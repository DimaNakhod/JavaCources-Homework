package hillel.constants.web;

import hillel.constants.sevice.impl.VideoLibrary;

public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private VideoLibrary source;

    @Override
    public void init() throws ServletException {
        this.source = new VideoLibrary();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/Login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setName(request.getParameter("name"));
        user.setPassword(request.getParameter("password"));
        List<User> users = source.getUsers();
        if (users.contains(user)) {
            request.getSession().setAttribute("user", user);
            response.sendRedirect("index.jsp");
        } else {
            request.setAttribute("invalid", "Invalid user's data");
            request.getRequestDispatcher("/jsp/Login.jsp").forward(request, response);
        }
    }
}
