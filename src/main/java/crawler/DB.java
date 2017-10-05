package crawler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DB 
{
    public Connection con=null;  
    public DB() throws SQLException, ClassNotFoundException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String path = "jdbc:mysql://localhost:3306/Crawler";
            con=DriverManager.getConnection(path,"root","");
            System.out.println("Connection Established");
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
