package com.example.snail;

public class Snail {
    private final char width;
    private final int[][] snail;
    private int posX = 0;
    private int posY = 0;
    private int count = 1;

    Snail(char width) {
        snail = new int[width][width];
        this.width = width;
    }

    public int[][] compute() {
        fillTop();
        fillRight();
        fillBottom();
        fillLeft();
        if (count <= width * width) {
            posX++;
            posY++;
            return compute();
        }
        return snail;
    }

    private void fillRight() {
        for (int i = 1 + posY; i < width - posY; i++) {
            snail[i][width - 1 - posX] = count++;
        }
    }

    private void fillLeft() {
        for (int i = width - 2 - posY; i > posY; i--) {
            snail[i][posX] = count++;
        }
    }

    private void fillTop() {
        for (int i = posX; i < width - posX; i++) {
            snail[posY][i] = count++;
        }
    }

    private void fillBottom() {
        for (int i = width - 2 - posX; i >= posX; i--) {
            snail[width - 1 - posY][i] = count++;
        }
    }

}
