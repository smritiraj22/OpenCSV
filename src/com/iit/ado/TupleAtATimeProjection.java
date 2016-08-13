package com.iit.ado;

import java.util.Iterator;
import java.util.List;
/**
 * 
 * @author Smriti
 *
 */
public class TupleAtATimeProjection {
	/**
	 * 
	 * @param employees
	 * @param depts
	 */
	public static void tupleAtATimeProjection(List<Employee> employees, List<Department> depts) {

		int count = 0;
		int i = 0;
		Iterator<Department> it = depts.iterator();
		while (it.hasNext()) {
			if (i < depts.size() - 1) {
				i = i + 1;
			} else {
				continue;
			}
			List<Department> d = depts.subList(i, i + 1);
			for (Employee e : employees) {
				if (e.getDeptId() == d.get(0).getDeptId() && e.isIncluded() == false) {
					e.setIncluded(true);

					System.out.println(++count + " | " + e.getfName() + " | " + e.getCounty() + " | " + e.getState()
							+ " | " + e.getZip() + " | " + e.getDeptId() + " | " + d.get(0).getDeptName());
				}

			}

		}
	}
}
