package streamapi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ReduceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer>list=Arrays.asList(34,12,45,76,34,56,54,32);
      double avg=list.stream().reduce(0,(a, b)->a+b)/list.size();
      System.out.println("Avg="+avg);
      
      //ques1
      List<Integer>list1=Arrays.asList(10,20,30,40,50);
      int sum=list1.stream().reduce(0,(a,b)->a+b);
      System.out.println("Sum="+sum);
      //ques2
      List<Integer>list2=Arrays.asList(2,3,4,5);
      int mul=list2.stream().reduce(1,(a,b)->a*b);
      System.out.println("Multiply="+mul);
      
      //ques4
      
      
      
      
      //ques3
      List<Integer>list3=Arrays.asList(12,45,7,89,23,56);
      int max=list3.stream().reduce(Integer.MIN_VALUE,(a,b)->a>b?a:b);
      System.out.println("Max = " + max);
      
      //ques5
      List<Integer>list5=Arrays.asList(34,12,45,76,34,56,54,32);
      int count=list5.stream().reduce(0,(a, b)->a+1);
      System.out.println("Count="+count);
      
      //ques6
      List<Integer>list6=Arrays.asList(11,22,33,44,55,66,77,88);
      int sumEven= list.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b);
      System.out.println("sumEven="+sumEven);
      
      //ques7
      List<String>list7=Arrays.asList("Java","Stream","API","Reduce");
      String finalList=list7.stream().reduce("",(a,b)->a+" "+b);
      System.out.println(finalList);
      
      //ques8
      List<Integer>list8=Arrays.asList(1,2,3,4,5,6);
      int sumOfSquares = list8.stream().map(n -> n * n).reduce(0, (a, b) -> a + b);
      System.out.println(sumOfSquares);
      
      //ques9
      List<Integer>list9=Arrays.asList(12,45,67,23,89,34,78);
//      int secondMax = list9.stream().filter(n -> n != list9.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b)).reduce(Integer.MIN_VALUE,
//                      (a, b) -> a > b ? a : b);
//      System.out.println(secondMax);
      int maximum=list9.stream().reduce(0, (a,b)->a>b?a:b);
      int Smax=list9.stream().reduce(0, (a,b)->a>b&&a<max?a:b);
      System.out.println(Smax);
      
      //ques 10
      List<String>list10=Arrays.asList("Java","Programming","Stream","API","Functional");
      String longest = list10.stream().reduce("",(a, b) -> a.length() > b.length() ? a : b);
      System.out.println("Longest String = " + longest);
      
      //ques 11
      List<Integer>list11=Arrays.asList(10,20,30,40,50);
      double avg1=list11.stream().reduce(0,(a, b)->a+b)/list11.size();
      System.out.println("Avg="+avg1);
      
      //ques 12
      List<Integer>list12=Arrays.asList(12,34,56,78);
      int res=list12.stream().reduce(0, (a,b)->a+(b%10)+(b-(b%10))/10);
      System.out.println(res);
        
      int value =123456;
     int rel =String.valueOf(value).chars().map(c->c-'0').reduce(0,(a,b)->a+b);
     System.out.println(rel);
      
     
   //ques 13
     int n=5;
     int fact=IntStream.rangeClosed(1, n).reduce(1,(a,b)->a*b);
     System.out.println(fact);
     
     
      
      
      
      
      
      
      
      
      

      
	}

}

       

