import java.sql.*;

public class MySQLPersonDAO implements PersonDAO{
    @Override
    public void savePerson(Person person) throws Exception{
        String name = person.getname();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost//pbo", "root", "carroty123");
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}
