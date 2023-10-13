package by.it.academy.jd2.aeroplane.controller_servlets;
import by.it.academy.jd2.aeroplane.services.api.IAeroplaneServices;
import by.it.academy.jd2.aeroplane.services.entity.AirCraft;
import by.it.academy.jd2.aeroplane.services.factory.AeroplaneServicesFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/aeroplane")
public class AeroplaneServlet extends HttpServlet {


    private IAeroplaneServices aeroplaneServices = AeroplaneServicesFactory.getInstance();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<AirCraft> airCrafts = aeroplaneServices.getAirCrafts();

        req.setAttribute("aircrafts", airCrafts);
        req.getRequestDispatcher("/ui/airplane.jsp").forward(req, resp);

    }
}
