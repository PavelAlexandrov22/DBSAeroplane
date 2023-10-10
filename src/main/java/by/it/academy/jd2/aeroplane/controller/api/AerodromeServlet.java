package by.it.academy.jd2.aeroplane.controller.api;

import by.it.academy.jd2.aeroplane.dto.Aerodrome;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class AerodromeServlet extends HttpServlet {


    private static final String AERODROME_NAME = "name";
    private static final String AERODROME_CITY = "city";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset=utf-8");

        String aerodromeName = req.getParameter(AERODROME_NAME);
        String aerodromeCity = req.getParameter(AERODROME_CITY);




    }
}
