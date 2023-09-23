import java.util.Scanner;

public class SUV {
    public void SUVInput(){

        System.out.println("For you car we have total 5 types services available as of now.");
        System.out.println("The list of services is give below...");
        System.out.println("1.Basic_Servicing. Code: BS01 ,Charge: 5000");
        System.out.println("2.Engine_Fixing. Code: EF01 ,Charge: 10000");
        System.out.println("3.Clutch_Fixing. Code: CF01 ,Charge: 6000");
        System.out.println("4.Brake_Fixing. Code: BF01 ,Charge: 2500");
        System.out.println("5.Gear_Fixing. Code: GF01 ,Charge: 8000");
        System.out.println("How many services you want to take?");
        Scanner cin = new Scanner(System.in);
        int numberOfServices = cin.nextInt();
        System.out.println("Give me the code  of all "+ numberOfServices +" services you want to take.");
        String [] services = new String[numberOfServices];

        int totalAmount = 0;
        for(int i=0; i<numberOfServices; i++){
            services[i] = cin.next().toLowerCase();
            totalAmount+=chargeForGivenSerive(services[i]);
        }
        System.out.println("Original Bill...  @Pappu Car Service Station");
        for(int i=0; i<numberOfServices; i++){
            System.out.println(services[i] + " : " + chargeForGivenSerive(services[i]));
        }
        if(totalAmount >= 10000){
            System.out.println("Congratulation!🎉 You are eligible for free Car Washing Service.");
        }
        System.out.println("Thank you 🙏 for visiting ``Pappu Car Service Station`` please visit again...!");
        System.out.println("Total Amount: " + totalAmount);
    }
    public static int chargeForGivenSerive(String typeOfService){
        int charge = 0;
        if(typeOfService.equals("basic_servicing") ||typeOfService.equals("bs01") ){
            charge = 5000;
        }else if( typeOfService.equals("engine_fixing") ||typeOfService.equals("ef01") ){
            charge = 10000;
        }
        else if( typeOfService.equals("clutch_fixing") ||typeOfService.equals("cf01") ){
            charge =6000;
        }
        else if( typeOfService.equals("brake_fixing") ||typeOfService.equals("bf01") ){
            charge =2500;
        }
        else if( typeOfService.equals("gear_fixing") ||typeOfService.equals("gf01") ){
            charge =8000;
        }else {
            System.out.println("As of now we don't have " +  typeOfService  + " for this type of car.");
        }
        return charge;
    }
}
