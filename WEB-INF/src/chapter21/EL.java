package chapter21;

import bean.Product;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/chapter21/el"})
public class EL extends HttpServlet {

    public void doGet (
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {

        Product p=new Product();
        p.setId(1);
        p.setName("ポンデドーナツ");
        p.setPrice(200);

        request.setAttribute("product", p);

        request.getRequestDispatcher("el.jsp")
            .forward(request, response);
    }
    
}
