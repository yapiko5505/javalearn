package chapter16;

import bean.Product;
import dao.ProductDAO;
import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.List;

@WebServlet(urlPatterns={"/chapter16/search"})
public class Search extends HttpServlet {

    public void doPost (
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        try {
            String keyword=request.getParameter("keyword");

            ProductDAO dao=new ProductDAO();
            List<Product> list=dao.search(keyword);

            request.setAttribute("list", list);

            request.getRequestDispatcher("attribute2.jsp")
                .forward(request, response);

        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }
    
}
