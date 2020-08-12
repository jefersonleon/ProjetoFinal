/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Teste {
    public static void main(String[] args) {
       Connection connection = new ConexaoBD().getConnection();
    
     
    }
    
}
