package servlets;

import dao.MapUserDao;
import model.AppUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Register", value = "/register")
public class RegisterServlet extends HttpServlet {
    public static final String LOGIN = "login";
    public static final String EMAIL = "email";
    public static final String PASSWORD = "password";

    private MapUserDao userDao;

    @Override
    public void init() throws ServletException {
        userDao = MapUserDao.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/registerUser.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AppUser user = AppUser.AppUserBuilder.getBuilder()
                .login(req.getParameter(LOGIN))
                .password(req.getParameter(PASSWORD))
                .email(req.getParameter(EMAIL))
                .build();
        userDao.addUser(user);
    }
}
