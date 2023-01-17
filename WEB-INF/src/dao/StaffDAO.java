package dao;

import bean.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StaffDAO extends DAO {

    public Staff search(String login, String password)
        throws Exception {
            Staff staff=null;

            Connection con=getConnection();

            PreparedStatement st;
            st=con.prepareStatement("select * from staff where login=? and password=?");
            st.setString(1, login);
            st.setString(2, password);
            ResultSet rs=st.executeQuery();

            while (rs.next()) {
                staff=new Staff();
                staff.setId(rs.getInt("id"));
                staff.setLogin(rs.getString("login"));
                staff.setPassword(rs.getString("password"));
            }

            st.close();
            con.close();
            return staff;
        }
}
