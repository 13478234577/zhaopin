package com.zhaopin.servlet;

import com.zhaopin.DBUtil.User_DB;
import com.zhaopin.DBUtil.User_DB_JDBC;
import com.zhaopin.java.User;

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
@WebServlet("/ServletMyInformation")
public class ServletMyInformation extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        User user=(User) request.getSession().getAttribute("user");
        user.setName(request.getParameter("name"));
        user.setExperience(request.getParameter("experience"));
        user.setEducation(request.getParameter("education"));
        user.setEmail(request.getParameter("email"));
        user.setExpect_sal(request.getParameter("expect_sal"));
        user.setAddress(request.getParameter("address"));
        user.setDiscipline(request.getParameter("discipline"));
        user.setTel(request.getParameter("tel"));
        user.setSex(request.getParameter("sex"));
        user.setSchool(request.getParameter("school"));

        user.setPhoto(request.getParameter("photo"));

        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
        String da= request.getParameter("date");
        Date date=null;
        try
        {
           date = sf.parse(da);
        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        user.setBirthday(date);


        User_DB user_db= new User_DB_JDBC();
        if(user_db.update_userinfo(user))
        {
            response.sendRedirect("********");
        }
        else
        {
            response.sendRedirect("********");
        }






    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        doPost(request, response);
    }
}
