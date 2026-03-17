package streamapi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterAPI_Ques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// question2
	    
	    List<String> data=Arrays.asList("Amit","Ravi","Anil","Vikas","Ashok","Rahul");
		ArrayList<String> list2=new ArrayList<String>();
		list2.addAll(data);
		list2.stream().filter(name->name.startsWith("A")).forEach(System.out::println);;
		
		
//question3
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.addAll(List.of(10,60,45,90,30,24,50,76));
		System.out.println(list3);
		list3.stream().filter(n->n>=50 && n<=60).forEach((element)->System.out.println(element+" "));
		
//question4
		
		List<String>data2=Arrays.asList("java","Python","C","React","c#","Next.js","Node.js");
		ArrayList<String> list4=new ArrayList<String>();
		list4.addAll(data2);
		list4.stream().filter(lang->lang.length()>4).forEach(System.out::println);
		
		
//question5
		
		List<String>data3=Arrays.asList("java",null,"Spring",null,"React");
		ArrayList<String>list5=new ArrayList<String>();
		list5.addAll(data3);
		List<String>notNullList=list5.stream().filter(lang->(lang!=null)).toList();
		System.out.print(notNullList);
		
		
		
		

	}

}
