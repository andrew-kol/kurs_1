public class Easy {
    private static Employee[] employees = new Employee[5];




    public static float calculateAverageSalary(){

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
