package Controller;

import CRUD.Read;
import Models.Tribble;
import Models.TribbleLabs;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TribblesServlet extends HttpServlet {
    public TribblesServlet() {
        System.out.println("constructing");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("initializing");
    }

    /*
        In postman provide the parameter tribbleId or tribbleName of the tribble and then endpoint tribble and it will return the name of the tribble and id
     */
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("labId") != null) {
            Tribble t = Read.getTribbleById(Integer.parseInt(req.getParameter("tribbleId")));
            resp.getWriter().println(t.toString());
        }

        if (req.getParameter("labName") != null) {
            Tribble t = Read.getTribble(req.getParameter("tribbleName"));
            resp.getWriter().println(t.toString());
        }

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void doDelete(HttpServletRequest req, HttpServletResponse resp){

    }
}
