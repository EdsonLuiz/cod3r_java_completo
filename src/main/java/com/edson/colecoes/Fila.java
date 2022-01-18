package com.edson.colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
  private Queue<String> fila = new LinkedList<>();

  public Queue<String> getAllQueue() {
    return fila;
  }

  public void addOnQueue(String item) {
    fila.add(item);
  }

  public String getNextItem() {
    String nextItemOnQueue = this.fila.peek();
    return nextItemOnQueue;
  }

  public void removeFromQueue() {
    this.fila.poll();
  }
}
