/*
Codechef
Q.
Chef has recently got a broadband internet connection. His history of internet data usage is provided as below.

During the first T1 minutes, the internet data used was D1 MBs per minute, and during the next T2 minutes, it was D2 MBs per minute, and so on till during last TN minutes it was DN MBs per minute.

The internet provider charges the Chef 1 dollar for every 1 MB data used, except for the first K minutes, when the internet data is free as part of the plan provided to Chef.

Please find out the total amount that Chef has to pay the internet provider (in dollars).

Input
First line of the input contains a single integer TC the number of test cases. Description of TC test cases follow.

First line of each test case contains two space separated integers N and K.

Next N lines of each test case contains information about the internet data usage. Specifically, in the i-th line, there will be two space separated integers: Ti and Di.
*/
import java.util.Scanner;

class Testcases{
    int N,K,T,D;   //TC= test cases, N=no. of minutes, K= free minutes, T= minutes used, D=Mbs/minute
    int rate,look;
    void getData(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for N (Number of minutes):");
        N=sc.nextInt();
        System.out.println("Enter the value for K (free minutes):");
        K=sc.nextInt();
        int array[][]=new int[N][2];            //initializing 2D array type "int" for detail storage
        for(int i=0;i<N;i++){                   //looping till no. of minutes
            System.out.println("Enter the value if T:");
            array[i][0]=sc.nextInt();                     //storing in row "i" & column 0
            System.out.println("Enter the value if D:");
            array[i][1]=sc.nextInt();                     //storing in row "i" & column 1
        }

        if(array[0][0]==K){               //checking if [0,0] is equal to the free minutes
            for(int i=1;i<N;i++){
                rate+=(array[i][0]*array[i][1]);
            }
        }
        else if(array[0][0]>K){              //checking if [0,0] is greater than free minutes
            rate=((array[0][0]-K)*array[0][1]);
            for(int i=1;i<N;i++){
                rate+=(array[i][0]*array[i][1]);
            }
        }
        else{                                  //auto condition for [0,0] less than free minutes
            int i=0;
            while(!(look>=K)){   //adding values of column "0" till >= free minutes and storing in "look"
                look+=array[i][0];
                i++;
            }
            if(look>K){                    //checking if look is greater than free minutes
                rate=(look-K)*array[i-1][1];
                for(i=i;i<N;i++){
                    rate+=(array[i][0]*array[i][1]);
                }
        }
            else{                      //auto condition for look equals to free minutes
                for(i=i;i<N;i++){
                    rate+=(array[i][0]*array[i][1]);
                }
            }
        }

    System.out.println("rate is :"+rate);
    }
}
class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of test cases");
        int tc = scan.nextInt();                         //scanning no. of test cases
        Testcases[] obj = new Testcases[tc];
        for (int i = 0; i < tc; i++) {                  //creating objects for number of Test cases
            obj[i] = new Testcases();
            obj[i].getData();
        }

    }
}
