package com.edson.colecoes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilaTest {
  public static Fila sut;

  @BeforeEach
  void setUp() {
    sut = new Fila();
  }

  @Test
  @DisplayName("should start with an empty queue")
  void testAddOnQueueBehaviour01() {
    Queue<String> actual = sut.getAllQueue();
    assumeTrue(actual.isEmpty());
  }

  @Test
  @DisplayName("should add an item to the queue")
  void testAddOnQueueBehaviour02() {
    String item = "Some item";
    sut.addOnQueue(item);
    Queue<String> actual = sut.getAllQueue();
    assertTrue(actual.contains(item));
  }

  @Test
  @DisplayName("should get next item on queue without remove it")
  void testGetNextItemBehaviour01() {
    String nextItem = "next item";
    sut.addOnQueue(nextItem);
    sut.addOnQueue("second item");

    String actual = sut.getNextItem();
    assertEquals(nextItem, actual);
    assertTrue(sut.getAllQueue().contains(nextItem));
  }

  @Test
  @DisplayName("should remove an item from the queue")
  void testRemoveFromQueue() {
    String itemToRemove = "item to remove";
    sut.addOnQueue("second item");
    sut.addOnQueue("third item");

    sut.removeFromQueue();
    boolean itemHasBeenRemoved = !sut.getAllQueue().contains(itemToRemove);
    assertTrue(itemHasBeenRemoved);
  }
}
