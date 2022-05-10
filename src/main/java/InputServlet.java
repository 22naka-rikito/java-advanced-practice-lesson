
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/inputServlet")
public class InputServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    	// ここに必要な処理を記述してください。
    	request.setCharacterEncoding("UTF-8");
    	String info = "";
    	String btn = request.getParameter("btn");
    	String birthPlace = request.getParameter("birthPlace");
    	
    	String name = request.getParameter("name");
    	String language = request.getParameter("language");
    	
    	if(btn.equals("simple")) {
    		if(birthPlace.equals("japan")) {
    			Japanes human = new Japanes();
    			info = human.returnHumanInfo();
    			info += "、日本の公用語は「日本語」です。";
    		}else if(birthPlace.equals("america")) {
    			American human = new American();
    			info = human.returnHumanInfo();
    			info += "、アメリカの公用語は「英語」です。";
    		}else {
    			Human human = new Human();
    			info = human.returnHumanInfo();
    		}
    	}else {
    		if(birthPlace.equals("japan")) {
    			Japanes human = new Japanes(name,language);
    			info = human.returnHumanInfo();
    			info += "、日本の公用語は「日本語」です。";
    		}else if(birthPlace.equals("america")) {
    			American human = new American(name,language);
    			info = human.returnHumanInfo();
    			info += "、アメリカの公用語は「英語」です。";
    		}else {
    			Human human = new Human(name,language);
    			info = human.returnHumanInfo();
    		}
    	}
    	request.setAttribute("info", info);

        // 結果画面へ
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}
