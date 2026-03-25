package streamminmax;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(12,1,4,100,200,150,45,67,99);
		Optional<Integer> result=list.stream().min((a,b)->a-b);
        result.ifPresent(System.out::println);
        
        
        //ques
        List<Integer>list2=Arrays.asList(10,20,10,30,20,40);
        List<Integer> uniqueList = list2.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueList);
       
        //ques
        List<Integer>list3=Arrays.asList(5,10,15,20,25,30,35);

        list3.stream().skip(3).forEach(System.out::println);
        
        
        
	}

}

       
