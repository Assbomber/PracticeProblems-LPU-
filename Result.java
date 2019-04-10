/*
Q. Create a superclass "Student" with some class variables and an abstract boolean ispassed(double grade) method. Create two extended class "undergrad" and "grad" with overrided method boolean ispassed(double grade). pass the grade to each of extended class and return whether they are passed or not
*/

abstract class Student {                     //Student
    String name, address;
    byte age;
    // grade;
    Student(String name, String address, byte age){
        this.name=name;
        this.address=address;
        this.age=age;
    }
    abstract boolean ispassed(double grade);

    public void display(){
        System.out.println("name:"+name+" address:"+address+" age:"+age);
    }
}
class Undergrad extends Student{                            //Extended Undergrad
    Undergrad(String name,String address,byte age){
        super(name, address, age);
    }
    boolean ispassed(double grade){

        if (grade>70){
            display();
           // System.out.println("Result: Passed");
            return true;
        }
        else{
            display();
          //  System.out.println("Result: failed");
            return  false;
        }
    }
}
class Grad extends Student{                              //Extended Grad
    Grad(String name,String address,byte age){
        super(name, address, age);
    }
    boolean ispassed(double grade){
        if (grade>80){
            display();
            //System.out.println("Result: Passed");
            return true;
        }
        else{
            display();
           // System.out.println("Result: failed");
            return false;
        }
    }
}

class Main{                                               //Main
    public static void main(String [] args){
        Grad obj=new Grad("Aman","lucknow",(byte)21);
        Undergrad obj2=new Undergrad("Amit","himachal",(byte)22);
        if(obj2.ispassed(55)==true){
            System.out.println("Passed");
        }
        else{
            System.out.println("failed");
        }

        if(obj.ispassed(89)==true){
                System.out.println("Passed");
            }
            else{
                System.out.println("failed");
            }
        }
    }
