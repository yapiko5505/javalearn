package chapter24;

import bean.Staff;
import dao.StaffDAO;
import tool.Action;
import javax.servlet.http.*;

public class LoginAction extends Action {

    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception {

        HttpSession session=request.getSession();

        String login=request.getParameter("login");
        String password=request.getParameter("password");
        StaffDAO dao=new StaffDAO();
        Staff staff=dao.search(login, password);

        if (staff!=null) {
            session.setAttribute("staff", staff);
            return "login-out.jsp";
        }

        return "login-error.jsp";
    }
    
}
