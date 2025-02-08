package com.chess;

import com.chess.controller.ChessController;
import com.chess.observer.TabuleiroObservavel;
import com.chess.view.TabuleiroView;

public class Main {
    public static void main(String[] args) {
        TabuleiroObservavel tabuleiro = new TabuleiroObservavel();
        TabuleiroView tabuleiroView = new TabuleiroView();
        ChessController controller = new ChessController(tabuleiro);

        tabuleiro.adicionarObserver(tabuleiroView);
        
        // Um movimento qualquer usando o Controller
        controller.moverPeca(1, 1, 2, 2, "rainha", "branco");
    }
}