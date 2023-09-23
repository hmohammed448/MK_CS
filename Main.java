import  java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Welcome 🙏 to Pappu car service Station.");
        System.out.println("As of now we have services for these 3 cars only \n 1.HetchBack, \n 2.Sedan \n 3.SUV.");
        System.out.println("What type car you have?");
        String carType = cin.nextLine();
        carType = carType.toLowerCase();
        if(carType.equals("hetchback")){
            HetchBack t1 = new HetchBack();
            t1.HetchBackInput();
        }else if(carType.equals("sedan")){
            Sedan t1 = new Sedan();
            t1.SedanInput();
        }else if(carType.equals("suv")){
            SUV t1 = new SUV();
            t1.SUVInput();
        }else {
            System.out.println("As of now we don't have services for this type of car.");
        }
    }
}
