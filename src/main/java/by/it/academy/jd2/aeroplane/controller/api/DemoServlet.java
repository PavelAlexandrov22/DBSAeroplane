package by.it.academy.jd2.aeroplane.controller.api;

import by.it.academy.jd2.aeroplane.services.connection.DataRetriever;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@WebServlet(urlPatterns = "/air")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");



        try (PrintWriter out = resp.getWriter()) {
            DataRetriever retriever = new DataRetriever();
            List<String> data = retriever.retrieveData();

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Data from Database</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Data from Database</h1>");

            for (String record : data) {
                out.println("<p>" + record + "</p>");
            }

            out.println("</body>");
            out.println("</html>");
        }

    }
}
