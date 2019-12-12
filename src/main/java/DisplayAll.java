import Classes.User;

import javax.servlet.annotation.WebServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
@WebServlet
public class DisplayAll {
ArrayList<User> users;
public static void main(String[] args)
{
    ArrayList<User>users=null;
    try {
        Class.forName("org.postgresql.Driver");
        users = new ArrayList<>();
        User user=new User();
        System.out.println("Start");
        Connection cn = DriverManager.getConnection("jdbc:postgresql://ec2-54-247-96-169.eu-west-1.compute.amazonaws.com:5432/d4p0ktpivmfbbe?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory", "rdcfuldfwzbsbi", "ae8a474229e34b4f9e68dbff1a2c78b7440a9c9903efedf2dd9d3585491e5a6d");
        System.out.println("Success");

        Statement smt = cn.createStatement();

        //query to display all records from table employee
        String q = "Select * from users";

        //to execute query
        ResultSet rs = smt.executeQuery(q);

        //to print the resultset on console
        if (rs.next()) {
            do {
                user=new User();
                user.user_id=rs.getInt(1);
                user.user_name=rs.getString(2);
                user.Age=rs.getInt(4);
                user.role_id=rs.getInt(3);
                users.add(user);
                  System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4));
            } while (rs.next());
        } else {
            System.out.println("Record Not Found...");
        }


        cn.close();

        System.out.println("Finish");
    } catch (Exception e) {
        System.out.println(e);
    }



}
    public  ArrayList<User> ShowUsers() {
        //users = null;

        try {
            Class.forName("org.postgresql.Driver");
            users = new ArrayList<>();
            User user=new User();
            System.out.println("Start");
            Connection cn = DriverManager.getConnection("jdbc:postgresql://ec2-54-247-96-169.eu-west-1.compute.amazonaws.com:5432/d4p0ktpivmfbbe?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory", "rdcfuldfwzbsbi", "ae8a474229e34b4f9e68dbff1a2c78b7440a9c9903efedf2dd9d3585491e5a6d");
            System.out.println("Success");

            Statement smt = cn.createStatement();

            //query to display all records from table employee
            String q = "Select * from users";

            //to execute query
            ResultSet rs = smt.executeQuery(q);

            //to print the resultset on console
            if (rs.next()) {
                do {
                    user=new User();
                    user.user_id=rs.getInt(1);
                    user.user_name=rs.getString(2);
                    user.Age=rs.getInt(4);
                    user.role_id=rs.getInt(3);
                    users.add(user);
                  //  System.out.println(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getString(4));
                } while (rs.next());
            } else {
                System.out.println("Record Not Found...");
            }
            cn.close();
            System.out.println("Finish");
        } catch (Exception e) {
            System.out.println(e);
        }
        return users;
    }
}
