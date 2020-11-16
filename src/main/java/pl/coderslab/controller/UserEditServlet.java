package pl.coderslab.controller;

import pl.coderslab.model.User;
import pl.coderslab.model.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/edit")
public class UserEditServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setId(Integer.parseInt(request.getParameter("id")));
        user.setUsername(request.getParameter("userName"));
        user.setEmail(request.getParameter("userEmail"));
        user.setPassword(request.getParameter("userPassword"));
        UserDao userDao = new UserDao();
        userDao.updateUser(user);
        response.sendRedirect("/user/list");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        UserDao userDao = new UserDao();
        User readUserToEdit = userDao.readUser(Integer.parseInt(id));
        request.setAttribute("user", readUserToEdit);

        getServletContext().getRequestDispatcher("/user/edit.jsp").forward(request, response);
    }
}
