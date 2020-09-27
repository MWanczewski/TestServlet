package servlets;

import dao.MapUserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/users")
public class UsersServlet extends HttpServlet {
    public static final String USERS = "users";

    private MapUserDao userDao;

    @Override
    public void init() throws ServletException {
        userDao = MapUserDao.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute(USERS, userDao.getAll());
        req.getRequestDispatcher("/users.jsp").forward(req, resp);
    }
}
