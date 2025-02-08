package com.xadrez.model;

public class Rainha extends Peca {
    public Rainha(String cor) {
        super(cor);
    }
    @Override
    public String getSimbolo() {
        return cor.equals("branco") ? "♕" : "♛";
    }
}