package com.iit.ado;

import java.util.List;

/**
 * @author Smriti
 *
 */
public class TestDatabaseOperations {

	public static void main(String[] args) {
		List<Employee> employees=CSVLoaderEmployee.loadEmployee("C:\\Users\\Smriti\\java-practice\\ADO-HW1\\src\\employee.csv");
		List<Department> dept=CSVLoaderDept.loadDept("C:\\Users\\Smriti\\java-practice\\ADO-HW1\\src\\dept.csv");
		
		System.out.println("-----------------");
		CartisianProduct.cartesianProduct(employees,dept);
		System.out.println("-----------------");
		CartisianProduct.cartesianProductEquiJoin(employees,dept);
		System.out.println("-----------------");
		CartisianProduct.cartesianProductRightOuterJoin(employees,dept);
		System.out.println("-----------------");
		CartisianProduct.cartesianProductRightOuterJoin(employees, dept);
		System.out.println("-----------------");
		DistinctNonBuffer.distinctNonBufferDept( dept);
		System.out.println("-----------------");
		DistinctBuffer.distinctBufferDept(dept);
		System.out.println("-----------------");
		GroupByNonBuffer.groupbyNonBufferEmp(employees);
		System.out.println("-----------------");
		GroupByBuffer.groupbyBufferEmp(employees);
		System.out.println("-----------------");
		TupleAtATimeProjection.tupleAtATimeProjection(employees, dept);
		System.out.println("-----------------");
		TupleAtATimeSelection.tupleAtATimeSelection(employees, dept);
		System.out.println("-----------------");
		
		
	}

}
