package com.khh.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.khh.domain.Message;

/**
 * Servlet implementation class CustomersQryServlet
 */
//採用Annotation進行DD(Deployment/Descriptor) 因為採用name同class name可以預設不設定
@WebServlet(urlPatterns={"/CustomersQryServlet","/customersqry.view"}) //參數是預設為url Pattern
public class CustomersQryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
/**
 * @see HttpServlet#HttpServlet()
 */
public CustomersQryServlet() {
    super();
    // TODO Auto-generated constructor stub
}

	//採用URL Query String方式傳遞一個客戶編號進來 參數名稱定義為customerid
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//使用封裝前端資訊的request物件 取出客戶編號參數
		String customerid=request.getParameter("customerid");
		//1.進行資料查詢...
		//回應一個資訊文字類型
		PrintWriter out=response.getWriter();
		//書出資訊到前端去(真正表現畫面View 最好寫上網頁Page...又要動態 就是調用一個 JSP)
		//out.println("內容:"+customerid);
		//處理後的資訊
		//封裝成一個Instance JavaBean物件
		Message msg=new Message();
		msg.setMsg("內容:"+customerid);
		msg.setStatus("200");
		//讓request物件參考狀態
		request.setAttribute("msg",msg);
		//我不想立即回到瀏覽器 直接調用JSP呈現畫面(還要持續原先的request and response物件)
		RequestDispatcher disp=request.getRequestDispatcher("showmassge.jsp");
		//派送
		disp.forward(request, response); //forward較交出控制權
		//不用寫 不會執行
		
	}

}
