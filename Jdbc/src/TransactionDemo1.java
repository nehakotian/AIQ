import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Wrapper;

public class TransactionDemo1 {

	public static void main(String[] args) {
		String sql = "select code,name,price from product";
	
	Connection conn =null;			
	try {
		conn = JdbcFactory.getConnection();

		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		        								
		ResultSet rs = stmt.executeQuery("SELECT code,name FROM product");
		
		rs.absolute(5);
		rs.updateString("NAME", "AINSWORTH"); 
		  
		/*rs.updateRow();

		
		rs.moveToInsertRow(); 
		rs.updateString(1, "AINSWORTH");
		  
		rs.updateInt(2,35); 
		rs.updateBoolean(3, true); 
		rs.insertRow();
		rs.moveToCurrentRow();*/
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}
