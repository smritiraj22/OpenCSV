package com.iit.ado;

/**
 * @author Smriti
 *
 */
public class Department {
	private int deptId;
	private String deptName;

	private boolean isIncluded;

	public boolean isIncluded() {
		return isIncluded;
	}

	/**
	 * @param isIncluded
	 *            is the flag that is set to mark the rows that are included in
	 *            the Cartisian Product
	 * 
	 */
	public void setIncluded(boolean isIncluded) {
		this.isIncluded = isIncluded;
	}

	/**
	 * 
	 * @return deptId
	 */
	public int getDeptId() {
		return deptId;
	}

	/**
	 * 
	 * @param sets
	 *            deptId
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	/**
	 * 
	 * @return deptName
	 * 
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * 
	 * @param sets
	 *            deptName
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}
