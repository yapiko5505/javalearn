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

        String keyword=request.getParameter("keyword");

        ProductDAO dao=new ProductDAO();
        List<Product> list=dao.delete(keyword);
        // dao.delete(p);

        request.setAttribute("list", list);

        return "list.jsp";
    }
    
}
