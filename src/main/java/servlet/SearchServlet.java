package servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	// ここに必要な処理を記述してください。
    	String str = "見つかりませんでした";
    	String english = request.getParameter("english");
    	Dictionary dictionary = new Dictionary();
    	HashMap<String, String> dictionaryInfo = dictionary.getDictionaryInfo();
    			
    	if(english != null && !("".equals(english))) {
    		if(dictionaryInfo.get(english) != null) {
    			str = "英語:" + english + "、日本語:" + dictionaryInfo.get(english);
    		}
    	}
    	
    	request.setAttribute("result",str);
        request.getRequestDispatcher("dictionary.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
