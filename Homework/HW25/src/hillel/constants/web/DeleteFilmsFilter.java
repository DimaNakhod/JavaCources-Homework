package hillel.constants.web;

import java.io.IOException;
import java.util.logging.Filter;

public class DeleteFilmsFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest requestOne = (HttpServletRequest) request;
        HttpServletResponse responseOne = (HttpServletResponse) response;
        if(requestOne.getSession().getAttribute("user") != null) {
            requestOne.getRequestDispatcher("/deleteFilms").forward(request, response);
        } else {
            responseOne.sendRedirect("/login");
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}
