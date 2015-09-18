package com.alvin.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Alvinyau on 2015/6/18.
 */
public class CheckLoginFilter implements Filter {

    public void init(FilterConfig filterConfig)throws ServletException{

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        HttpServletResponse response=(HttpServletResponse) servletResponse;
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession session=request.getSession();
        String url=request.getRequestURL().toString();
        String userInfo=(String) session.getAttribute("loginUser");
        if(userInfo!=null){
            filterChain.doFilter(request, response);
        }else if(url.endsWith("index.jsp") || url.endsWith("web/")){
            filterChain.doFilter(request,response);
        }else{
            response.sendRedirect("/WEB-INF/jsp/index.jsp");
        }
    }

    public void destroy(){

    }
}
