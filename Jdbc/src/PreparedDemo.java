import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDemo {

	public static void main(String[] args) {
		Connection conn = null;
		//? is placeholder, index starts from 1
		String sql = "insert into product values(?, ?, ?)";
		
		try {
			conn = JdbcFactory.getConnection();
			PreparedStatement stmt =  conn.prepareStatement(sql);
			//Replacing place holders with values
			stmt.setInt(1, Integer.parseInt(args[0]));
			stmt.setString(2, args[1]);
			stmt.setDouble(3, Double.parseDouble(args[2]));
			
			stmt.executeUpdate();
			System.out.println("Record inserted");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
