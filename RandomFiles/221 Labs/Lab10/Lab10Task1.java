// public class Lab10Task1 {
//     public static PartTimeEmployee[] addPartTimeEmployee(PartTimeEmployee[] employeesArray,
//             PartTimeEmployee addWorker) {
//         PartTimeEmployee[] newEmployeesArray = new PartTimeEmployee[employeesArray.length + 1];
//         for (int i = 0; i < employeesArray.length; i++) {
//             newEmployeesArray[i] = employeesArray[i];
//         }
//         newEmployeesArray[employeesArray.length] = addWorker;
//         return newEmployeesArray;
//     }

//     public static FullTimeEmployee[] addFullTimeEmployee(FullTimeEmployee[] employeesArray,
//             FullTimeEmployee addWorker) {
//         FullTimeEmployee[] newEmployeesArray = new FullTimeEmployee[employeesArray.length + 1];
//         for (int i = 0; i < employeesArray.length; i++) {
//             newEmployeesArray[i] = employeesArray[i];
//         }
//         newEmployeesArray[employeesArray.length] = addWorker;
//         return newEmployeesArray;
//     }

//     public static void main(String[] args) throws Exception {
//         Employee[] workers = {
//                 new FullTimeEmployee(123456, "Apple", 10000.0),
//                 new FullTimeEmployee(234561, "Banana", 20000.0),

//                 new PartTimeEmployee(345612, "Carrot", 10.0),
//                 new PartTimeEmployee(456123, "Potato", 20.0)
//         };

//         double averageSalary = 0;
//         PartTimeEmployee partTimeEmployee;
//         PartTimeEmployee[] partTimeEmployees = {};

//         double averageHours = 0;
//         FullTimeEmployee fullTimeEmployee;
//         FullTimeEmployee[] fullTimeEmployees = {};

//         for (int i = 0; i < workers.length; i++) {
//             Employee worker = workers[i];
//             if (worker instanceof PartTimeEmployee) {
//                 partTimeEmployee = (PartTimeEmployee) worker;
//                 averageHours += partTimeEmployee.getHours();
//                 partTimeEmployees = addPartTimeEmployee(partTimeEmployees, partTimeEmployee);
//             } else if (worker instanceof FullTimeEmployee) {
//                 fullTimeEmployee = (FullTimeEmployee) worker;
//                 averageSalary += fullTimeEmployee.getSalary();
//                 fullTimeEmployees = addFullTimeEmployee(fullTimeEmployees, fullTimeEmployee);
//             }
//         }

//         for (int i = 0; i < partTimeEmployees.length; i++) {
//             System.out.println(partTimeEmployees[i]);
//         }
//         System.out.printf("Average Hours: %.2f\n", averageHours / partTimeEmployees.length);

//         System.out.println();

//         for (int i = 0; i < fullTimeEmployees.length; i++) {
//             System.out.println(fullTimeEmployees[i]);
//         }
//         System.out.printf("Average Salary: %.3f\n", averageSalary / fullTimeEmployees.length);
//     }
// }