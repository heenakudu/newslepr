package CentralizaData;

public class yolo {
    public String Name;
    public int age;

    public yolo(){
        this.Name="Unknown";
        this.age=0;
    }
    public yolo(String Name,int age){
        this.Name=Name;
        this.age=age;
        if(age>0){
            this.age=age;
        }
        else{
            this.age=0;
        }
    }
    public String Getname(){
        return Name;
    }
    public int Getage(){
        return age;
    }
}

