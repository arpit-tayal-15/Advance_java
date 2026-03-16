package streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class FilterAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ArrayList<Integer> list=new ArrayList<Integer>();
	     list.add(23);
	     list.add(45);
	     list.addAll(List.of(23,56,78,23,45,67));
	     System.out.println(list);
	    // Stream listStream=list.stream();
	     list.stream().filter(n->n>60).forEach((element)-> System.out.print(element+ " "));
	   //  list.stream().forEach(System.out::println);
	     System.out.println();
	     System.out.println("count="+list.stream().filter((item)->item>60).count());
	     

	          /*   ArrayList<String> list1 = new ArrayList<String>();

	             list1.add("Java");
	             list1.add("Python");
	             list1.addAll(List.of("C","C++","JavaScript","Spring"));

	             System.out.println(list1);

	             list1.stream().forEach((element) -> System.out.print(element + " "));
	             list1.stream().forEach(System.out::println);*/
	 

	         
	     
	     
	     

	}

}
