package chapter14;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;

@WebServlet(urlPatterns={"/chapter14/delete"})
public class Delete extends HttpServlet {

    public void doPost (
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        Page.header(out);
        try {
            InitialContext ic=new InitialContext();
            DataSource ds=(DataSource)ic.lookup("java:/comp/env/jdbc/book");
            Connection con=ds.getConnection();

            String name=request.getParameter("name");

            PreparedStatement st=con.prepareStatement("delete from product where name=?");
            st.setString(1, "name");
            int line=st.executeUpdate();

            if (line>0) {
                out.println("削除しました。");
            }


            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace(out);
        }
        Page.footer(out);
    }
    
}
