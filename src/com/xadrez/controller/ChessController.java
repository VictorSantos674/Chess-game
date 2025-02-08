package com.chess.controller;

import com.chess.model.Peca;
import com.chess.model.PecaFactory;
import com.chess.observer.TabuleiroObservavel;

public class ChessController {
    private final TabuleiroObservavel tabuleiro;

    public ChessController(TabuleiroObservavel tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void moverPeca(int startX, int startY, int endX, int endY, String tipoPeca, String cor) {
        Peca peca = PecaFactory.criarPeca(tipoPeca, cor);
        if (peca != null) {
            tabuleiro.notificarMudanca(startX, startY, endX, endY, peca.getSimbolo());
        }
    }
}