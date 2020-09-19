package week3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestApp1
 */
@WebServlet(name = "TestApplication1", urlPatterns = {"/TestApp1"})
public class TestApp1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String v = request.getParameter("V");
			
			//application저장소에 입력
			ServletContext app = request.getServletContext();
			app.setAttribute("v", v);
			
			response.setContentType("utf-8");
			PrintWriter out = response.getWriter();
			out.println("Application1객체에서 데이터를 저장합니다.");
			
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
