/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controller.ClienteDAO;
import Models.Cliente;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author César
 */
@WebServlet(urlPatterns = {"/ListaClientes"}, name="ListaClientes")
public class ListaClientes extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("To na servlet");
        ArrayList<Cliente> arrayCliAll = new ArrayList<>();
        ClienteDAO cliDao = new ClienteDAO();
        
        arrayCliAll = cliDao.pesquisarAll();
        Gson gson = new Gson();
        PrintWriter out = response.getWriter();
        
        out.print(gson.toJson(arrayCliAll));
                
    }
}
