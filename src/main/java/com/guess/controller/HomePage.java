package com.guess.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "homePage", urlPatterns = "/home-page")
public class HomePage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        req.setAttribute("username",username);
        if (username != null){
            resp.sendRedirect(req.getContextPath()+"/game?username="+username);
        }
        else{
            req.getRequestDispatcher("webapp/home-page.jsp").forward(req,resp);
        }

    }
}
