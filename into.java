import java.util.Scanner;


public class into {
    public static void main(String[] args) {
        int studentPop = 39740;
        int tuition = 9972;
        int infected_students = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the amount of days: ");
        int D = scan.nextInt();

        for (int i = 1; i <= D; i++) {
            infected_students += infection(i);
        }

        float percentage = (infected_students/studentPop) * 100;

        System.out.println("Infected Students: " + infected_students);
        System.out.println("Percentage of student population infected: " + percentage + "%");

        infected_students = 0;
    

        for (int i = 1; i <= 14 && i <= D; i++) {
            infected_students += infection(i);
        }
        
        System.out.println("Amount tuition lost after 14 days: " + (infected_students * tuition));

    }
    static double infection(int D) {
        int i = 7;
        double r = 1.2;

        if (D == 1) {
            return i;
        }
        else {
            return r * infection(D-1);
        }
    }
}