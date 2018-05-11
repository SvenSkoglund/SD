package com.skilldistillery.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.data.president.JDBCPresidentDAOImpl;
import com.skilldistillery.data.president.President;
import com.skilldistillery.data.president.PresidentDAO;

public class PresidentServlet extends HttpServlet {

	private PresidentDAO presidentDAO;

	@Override
	public void init() throws ServletException {
		super.init();
		try {
			presidentDAO = new JDBCPresidentDAOImpl();
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String searchString = "";
		String party = req.getParameter("party");
		if (party != null && !party.equals("")) {
			List<President> pByParty = presidentDAO.findByParty(party);

			req.setAttribute("presidents", pByParty);
			searchString = party;
			req.setAttribute("searchString", searchString);
			req.getRequestDispatcher("/WEB-INF/presidents.jsp").forward(req, resp);

		}
		String lastName = req.getParameter("lastName");
		if (lastName != null && !lastName.equals("")) {
			List<President> pByLastName = presidentDAO.findByLastName(lastName);
			req.setAttribute("presidents", pByLastName);
			searchString = lastName;
			req.setAttribute("searchString", searchString);
			req.getRequestDispatcher("/WEB-INF/presidents.jsp").forward(req, resp);

		}
		String termNumber = req.getParameter("termID");
		if (termNumber != null && !termNumber.equals("")) {
			President pByTermNumber = presidentDAO.getPresidentByTermNumber(Integer.parseInt(termNumber));
			req.setAttribute("president", pByTermNumber);
			req.setAttribute("searchString", searchString);
			req.getRequestDispatcher("/WEB-INF/singlePresident.jsp").forward(req, resp);
		}
		if (searchString.equals("")){
			req.setAttribute("presidents", presidentDAO.getPresidents());
			req.setAttribute("searchString", searchString);
			req.getRequestDispatcher("/WEB-INF/presidents.jsp").forward(req, resp);
		}

	}
}