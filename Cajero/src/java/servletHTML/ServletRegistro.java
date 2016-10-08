
package servletHTML;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletRegistro extends HttpServlet {
    String user;
    int dinero;
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        user = req.getParameter("user");
        dinero = Integer.parseInt(req.getParameter("dinero"));
        if (user.equals(user) ) {
			response(res, "logeo correcto");
		} else {
			response(res, "logeo incorrecto");
		}
    }
    private void response(HttpServletResponse resp, String msg)
			throws IOException {
		PrintWriter out = resp.getWriter();
		 out.println("<html>");
        out.println("<head><title>Registro</title><style>\n"
                + "            @import url(https://fonts.googleapis.com/css?family=Roboto+Condensed);\n"
                + "        </style></head>");
        out.println("<body><div style = \"float: left; width:100%; height:100%; background-color:#708573; font-family: Roboto Condensed;\">");
	 out.print("<br><br><br><br><br><br><br><br><br><br><br>");
        out.println("<center><Font color=\"white\" size=\"12\">Bienvenido al cajero " + user + "</Font>");
        out.println(" <br><br>\n" +
"                    <input type=\"button\" value=\"HOME\" name=\"Registro\" OnClick=\"location.href = 'index.html'\"></center>");
        out.println("</div></body></html>");
        out.close();	
        
        
	}
}
