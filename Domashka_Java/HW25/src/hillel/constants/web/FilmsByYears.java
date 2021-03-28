package hillel.constants.web;

import hillel.constants.entity.Film;
import hillel.constants.sevice.impl.VideoLibrary;
@WebServlet("/filmsByYears")
public class FilmsByYears  extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private VideoLibrary source;

    @Override
    public void init() throws ServletException {
        this.source = new VideoLibrary();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Film> films = source.findFilmsForCurrentAndPreviousYear();
        request.setAttribute("films", films);
        request.getRequestDispatcher("/jsp/FilmsByYears.jsp").forward(request, response);
    }
}
