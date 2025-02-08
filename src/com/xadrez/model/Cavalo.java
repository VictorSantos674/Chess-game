package com.xadrez.model;

public class Cavalo extends Peca {
    public Cavalo(String cor) {
        super(cor);
    }
    @Override
    public String getSimbolo() {
        return cor.equals("branco") ? "♘" : "♞";
    }
}