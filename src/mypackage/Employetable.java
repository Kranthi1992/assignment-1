package mypackage;

public class Employetable {
	 

	public static void main(String[] args) {

	

		ArrayList<Employeetable> emp=new ArrayList<Employeetable>(); 	

		for (int i = 0; i <= 100; i++) {

			String name="emp" + i;

			int id= i;

			double sal = i+100;

			Employeetable employees = new Employeetable(name,id,sal);

			emp.add(employees);

		}

		

		for (int i = 0; i < emp.size() ; i++) {

			Employeetable employees = (Employeetable) emp.get(i);

			System.out.println("Employee " + i +  " name is " + employees.getEmpName());

			System.out.println("Employee " + i +  " id is " + employees.getEmpId());

			System.out.println("Employee " + i +  " sal is " + employees.getSalary());

		    } 
	}

		


