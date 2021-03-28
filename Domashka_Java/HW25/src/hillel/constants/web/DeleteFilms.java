package hillel.constants.web;

import hillel.constants.sevice.impl.VideoLibrary;

import java.io.IOException;

public class DeleteFilms extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private VideoLibrary source;

    @Override
    public void init() throws ServletException {
        this.source = new VideoLibrary();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/DeleteFilms.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(source.deleteFilmsOlderGivenYears(Integer.parseInt(request.getParameter("number")))) {
            request.setAttribute("status", "Successfully deleted");
            request.getRequestDispatcher("/jsp/DeleteFilms.jsp").forward(request, response);
        } else {
            request.setAttribute("status", "Something went wrong");
            request.getRequestDispatcher("/jsp/DeleteFilms.jsp").forward(request, response);
        }
    }
}
