package com.edson.colecoes;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PilhaTest {

  Pilha sut;

  @BeforeEach
  void setUp() {
    sut = new Pilha();
  }

  @Test
  @DisplayName("should return a list of books")
  void testGetLivrosBehaviour01() {
    ArrayList<String> livros = new ArrayList<>() {
      {
        add("O pequeno principe");
        add("Don Quixote");
        add("O Hobbit");
      }
    };
    Deque<String> actual = new ArrayDeque<>(livros);
    Deque<String> expected = sut.getLivros();
    assertIterableEquals(expected, actual);
  }

  @Test
  @DisplayName("should remove last item added to the list")
  void testRemoveLivroBehaviour01() {
    sut.AddLivro("New book");
    var temp = sut.getLivros();
    temp.removeFirst();
    System.out.println(temp);
    // sut.removeLivro();
    // boolean containsLastInBook = sut.getLivros().contains("O pequeno principe");
    // assertFalse(containsLastInBook);
  }
}
