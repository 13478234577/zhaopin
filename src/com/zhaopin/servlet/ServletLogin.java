package com.zhaopin.servlet;

import com.zhaopin.DBUtil.User_DB;
import com.zhaopin.DBUtil.User_DB_JDBC;
import com.zhaopin.java.MD5Util;
import com.zhaopin.java.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by ttc on 18-1-3.
 */
@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        String username = request.getParameter("username");
        String pwd=request.getParameter("password");
        String pwd_md5= MD5Util.getMD5(pwd);
        User user=new User();
        user.setUsername(username);
        user.setPassword(pwd_md5);
        User_DB user_db=new User_DB_JDBC();
        User user1= user_db.select_userinfo(user);
        HttpSession session=request.getSession();
        if(user1!=null)
        {

            session.setAttribute("user",user1);
            response.sendRedirect("MyInformation.jsp");

        }
        else
        {
            session.setAttribute("login_info","false");
        }





    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        doPost(request, response);
    }
}
