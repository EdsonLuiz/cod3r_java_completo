package com.edson.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DesafioArrayTest {
  DesafioArray sut;

  @BeforeEach
  void setUp() {
    sut = new DesafioArray();
  }

  
  @Test
  @DisplayName("should return the average of the 3 grades")
  void calcularMediaBehaviour01() {
    double expected = 10.0;
    double actual = sut.calculate(new double[] {10.0, 10.0, 10.0});
    assertEquals(expected, actual, 0.001);
  }

  @Test
  @DisplayName("should return the average of the 4 grades")
  void calcularMediaBehaviour02() {
    double expected = 7.5;
    double actual = sut.calculate(new double[] {7.51, 7.52, 7.53, 7.54});
    assertEquals(expected, actual, 0.029);
  }

  @Test
  @DisplayName("should return the average of the 2 grades")
  void calcularMediaBehaviour03() {
    double expected = 50.0;
    double actual = sut.calculate(new double[] {85.40, 14.60});
    assertEquals(expected, actual);
  }



}
