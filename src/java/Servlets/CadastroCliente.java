/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controller.ClienteDAO;
import Models.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author César
 */
@WebServlet(urlPatterns = {"/CadastroCliente"}, name="CadastroCliente")
public class CadastroCliente extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Entrei");
        String nomeCliente = request.getParameter("nomeCliente");
        String nomeContato = request.getParameter("nomeContato");
        String dataIngresso = request.getParameter("dataIngresso");
        
        Cliente cli = new Cliente(nomeCliente,nomeContato,dataIngresso);
        ClienteDAO cliDAO = new ClienteDAO();
        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("Nome Contato: " + nomeContato);
        System.out.println("Data de ingresso: " + dataIngresso);
        
        if(cliDAO.cadastrar(cli)){
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("Usuario cadastrado");
        }
        else{
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("Não usuario cadastrado");
        }
    }
}
