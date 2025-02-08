package com.chess.view;

import com.chess.observer.TabuleiroObserver;

public class TabuleiroView implements TabuleiroObserver {
    @Override
    public void atualizar(int startX, int startY, int endX, int endY, String peca) {
        System.out.println("Movendo " + peca + " de (" + startX + "," + startY + ") para (" + endX + "," + endY + ")");
    }
}