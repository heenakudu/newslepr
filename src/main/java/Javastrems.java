import java.util.*;
import java.util.stream.Collectors;
import java.util.HashMap;

public class Javastrems {
    public static void main(String[] args) {
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";
        String[] str=string.split(" ");
        int[] len=new int[str.length];
        HashMap<String,Integer> hs=new HashMap<>();


        for(int i=0;i< str.length;i++){
           hs.put(str[i],str[i].length()) ;
           len[i]= str[i].length();
        }
        Arrays.sort(len);
        int min=len[0];
for(Map.Entry<String,Integer> ms:hs.entrySet()){
    if(ms.getValue()==min){
        System.out.println(ms.getKey()+":"+ms.getValue());
    }
}


    }}




