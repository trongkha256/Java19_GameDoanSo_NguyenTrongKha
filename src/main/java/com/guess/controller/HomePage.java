package com.guess.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "homePage", urlPatterns = "/")
public class HomePage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("webapp/index.jsp").forward(req,resp);
        String username=req.getParameter("username");
        req.setAttribute("username",username);
        if (username != null){
            System.out.printf(req.getContextPath()+"/welcome?username="+username);
            resp.sendRedirect(req.getContextPath()+"/welcome?username="+username);
        }
        else{
            req.getRequestDispatcher("webapp/login_page.jsp").forward(req,resp);
        }
    }
}
