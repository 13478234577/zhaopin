import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ttc on 18-1-3.
 */
@WebServlet("/Servlettest")
public class Servlettest extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
//        String date =request.getParameter("date");
        String date="2001-11-11";
        System.out.println(date);
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        try
        {
            Date date1= sf.parse(date);
            System.out.println(date1);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        doPost(request, response);
    }
}
