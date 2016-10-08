
package servletHTML;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRetirar extends HttpServlet {

    ServletRegistro Reg = new ServletRegistro();

    public int actual, actualizado;

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        actual = Integer.parseInt(req.getParameter("cantidad"));
        Reg.dinero = actualizado;
        actualizado = actualizado - actual;

    }

    public void response(HttpServletResponse resp, String msg)
            throws IOException {

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>Registro</title><style>\n"
                + "            @import url(https://fonts.googleapis.com/css?family=Roboto+Condensed);\n"
                + "        </style></head>");
        out.println("<body><div style = \"float: left; width:100%; height:100%; background-color:#708573; font-family: Roboto Condensed;\">");
        out.print("<br><br><br><br><br><br><br><br><br><br><br>");
        out.println("<center><Font color=\"white\" size=\"12\">Se ha retirado el monto de: $" + actual + " pesos</Font></center>");
        out.println("<Font color=\"white\" size=\"12\">Tu saldo actual es de: $" + actualizado + "</Font>");

        out.println(" <br><br>\n"
                + "                    <input type=\"button\" value=\"HOME\" name=\"Registro\" OnClick=\"location.href = 'index.html'\"></center>");
        out.println("</div></body></html>");
        out.close();

    }
}
