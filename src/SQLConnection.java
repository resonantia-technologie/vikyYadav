	import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Connection con=DriverManager.getConnection("DBURL","Username","Password");
	Class.forName("Com.mysql.jdbc.driver");
	//Statement st=con.createStatement();
	
	
}
}
