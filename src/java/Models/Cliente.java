/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author César
 */
public class Cliente {

    String nomeCliente;
    String nomeContato;
    String dataCliente;
    String sinalizador = "Nenhum";
    String ultimaAva;
   
    public Cliente() {
    }
    
    public Cliente(String nomeCliente, String nomeContato, String dataCliente) {
        this.nomeCliente = nomeCliente;
        this.nomeContato = nomeContato;
        this.dataCliente = dataCliente;
    }    

    public Cliente(String nomeCliente, String nomeContato, String dataCliente, String ultimaAva, String sinalizador) {
        this.nomeCliente = nomeCliente;
        this.nomeContato = nomeContato;
        this.dataCliente = dataCliente;
        this.ultimaAva = ultimaAva;
        this.sinalizador = sinalizador;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public String getDataCliente() {
        return dataCliente;
    }

    public void setDataCliente(String dataCliente) {
        this.dataCliente = dataCliente;
    }

    public String getSinalizador() {
        return sinalizador;
    }

    public void setSinalizador(String sinalizador) {
        this.sinalizador = sinalizador;
    }
   
    
}
