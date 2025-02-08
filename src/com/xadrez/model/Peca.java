package com.xadrez.model;

public abstract class Peca {
    protected String cor;

    public Peca(String cor) {
        this.cor = cor;
    }

    public abstract String getSimbolo();
}