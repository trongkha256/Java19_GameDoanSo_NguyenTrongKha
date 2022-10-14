package com.guess.controller;

import com.guess.model.Player;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PlayGame",urlPatterns = "/game")
public class PlayGame extends HttpServlet {
    List<Player> listPlayer= new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        int number= Integer.parseInt(req.getParameter("number"));
        double randomDouble = Math.random();
        randomDouble = randomDouble * 1000 + 1;
        int randomInt = (int) randomDouble;
        Player player =new Player();
        player.setName(username);
        player.setSeq(1);
        String str;
        if (number ==randomInt){
            str="Congratulations !";
            listPlayer.add(player);
        }
        else{
            if (number<randomInt){
                str="Number is less";
                player.setSeq(player.getSeq()+1);

            }
            else if (number>randomInt){
                str="Number is bigger";
                player.setSeq(player.getSeq()+1);

            }
        }
        req.setAttribute("listPlayer",listPlayer);
        req.getRequestDispatcher("webapp/playGame.jsp").forward(req,resp);
    }
}
