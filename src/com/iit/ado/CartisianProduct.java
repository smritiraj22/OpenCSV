
package com.iit.ado;

import java.util.List;

/**
 * @author Smriti
 *
 */
public class CartisianProduct {
   /**
    * 
    * @param employees
    * @param depts
    * 
    * takes input as the list of employee and department objects and gives the complete cartisian product
    */
	public static void cartesianProduct(List<Employee> employees,List<Department> depts) {
		
		int count = 0;
		for (Employee e : employees) {
			for (Department d : depts) {

				System.out.println(++count + " | " + e.getfName() + " | " + e.getlName() + " | " + e.getCity() + " | "
						+ e.getCounty() + " | " + e.getState() + " | " + e.getZip() + " | " + e.getDeptId() + " | "
						+ d.getDeptName() + " | " + d.getDeptId());
			}
		}
	}
	
	 /**
	    * 
	    * @param employees
	    * @param depts
	    * 
	    * takes input as the list of employee and department objects and gives the complete equijoin  product
	    */
	public static void cartesianProductEquiJoin(List<Employee> employees,List<Department> depts) {
		
		int count = 0;
		for (Employee e : employees) {
			for (Department d : depts) {

				if (e.getDeptId() == d.getDeptId())
					System.out.println(++count + " | " + e.getfName() + " | " + e.getlName() + " | " + e.getCity()
							+ " | " + e.getCounty() + " | " + e.getState() + " | " + e.getZip() + " | " + e.getDeptId()
							+ " | " + d.getDeptName() + " | " + d.getDeptId());
			}
		}
	}

	 /**
	    * 
	    * @param employees
	    * @param depts
	    * 
	    * takes input as the list of employee and department objects and gives the complete left outer join  product
	    */
	public static void cartesianProductLeftOuterJoin(List<Employee> employees,List<Department> depts) {
		
		int count = 0;
		for (Employee e : employees) {
			Department empDept = new Department();
			for (Department d : depts) {

				if (e.getDeptId() == d.getDeptId()) {
					e.setIncluded(true);
					System.out.println(++count + " | " + e.getfName() + " | " + e.getlName() + " | " + e.getCity()
							+ " | " + e.getCounty() + " | " + e.getState() + " | " + e.getZip() + " | " + e.getDeptId()
							+ " | " + d.getDeptName() + " | " + d.getDeptId());
				}

			}
			if (!e.isIncluded()) {
				System.out.println(++count + " | " + e.getfName() + " | " + e.getlName() + " | " + e.getCity() + " | "
						+ e.getCounty() + " | " + e.getState() + " | " + e.getZip() + " | " + e.getDeptId() + " | "
						+ empDept.getDeptId() + " | " + empDept.getDeptName());
			}
		}
	}

	 /**
	    * 
	    * @param employees
	    * @param depts
	    * 
	    * takes input as the list of employee and department objects and gives the complete right outer join  product
	    */
	public static void cartesianProductRightOuterJoin(List<Employee> employees,List<Department> depts) {
		
		int count = 0;
		for (Department d : depts) {
			Employee deptEmp = new Employee();
			for (Employee e : employees) {
				if (e.getDeptId() == d.getDeptId()) {
					d.setIncluded(true);
					System.out.println(++count + " | " + d.getDeptName() + " | " + d.getDeptId() + " | "+ e.getfName() + " | " + e.getlName() + " | " + e.getCity()
							+ " | " + e.getCounty() + " | " + e.getState() + " | " + e.getZip() + " | " + e.getDeptId()
							);
				}

			}
			if (!d.isIncluded()) {
				System.out.println(++count + " | " + d.getDeptId() + " | " + d.getDeptName() + " | "+ deptEmp.getfName()
						+ " | " + deptEmp.getlName() + " | " + deptEmp.getCity() + " | " + deptEmp.getCounty() + " | "
						+ deptEmp.getState() + " | " + deptEmp.getZip() + " | " + deptEmp.getDeptId() );
			}
		}
	}
}
