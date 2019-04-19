/*
Create a array that contains Debit card numbers and corresponding balance as a database. Prompt user to enter card number and if the 
card number matches to any card in array, request him to enter amount to pay. Print "Balance low" if the amount is greater than the 
available balance else "paid successfully". Print "blocked" and exit if user enters incorrect card details for 3 times.
*/
import java.util.Scanner;

class Excep extends Exception {
    Excep() {
        System.out.println("Invalid Card number!");
    }
}
class Class1{
    int count = 0;
    private int array[][]={{465789,258964,245486},      //Details
            {2000,3000,4000}};

    public void fun1() throws Excep {
        Scanner scan = new Scanner(System.in);
        S:

        while (true){
            if(count>=1) System.out.println("\nOops can't find you, Let's Try Again!");
        System.out.println("Enter the Card number: ");
        int num = scan.nextInt();
        scan.nextLine();           //reading \n


            for (int i = 0; i < 3; i++) {
                if (num == array[0][i]) {
                    System.out.println("Enter the balance: ");
                    int bal = scan.nextInt();
                    if (bal <= array[1][i]) {System.out.println("paid Successfully!"); System.exit(0);}
                    else {System.out.println("Insufficient balance!"); System.exit(0);}
                }

                }
            ++count;
            try {
                if (count == 3) {
                    System.out.println("!!!Card blocked | Reason: multiple tries!!!");
                    System.exit(0);
                }
                throw new Excep();
            }
            catch(Excep e){}

        }
    }
}
class Main{
    public static void main(String [] args){
        Class1 obj=new Class1();
        try {
            obj.fun1();
        }
        catch (Excep e){
        }
    }
}
