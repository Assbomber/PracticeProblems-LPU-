import java.util.Scanner;

class Billing{


    public double computebill(double price){
    return (price*0.8 + price);
    }
    public double computebill(double price, int quantity){
    return (price*0.8)*quantity;
    }
   public double computebill(double price,int quantity,int coupon){
    double am= (price*0.8)*quantity;

   return (am-coupon);
  }
}

class Main{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        Billing obj1=new Billing();
        System.out.println("Enter the price of the Book: "); double price=scan.nextDouble();
        System.out.println("Enter the quantity of the Book: "); int quantity=scan.nextInt();
        System.out.println("Enter the Coupon for a Discout!: "); int coupon=scan.nextInt();
        System.out.println(obj1.computebill(200));
        System.out.println(obj1.computebill(200,3,12));
        System.out.println(obj1.computebill(200,2));

    }

    }
