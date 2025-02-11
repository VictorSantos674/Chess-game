package com.xadrez.tests;

import com.xadrez.controller.ChessController;
import com.xadrez.model.*;
import com.xadrez.observer.TabuleiroObservavel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChessTests {
    private TabuleiroObservavel tabuleiro;
    private ChessController controller;

    @BeforeEach
    void setUp() {
        tabuleiro = new TabuleiroObservavel();
        controller = new ChessController(tabuleiro);
    }

    @Test
    void testCriacaoDasPecas() {
        Peca peao = PecaFactory.criarPeca("peao", "branco");
        assertNotNull(peao);
        assertEquals("♙", peao.getSimbolo());
        
        Peca rainha = PecaFactory.criarPeca("rainha", "preto");
        assertNotNull(rainha);
        assertEquals("♛", rainha.getSimbolo());
    }

    @Test
    void testMovimentoPecaValido() {
        controller.moverPeca(0, 1, 0, 2, "peao", "branco");
        // Aqui seria interessante adicionar um Observer mockado para verificar a notificação
    }
    
    @Test
    void testFactoryRetornaNuloParaPecaInvalida() {
        Peca pecaInvalida = PecaFactory.criarPeca("dragao", "branco");
        assertNull(pecaInvalida);
    }
}
