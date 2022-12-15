import java.sql.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/table","root","veni");
			String n =request.getParameter("uname");
			String p =request.getParameter("password");
		PreparedStatement ps = con.prepareStatement("select uname from member where uname = ? and password =?");
		ps.setString(1, n);
		ps.setString(2, p);
		ResultSet rs = ps.executeQuery();
		PrintWriter out = response.getWriter();
		if(rs.next()) {
			RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
			rd.forward(request, response);
		}
		else {
			out.println("<font color=red size=18>Login failed!!<br>");
			out.println("<a href=Login.jsp>Try Again!!<br>");
		}
		}catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
