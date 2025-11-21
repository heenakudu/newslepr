package CentralizaData;

import java.util.*;
import java.util.stream.Collectors;



class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class StreamsComplete {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 15);
int mnb=numbers.stream().min(Integer::compareTo).orElse(-1);
int maxc=numbers.stream().max(Integer::compareTo).orElse(-1);
System.out.println(maxc);

    }
}
