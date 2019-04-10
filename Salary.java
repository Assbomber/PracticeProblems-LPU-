
import java.util.Scanner;
import java.util.ArrayList;

class Employee {
    String name;
    String emp_id;
    // int raw_salary;
    int final_salary;

    public void getEmployee() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the name: ");
        name = scan.nextLine();
        System.out.println("enter the Emp_id: ");
        emp_id = scan.nextLine();
        System.out.println("enter the sal ");
        final_salary = scan.nextInt();

    }
}

class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Employee [] obj=new Employee[2];
        obj[0]=new Employee();
        obj[1]=new Employee();
        ArrayList<Employee> al=new ArrayList<Employee>();
        for (int i=0;i<2;i++){
            obj[i].getEmployee();
            al.add(obj[i]);
        }
        System.out.println("enter the name to look for: ");
        String empname=sc.nextLine();
        for(Employee var:al)
        {
            if(var.name.equals(empname)){
                System.out.println("name: "+var.name+"\n Emp_id: "+var.emp_id+"\n Salary: "+var.final_salary);
            }

        }


    }
}
