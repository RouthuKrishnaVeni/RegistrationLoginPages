import java.sql.*;
public class RegisterDao {
	private String dburl = "jdbc:mysql://localhost:3306/table";
	 private String dbuname = "root";
	 private String dbpassword = "veni";
	 private String dbdriver = "com.mysql.jdbc.Driver";
	 
	 public void loadDriver(String dbDriver)
	 {
	 try {
	 Class.forName(dbDriver);
	 } catch (ClassNotFoundException e) {
	 
	 e.printStackTrace();
	 }
	 }
	 public Connection getConnection() {
	 Connection con = null;
	 try {
	 con = DriverManager.getConnection(dburl, dbuname, dbpassword);
	 } catch (SQLException e) {

	 e.printStackTrace();
	 }
	 return con;
	 }
	 
	 public String insert(Member member) {
	 loadDriver(dbdriver);
	 Connection con = getConnection();
	 String sql = "insert into member values(?,?,?,?)";
	 String result="Data Entered Successfully";
	 try {
	 PreparedStatement ps = con.prepareStatement(sql);
	 ps.setString(1, member.getUname());
	 ps.setString(2, member.getPassword());
	 ps.setString(3, member.getEmail());
	 ps.setNString(4, member.getPhone());
	 ps.executeUpdate();
	 } catch (SQLException e) {
	
	 result="Data Not Entered";
	 e.printStackTrace();
	 }
	 return result;
	 
	 }
}
