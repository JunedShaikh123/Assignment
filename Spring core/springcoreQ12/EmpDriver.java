package com.springcoreQ12;



	import java.util.ArrayList;
	import java.util.List;
	import java.util.Map;
	import java.util.Set;
	import java.util.Map.Entry;
	import java.util.stream.Collectors;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	
	public class EmpDriver {
		
		public static void main(String[] args) {
			
			ApplicationContext contex=new ClassPathXmlApplicationContext("ApplicationContextNewFile.xml");
			Employee emp1=(Employee) contex.getBean("employee1");
			Employee emp2=(Employee) contex.getBean("employee2");
			Employee emp3=(Employee) contex.getBean("employee3");
			Employee emp4=(Employee) contex.getBean("employee4");
			
			List<Employee> elist=new ArrayList<Employee>();
			elist.add(emp1);
			elist.add(emp2);
			elist.add(emp3);
			elist.add(emp4);
			
			
			
			System.out.println("maximum salary in department");
			
			
			
			
			
			System.out.println("-------------------------------");
			
			Employee max =elist.stream().max((a,b)->a.salary>b.salary?1:-1).get();
			System.out.println("Higest salary of employee Name is "+max.empName +" and salary is "+max.salary);
			
			
			
			
			System.out.println("-------------------------------");
			
			
			double aveSalary=elist.stream().collect(Collectors.averagingDouble(i->i.salary));
			System.out.println("Average salary : "+aveSalary);
			System.out.println("name of the emp havaing salary less than average salary");
			
			
			
			List<Employee> ave=elist.stream().filter(i->i.salary<aveSalary).collect(Collectors.toList());
			
			for(Employee e:ave)
			{
				System.out.println(e.empName+"  "+e.salary);
			}
			
			
			
			System.out.println("-------------------------------");
			
			System.out.println("average salary of each dept");

			
			  System.out.println("Average salary of each department--");
		        Map<String, Double> avgSalaryOfDepartments=
		        list.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));       
		        Set<Entry<String, Double>> entrySet1 = avgSalaryOfDepartments.entrySet();       
		        for (Entry<String, Double> entry : entrySet1) 
		        {
		             System.out.println(entry.getKey()+" : "+entry.getValue());
		        }
		        
		}

	}

			
			
			