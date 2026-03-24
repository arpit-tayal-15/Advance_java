package streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class SortedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(23,12,1,45,23,76,26,91);
		System.out.println(list);
		List<Integer> sortedList=list.stream().sorted((a,b)->b-a).toList();
		//List<Integer> sortedList=list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(sortedList);
		
		//ques2
		List<Integer>list2=Arrays.asList(18,42,7,91,33,25,60);
		System.out.println(list2);
		List<Integer>sortedList2=list2.stream().sorted((a,b)->b-a).limit(3).toList();
		System.out.println(sortedList2);
		
		//ques3
		
		List<Integer>list3=Arrays.asList(14,9,20,7,6,11,32,3);
		System.out.println(list3);
		List<Integer>sortedList3=list3.stream().filter(n -> n % 2 == 0).sorted((a,b)->a-b).toList();
		System.out.println(sortedList3);
		
		//ques4
		
		List<Integer>list4=Arrays.asList(55,12,88,34,99,21);
		System.out.println(list4);
		Integer sortedList4=list4.stream().sorted((a,b)->b-a).toList().get(1);
		System.out.println(sortedList4);
		
		//ques5
		
		List<Integer>list5=Arrays.asList(8,26,13,41,19,32,5);
		System.out.println(list5);
		List<Integer> sortedList5 = list5.stream().filter(n -> n > 20).sorted().toList();
		System.out.println(sortedList5);
		
		//ques6
		
		List<String>list6=Arrays.asList("Ravi","Ankit","zoya","Meena","Kunal");
		System.out.println(list6);
		List<String> sortedList6 = list6.stream().sorted().toList();
		System.out.println(sortedList6);
		
		//ques7
		
		List<String>list7=Arrays.asList("Suresh","Amit","Neha","Vikas","Priya");
		System.out.println(list7);
		List<String>sortedList7=list7.stream().sorted((a,b)->b.compareTo(a)).toList();
		System.out.println(sortedList7);
		
		//ques8
		
		List<String>list8=Arrays.asList("Java","Springboot","API","Microservices","SQL");
		System.out.println(list8);
        List<String>sortedList8=list8.stream().sorted((a, b) -> a.length() - b.length()).toList();
        System.out.println(sortedList8);
		
        //ques9
        
        List<Integer>list9=Arrays.asList(39,7,22,15,3,41);
        System.out.println(list9);
        Integer sortedList9=list9.stream().sorted().toList().get(0);
        System.out.println(sortedList9);
        
        
		

		
		
		
		

	}
	

}
