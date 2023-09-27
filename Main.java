import java.util.*;

public class Main {
    public static void main(String[] args){
        System.out.println();
        int n = 2, star = 15;
        for (int row = 1; row <= n; row++) {
            // stars
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if (row == n / 2) {
                System.out.println("\tMK CAR SERVICE STATION\t");
            }
        }

        System.out.println();
        System.out.println("What type of Car you Want to Service");
        System.out.println("1. SEDAN\t\t\t2. SUV\t\t\t3. HATCHBACK");
        System.out.println();
        System.out.println("Select your choice by entering number");
        System.out.print("-------------------------------------");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int typeNum = sc.nextInt(); // we are taking type in as number input
        System.out.println();
        if(typeNum==1){
            Sedan c1 = new Sedan();
            c1.SedanCS();
//            System.out.print("Sedan");
        }else if(typeNum==2){
            SUV s1 = new SUV();
            s1.SUVCS();
        }else if(typeNum==3){
            HatchBack h1 = new HatchBack();
            h1.HatchBackCS();
        }else{
            System.err.print("❌ Wrong Input, Please Try Again! ❌");
        }
    }
}
