package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoTest {
    @Test
    public void deveRetornarUrlDoBancoDeDados() {
        Configuracao.getInstancia().setUrlBancoDados("localhost");
        assertEquals("localhost", Configuracao.getInstancia().getUrlBancoDados());
    }

    @Test
    public void deveRetornarUsuarioDoBancoDeDados() {
        Configuracao.getInstancia().setUsuarioBancoDados("root");
        assertEquals("root", Configuracao.getInstancia().getUsuarioBancoDados());
    }

    @Test
    public void deveRetornarSenhaDoBancoDeDados() {
        Configuracao.getInstancia().setUsuarioBancoDados("password");
        assertEquals("password", Configuracao.getInstancia().getUsuarioBancoDados());
    }
}