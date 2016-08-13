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
public class GroupByBuffer {
	/**
	 * 
	 * @param emp
	 */
	public static void groupbyBufferEmp(List<Employee> emp) {
		int count = 0;
		int buffLen = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int j = 0; j < emp.size(); j = j + 10) {

			if (buffLen <= emp.size() - 10) {
				buffLen = buffLen + 10;
			} else {
				buffLen = buffLen + (emp.size() % 10) - 1;
			}

			List<Employee> buffer = emp.subList(buffLen - 10, buffLen);
			for (Employee e : buffer) {
				if (!map.containsKey(e.getfName())) {
					map.put(e.getfName(), e.getZip());
				} else {
					int zip = map.get(e.getfName());
					map.put(e.getfName(), zip + e.getZip());

				}

			}
		}
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(++count + " | " + pair.getKey() + " | " + pair.getValue());

		}

	}
}
