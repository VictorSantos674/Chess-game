package com.xadrez.observer;

public interface Observador {
    void atualizar(int startX, int startY, int endX, int endY, String peca);
}
