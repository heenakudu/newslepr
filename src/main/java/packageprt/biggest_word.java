package packageprt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class biggest_word {
    public static void main(String[] args){
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";
        String[] str = string.split(" ");
        int[] len = new int[str.length];

        TreeMap<String, Integer> hs = new TreeMap<>();


        for(int i = 0; i < str.length; i++) {
            hs.put(str[i], str[i].length());
            len[i] = str[i].length();
        }

        Arrays.sort(len);
       int max = len[str.length-1];
       for(Map.Entry<String, Integer> entry:hs.entrySet()){
           if(entry.getValue()==max){
               System.out.println(entry.getKey()+":"+entry.getValue());
           }
       }
    }
}
