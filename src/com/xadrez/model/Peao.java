package com.xadrez.model;

public class Peao extends Peca {
    public Peao(String cor) {
        super(cor);
    }
    @Override
    public String getSimbolo() {
        return cor.equals("branco") ? "♙" : "♟";
    }
}