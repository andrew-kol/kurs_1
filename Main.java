public class Main {

    public static void main(String[] args) {
        Employee[] empl = new Employee[5];
        empl[0] = new Employee("Иван", "Иванов", "Иванович", 1, 25623f);
        empl[1] = new Employee("Петр", "Петров", "Петрович", 2, 31450f);
        empl[2] = new Employee("Сидор", "Сидоров", "Сидорович", 3, 40200f);
        empl[3] = new Employee("Егор", "Егоров", "Егорович", 4, 50400f);
        empl[4] = new Employee("Павел", "Павлов", "Павлович", 5, 12000f);

        for (Employee e : empl) {
            System.out.println(e);

        }

        System.out.println("Зарплата минимальная " + minOfSalary(empl));

        System.out.println("Зарплата максимальная " + maxOfSalary(empl));
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

        }





