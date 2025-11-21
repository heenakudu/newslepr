import java.util.*;

interface vehicle{
    void  start();
    default  void stop(){
        System.out.println("vehicle stopped");
    }
}
class car implements vehicle{

    public void start() {
        System.out.println("car starts");
    }
}
class Bike implements vehicle{
    public void start() {
        System.out.println("Bike starts");
    }
}

class thsiandsuper {
    public static void main(String[] args) {
        vehicle vh=new car();
        vh.start();
        vehicle hd=new Bike();
        hd.stop();
        Date date=new Date();
        long ms=date.getTime();
        System.out.println(date);
        System.out.println(ms);
        Calendar calendar = Calendar.getInstance();
        int year=calendar.get(calendar.YEAR);
        int month=calendar.get(calendar.MONTH)+1;
        int day=calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        ArrayList<String> a=new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");
        a.remove(a.get(0));
        for(int i=0;i<a.size();i++){
            System.out.println(a.get(i));
        }
      /*  HashSet<String> set=new HashSet<String>();
        set.add("apple");
        set.add("Banna");
        set.add("gvsdg");
        set.remove("gvsdg");
        Iterator<String> i=set.iterator();
        while(i.hasNext()){
System.out.println(i.next());*/
HashMap<Integer,String> map=new HashMap<>();
map.put(1,"Apple");
map.put(2,"Banana");
map.put(3,"Orange");
for(Map.Entry<Integer,String> e: map.entrySet()){
    System.out.println(e.getKey()+":"+e.getValue());
}

        }
    }

