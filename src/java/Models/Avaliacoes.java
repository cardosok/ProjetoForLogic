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
public class Avaliacoes {
    String Mes_Ano_ref;
    String cliParticiparam;
    String mesUltimaAva;
    String resultado;
    double meta;

    public Avaliacoes(String Mes_Ano_ref, String cliParticiparam, String mesUltimaAva, String resultado) {
        this.Mes_Ano_ref = Mes_Ano_ref;
        this.cliParticiparam = cliParticiparam;
        this.mesUltimaAva = mesUltimaAva;
        this.resultado = resultado;
        this.meta = meta;
    }

    public Avaliacoes(String Mes_Ano_ref, String cliParticiparam, String mesUltimaAva) {
        this.Mes_Ano_ref = Mes_Ano_ref;
        this.cliParticiparam = cliParticiparam;
        this.mesUltimaAva = mesUltimaAva;
    }

    public String getMes_Ano_ref() {
        return Mes_Ano_ref;
    }

    public void setMes_Ano_ref(String Mes_Ano_ref) {
        this.Mes_Ano_ref = Mes_Ano_ref;
    }

    public String getCliParticiparam() {
        return cliParticiparam;
    }

    public void setCliParticiparam(String cliParticiparam) {
        this.cliParticiparam = cliParticiparam;
    }

    public String getMesUltimaAva() {
        return mesUltimaAva;
    }

    public void setMesUltimaAva(String mesUltimaAva) {
        this.mesUltimaAva = mesUltimaAva;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double getMeta() {
        return meta;
    }

    public void setMeta(double meta) {
        this.meta = meta;
    }
    
    
}
