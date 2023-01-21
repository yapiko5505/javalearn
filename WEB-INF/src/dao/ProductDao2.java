package dao;

public class ProductDao2 {










}



public List<Product> delete(String name) throws Exception {
    List<Product> list=new ArrayList<>();
    Connection con=getConnection();
    PreparedStatement st=con.prepareStatement("delete from product where name=?");
    st.setString(1, "%"+name+"%");
    ResultSet rs=st.executeQuery();
    while (rs.next()) {
        Product p=new Product();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setPrice(rs.getInt("price"));
        list.remove(p);
    }
    st.close();
    con.close();
    return list;
}
