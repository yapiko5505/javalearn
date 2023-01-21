package chapter23;

import bean.Product;
import dao.ProductDAO;
import tool.Action;
import javax.servlet.http.*;
import java.util.List;

public class DeleteAction extends Action {

    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception {

        HttpSession session=request.getSession();

        if (session.getAttribute("staff")==null) {
            return "preview-error-login.jsp";
        }

        Integer id=Integer.parseInt(request.getParameter("id"));
        String name=request.getParameter("name");
        Integer price=Integer.parseInt(request.getParameter("price"));

        if (id !=null) {
            ProductDAO dao=new ProductDAO();
            List<Product> list=dao.delete(p);
        }
       
        // request.setAttribute("list", list);

        return "list.jsp";
    }
    
}
