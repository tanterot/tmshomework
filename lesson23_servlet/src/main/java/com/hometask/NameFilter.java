package com.hometask;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebFilter("/black/*")
public class NameFilter implements Filter
{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        var request  = (HttpServletRequest)servletRequest;
        var response = (HttpServletResponse)servletResponse;
        HttpSession session = request.getSession();
        String token = (String) session.getAttribute("token");

        if (token!=null&& token.length()>=5){
            filterChain.doFilter(servletRequest,servletResponse);
        }
        else {
            response.sendRedirect("/white/home");
        }


    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
