package streamapi;

import java.util.Arrays;
import java.util.List;

class Employee{
	int sal;
	String name;
	String dept;
	Employee(int sal,String name,String dept){
		this.sal=sal;
		this.name=name;
		this.dept=dept;
		
	}
	@Override
	public String toString() {
		return "Employee [sal=" + sal + ", name=" + name + ", dept=" + dept + "]";
	}
}

public class Sorted17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee e1=new Employee(20000,"Arpit","IT");
     Employee e2=new Employee(1000,"Alok","Accounts");
     Employee e3=new Employee(3000,"Alok singh","Testing");
     Employee e4=new Employee(10000,"Aryan","Admin");
     Employee e5=new Employee(2000,"Archit","Ceo");
     List<Employee>list=Arrays.asList(e1,e2,e3,e4,e5);
     List<Employee>sortedList=list.stream().sorted(( a, b)->a.sal-b.sal).toList();
     for(int i=0;i<sortedList.size();i++) {
    	 System.out.println(sortedList.get(i).name+" "+sortedList.get(i).sal);
     }
     System.out.println("dept");
     List<Employee>sortedList2=list.stream().sorted((a, b)->a.dept.compareTo(b.dept)).toList();
     for(int i=0;i<sortedList2.size();i++) {
    	 System.out.println(sortedList2.get(i).name+" "+sortedList2.get(i).dept);
     }
    		 
    		 
    		 
    		 
    		 
    		 
    		 
 	}

}
