import java.sql.*;

    

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person p) throws Exception{
        String name = p.getNama();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "");
        String query = "INSERT INTO person (name) VALUES (?)";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, name);
        stmt.executeUpdate();
        stmt.close();
        con.close();
    }


    

    
}
