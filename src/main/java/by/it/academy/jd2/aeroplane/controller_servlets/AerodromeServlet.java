package by.it.academy.jd2.aeroplane.controller_servlets;

import by.it.academy.jd2.aeroplane.services.api.IAirportServices;

import by.it.academy.jd2.aeroplane.dao.entity.AirportEntity;
import by.it.academy.jd2.aeroplane.services.factory.AirportServicesFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
@WebServlet(urlPatterns = "/airport")
public class AerodromeServlet extends HttpServlet {


    private IAirportServices aerodromeServices = AirportServicesFactory.getInstance();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<AirportEntity> airports = aerodromeServices.getAirport();
        req.setAttribute("airport", airports);
        req.getRequestDispatcher("/ui/airport.jsp").forward(req, resp);

    }
}
