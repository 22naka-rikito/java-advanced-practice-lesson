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
@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
    	//sessionから値を取得
    	//配列を用意
    	//sessionを宣言
    	//値を取得
    	ArrayList<Car> historyList;
    	HttpSession session = request.getSession();
    	historyList = (ArrayList<Car>)session.getAttribute("historyList");
    	
    	//textboxの値を取得
    	String bodyColor = request.getParameter("bodyColor");
    	String speed = request.getParameter("speed");

    	//textboxと前回の配列をもとにCarを生成
    	Car car = new Car(historyList.get(historyList.size() - 1).getCarName(), historyList.get(historyList.size() - 1).getBodyColor(),
    			historyList.get(historyList.size() - 1).getMaxSpeed(), historyList.get(historyList.size() - 1).getSpeed());
    	car.setBodyColor(bodyColor);
    	car.setSpeed(Integer.parseInt(speed));
    	historyList.add(car);
    	
    	String result = "車体の色と現在速度を変更しました。";
    	
    	session.setAttribute("historyList", historyList);
		request.setAttribute("latestCar", car);
		request.setAttribute("result", result);

        // 結果画面へ遷移
        request.getRequestDispatcher("update.jsp").forward(request, response);

    }
}
