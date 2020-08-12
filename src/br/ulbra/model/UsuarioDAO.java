/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Jeferson Leon
 */
public class UsuarioDAO {

    public void addUser(Usuario usuario) {
        String sql = "insert into tbusuario (nome, email, senha) value (?,?,?)";
        PreparedStatement stmt = null;
        Connection connection = null;
        try {
            connection = new ConexaoBD().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getSenha());
            stmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
