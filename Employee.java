public class Employee {

    private String name;
    private String lastName;
    private String middleName;
    private int department;
    private int salary;
    private static int counter = 0;
    private Integer id;


    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getMiddleName(){
        return this.middleName;
    }

    public int getDepartment() {
        return this.department;
    }

    public float getSalary() {
        return this.salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(int dept) {
        this.department = dept;
    }

    public void setSalary(int sal) {
        this.salary = sal;
    }


    public Employee(String fio, int dept, float salary) {
        fio = fio;
        department = dept;
        salary = salary;
        id = ++counter;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name " + name + " LastName " + lastName + " MiddleName " + middleName + " Dept: " + department + " Salary: " + salary;
    }




}


