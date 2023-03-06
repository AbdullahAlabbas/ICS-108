package Labs.Lab11;

public class Main {
    public static void main(String[] args) {


        Student[] students = {
                new Graduate("201556190", "Ali Ahmed", "0555906372", 3.4, "Data Science"),
                new Graduate("201543871", "Reda Mohammed", "0503478890", 2.1, "Machine Learning"),
                new Undergraduate("202163120", "Abdullah Hassan", "0567987070", 2.9, "SR"),
                new Undergraduate("202156294", "Haider Basel", "0509987863", 3.4, "JR")
                            };

        System.out.println("List of graduates: ");
        for( Student graduate : students) if(graduate instanceof Graduate) System.out.println(graduate);
        System.out.print("average GPA: ");
        double sum = 0;
        int counter = 0;

        for(Student i : students) {
            if ((i instanceof Graduate)) {
                sum += ((Graduate) i).getGpa();
                counter ++;
            }
        }
        System.out.println(sum / counter);
        System.out.println("===================================================================================================");
        System.out.println("List of undergraduates");
        for( Student under : students) if(under instanceof Undergraduate) System.out.println(under);
        System.out.print("average GPA: ");
        double sumForUnder = 0;
        int counterForUnder = 0;

        for(Student j : students) {
            if ((j instanceof Undergraduate)) {
                sumForUnder += ((Undergraduate) j).getGpa();
                counterForUnder ++;
            }
        }
        System.out.println(sumForUnder / counterForUnder);


    }}
