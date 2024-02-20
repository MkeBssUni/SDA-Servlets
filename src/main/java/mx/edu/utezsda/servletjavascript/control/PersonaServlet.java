package mx.edu.utezsda.servletjavascript.control;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "PersonaServlet", value = "/PersonaServlet")
public class PersonaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/persona/form.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String semblanza = req.getParameter("semblanza");

        req.setAttribute("nombreX",nombre);
        req.setAttribute("semblanzaX",semblanza);
        req.getRequestDispatcher("/WEB-INF/persona/resultado.jsp")
                .forward(req, resp);
    }
}
