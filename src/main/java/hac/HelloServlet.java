package hac;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// a simple demo servlet to remove from your repo upon submission!
@WebServlet(name = "helloServlet", urlPatterns = {"/hello-servlet", ""})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}