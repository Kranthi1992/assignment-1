/**
 * 
 */
package mypackage;

import java.util.HashMap;
import java.util.Map;

public class Myclass {
		Map<Integer,Employeeclass> empMap=new HashMap<Integer,Employeeclass>();
		for (int i = 0; i <= 10; i++) {
			String name="emp" + i;
			int id= i;
			double sal = i+100;
			Employeeclass employee = new Employeeclass(name,id,sal);
			empMap.put(i, employee);
		}
		
		
		 for(Map.Entry<Integer, Employeeclass> entry:empMap.entrySet())
		 
			 	int employeeId=entry.getKey();
			 	Employeeclass empDetails=entry.getValue();
			 	System.out.println(employeeId+" Details:");
			 	System.out.println("emp name is");

		 
		 
	 }   
	}
	 

