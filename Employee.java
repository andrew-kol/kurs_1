public class Employee {

    private String FIO;
    private int Department;
    private float Salary;
    private static int Counter;
    private int Id;


    public int getId() {
        return this.Id;
    }

    public String getFIO() {
        return this.FIO;
    }

    public int getDepartment() {
        return this.Department;
    }

    public float getSalary() {
        return this.Salary;
    }


    public void SetFIO(String fio) {
        this.FIO = fio;
    }

    public void SetDepartment(int dept) {
        this.Department = dept;
    }

    public void SetSalary(float sal) {
        this.Salary = sal;
    }


    public Employee(String fio, int dept, float salary) {
        FIO = fio;
        Department = dept;
        Salary = salary;
        Id = ++Counter;
    }

    @Override
    public String toString() {
        return "Id: " + Id + " Fio: " + FIO + " Dept: " + Department + " Salary: " + Salary;
    }

    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Иванов Иван Иванович", 1, 25500f);
        empl[1] = new Employee("Петров Петр Петрович", 2, 31450f);
        empl[2] = new Employee("Сидоров Сидор Сидорович", 3, 40200f);
        empl[3] = new Employee("Егоров Егор Егорович", 4, 50400f);
        empl[4] = new Employee("Павлов Павел Павлович", 5, 12000f);

        for (Employee e : empl) {
            System.out.println(e);
        }
    }

    public static double minOfSalary(Employee[] arr) {
        double min = maxOfSalary(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (min > arr[i].getSalary()) {
                    min = arr[i].getSalary();
                }
            } else break;
        }
        return min;


    }

    public static double maxOfSalary(Employee[] arr) {
        double max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (max < arr[i].getSalary()) {
                    max = arr[i].getSalary();
                }
            } else break;
        }
        return max;
    }


}


