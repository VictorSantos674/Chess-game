package com.xadrez.model;

public class PecaFactory {
    public static Peca criarPeca(String tipo, String cor) {
        return switch (tipo.toLowerCase()) {
            case "peao" -> new Peao(cor);
            case "torre" -> new Torre(cor);
            case "cavalo" -> new Cavalo(cor);
            case "bispo" -> new Bispo(cor);
            case "rainha" -> new Rainha(cor);
            case "rei" -> new Rei(cor);
            default -> null;
        };
    }
}