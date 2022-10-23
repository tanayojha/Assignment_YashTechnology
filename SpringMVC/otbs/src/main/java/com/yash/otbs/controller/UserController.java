package com.yash.otbs.controller;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.yash.otbs.model.User;
import com.yash.otbs.service.UserService;

@Controller
//@RestController
public class UserController {

	@Autowired
	UserService userService;

	// After Successful Registration redirect to LOGIN page
	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user) {
		// System.out.println("Registering... User ID : " + user.getUserName());
		userService.saveUser(user);
		return "login";
	}

	@RequestMapping("/login")
	public ModelAndView loginUser(@RequestParam("username") String username, @RequestParam("password") String password,
			@ModelAttribute User user, Model m) {
		User userObj = null;

		ModelAndView modelAndView = new ModelAndView();

		// get data from database
		userObj = userService.fetchUserByUsernameAndPassword(username, password);

		if (Objects.nonNull(userObj)) {
			// m.addAttribute("username", userObj);

			modelAndView.addObject("username", userObj);
			modelAndView.setViewName("userdashboard");
			return modelAndView;

		} else if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			// m.addAttribute("username", userObj);

			modelAndView.addObject("username", userObj);
			modelAndView.addObject("error", "");		
			modelAndView.setViewName("admindashboard");
			return modelAndView;

		} else
			modelAndView.addObject("error", "Invalid Credential!");		
		// modelAndView.setViewName("redirect:/");
		return modelAndView;
		// return "redirect:/";
	}

	/*
	 * @GetMapping("/getMessage2") public ModelAndView getMessage() { var mav = new
	 * ModelAndView(); mav.addObject("message", message); mav.setViewName("show");
	 * return mav; }
	 */

	// it is to redirect to REGISTER page
	@GetMapping("/register")
	public String doRegister() {
		return "register";
	}

	// it is to redirect to Login page
	@GetMapping("/")
	public String doLogin() {
		return "login";
	}

	// it is to redirect to Login page
	@GetMapping("/backtologin")
	public String doLogout() {
		return "login";
	}

	@RequestMapping("/userlist")
	public String showUseList(Model model) {
		// create model attribute to bind form data
		List<User> list = userService.getAllUsers();
		if (list.isEmpty()) {
			model.addAttribute("msg", "no users available");
		} else {
			model.addAttribute("users", list);
		}
		return "userlist";
	}
	
	
	
	// it is to redirect to Login page
		@GetMapping("/backtoDashboard")
		public String backToDashboard() {
			return "admindashboard";
		}

}
