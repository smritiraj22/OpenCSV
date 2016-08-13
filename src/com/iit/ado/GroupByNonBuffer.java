package com.iit.ado;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author Smriti
 *
 */
public class GroupByNonBuffer {
	/**
	 * 
	 * @param emp
	 */
	public static void groupbyNonBufferEmp(List<Employee> emp) {
		int count = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (Employee e : emp) {
			if (!map.containsKey(e.getfName())) {
				map.put(e.getfName(), e.getZip());
			} else {
				int zip = map.get(e.getfName());
				map.put(e.getfName(), zip + e.getZip());

			}

		}
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(++count+" | "+pair.getKey()  +" | " + pair.getValue());

		}

	}

}
