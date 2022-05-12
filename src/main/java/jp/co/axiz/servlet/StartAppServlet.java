package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartsGameApp;
import jp.co.axiz.app.GameApp;

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
	    
	    App app = null;
	    if("card".equals(item)) {
	    	itemStr = "トランプ";
	    	app = new CardGameApp(itemStr);
	    }else if("darts".equals(item)) {
	    	itemStr = "ダーツ";
	    	app = new DartsGameApp(itemStr);
	    }else if("clock".equals(item)) {
	    	app = new ClockApp();
	    }
	    
//	    GameApp cardGameApp = new CardGameApp(itemStr);
//	    GameApp dartsGameApp = new DartsGameApp(itemStr);
//	    ClockApp clockApp = new ClockApp();
	    if(app instanceof GameApp) {
	    	if (name != null && !name.isEmpty()) {
		    	if(item.equals("card")) {
		    		result = app.start(name);
			    }else if(item.equals("darts")) {
			    	result = app.start(name);
			    }
		    	GameApp gameApp = (GameApp)app;
		    	request.setAttribute("playTime", "実行時間:" + gameApp.getNum() + "分");
		    }
	    }else {
	    	if(item.equals("clock")) {
		    	result = app.start(name);
		    }else {
		    	result = "アプリの実行に失敗しました。";
		    }
	    }
//	    if (name != null && !name.isEmpty()) {
//	    	if(item.equals("card")) {
//	    		result = app.start(name);
//		    }else if(item.equals("darts")) {
//		    	result = app.start(name);
//		    }else 
//	    	
//	    }
	    request.setAttribute("result", result);
	    request.getRequestDispatcher("/appStart.jsp").forward(request, response);
	}

}
