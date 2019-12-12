import Classes.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
@WebServlet(name = "ServletAdd")
public class ServletAdd extends javax.servlet.http.HttpServlet {
//DataSource con;
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {



    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw=response.getWriter();
        DisplayAll ds=new DisplayAll();
        ArrayList<User> users=ds.ShowUsers();
        if(users!=null)pw.println(1);else pw.println(users);
    }
}
