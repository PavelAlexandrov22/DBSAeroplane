package by.it.academy.jd2.aeroplane.controller.api;

import by.it.academy.jd2.aeroplane.dto.Aeroplane;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AeroplaneServlet extends HttpServlet {
    private static final String AEROPLANE_NAME = "name";
    private static final String AEROPLANE_NUMBER = "number";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");

        String aeroplaneName = req.getParameter(AEROPLANE_NAME);
        String aeroplaneNumber = req.getParameter(AEROPLANE_NUMBER);

        Aeroplane aeroplane = new Aeroplane();
        aeroplane.setModel(aeroplaneName);
        aeroplane.setNumber(Integer.parseInt(aeroplaneNumber));






    }
}
