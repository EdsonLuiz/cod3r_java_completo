package com.edson.colecoes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ListaTest {
  Lista sut;
  
  @BeforeEach
  void setUp() {
    sut = new Lista();
  }

  @Test
  @DisplayName("should add user to the list")
  void testAddUser() {
    Usuario newUser = new Usuario("newUser");
    sut.addUser(newUser);
    boolean containsNewUser = sut.getAllUsers().contains(newUser);
    assertTrue(containsNewUser);
  }

  @Test
  @DisplayName("should return empty when no users are added")
  void testGetAllUsersBehaviour01() {
    ArrayList<Usuario> actual = sut.getAllUsers();
    assertTrue(actual.isEmpty());
  }

  @Test
  @DisplayName("should remove user from list")
  void testRemoveUser() {
    Usuario newUser = new Usuario("newUser");
    sut.addUser(newUser);
    boolean containsUser = sut.getAllUsers().contains(newUser);
    assertTrue(containsUser);
    sut.removeUser(newUser);
    containsUser = sut.getAllUsers().contains(newUser);
    assertFalse(containsUser);
  }

}
