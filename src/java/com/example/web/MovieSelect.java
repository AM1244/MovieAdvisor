/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;


import com.example.model.MovieExpert;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author thomi
 */
public class MovieSelect extends HttpServlet {

  public void doPost( HttpServletRequest request,
                      HttpServletResponse response)
                      throws IOException, ServletException {

        String c = request.getParameter("type");

        // Now use our Coffee Model above
       // MovieExpert ce = new MovieExpert();
        if(c.equals("Thriller")){
           // List result = ce.getTypes(c);

          //  request.setAttribute("styles", result);
            RequestDispatcher view = request.getRequestDispatcher("thriller.jsp");
            view.forward(request, response);
        }
        else if(c.equals("Comedy")){
          //  List result = ce.getTypes(c);

         //   request.setAttribute("styles", result);
            RequestDispatcher view = request.getRequestDispatcher("comedy.jsp");
            view.forward(request, response);
        }
        else if(c.equals("Adventure")){
          //  List result = ce.getTypes(c);

           // request.setAttribute("styles", result);
            RequestDispatcher view = request.getRequestDispatcher("adventure.jsp");
            view.forward(request, response);
        }
    } 
}
  
