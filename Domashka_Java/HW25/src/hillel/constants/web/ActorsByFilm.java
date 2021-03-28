package hillel.constants.web;

import hillel.constants.entity.Actor;
import hillel.constants.sevice.impl.VideoLibrary;

import java.io.IOException;
import java.util.List;

public class ActorsByFilm extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private VideoLibrary source;

    @Override
    public void init() throws ServletException {
        this.source = new VideoLibrary();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/jsp/ActorsByFilm.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Actor> actors = source.findActorsForFilm(request.getParameter("film"));
        request.setAttribute("actors", actors);
        request.getRequestDispatcher("/jsp/ActorsByFilm.jsp").forward(request, response);
    }
}
