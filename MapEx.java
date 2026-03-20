package streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method 
List<Integer> numbers=Arrays.asList(23,32,45,35,67,89,95);
System.out.println(numbers);
List<Integer>result=numbers.stream().filter(n->n<40).map(n->n+8).toList();
System.out.println(result);

//ques1

List<String> names=Arrays.asList("sachin","rahul","amit");
System.out.println(names);
List<String>result1=names.stream().map( n->n.toUpperCase()).toList();
System.out.println(result1);

//ques2

List<String> names1=Arrays.asList("Java","Python","C");
System.out.println(names1);
List<Character>res=names1.stream().map( n->n.charAt(0)).toList();
System.out.println(res);

//ques3

List<String>names2=Arrays.asList("A","B","C");
System.out.println(names2);
List<String>res2=names2.stream().map(n->("Item-"+n)).toList();
System.out.println(res2);

//ques4





	}

}
