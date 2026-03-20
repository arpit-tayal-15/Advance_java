package streamapi;
import java.util.*;

public class Map7 {
	int eid;
	String name;
	String course;
	Map7(int eid,String name, String course){
		this.eid=eid;
		this.name=name;
		this.course=course;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Map7>list=new ArrayList<Map7>();
		list.add(new Map7(1,"Ankit","MCA"));
		list.add(new Map7(2,"Rahul","CSE"));
		List<String>empNames=list.stream().map(emp->emp.name).toList();
		System.out.println(empNames);

	}

}
