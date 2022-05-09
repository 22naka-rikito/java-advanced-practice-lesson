

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String idStr = "";
		String passStr = "";
		String path = "/login.jsp";
		
		if(Utility.isNullOrEmpty(id) && Utility.isNullOrEmpty(pass)) {
			idStr = "none";
			passStr = "none";
		}else if(Utility.isNullOrEmpty(id)) {
			idStr = "none";
		}else if(Utility.isNullOrEmpty(pass)) {
			passStr = "none";
		}else {
			if(id.equals("axiz") && pass.equals("axizuser")) {
				idStr = "axiz";
				path = "/result.jsp";
			}else if(id.equals("technocore") && pass.equals("techno-pass")) {
				idStr = "technocore";
				path = "/result.jsp";
			}else {
				idStr = "miss";
			}
		}
		request.setAttribute("id", idStr);
		request.setAttribute("pass", passStr);
		request.getRequestDispatcher(path).forward(request, response);
	}

}
