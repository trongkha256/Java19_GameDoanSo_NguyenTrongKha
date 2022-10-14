package com.guess.controller;

import com.guess.model.Player;
import com.guess.service.SortService;

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
    int seq=1;
    double randomDouble = Math.random()* 1000 + 1;
    int randomInt = (int) randomDouble;
    String nameTemp="";
    SortService sortService=new SortService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username=req.getParameter("username");
        String tag="";
        Player player =new Player();
        if (username!=null){
            nameTemp=username;

        }
            int number= Integer.parseInt(req.getParameter("number"));
            player.setName(nameTemp);
            player.setSeq(seq);
            String str="";
            System.out.printf(""+randomInt+username+number);
            if (number ==randomInt){
                str="Congratulations !";
                listPlayer.add(player);
                nameTemp="";
//                tag="<h2 lass=\"mb-3\">Please enter your name to continue.</h2>\n" +
//                        "        <form action=\"http://localhost:8085/doanSo/game\" method=\"get\">\n" +
//                        "          <div class=\"mb-3\">\n" +
//                        "            <input type=\"text\" class=\"form-control w-25\" id=\"exampleInputEmail1\" name=\"username\">\n" +
//                        "          </div>\n" +
//                        "\n" +
//                        "          <button type=\"submit\" class=\"btn btn-primary\">Continue</button>\n" +
//                        "        </form>";

                seq=1;
            }
            else{
                if (number<randomInt){
                    str="Number is less";

                    seq+=1;

                }
                else if (number>randomInt){
                    str="Number is bigger";
                    seq+=1;

                }
            }
            req.setAttribute("tag",tag);
            req.setAttribute("str",str);
        sortService.insertionSort(listPlayer);
        req.setAttribute("listPlayer",listPlayer);
        req.getRequestDispatcher("webapp/playGame.jsp").forward(req,resp);
    }
}
