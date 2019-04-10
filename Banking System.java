/* Q2. write a program to create a banking application in which Display the menu and options are
create acc., deposit, withdraw, bal. enq..
If the user wants to create the new account the ask the user to nter acc. holder name, age,initial
deposit and passwrd the create an acc. object with account number automatically asssigned to the user and
display the details
when the acc. is created. provide the method  to display ...widraw and view bal. Store all the acc. object
in array. if the user wants to deposit,widthdraw or view bla. then ask the user to enter Acc. no. and password.
Confirm the credentials. Fetch the details of the account from the stored account object and display the
account holder name .coressponding to the entered acc. no.
Ask teh user to confirm the account then proceed according to the user choice.
In case Deposit, ask the user to enter the amount to be deposited and update the balance accordingly.
and Display the updated Bal.
In case of widrwal ask the user to enter the amount to the withdrwan . update the bal. if the user is
havingremaining bal. else display "Insufficient bal/"
Incase of bal. enq. display the bal.
*/

//-----------IMPROVEMENT REQUIRED---------------------------IMPROVEMENT REQUIRED------------------------IMPROVEMENT REQUIRED-------------------------------

import java.util.Scanner;
class Records{
    String [] name=new String[100]; String[] password=new String[100]; String[] accNo=new String[100];
    int [] age=new int[100]; int [] deposit=new int[100];

    public void out(int i){
        System.out.println("name: "+name[i]+" age: "+age[i]+" Current Cash: "+deposit[i]);
    }
}
class User{
    String name,password,accNo;
    int deposit,age;
    Records obj = new Records();
    Scanner scan = new Scanner(System.in);
    public void newUser(String name,String password,int deposit,int age){
        for(int i=0;i<100;i++){
            if(obj.accNo[i]==null){
                obj.name[i]=name; obj.password[i]=password; obj.deposit[i]=deposit; obj.age[i]=age;
                obj.accNo[i]=(9608+name);
                System.out.println("~~~Congratulation! Your Account has been created.~~~" +
                        "\n===>Your New Account number is: "+(9608+name)+" \n===> Please save this for future reference");
                break;
            }
        }
    }

    public void throwall(){
        for(int i=0;i<100;i++){
            System.out.println("Accno.: "+obj.accNo[i]+", name: "+obj.name[i]+", age: "+obj.age[i]+", Current Cash: "+obj.deposit[i]);
        }
    }

    public byte submenu(){
        System.out.println("1) Cash Deposit \n2) Cash Withdrawl \n3) Balance Enquiry");
        byte option=scan.nextByte();
        return option;

    }

    public void oldUser() {

        int amount;
        System.out.println("Enter your Account no.: ");
        scan.nextLine();
        String get_accNo = scan.nextLine();

        System.out.println("Enter your Password: ");
        String get_password = scan.nextLine();
        for (int i = 0; i < 100; i++) {
            //  System.out.println(obj.accNo[i]+" right"+get_accNo+" af"+obj.password[i]+" df"+get_password);
            if (obj.accNo[i].equals(get_accNo))
            {
                if (obj.password[i].equals(get_password)) {
                    System.out.println("~~~MATCH FOUND!~~~");
                    switch (submenu()){
                        case 1:System.out.println("Enter amount:");
                            amount=scan.nextInt(); obj.deposit[i]+=amount;
                            System.out.println("===> Amounted deposited! Updated balance: "+obj.deposit[i]);
                            break;
                        case 2: System.out.println("Enter amount:");
                            amount=scan.nextInt();
                            obj.deposit[i]-=amount;
                            System.out.println("===> Updated balance: "+obj.deposit[i]+"\n===> Please collect ur cash");
                            break;
                        case 3:
                            System.out.println("===> Current balance: "+obj.deposit[i]);
                            break;
                    }
                    break;
                }
                else {
                    System.out.println("looks like you Entered a wrong password!");
                    break;
                }
            }
            else if(!(obj.accNo[i].equals(get_accNo))) {
                System.out.println("looking");
                break;
            }


        }
    }

    public void menu(){

        System.out.println("WELCOME TO BANK OF LPU \n Choose below to get started");
        System.out.println("1) New User \n2) Existing User \n3) System admin");
        byte option=scan.nextByte();
        switch (option){
            case 1:
                System.out.println("Enter your age: "); age=scan.nextInt();
                System.out.println("Enter your name: "); name=scan.nextLine();
                scan.nextLine();
                System.out.println("Enter your Password(Combination of letter & numbers): "); password=scan.nextLine();
                System.out.println("Enter your first Deposit: "); deposit=scan.nextInt();
                newUser(name,password,deposit,age);
                break;
            case 2:
                oldUser();
                break;
            case 3:
                scan.nextLine();
                System.out.println("Enter admin password: ");
                String adpass=scan.nextLine();
                System.out.println(adpass);
                if(adpass.equals("@dmin")) {
                    throwall();
                }
                else{System.out.println("Access Denied");}
                break;

        }
    }



}
class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        User obj2=new User();
        while (true) {
            obj2.menu();
        }

    }
}
