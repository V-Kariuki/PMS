package src;

public class Department {
    private String Department_Name;
    public Department (String _department_Name){
        Department Depa = new Department("Oncology");
        Department_Name = _department_Name;
    }
    public String getDepartment(){
        return Department_Name;
    }
}