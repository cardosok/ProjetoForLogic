/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BancoDeDados.ConnectionFactory;
import Models.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author César
 */
public class ClienteDAO {
    Connection con;
    
     public ClienteDAO() {
        this.con = ConnectionFactory.getConnection();
    }
    
    public boolean cadastrar (Cliente cli){
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO cliente (data_cliente,nome_cliente,nome_contato,sinalizador,ultima_ava) values(?,?,?,?,?)");
            stmt.setString(1,cli.getDataCliente());
            stmt.setString(2, cli.getNomeCliente());
            stmt.setString(3, cli.getNomeContato());
            stmt.setString(4, cli.getSinalizador());
            stmt.setString(5,"00/00/0000");
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao Cadastrar: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return false;
    }
    
    public ArrayList<Cliente> pesquisarAll () {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String sqlQuery = "SELECT nome_cliente, nome_contato, data_cliente, sinalizador, ultima_ava FROM cliente";
        ArrayList<Cliente> cli = new ArrayList<>();
        try{
            stmt = con.prepareStatement(sqlQuery);
            rs = stmt.executeQuery();
            while(rs.next()){
                Cliente publi = new Cliente(rs.getString(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                cli.add(publi);
             
            } 
            return cli;
        }catch(SQLException ex){
            System.err.println("Erro ao procurar clientes: "+ ex);
        }
        return null;
    }
}

