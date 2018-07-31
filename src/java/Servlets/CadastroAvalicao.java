/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controller.AvaliacaoDAO;
import Models.Avaliacoes;
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
@WebServlet(urlPatterns = {"/CadastroAvalicao"}, name="CadastroAvalicao")
public class CadastroAvalicao extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Entrei");
        String nomeCliente = request.getParameter("clientesCad");        
        String referencia = request.getParameter("referencia");
        ArrayList<String> array = new ArrayList<>();
        
        //Gson gson = new Gson();
        //String teste = gson.fromJson(request.getParameter("clientesCad"),String.class);
        
        System.out.println("Nome Cliente: " + nomeCliente);
        System.out.println("Data de ingresso: " + referencia);
        Avaliacoes ava = new Avaliacoes(referencia,"Cesar,Vitor","00/00/0000");
        AvaliacaoDAO avaDAO = new AvaliacaoDAO();
        
        avaDAO.cadastrar(ava);
    }
}
