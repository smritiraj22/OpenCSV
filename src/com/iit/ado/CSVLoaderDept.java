package com.iit.ado;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

/**
 * @author Smriti
 *
 */
public class CSVLoaderDept {

	/**
	 * @param path the string path give the path of the CSV file to be mapped to the DAO
	 * @return returns the list of departments 
	 */
	public static List<Department> loadDept(String path){
		CSVReader readerFordept;
		try{
		//opens and reads the csv file
		readerFordept = new CSVReader(new FileReader(path), ',','\"', 1);
		//Mapping stratergy is mapping to the columns of the CSV file to the instance variables the DAO class
		ColumnPositionMappingStrategy<Department> mappingStrategyDept = new ColumnPositionMappingStrategy<Department>();
		mappingStrategyDept.setType(Department.class);
		//Mapping to dept class//
		String[] columnsDept = new String[] {"deptId","deptName" };
		mappingStrategyDept.setColumnMapping(columnsDept);
		//conversion of the CSV objects to bean objects
		CsvToBean<Department> csvDept = new CsvToBean<Department>();
		//returns the list of bean objects
		List<Department> deptList = csvDept.parse(mappingStrategyDept, readerFordept);
		
		readerFordept.close();
		
		return deptList;
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
