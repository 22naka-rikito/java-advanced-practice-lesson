package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.axiz.entity.Car;

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
    	
    	String carName = request.getParameter("carName");
    	String bodyColor = request.getParameter("bodyColor");
    	String maxSpeed = request.getParameter("maxSpeed");
    	
    	String path = "update.jsp";
    	Car car = null;
    	
    	ArrayList<Car> historyList = new ArrayList<Car>();
    	
    	if( carName.isEmpty() || bodyColor.isEmpty() || maxSpeed.isEmpty()) {
    		path = "input.jsp";
    		request.setAttribute("result", "未入力の項目があります。");
    	}else {
    		car = new Car(carName, bodyColor, Integer.parseInt(maxSpeed));
    		historyList.add(car);
    		HttpSession session = request.getSession();
    		session.setAttribute("historyList", historyList);
    		request.setAttribute("latestCar", car);
    	}

        request.getRequestDispatcher(path).forward(request, response);
    }
}
