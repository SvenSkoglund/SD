package com.skilldistillery.lotto.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.lottery.powerball.PowerBallDrawing;
import com.skilldistillery.lottery.powerball.PowerBallDrawingResult;

public class LotteryServlet extends HttpServlet {
	PowerBallDrawing pbd = new PowerBallDrawing();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.println("<html><head><title>Power Ball</title></head>");
		pw.println("<body>");
		PowerBallDrawingResult result = pbd.getResults();
		List winners = result.getWinners();
		pw.println("<h1>Results</h1>");
		for (Object winner : winners) {
			pw.println("<br><p>Winning number: " + winner + "</p>");
		}
		pw.println("<br><a href=?");
		
		pw.println("</body>");
		pw.println("</html>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

}
