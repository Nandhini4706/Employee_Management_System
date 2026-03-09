import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.*;
public class Main{
    public static void main(String[]args){
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
        int id=sc.nextInt();
        PreparedStatement ps= con.prepareStatement(query);
        ps.setInt(1,id);
    }
}