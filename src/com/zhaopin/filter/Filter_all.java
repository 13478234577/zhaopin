package com.zhaopin.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by ttc on 18-1-2.
 */
@WebFilter(filterName = "Filter_all",urlPatterns = "/*")
public class Filter_all implements Filter
{
    public void destroy()
    {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException
    {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html; charset=utf-8");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException
    {

    }

}
