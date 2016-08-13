Employee and Department classes are the DAO objects we are mapping our CSV instance variables to the columns in the
CSV file. The CSVLoaderDept and CSVLoaderEmployee take in the input as the path String from the user as the path of the CSV file
it needs to be changed depending on where the file is stored in the file system. The perform the following operations.
opens and reads the csv file, defines the mapping startergy i.e Mapping stratergy is mapping to the columns of the CSV file to
 the instance variables the DAO class, then conversion of the CSV objects to bean objects, returns the list of bean objects.
 The returned value is the list of objects that are read from the CSV file. These are the inputs to the CartisianProduct class, where 
 the method public static void cartesianProduct(List<Employee> employees,List<Department> depts)
 takes input as the list of employee and department objects and gives the complete cartisian product, the method 
 public static void cartesianProductEquiJoin(List<Employee> employees,List<Department> depts) takes input as the 
 list of employee and department objects and gives the complete equijoin  product, the method 
 public static void cartesianProductLeftOuterJoin(List<Employee> employees,List<Department> depts) 
 takes input as the list of employee and department objects and gives the complete left outer join  product
 , the method public static void cartesianProductRightOuterJoin(List<Employee> employees,List<Department> depts) 
 takes input as the list of employee and department objects and gives the complete right outer join  product.
 
 All the methods are tested in the TestCartisianProduct and the output is printed on the console.