public class Person {
    private String Name;
    private int Age;

    Person(String Name,int Age){
        this.Age=Age;
        this.Name=Name;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
}
