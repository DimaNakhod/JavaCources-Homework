package hillel.constants.web;

import hillel.constants.entity.Actor;
import hillel.constants.sevice.impl.VideoLibrary;

import java.io.IOException;

public class ActorsSaDirector extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private VideoLibrary source;

    @Override
    public void init() throws ServletException {
        this.source = new VideoLibrary();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Actor> actors = source.findActorAsDirector();
        request.setAttribute("actors", actors);
        request.getRequestDispatcher("/jsp/ActorsAsDirector.jsp").forward(request, response);
    }
}
