package com.xadrez.model;

public class Bispo extends Peca {
    public Bispo(String cor) {
        super(cor);
    }
    @Override
    public String getSimbolo() {
        return cor.equals("branco") ? "♗" : "♝";
    }
}