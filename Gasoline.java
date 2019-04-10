/*when gasoline is 100 $ per barrel then the consumer price at the petrol pump is b/w 3.5 $ & 4 $
 per gallon create a class named gas price.
its main method holds int variable name: price /barrel to which you will assign a value entered by a usr
at the keyboard.
Create a method to which you pass price/barrel. The method displays the range of possible prices/gallon.
for eg. If gas is 120$ /barrel theen the pprice at pump should be b/w 4.2 $-4.8$.
*/
import java.util.Scanner;
class GasPrice{
    GasPrice(float price){                             //Constructor with  1 para. Initialized
        System.out.println("The current pricing at the pump may be: $"+(price/30)+" to $"+((price/30)+0.5)+" per Gallon");
    }
}
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter cuurent price per Barrel: "); float price_Barrel=scan.nextFloat();
        GasPrice obj1=new GasPrice(price_Barrel);
    }
}
