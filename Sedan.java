import java.util.*;
public class Sedan {
    public static void SedanCS() {
        System.out.println("1. BS01\t:Basic_Servicing :\t₹ 4,000/-");
        System.out.println("2. EF01\t:Engine_Fixing\t:\t₹ 8,000/-");
        System.out.println("3. CF01\t:Clutch_Fixing\t:\t₹ 4,000/-");
        System.out.println("4. BF01\t:Brake_Fixing\t:\t₹ 1,500/-");
        System.out.println("5. GF01\t:Gear_Fixing\t:\t₹ 6,000/-");
        System.out.println();

        System.out.println("How many services you want?");
        System.out.println("__________________________");

        Scanner sc = new Scanner(System.in);
        int howMany = sc.nextInt(); // number of services
        System.out.println();

        System.out.println("Choose using Service Code OR Service Name");
        System.out.println("-----------------------------------------");

        String[] numberOfServices = new String[howMany];
        for(int i=0;i<howMany;i++){
            numberOfServices[i] = sc.next().toLowerCase(); // taking by service code;
        }
        System.out.println();

        // String Array
        int totalAmount = 0;
        for(String x : numberOfServices){
            totalAmount += spareAmount(x);
        }
        System.out.println();

        if(totalAmount>=10000){
            System.out.println("Congratulations! 🎉 You are eligible for FREE CAR Washing.");
            System.out.println("Your Bill Total Amount is : ");
            for(String x : numberOfServices){
                System.out.println(x + "\t:\t" + spareAmount(x));
            }
            System.out.println("Total Amt.\t=\t" + totalAmount);
        }else
        {
            System.out.println("Your Bill Total Amount is : ");
            for(String x : numberOfServices){
                if(spareAmount(x)==0){
                    System.err.println(x + "\t:\t" + spareAmount(x) + " (Service Not Available)");
                }else{
                    System.out.println(x + "\t:\t" + spareAmount(x));
                }
            }

            System.out.println("_________________________");
            System.out.println("Total Amt.\t=\t" + totalAmount);
        }

        System.out.println();
        System.out.println("THANK YOU. 🙏 VISIT AGAIN!");
        System.out.println("_________xxx_________");
        System.out.println();
    }
    public static int spareAmount(String str){
        if(str.equals("bs01") || str.equals("basic_servicing")){
            return 4000;
        }else if(str.equals("ef01") || str.equals("engine_fixing")){
            return 8000;
        }else if(str.equals("cf01") || str.equals("clutch_fixing")){
            return 4000;
        }else if(str.equals("bf01") || str.equals("brake_fixing")){
            return 1500;
        }else if(str.equals("gf01") || str.equals("gear_fixing")){
            return 6000;
        }
        return 0;
    }
}
