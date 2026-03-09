import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
public class Main{
    public static void main(String[]args) throws Exception{
        Scanner sc=new Scanner(System.in);
        Connection con= DBConnection.getConnection();
     /*   if(con != null){
            System.out.println("Connected Successfully");
        }else{
            System.out.println("Connection Failed");
        }

      */
        String query ="Insert into employee(id,name,age,department,designation,reporting_to)" +
                "values(?,?,?,?,?,?)";
        System.out.println("1.enter id");
        int id=sc.nextInt(); sc.nextLine();
        System.out.println("2. enter name");
        String name=sc.nextLine();
        System.out.println("3.enter age");
        int age=sc.nextInt();sc.nextLine();
        System.out.println("4.enter department");
        String dept=sc.nextLine();
        System.out.println("5.designation");
        String des=sc.nextLine();
        System.out.println("6.reporting to: ");
        String repo=sc.nextLine();
        PreparedStatement ps= con.prepareStatement(query);
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setInt(3,age);
        ps.setString(4,dept);
        ps.setString(5,des);
        ps.setString(6,repo);

    }
}