public class Employee {
    private String Name;
    private  String Department;
    private int Salary;

    Employee(String Name,String Department,int Salary){
        this.Name=Name;
        this.Department=Department;
        this.Salary=Salary;
    }

    public String GetName(String name,int number){
        return Name;
    }
    public String GetDeprtmnt(){
        return  Department;
    }
    public int GetSalary(){
        return  Salary;
    }
}
