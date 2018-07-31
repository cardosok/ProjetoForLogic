/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import BancoDeDados.ConnectionFactory;
import Models.Avaliacoes;
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
public class AvaliacaoDAO {
    Connection con;
    
     public AvaliacaoDAO() {
        this.con = ConnectionFactory.getConnection();
    }
    
    public boolean cadastrar (Avaliacoes ava){
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO avaliacao(cliente_participaram,data_ultima_ava,mes_ano_ref) values(?,?,?)");
            stmt.setString(1,ava.getCliParticiparam());
            stmt.setString(2,ava.getMesUltimaAva());
            stmt.setString(3,ava.getMes_Ano_ref());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao Cadastrar: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        return false;
    }
    public ArrayList<Avaliacoes> pesquisarAll () {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String sqlQuery = "SELECT mes_ano_ref, cliente_participaram,data_ultima_ava,nota,motivo FROM avaliacao";
        ArrayList<Avaliacoes> ava = new ArrayList<>();
        try{
            stmt = con.prepareStatement(sqlQuery);
            rs = stmt.executeQuery();
            while(rs.next()){
                Avaliacoes avali = new Avaliacoes(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
                ava.add(avali);
             
            } 
            return ava;
        }catch(SQLException ex){
            System.err.println("Erro ao procurar clientes: "+ ex);
        }
        return null;
    }
}
