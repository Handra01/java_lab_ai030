import java.util.Scanner;

class Main {
    String name;
    int age, dur, totalamt;
    boolean member_detail;
    int fee=2500;

    void calculate() {
            this.totalamt = this.fee * this.dur;
        }
}
public class GYM {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of members :");
            int n= sc.nextInt();

                System.out.print("Enter the Name :");
                String name=sc.nextLine();
                System.out.print("Enter the Age :");
                int age= sc.nextInt();
                System.out.print("Enter the Member ship Details :");
                boolean member_detail=sc.nextBoolean();
                System.out.print("Enter the Duration(in months) :");
                int duration= sc.nextInt();
                System.out.print("The total amount :");


        }
    }

