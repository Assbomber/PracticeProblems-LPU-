/* Create a program for restaurant billing system with menu as "starter", "main meal" and "drinks". Each menu contains submenu with
some dishes.Task is to recieve order and at end of every order ask user to Delete, Add More items or Confirm.
*/

import java.util.Scanner;

class Res{

       String[] starter={"ABC","DEF","GHI"};
       int [] starterval={22,33,44};
    String[] mainMeal={"ASD","QWE","ZXC"};
    int [] mainval={55,66,77};
    String[] drinks={"POI","LKJ","MNB"};
    int [] drinksval={88,99,100};
    int total=0;

    public void menu(){
        System.out.println("WELCOME TO RES");
        System.out.println("1. Starter");
        System.out.println("2. Main Meal");
        System.out.println("3. Drinks");
    }

    public void innermenuStarter(){
        System.out.println("0."+starter[0]);
        System.out.println("1."+starter[1]);
        System.out.println("2."+starter[2]);
    }

    public void innermenumain(){
        System.out.println("0."+mainMeal[0]);
        System.out.println("1."+mainMeal[1]);
        System.out.println("2."+mainMeal[2]);
    }

    public void innermenudrinks(){
        System.out.println("0."+drinks[0]);
        System.out.println("1."+drinks[1]);
        System.out.println("2."+drinks[2]);
    }

    public void controller(){
        Scanner scan= new Scanner(System.in);
        Res obj1=new Res();

        obj1.menu();
        int option2;
        System.out.println("Enter the Option: ");
        int option=scan.nextInt();
        switch(option){
            case 1:
                obj1.innermenuStarter();
                System.out.println("Choose ur dish: ");
                option=scan.nextInt();
                System.out.println("Choose the quantiity");
                option2=scan.nextInt();
                total+=(starterval[option])*option2;
                System.out.println("Current added item is "+starter[option]+" and the total bill is: "+total);

                break;
            case 2:
                obj1.innermenumain();
                System.out.println("Choose ur dish: ");
                option=scan.nextInt();
                System.out.println("Choose the quantiity");
                option2=scan.nextInt();
                total+=(mainval[option])*option2;
                System.out.println("Current added item is  "+mainMeal[option]+" and the total bill is: "+total);
                break;
            case 3:
                obj1.innermenudrinks();
                System.out.println("Choose ur dish: ");
                option=scan.nextInt();
                System.out.println("Choose the quantiity");
                option2=scan.nextInt();
                total+=(drinksval[option])*option2;
                System.out.println("Current added item is  "+drinks[option]+" and the total bill is: "+total);
                break;
        }
    }

    public void finale(){
        Scanner s=new Scanner(System.in);
        System.out.println("Do you want to 1) Restart 2) add More 3) Confirm");
        int check=s.nextInt();
        switch (check){
            case 1: total=0; System.out.println("Oho! No issues, lets pick again");
            break;
            case 2: System.out.println("Sure lets do it again!");
            break;
            case 3:
                System.out.println("Alright then! We are Sending your order to our kitchen. Expect up to 30 mins");
                System.exit(0);
            break;
        }

    }

}

class Main{
    public static void main(String [] args){
        Res myobj=new Res();
        boolean a= true;
        while(a){
        myobj.controller();
        myobj.finale();
        }

    }
}
