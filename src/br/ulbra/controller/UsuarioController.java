/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.controller;

import br.ulbra.model.Usuario;

/**
 *
 * @author Jeferson Leon
 */
public class UsuarioController {

    public boolean addUser(String nome, String email, String senha) {
        if (nome != null && nome.length() > 0 && email != null && email.length() > 0 && senha != null && senha.length() > 0) {
            Usuario user = new Usuario(nome, email, senha);
            user.addUser(user);
            return true;
        }

        return false;

    }
}
