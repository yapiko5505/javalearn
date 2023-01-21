package chapter15;

import bean.Product;
import dao.ProductDAO;
import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
// import java.util.List;

@WebServlet(urlPatterns={"/chapter15/delete"})
public class Delete extends HttpServlet {

    public void doPost (
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        Page.header(out);
        try {
            String name=request.getParameter("name");
            int price=Integer.parseInt(request.getParameter("price"));

            Product p=new Product();
            p.setName(name);
            p.setPrice(price);

            ProductDAO dao=new ProductDAO();
            int line=dao.delete(p);

            if (line!=0) {
                out.println("削除しました。");
            }
        } catch (Exception e) {
            e.printStackTrace(out);
        }
        Page.footer(out);
    }
    
}
