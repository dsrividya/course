import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class MergetwoSorted{

   
public static void main(String[] args)
{
     List<Integer> st= Arrays.asList(3,4,2,1,3,4,9);
     List<Integer>s= st.stream().sorted() .collect(Collectors.toList());
     System.out.println(s);
     IntStream intStream = IntStream.of(1, 2, 3, 4, 5);
     intStream.forEach(System.out::println);


}
}

