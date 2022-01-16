package com.edson.arrays;

public class DesafioArray {
  public double calculate(double[] notas) {
    double total = 0.0;

    for(double nota: notas) {
      total += nota;
    }

    return total / notas.length;
  }
}
