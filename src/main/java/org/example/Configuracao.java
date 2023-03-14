package org.example;

public class Configuracao {
    private Configuracao() {};
    private static Configuracao instancia = new Configuracao();
    public static Configuracao getInstancia() {
        return instancia;
    }
    private String urlBancoDados;
    private String usuarioBancoDados;
    private String senhaBancoDados;

    public String getUrlBancoDados() {
        return urlBancoDados;
    }

    public void setUrlBancoDados(String urlBancoDados) {
        this.urlBancoDados = urlBancoDados;
    }

    public String getUsuarioBancoDados() {
        return usuarioBancoDados;
    }

    public void setUsuarioBancoDados(String usuarioBancoDados) {
        this.usuarioBancoDados = usuarioBancoDados;
    }

    public String getSenhaBancoDados() {
        return senhaBancoDados;
    }

    public void setSenhaBancoDados(String senhaBancoDados) {
        this.senhaBancoDados = senhaBancoDados;
    }



}
