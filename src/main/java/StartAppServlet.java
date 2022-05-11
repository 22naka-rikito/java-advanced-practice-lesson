

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.CardGameApp;
import app.GameApp;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")
public class StartAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StartAppServlet() {
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
	    String name = request.getParameter("name");
	    String item = request.getParameter("item");
	    String itemStr = "";
	    String result = "";
	    
	    
	    if("card".equals(item)) {
	    	itemStr = "トランプ";
	    }
	    GameApp gameApp = new GameApp("何か");
	    CardGameApp cardgameApp = new CardGameApp(itemStr);

	    if (name != null && !name.isEmpty()) {
	    	// このif分の中で、GameAppクラスのstartメソッドを呼び出し、
	    	// 戻り値をresultに代入してください。
	    	if(item.equals("card")) {
	    		result = cardgameApp.start(name);
		    }else {
		    	result = gameApp.start(name);
		    }
	    	
	    }
	    request.setAttribute("result", result);
	    request.getRequestDispatcher("/appStart.jsp").forward(request, response);
	}

}
