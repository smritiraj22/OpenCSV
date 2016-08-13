package com.iit.ado;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author Smriti
 *
 */
public class DistinctBuffer {
	/**
	 * 
	 * @param depts
	 */
	public static void distinctBufferDept(List<Department> depts) {
		int count = 0;
		int buffLen = 0;
		Map<String, Department> map = new HashMap<String, Department>();

		for (int j = 0; j < depts.size(); j = j + 10) {

			if (buffLen <= depts.size() - 10){				
				buffLen = buffLen + 10;
			}
			else {
				buffLen = buffLen + (depts.size() % 10) - 1;
			}
			
			List<Department> buffer = depts.subList(buffLen - 10, buffLen);
			for (Department d : buffer) {				
				map.put(d.getDeptName(), d);				
			}
		}
		for (Department d1 : map.values()) {
			System.out.println(++count + " | " + d1.getDeptName() + " | " + d1.getDeptId());
		}
	}

}
