package com.xadrez.observer;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroObservavel {
    private final List<Observador> observers = new ArrayList<>();

    public void adicionarObserver(Observador observer) {
        observers.add(observer);
    }

    public void removerObserver(Observador observer) {
        observers.remove(observer);
    }

    public void notificarMudanca(int startX, int startY, int endX, int endY, String peca) {
        for (Observador observer : observers) {
            observer.atualizar(startX, startY, endX, endY, peca);
        }
    }
}
