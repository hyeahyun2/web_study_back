package servletEx;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ���� Ŭ������ ���� Ŭ������� ���� �����̳ʿ� �˸��� ���� ������̼��� ���
// � ��û�� ���� ���� ȣ���� �������� �����ϴ� URL mapping �κе� urlPatterns �Ӽ����� ����
// @WebServlet("/hello")���� �ܼ�ȭ�ϴ� �͵� ����
@WebServlet(description = "My first servlet", urlPatterns = {"/hello"})
public class HelloWorld extends HttpServlet {

	// Get ��û�� ó���ϴ� �޼���. request, response�� ���ڷ� ��
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ���� ������ Ÿ�� ������ �ѱ� ����� ���� response.setContentType() �޼��� ���
		resp.setContentType("text/html; charset=utf-8");
		// PrintWriter�� ��� ��Ʈ������ Ŭ���̾�Ʈ�� ������ ��¹� �ۼ��� ���
		// ��� ��Ʈ���� �̿��� HTML �������� �����Ϳ� ������ ���
		PrintWriter out = resp.getWriter();
		out.append("<!doctype html><html><head><title>Hello World Servlet</title></head><body>")
			.append("<h2>Hello World !!</h2>")
			.append("���� ��¥�� �ð��� " + java.time.LocalDateTime.now())
			.append("</body></html>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
