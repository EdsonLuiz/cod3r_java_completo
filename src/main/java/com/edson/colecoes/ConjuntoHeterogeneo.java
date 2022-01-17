package com.edson.colecoes;

import java.util.Arrays;
import java.util.HashSet;

public class ConjuntoHeterogeneo {
  HashSet conjunto = new HashSet<>(Arrays.asList(1.2, "Edson", true, 1));

  public HashSet getConjunto() {
    return conjunto;
  }

  public void add(Object item) {
    this.conjunto.add(item);
  }

  public void remove(Object item) {
    this.conjunto.remove(item);
  }


}
