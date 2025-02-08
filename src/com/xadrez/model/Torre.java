package com.xadrez.model;

public class Torre extends Peca {
    public Torre(String cor) {
        super(cor);
    }
    @Override
    public String getSimbolo() {
        return cor.equals("branco") ? "♖" : "♜";
    }
}