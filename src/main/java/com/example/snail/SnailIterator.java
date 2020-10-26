package com.example.snail;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class SnailIterator implements Iterator<Integer> {
  private int[][] dataset;
  private int minRow;
  private int maxRow;
  private int minColumn;
  private int maxColumn;
  private int currentRow;
  private int currentColumn;

  SnailIterator(int[][] dataset) {
    this.dataset = dataset;
    minRow = 0;
    minColumn = 0;
    maxRow = dataset.length - 1;
    maxColumn = dataset[0].length - 1;
    currentRow = minRow;
    currentColumn = minColumn;
  }

  @Override
  public boolean hasNext() {
    boolean b = minColumn <= maxColumn;
    boolean c = minRow <= maxRow;
    return b && c;
  }

  @Override
  public Integer next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    final Integer next = dataset[currentRow][currentColumn];
    final Integer nbColSteps = maxColumn - minColumn - 1;
    final Integer nbRowSteps = maxRow - minRow - 1;
    // TOP
    if (currentRow == minRow && currentColumn <= minColumn + nbColSteps) {
      currentColumn++;
    }
    // RIGHT
    else if (currentColumn == maxColumn && currentRow <= minRow + nbRowSteps) {
      currentRow++;
    }
    // BOTTOM
    else if (currentRow == maxRow && currentColumn >= maxColumn - nbColSteps) {
      currentColumn--;
    }
    // LEFT
    else if (currentRow > maxRow - nbRowSteps) {
      currentRow--;
    } else shrinkWindow();
    return next;
  }

  private void shrinkWindow() {
    minRow++;
    maxRow--;
    minColumn++;
    maxColumn--;
    currentColumn = minColumn;
    currentRow = minRow;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}
