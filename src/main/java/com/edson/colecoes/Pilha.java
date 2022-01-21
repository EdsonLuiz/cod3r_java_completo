package com.edson.colecoes;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Pilha {
  private Deque<String> livros = new ArrayDeque<>(
    Arrays.asList("O pequeno principe", "Don Quixote", "O Hobbit"));

  public Deque<String> getLivros() {
    return this.livros;
  }

  public void AddLivro(String livro) {
    this.livros.add(livro);
  }

  public void removeLivro() {
    this.livros.poll();
  }
}
