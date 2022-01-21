package com.edson.colecoes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapaTest {
  Mapa sut;

  @BeforeEach
  void setUp() {
    sut = new Mapa();
  }

  @Test
  @DisplayName("should return 3 user ids")
  void testGetKeySetBehaviour01() {
    int expected = 3;
    int actual = sut.getKeySet().size();
    assertEquals(expected, actual);
  }

  @Test
  @DisplayName("should return all user ids")
  void testGetKeySetBehaviour02() {
    Set<Integer> expected = new HashSet<>(Arrays.asList(1, 2, 3));
    Set<Integer> actual = sut.getKeySet();
    assertIterableEquals(expected, actual);
  }

}
