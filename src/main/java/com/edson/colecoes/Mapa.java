package com.edson.colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapa {

  Map<Integer, String> usuarios = new HashMap<>(
    Map.of(1, "Edson", 2, "Luiz", 3, "Ribeiro")
  );

  public Set<Integer> getKeySet() {
    return this.usuarios.keySet();
  }
}
