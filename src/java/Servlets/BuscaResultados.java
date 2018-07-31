/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controller.*;
import Models.*;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author César
 */
public class BuscaResultados extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("To na servlet");
        ArrayList<Avaliacoes> arrayCliAll = new ArrayList<>();
        AvaliacaoDAO avaDao = new AvaliacaoDAO();
        
        arrayCliAll = avaDao.pesquisarAll();
        Gson gson = new Gson();
        PrintWriter out = response.getWriter();
        
        out.print(gson.toJson(arrayCliAll));
                
    }
}
