import Model.Employee;
import Service.EmployeeService;
import db.DBConnection;
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
                    PreparedStatement ps1=con.prepareStatement("SELECT * FROM employee");
                    ResultSet rs=ps1.executeQuery();
                    while(rs.next()) {
                       int id1= rs.getInt("id");
                        String name1= rs.getString("name");
                       int age1=rs.getInt("age");
                       String dept1=rs.getString("department");
                        String desi=rs.getString("designation");
                        String repo1=rs.getString("reporting_to");
                    }
            }
        }
    }
}