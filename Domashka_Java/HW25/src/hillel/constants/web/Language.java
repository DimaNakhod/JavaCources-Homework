package hillel.constants.web;

import java.io.IOException;
import java.io.ObjectInputFilter;

public class Language extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String locale = request.getParameter("language");
        ObjectInputFilter.Config.set(request.getSession(), ObjectInputFilter.Config.FMT_LOCALE, locale);
        response.sendRedirect(request.getHeader("Referer"));
    }
}
