package by.it.academy.jd2.aeroplane.controller_servlets;

import by.it.academy.jd2.aeroplane.dao.enums.Filters;
import by.it.academy.jd2.aeroplane.services.api.IFlightServices;
import by.it.academy.jd2.aeroplane.dao.entity.FlightEntity;
import by.it.academy.jd2.aeroplane.services.factory.FlightServicesFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@WebServlet(urlPatterns = "/flight")
public class FlightServlet extends HttpServlet {

    private IFlightServices flightServices = FlightServicesFactory.getInstance();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String page = req.getParameter("page") ;
        String size = req.getParameter("size") ;

        if(page != null && size != null){
            List<FlightEntity> flights = flightServices.getFlights(Integer.parseInt(page), Integer.parseInt(size));
            req.setAttribute("flights", flights);
        }else {
            List<FlightEntity> flights = flightServices.getFlights();
            req.setAttribute("flights", flights);
        }



    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String page = req.getParameter("page");
        String size = req.getParameter("size");
        String[] selectedFilters = req.getParameterValues("filters");

        List<FlightEntity> flights = new ArrayList<>();
        List<String> activeFilters = new ArrayList<>();


        for (String string : selectedFilters) {
            activeFilters.add(Filters.valueOf(string).getFilterValue());
        }

        if (page != null && size != null && !activeFilters.isEmpty()) {
            flights = flightServices.getFlights(Integer.parseInt(page), Integer.parseInt(size), activeFilters);
        } else if (page != null && size != null) {
            flights = flightServices.getFlights(Integer.parseInt(page), Integer.parseInt(size));
        } else {
            flights = flightServices.getFlights();
        }

        req.setAttribute("flights", flights);
        req.getRequestDispatcher("/ui/flight.jsp").forward(req, resp);


    }
}
