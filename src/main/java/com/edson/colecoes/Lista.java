package com.edson.colecoes;

import java.util.ArrayList;

public class Lista {
  private ArrayList<Usuario> lista = new ArrayList<>();

  public void addUser(Usuario usuario) {
    this.lista.add(usuario);
  }

  public ArrayList<Usuario> getAllUsers() {
    return this.lista;
  }

  public void removeUser(Usuario userToRemove) {
    this.lista.remove(userToRemove);
  }

}
