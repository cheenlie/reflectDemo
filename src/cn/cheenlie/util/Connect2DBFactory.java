package cn.cheenlie.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect2DBFactory {

	public static Connection getDBConnection(){
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/blogsystem";
			String username="root";
			String password="root";
			con=DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
}
