package com.xadrez.view;

import com.xadrez.observer.TabuleiroObserver;
import javax.swing.*;
import java.awt.*;

public class TabuleiroView extends JFrame implements TabuleiroObserver {
    private final JPanel boardPanel;
    private final JLabel[][] squares = new JLabel[8][8];

    public TabuleiroView() {
        setTitle("Jogo de Xadrez");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        boardPanel = new JPanel(new GridLayout(8, 8));
        add(boardPanel, BorderLayout.CENTER);
        
        inicializarTabuleiro();
        setVisible(true);
    }

    private void inicializarTabuleiro() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                squares[row][col] = new JLabel("", SwingConstants.CENTER);
                squares[row][col].setOpaque(true);
                squares[row][col].setBackground((row + col) % 2 == 0 ? Color.WHITE : Color.GRAY);
                boardPanel.add(squares[row][col]);
            }
        }
    }

    @Override
    public void atualizar(int startX, int startY, int endX, int endY, String peca) {
        squares[startX][startY].setText("");
        squares[endX][endY].setText(peca);
    }
}
