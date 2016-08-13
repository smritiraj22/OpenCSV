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
public class CSVLoaderEmployee {
	/**
	 * @param path the string path give the path of the CSV file to be mapped to the DAO
	 * @return returns the list of employees 
	 */
	public static List<Employee> loadEmployee(String path) {
		CSVReader readerForEmployee;

		try {
			//opens and reads the csv file
			readerForEmployee = new CSVReader(
					new FileReader(path), ',', '\"', 1);
			//Mapping stratergy is mapping to the columns of the CSV file to the instance variables the DAO class
			ColumnPositionMappingStrategy<Employee> mappingStrategyEmp = new ColumnPositionMappingStrategy<Employee>();
			//Mapping to employee class//
			mappingStrategyEmp.setType(Employee.class);
			//Mapping to instance variables employee class//
			String[] columnsEmp = new String[] { "fName", "lName", "city", "county", "state", "zip", "deptId" };
			mappingStrategyEmp.setColumnMapping(columnsEmp);
			//conversion of the CSV objects to bean objects
			CsvToBean<Employee> csvEmp = new CsvToBean<Employee>();
			List<Employee> employeeList = csvEmp.parse(mappingStrategyEmp, readerForEmployee);
			//returns the list of bean objects
			
			readerForEmployee.close();
			
			return employeeList;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
