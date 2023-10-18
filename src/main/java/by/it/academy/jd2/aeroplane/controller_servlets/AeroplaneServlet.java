package by.it.academy.jd2.aeroplane.controller_servlets;
import by.it.academy.jd2.aeroplane.core.dto.Airplane;
import by.it.academy.jd2.aeroplane.services.api.IAirplaneServices;
import by.it.academy.jd2.aeroplane.dao.entity.AirCraftEntity;
import by.it.academy.jd2.aeroplane.services.factory.AirplaneServicesFactory;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/aeroplane")
public class AeroplaneServlet extends HttpServlet {


    private IAirplaneServices aeroplaneServices = AirplaneServicesFactory.getInstance();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Airplane> airCrafts = aeroplaneServices.getAirCrafts();

        req.setAttribute("aircrafts", airCrafts);
        req.getRequestDispatcher("/ui/airplane.jsp").forward(req, resp);

    }
}
