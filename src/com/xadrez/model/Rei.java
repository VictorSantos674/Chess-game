package com.xadrez.model;

public class Rei extends Peca {
    public Rei(String cor) {
        super(cor);
    }
    @Override
    public String getSimbolo() {
        return cor.equals("branco") ? "♔" : "♚";
    }
}