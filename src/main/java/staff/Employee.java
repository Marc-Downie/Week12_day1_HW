package staff;

public class Employee {

    private String name;
    private String niNumber;
    private Double salary;

    public Employee(String name, String niNumber, Double salary){

        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber(){
        return this.niNumber;
    }

    public Double getSalary(){
        return this.salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(Double salary){
        this.salary = salary;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public void raiseSalary(Double raise){
        if(raise >= 0)
            this.salary += raise;
    }

    public Double payBonus(){
        return this.salary * 0.01;
    }
}
