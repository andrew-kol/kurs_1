public class Main {
    private static Employee[] employees = new Employee[5];


    public static void main(String[] args) {
       // Employee[] empl = new Employee[5];
        Employee emp1 = new Employee("Иван", "Иванов", "Иванович", 1, 25623f);
        Employee emp2 = new Employee("Петр", "Петров", "Петрович", 2, 31450f);
        Employee emp3 = new Employee("Сидор", "Сидоров", "Сидорович", 3, 40200f);
        Employee emp4 = new Employee("Егор", "Егоров", "Егорович", 4, 50400f);
        Employee emp5 = new Employee("Павел", "Павлов", "Павлович", 5, 12000f);

employees[0] = emp1;
employees[1] = emp2;
employees[2] = emp3;
employees[3] = emp4;
employees[4] = emp5;
        for (Employee e : employees) {
            System.out.println(e);

        }

        System.out.println("Зарплата минимальная " + minOfSalary(employees));

        System.out.println("Зарплата максимальная " + maxOfSalary(employees));

        System.out.println("Зарплата средняя " + calculateAverageSalary(employees));

       // System.out.println("Зарплата полная " + calculateTotalSalary(employees));

    }

     //  public static int calculateTotalSalary(Employee[] arr){
   // int sum = 0;
    //for (Employee employee : employees);{
       // sum += employee.getSalary();
         //  }
          // return sum;
  //  }
    public static void printEmployees(){
        for (Employee employee : employees) {
            System.out.println(employee) ;

        }
    }
    public static double minOfSalary(Employee[] arr) {
        double min = maxOfSalary(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (min > arr[i].getSalary()) {
                    min = arr[i].getSalary();
                }
            } else continue;
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
            } else continue;
        }
        return max;
    }
    public static float calculateAverageSalary(Employee[] arr){
        int count = 0;
        int sum = 0;
        for (Employee employee: employees){
            if (employee != null ){
                count++;
                sum += employee.getSalary();
            }
        }
        return (float) sum/count;
    }
        }





