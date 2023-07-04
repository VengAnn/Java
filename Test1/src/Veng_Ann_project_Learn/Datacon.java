package Veng_Ann_project_Learn;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Veng Ann
 */
public class Datacon {

    /**
     * @return the datacon
     */
    public static Connection getDatacon() {
        return datacon;
    }

    /**
     * @param aDatacon the datacon to set
     */
    public static void setDatacon(Connection aDatacon) 
    {
       datacon = aDatacon;
    }
    private static Connection datacon;
    public static void Connectiondb(String user,String pass,String dbname,String server)throws Exception{
    
        Class.forName("com.mysql.jdbc.Driver");
        setDatacon(DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root",""));
        //Database Name - testDB, Username - "root", Password - "";
    }
}
