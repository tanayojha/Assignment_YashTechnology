package org.yash.collection.program8;

import java.time.LocalDate;
import java.util.Arrays;

public class ProductionFacility {
	private int prod_id;
	private String pro_facility_name;
	private String pro_facility_location;
	private int total_Production_Per_Day;
	private String itemNames[];
	private LocalDate prodDate;
	
	public ProductionFacility() {
		// TODO Auto-generated constructor stub
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public String getPro_facility_name() {
		return pro_facility_name;
	}

	public void setPro_facility_name(String pro_facility_name) {
		this.pro_facility_name = pro_facility_name;
	}

	public String getPro_facility_location() {
		return pro_facility_location;
	}

	public void setPro_facility_location(String pro_facility_location) {
		this.pro_facility_location = pro_facility_location;
	}

	public int getTotal_Production_Per_Day() {
		return total_Production_Per_Day;
	}

	public void setTotal_Production_Per_Day(int total_Production_Per_Day) {
		this.total_Production_Per_Day = total_Production_Per_Day;
	}

	public String[] getItemNames() {
		return itemNames;
	}

	public void setItemNames(String[] itemNames) {
		this.itemNames = itemNames;
	}

	public LocalDate getProdDate() {
		return prodDate;
	}

	public void setProdDate(LocalDate prodDate) {
		this.prodDate = prodDate;
	}

	@Override
	public String toString() {
		return "ProductionFacility [prod_id=" + prod_id + ", pro_facility_name=" + pro_facility_name
				+ ", pro_facility_location=" + pro_facility_location + ", total_Production_Per_Day="
				+ total_Production_Per_Day + ", itemNames=" + Arrays.toString(itemNames) + ", prodDate=" + prodDate
				+ "]";
	}
	
	
	
}
