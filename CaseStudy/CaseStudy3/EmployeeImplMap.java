package com.evergent.corejava.HashMapCaseStudy;
import java.util.*;

//1. Add new employees.
//2. Retrieve employee details using their unique ID.
//3. Update employee information.
//4. Remove employees from the system.
//5. List all employees.

import java.util.Map.Entry;
public class EmployeeImplMap 
{
     public static void main(String args[])
     {
    	 int id;
    	 String name;
    	 String department;
    	 Scanner input=new Scanner(System.in);
    	 HashMap<Integer,Employee> employeeMap=new HashMap<>();
    	 while(true)
    	 {
    		 System.out.print("\n1.Add Employee\n2.Retrive Employee\n3.update Employee\n4.Remove Employee\n5.List the Employee");
    		 System.out.print("\nSelect your choice from above options:");
    		 int choice=input.nextInt();
    		  switch(choice)
    		  {
    		   case 1:
		    	 Employee e=new Employee();
		    	 System.out.print("enter the employee id:");
		    	 id=input.nextInt();
		    	 e.setId(id);
		    	 System.out.print("enter the Employee name:");
		    	 name=input.next();
		    	 e.setName(name);
		    	 System.out.print("enter the employee department:");
		    	 department=input.next();
		    	 e.setDepartment(department);
		    	 employeeMap.put(id,e);
		    	 System.out.print("Succesfully Added");
		    	 break;
    		  case 2:  
    			   System.out.print("Enter the id to retrive the details:");
    			   int cur_id=input.nextInt();
    			   if(employeeMap.containsKey(cur_id))
    			   {
    				 System.out.print(employeeMap.get(cur_id));
    			   }
    			   else
    			   {
    				   System.out.print("please enter vaild id number!");
    			   }
    			   break;
    		  case 3:
    			    System.out.print("Enter the id:");
				    int id1=input.nextInt();
    				   if(employeeMap.containsKey(id1)) 
    				   {
    					  Employee existingEmployee = employeeMap.get(id1);   
    				        System.out.println("1.Update Employee Name 2.Update Employee Dept 3.Update Employee name& Dept");
    						int m=input.nextInt();
    						switch(m) 
    						{
    						case 1:
    							System.out.println("Enter new Name ");
    							String sn=input.next();
    							existingEmployee.setName(sn);
    							employeeMap.put(id1, existingEmployee);
    							System.out.print("Successfully Updated Your Name");
    							break;
    						case 2:
    							System.out.println("Enter new Dept");
    							String dpt=input.next();
    							existingEmployee.setDepartment(dpt);
                                employeeMap.put(id1, existingEmployee);
                                System.out.print("Successfully Updated Your Department");
    							break;
    						case 3:
    							System.out.println("Enter new Name and Dept");
    							String sn1=input.next();
    							String dpt1=input.next();
    							existingEmployee.setName(sn1);
    							existingEmployee.setDepartment(dpt1);
    							employeeMap.put(id1, existingEmployee);
    							System.out.print("Successfully Updated Your Name and Department");
    							break;
    						}
    				    }
    				    else 
    				    {
    					   System.out.println("Id is not Present");
    				    }
    			     break;
    		  case 4:
    			    System.out.print("Enter the id to be removed:");
  			    	int remove=input.nextInt();
  			    	employeeMap.remove(remove);
  			    	System.out.print("Successfully Removed the id"+remove);
    			     break;
    		  case 5:
    			System.out.print("Here the details of employee"); 
    			for(Map.Entry<Integer,Employee> map:employeeMap.entrySet())
    			{
    				   System.out.println(map.getValue());
    			}
		    	break;
    		}
    	 }
     }
}