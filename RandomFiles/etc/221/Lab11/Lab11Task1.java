// public class Lab11Task1 {
//     public static Employee[] createEmployeeArray() {
//         return new Employee[] {
//                 new FullTimeEmployee(123456, "Apple", 10000.0),
//                 new FullTimeEmployee(234561, "Banana", 20000.0),

//                 new PartTimeEmployee(345612, "Carrot", 10.0),
//                 new PartTimeEmployee(456123, "Potato", 20.0)
//         };
//     }

//     public static void printFullTimeEmployees(Employee[] employeeArray) {
//         Employee currentEmployee;
//         for (int i = 0; i < employeeArray.length; i++) {
//             currentEmployee = employeeArray[i];
//             if (currentEmployee instanceof FullTimeEmployee)
//                 System.out.println((FullTimeEmployee) currentEmployee);
//         }
//     }

//     public static double avgSalaryFullTimeEmployees(Employee[] employeeArray) {
//         double average = 0.0;
//         Employee currentEmployee;
//         for (int i = 0; i < employeeArray.length; i++) {
//             currentEmployee = employeeArray[i];
//             if (currentEmployee instanceof FullTimeEmployee)
//                 average += ((FullTimeEmployee) currentEmployee).getSalary();
//         }
//         return average;
//     }

//     public static void printPartTimeEmployees(Employee[] employeeArray) {
//         Employee currentEmployee;
//         for (int i = 0; i < employeeArray.length; i++) {
//             currentEmployee = employeeArray[i];
//             if (currentEmployee instanceof PartTimeEmployee)
//                 System.out.println((PartTimeEmployee) currentEmployee);
//         }
//     }

//     public static double avgHoursPartTimeEmployees(Employee[] employeeArray) {
//         double average = 0.0;
//         Employee currentEmployee;
//         for (int i = 0; i < employeeArray.length; i++) {
//             currentEmployee = employeeArray[i];
//             if (currentEmployee instanceof PartTimeEmployee)
//                 average += ((PartTimeEmployee) currentEmployee).getHours();
//         }
//         return average;
//     }

//     public static void main(String[] args) throws Exception {
//         Employee[] employeeArray = createEmployeeArray();

//         printFullTimeEmployees(employeeArray);
//         double avgSalary = avgSalaryFullTimeEmployees(employeeArray);
//         System.out.printf("avg salary of full-time employees = %f\n", avgSalary);

//         System.out.println();

//         printPartTimeEmployees(employeeArray);
//         double avgHours = avgHoursPartTimeEmployees(employeeArray);
//         System.out.printf("avg hours of part-time employees = %f\n", avgHours);
//     }
// }