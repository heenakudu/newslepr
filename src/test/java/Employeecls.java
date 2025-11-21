public class Employeecls {
    private int id;
    private String Name;
    int Salary;
    String Department;
    Employeecls(String Name,int Salary,int id,String Department){
        this.Name=Name;
        this.Salary=Salary;
        this.id=id;
        this.Department=Department;
    }
  public  int getId(){
        return  id;
  }
  public  String getName(){
        return  Name;
  }
    public  int getSalary(){
        return  Salary;
    }
    public String getDept(){
        return Department;
    }
    @Override
    public String toString(){
        return "ID:"+id+",Name:"+Name+",Salary:"+":"+Salary+",Department:"+Department;
    }
}
