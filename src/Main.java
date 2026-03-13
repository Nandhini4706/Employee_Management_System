import Model.Employee;
import Service.EmployeeService;
import db.DBConnection;

import java.security.Provider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class Main{
    public static void main(String[]args) throws Exception{
        Scanner sc=new Scanner(System.in);
        Connection con= DBConnection.getConnection();
        EmployeeService service=new EmployeeService(con);
     /*   if(con != null){
            System.out.println("Connected Successfully");
        }else{
            System.out.println("Connection Failed");
        }

      */

        while(true) {
            System.out.println("-----------------------------------Menu------------------------------------------");
            System.out.println("1.Add Employee");
            System.out.println("2.View Employee");
            System.out.println("3.Exit");
            System.out.println("---------------------------------------------------------------------------------");

            int n=sc.nextInt();
            switch(n) {
                case 1:

                    System.out.println("1.enter id");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("2. enter name");
                    String name = sc.nextLine();
                    System.out.println("3.enter age");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("4.enter department");
                    String dept = sc.nextLine();
                    System.out.println("5.designation");
                    String des = sc.nextLine();
                    System.out.println("6.reporting to: ");
                    String repo = sc.nextLine();
                    Employee emp=new Employee(id,name,age,dept,des,repo);
                    service.addEmployee(emp);
                    break;
                case 2:
                    service.viewEmployee();
                    break;
                case 3:
                    System.out.println("To confirm your choice enter");
                    System.out.println("Y/N");
                    String s=sc.next();
                    if(s.equalsIgnoreCase("Y")){
                       System.out.println("Thank You!!!");
                        return;
                    }
            }
        }
    }
}