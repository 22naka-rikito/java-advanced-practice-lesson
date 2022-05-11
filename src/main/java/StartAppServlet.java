

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.CardGameApp;
import app.ClockApp;
import app.DartsGameApp;
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
	    	itemStr = "トラン";
	    }else if("darts".equals(item)) {
	    	itemStr = "ダーツ";
	    }
	    
	    GameApp cardGameApp = new CardGameApp(itemStr);
	    GameApp dartsGameApp = new DartsGameApp(itemStr);
	    ClockApp clockApp = new ClockApp();
	    
	    if (name != null && !name.isEmpty()) {
	    	if(item.equals("card")) {
	    		result = cardGameApp.start(name);
		    }else if(item.equals("darts")) {
		    	result = dartsGameApp.start(name);
		    }else if(item.equals("clock")) {
		    	result = clockApp.start(name);
		    }else {
		    	result = "アプリの実行に失敗しました。";
		    }
	    	
	    }
	    request.setAttribute("result", result);
	    request.getRequestDispatcher("/appStart.jsp").forward(request, response);
	}

}
