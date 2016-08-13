package com.iit.ado;

/**
 * @author Smriti
 *
 */
public class Employee {
	private String fName;
	private String lName;
	private String city;
	private String county;
	private String state;
	private int zip;
	private int deptId;
	private boolean isIncluded;
	
	/**
	 * @param isIncluded
	 *            is the flag that is set to mark the rows that are included in
	 *            the Cartisian Product
	 * 
	 */
	public boolean isIncluded() {
		return isIncluded;
	}
	
	/**
	 * 
	 * @param sets isIncluded
	 */
	public void setIncluded(boolean isIncluded) {
		this.isIncluded = isIncluded;
	}
	/**
	 * 
	 * @return first name
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * 
	 * @param sets first name
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * 
	 * @return last name
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * 
	 * @param sets last name
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	/**
	 * 
	 * @return city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 
	 * @param sets city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 
	 * @return county
	 */
	public String getCounty() {
		return county;
	}
	/**
	 * 
	 * @param sets county
	 */
	public void setCounty(String county) {
		this.county = county;
	}
	/**
	 * 
	 * @return state
	 */
	public String getState() {
		return state;
	}
	/**
	 * 
	 * @param sets state
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * 
	 * @return zip
	 */
	public int getZip() {
		return zip;
	}
	/**
	 * 
	 * @param setszip
	 */
	public void setZip(int zip) {
		this.zip = zip;
	}
	/**
	 * 
	 * @return deptartment id
	 */
	public int getDeptId() {
		return deptId;
	}
	/**
	 * 
	 * @param sets deptartment id
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	

}
