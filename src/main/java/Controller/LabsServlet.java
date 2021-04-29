package Controller;

import CRUD.Read;
import Models.TribbleLabs;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LabsServlet extends HttpServlet {
    public LabsServlet() {
        System.out.println("constructing");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("initializing");
    }

    /*
        In postman provide the parameter labId or labName of the lab and then endpoint labs and it will return the name of the lab and id
     */
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("labId") != null) {
          TribbleLabs l = Read.getLabById(Integer.parseInt(req.getParameter("labId")));
          resp.getWriter().println(l.toString());
        }

        if (req.getParameter("labName") != null) {
            TribbleLabs l = Read.getLab(req.getParameter("labName"));
            resp.getWriter().println(l.toString());
        }

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void doDelete(HttpServletRequest req, HttpServletResponse resp){

    }
}
