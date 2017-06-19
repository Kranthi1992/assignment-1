package mypackage;

public class Employeetable {


		 private String empName;

		 private int empId;

		 private double empSal;

		 Employeetable employees[] = new Employeetable[100];

			 

			 public Employeetable(String empName,int empId,double empSal){

		         this.empName=empName;

		         this.empId=empId; 

		         this.empSal=empSal;

		      }

			 

			 public String getEmpName(){

				 return empName;

			 }

			

			 public int getEmpId(){

			     return empId;

			 }

			 

			  public double getSalary(){

			     return empSal;

			 }

			

			

			

			}



		
		




