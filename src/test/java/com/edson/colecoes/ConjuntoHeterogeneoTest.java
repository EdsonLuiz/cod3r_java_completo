package com.edson.colecoes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConjuntoHeterogeneoTest {
  ConjuntoHeterogeneo sut;
  @BeforeEach
  void setUp() {
    sut = new ConjuntoHeterogeneo();
  }

  @Test
  @DisplayName("should return correct heterogeous set")
  void testGetConjuntoBehaviour01() {
    Set expected = new HashSet<Object>(Arrays.asList(1.2, "Edson", true, 1));
    Set actual = sut.getConjunto();
    assertIterableEquals(expected, actual);
  }

  @Test
  @DisplayName("should return a set of size 4")
  void testGetConjuntoBehaviour02() {
    int expected = 4;
    int actual = sut.getConjunto().size();
    assertEquals(expected, actual);
  }
  @Test
  @DisplayName("should keep the same size when receiving repeated values")
  void testGetConjuntoBehaviour03() {
    int expected = 4;
    int actual = sut.getConjunto().size();
    assertEquals(expected, actual);
    sut.add("Edson");
    actual = sut.getConjunto().size();
    assertEquals(expected, actual);
  }

  @Test
  @DisplayName("should remove an item of set")
  void testGetConjuntoBehaviour04() {
    boolean hasItem = sut.getConjunto().contains("Edson");
    assertTrue(hasItem);
    sut.remove("Edson");
    boolean actual = sut.getConjunto().contains("Edson");
    assertFalse(actual);
  }

  @Test
  @DisplayName("should contains new item when add no duplicated value")
  void testGetConjuntoBehaviour05() {
    sut.add("Bingo");
    boolean hasNewValue = sut.getConjunto().contains("Bingo");
    assumeTrue(hasNewValue);
  }

}
