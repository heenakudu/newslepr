package CentralizaData;

import io.cucumber.java.sl.In;
import org.testng.Assert;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jadscorprac {
    public static void main(String[] args){
//        List<String> lst= Arrays.asList("heena", "kudu", "Arun");
//  List<String> sa=lst.stream().filter(s->s.endsWith("a")).collect(Collectors.toList());
//        List<String> sa2= lst.stream().filter(s -> s.startsWith("A")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
//        Stream<String>  newstr=Stream.concat(sa.stream(),sa2.stream());
//        newstr.sorted().forEach(s->System.out.println(s));
//        boolean flag=newstr.anyMatch(s->s.equalsIgnoreCase("heena"));
//        Assert.assertTrue(flag);
        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream",
                "Structure", "Sorting", "State"
        );
        List<String> namesup= names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        String sa="mmmgfnkkjhy";
        char[] ch=sa.toCharArray();

       List<Character> lst=new ArrayList<>();
       for(char c:ch){
           lst.add(c);
       }
     List<Character> newn=lst.stream().distinct().collect(Collectors.toList());
       StringBuilder sb=new StringBuilder();
       for(char m:newn){
          sb.append(m);

       }
     System.out.println(sb);
boolean res=names.stream().anyMatch(s->s.startsWith("S"));
        System.out.println(res);
        List < Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        OptionalDouble average = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average();
        //System.out.println(average);
        //Double avg=nums.stream().mapToDouble(Integer::doubleValue).average();
        List <Integer> numbers = Arrays.asList(1, 2, 3,5,5, 4, 5, 6,9,9, 7, 8, 9, 10);
        int sumofeven=numbers.stream().filter(s->s%2==0).mapToInt(Integer::intValue).sum();
        int sumofodd=numbers.stream().filter(m->m%2!=0).mapToInt(Integer::intValue).sum();
        numbers.stream().distinct().forEach(n->System.out.println(n));
       //
        List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
        List<String> colsorted=colors.stream().sorted().collect(Collectors.toList());
        List<String> desccol=colors.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        Integer maxval=numbers.stream().max(Integer::compare).orElse(null);
        Integer minval=numbers.stream().min(Integer::compare).orElse(null);
        List <Integer>  secsmall=numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(secsmall.get(1));
    }
}
