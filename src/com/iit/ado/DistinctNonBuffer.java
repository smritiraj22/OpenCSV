package com.iit.ado;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 
 * @author Smriti
 *
 */
public class DistinctNonBuffer {
	/**
	 * 
	 * @param depts
	 */
public static void distinctNonBufferDept(List<Department> depts) {
	    int count = 0;
		Map<String,Department> map=new HashMap<String,Department>();
		for (Department d : depts) {
			if(!map.containsValue(d))
			map.put(d.getDeptName(), d);
			
		}
		for(Department d1:map.values()){
			System.out.println(++count +" | "+d1.getDeptName() + " | " + d1.getDeptId());
		}
	}


}
