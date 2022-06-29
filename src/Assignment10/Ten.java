package Assignment10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Ten 
{
	public static void main(String[] args) 
	{
		
		{
	        List<Emp> employeeList = new ArrayList<>();
	        employeeList.add(new Emp(1, "simran"));
	        employeeList.add(new Emp(2, "rohan"));
	        employeeList.add(new Emp(3, "ketki"));
	        employeeList.add(new Emp(4, "Dev"));
	        employeeList.add(new Emp(5, "Elegent"));
	        employeeList.add(new Emp(6, "mohan"));
	        employeeList.add(new Emp(7, "rohit"));
	        employeeList.add(new Emp(8, "harsh"));
	        employeeList.add(new Emp(9, "joship"));
	        employeeList.add(new Emp(10, "kevin"));

	        System.out.println("====Converting list to map====");
	        Map<Integer, String> map = employeeList.stream().collect(Collectors.toMap(E1->E1.getId(), E2->E2.getName()));
	        System.out.println(map);

	        System.out.println("====Converting list to set====");

	        Set<Emp> Set = employeeList.stream().collect(Collectors.toSet());
	        for (Emp emp : Set)
	            System.out.println("Employee id = " + emp.id + " Employee name = " + emp.name);
	    }
		
	}

}
