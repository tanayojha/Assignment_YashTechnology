package org.yash.collection.program8;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author tanay.ojha
 *
 *Consider following class :- class ProductionFacility {
	int pliid;
	String pro_facility_name;
	String pro_fa_location;
	int totalproduction_perday;
	String itemnames[];
	LocalDate prod_date;
}
You have to perform following task.
a) Print the details of facility with highest production per day. (you have to add at least 3 days details of each facility after that you have to calculate average of 3 days on the basis of average you have to print the facility with highest production.
b) Print detail of facility on the basis of names.
c) Print which facility is producing highest item.
d) Print production detail of each facility on the basis of production date.
 */
public class Program8 {
	//Creating List of Production Facility
	static List<ProductionFacility> prodFacilityList;
	
	public static void main(String[] args) {
		// Creating List of Production Facility
		prodFacilityList = new ArrayList<ProductionFacility>();
		//
		createProductionFacilityData(prodFacilityList);
		//
		taskA();
		//
		taskB();
		//
		taskC();
		//
		taskD();
	}

	private static void createProductionFacilityData(List<ProductionFacility> prodFacilityList) {
		// Create Instance of Production Facility 1
		ProductionFacility pf1 = new ProductionFacility();
		// adding Item names manually
		String itemName[] = { "Bread", "Milk", "Egg", "Cheese", "Butter", "Tofu", "Toast", "Pasta", "Cakes",
				 };
		pf1.setItemNames(itemName);
		pf1.setPro_facility_location("Indore");
		pf1.setPro_facility_name("delivery");
		pf1.setProd_id(101);
		pf1.setProdDate(LocalDate.of(2022, 8, 11));
		pf1.setTotal_Production_Per_Day(100);

		prodFacilityList.add(pf1);

		// Create Instance of Production Facility 12
		ProductionFacility pf12 = new ProductionFacility();
		// adding Item names manually
		pf12.setItemNames(itemName);
		pf12.setPro_facility_location("Indore");
		pf12.setPro_facility_name("delivery");
		pf12.setProd_id(101);
		pf12.setProdDate(LocalDate.of(2022, 8, 12));
		pf12.setTotal_Production_Per_Day(102);

		prodFacilityList.add(pf12);

		// Create Instance of Production Facility 123
		ProductionFacility pf123 = new ProductionFacility();
		// adding Item names manually
		pf123.setItemNames(itemName);
		pf123.setPro_facility_location("Indore");
		pf123.setPro_facility_name("delivery");
		pf123.setProd_id(101);
		pf123.setProdDate(LocalDate.of(2022, 8, 13));
		pf123.setTotal_Production_Per_Day(80);

		prodFacilityList.add(pf123);

		//---------Prod Fac 1 ends-----------

		// Create Instance of Production Facility 2(1)
		ProductionFacility pf2 = new ProductionFacility();
		// adding Item names manually
		String itemName2[] = { "Bread", "Milk", "Egg", "Cheese", "Butter", "Pasta", "Cakes", "Pastery" };
		pf2.setItemNames(itemName2);
		pf2.setPro_facility_location("Indore");
		pf2.setPro_facility_name("delivery");
		pf2.setProd_id(103);
		pf2.setProdDate(LocalDate.of(2022, 8, 11));
		pf2.setTotal_Production_Per_Day(50);

		prodFacilityList.add(pf2);

		// Create Instance of Production Facility 2(12)
		ProductionFacility pf22 = new ProductionFacility();
		// adding Item names manually
		pf22.setItemNames(itemName2);
		pf22.setPro_facility_location("Indore");
		pf22.setPro_facility_name("delivery");
		pf22.setProd_id(103);
		pf22.setProdDate(LocalDate.of(2022, 8, 12));
		pf22.setTotal_Production_Per_Day(70);

		prodFacilityList.add(pf22);

		// Create Instance of Production Facility 2(123)
		ProductionFacility pf23 = new ProductionFacility();
		// adding Item names manually
		pf23.setItemNames(itemName2);
		pf23.setPro_facility_location("Indore");
		pf23.setPro_facility_name("delivery");
		pf23.setProd_id(103);
		pf23.setProdDate(LocalDate.of(2022, 8, 13));
		pf23.setTotal_Production_Per_Day(90);

		prodFacilityList.add(pf23);

		// ---------Prod Fac 2 ends-----------

		// Create Instance of Production Facility 3(1)
		ProductionFacility pf3 = new ProductionFacility();
		// adding Item names manually
		String itemName3[] = { "Bread", "Cheese", "Butter", "Tofu", "Toast", "Cakes", "Pastery" };
		pf3.setItemNames(itemName3);
		pf3.setPro_facility_location("Indore");
		pf3.setPro_facility_name("delivery");
		pf3.setProd_id(103);
		pf3.setProdDate(LocalDate.of(2022, 8, 11));
		pf3.setTotal_Production_Per_Day(50);

		prodFacilityList.add(pf3);

		// Create Instance of Production Facility 3(12)
		ProductionFacility pf32 = new ProductionFacility();
		// adding Item names manually
		pf32.setItemNames(itemName2);
		pf32.setPro_facility_location("Indore");
		pf32.setPro_facility_name("prod");
		pf32.setProd_id(103);
		pf32.setProdDate(LocalDate.of(2022, 8, 12));
		pf32.setTotal_Production_Per_Day(70);

		prodFacilityList.add(pf32);

		// Create Instance of Production Facility 3(123)
		ProductionFacility pf33 = new ProductionFacility();
		// adding Item names manually
		pf33.setItemNames(itemName2);
		pf33.setPro_facility_location("Indore");
		pf33.setPro_facility_name("prod");
		pf33.setProd_id(103);
		pf33.setProdDate(LocalDate.of(2022, 8, 13));
		pf33.setTotal_Production_Per_Day(90);

		prodFacilityList.add(pf33);

		// ---------Prod Fac 3 ends-----------

		// Create Instance of Production Facility 4
		ProductionFacility pf4 = new ProductionFacility();
		// adding Item names manually
		String itemName4[] = { "Bread", "Cheese", "Butter", "Pasta", "Cakes", "Pastery", "Bake samosa" };
		pf4.setItemNames(itemName4);
		pf4.setPro_facility_location("Indore");
		pf4.setPro_facility_name("prod");
		pf4.setProd_id(104);
		pf4.setProdDate(LocalDate.of(2022, 8, 11));
		pf4.setTotal_Production_Per_Day(110);

		prodFacilityList.add(pf4);

		// ---------Prod Fac 4 ends-----------
	}

	// Print the details of facility with highest production per day. (you have to
	// add at least 3 days details of each facility after that you have to calculate
	// average of 3 days on the basis of average you have to print the facility with
	// highest production.
	private static void taskA() {
		
	}
	
	
	//Print detail of facility on the basis of names.
	private static void taskB() {
		System.out.println("\nPrint detail of facility on the basis of names.\n");
		List<ProductionFacility> sortedList = prodFacilityList.stream()
		        .sorted(Comparator.comparing(ProductionFacility::getPro_facility_name))
		        .collect(Collectors.toList());
		
		for(ProductionFacility p : sortedList) {
			System.out.println(p);
		}
	}
	
	// Print which facility is producing highest item.
	private static void taskC() {
		System.out.println("\nPrint which facility is producing highest item.\n");

		int max = Integer.MIN_VALUE;
		String fname  = null;
		for(ProductionFacility pf:prodFacilityList) {
			int size=pf.getItemNames().length;
			System.out.println(size+" "+pf.getPro_facility_name());
			if(max < size) {
				max = size;
				fname = pf.getPro_facility_name();
			}
			
		}
		
		System.out.println(fname);
	}

	//Print production detail of each facility on the basis of production date.
	private static void taskD() {
		System.out.println("\nPrint production detail of each facility on the basis of production date.\n");
		List<ProductionFacility> sortedDateList = prodFacilityList.stream()
		        .sorted(Comparator.comparing(ProductionFacility::getProdDate))
		        .collect(Collectors.toList());
		
		sortedDateList.forEach(l -> System.out.println(l));
	}

}
