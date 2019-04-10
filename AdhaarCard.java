import java.util.Scanner;

/* write a program to define an interface person containing abstract method which returns obj of adhaar
card class. Now create a class Student which contains attributes like Reg. no., Name,and a inner class
adhaar card having attributes for adhaar no.. Student class also implements person interface.. Implement
 interface method such that it reads the name given by user and automaticalyy assignes unique reg. no.
 and unique adhaar no. to each student obj. Create a main class and create  three studen obj and display
 name,reg.no and adhaar no. to each student obj.
 */
import java.util.Scanner;
import java.util.Random;
interface Person{
    Student.Adhaar fun(String nam,int reg) ;
}
class Student implements Person {
    int regNo;
    String name;
    class Adhaar{
        int adhaarNo;

    }
    public Student.Adhaar fun(String nam,int reg){
        Adhaar object=new Adhaar();
        regNo=reg;
        name=nam;
        Random rand=new Random();
        object.adhaarNo= rand.nextInt(99999);  
        return object;

    }
}
class Main{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        Student[] obj=new Student[3];
        for(int i=0;i<3;i++){                                                 //creating three Objects
            obj[i]=new Student();
        }

        Student.Adhaar []arr=new Student.Adhaar[3];                           //to store returned object by function "fun" in Student
        for(int i=0;i<3;i++){                                                 //Requesting Input
            System.out.println("Enter the name: ");
                    String name=scan.nextLine();
            System.out.println("Enter the RegNo: ");
                    int regNo=scan.nextInt();
                    scan.nextLine();
                    arr[i]=obj[i].fun(name,regNo);                              //Storing returned object
        }
        for(int i=0;i<3;i++){                                                   //Displaying data
            System.out.println("_________________________________________");
            System.out.println(obj[i].regNo);
            System.out.println(obj[i].name);
            System.out.println(arr[i].adhaarNo);
        }


    }
}
