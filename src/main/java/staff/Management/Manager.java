package staff.Management;

public class Manager {

    private String name;
    private String niNumber;
    private Double salary;
    private String deptName;

    public Manager(String name, String niNumber, Double salary, String deptName){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }
}

