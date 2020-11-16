package pl.coderslab.controller;

import pl.coderslab.model.User;
import pl.coderslab.model.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/show")
public class UserShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/user/list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        UserDao userDao = new UserDao();
        User readUserForDetails = userDao.readUser(Integer.parseInt(id));
        request.setAttribute("user", readUserForDetails);

        getServletContext().getRequestDispatcher("/user/show.jsp").forward(request, response);
    }
}
