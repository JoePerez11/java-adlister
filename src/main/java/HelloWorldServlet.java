import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello-world")
public class HelloWorldServlet extends HttpServlet {

    int counter = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, World!</h1>");
        counter++;
        out.println("<p>I know I am going to work</p>" + counter);
    }

}

//    Fork and clone the Adlister Repository
//
//    Checkout the servlets tag and branch off of it
//
//
//        git checkout servlets
//        git branch servlets-exercise
//        git checkout servlets-exercise
//        Configure IntelliJ for the project
//
//        See this section in the appendix for more details.
//
//        Finish up the Hello World Servlet
//
//        Create a page that displays "Hello World!" when a user visits /hello
//
//        Bonus
//
//        Make the page say "Hello, <name>!" if name is passed as part of the query string (e.g. /hello?name=codeup), otherwise default to "Hello, World!".
//
//        Create a page view counter
//
//        Create a page that displays a number that goes up by one every time the /count page is viewed.
//
//        Bonus
//
//        Allow the user to pass a parameter in the query string to reset the counter.

