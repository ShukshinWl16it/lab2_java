public class Employee {
    private String name;
    private String departmentName;
    private Employee boss;
    private static Employee[] allEmployees=new Employee[50];
    private static int count=0;
    public Employee(){
        this.name="Неизвестный отдел";
        this.departmentName="Неизвестный отдел";
        addEmployee(this);
    }
    public Employee(String name,String departmentName){
        this.name=name;
        this.departmentName=departmentName;
        addEmployee(this);
    }
    public Employee(String name,String departmentName,Employee boss){
        this.name=name;
        this.departmentName=departmentName;
        this.boss=boss;
        addEmployee(this);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDepartmentName(){
        return departmentName;
    }

    public void setDepartmentName(String departmentName){
        this.departmentName=departmentName;
    }
    public Employee getBoss(){
        return boss;
    }
    public void setBoss(Employee boss){
        this.boss=boss;
    }
    @Override
    public String toString(){
        if(boss==null||this==boss){
            return name+" начальник отдела "+departmentName;
        }
        else{
            return name+" работаетe в отделе "+departmentName+", начальник которого "+boss.getName();
        }

    }
    private void addEmployee(Employee employee){
        allEmployees[count]=employee;
        count++;
    }
    public Employee[] getDepartmentEmployees(){
        int c=0;
        for(int i=0;i<count;i++){
            if(allEmployees[i].getDepartmentName()==this.departmentName){
                c++;
            }
        }
        Employee[] departmentEmployees=new Employee[c];
        int index=0;
        for(int i=0;i<count;i++){
            if(allEmployees[i].getDepartmentName()==this.departmentName){
                departmentEmployees[index]=allEmployees[i];
                index++;
            }
        }
        return departmentEmployees;
    }
    public static void printEmployees(Employee[] employees){
        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
        }
    }

}
