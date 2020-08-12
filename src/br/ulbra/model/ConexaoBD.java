/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;


import com.mysql.jdbc.Driver;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class ConexaoBD {
    public Connection getConnection(){
        Connection conn = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bdcolecao","root",null);
              JOptionPane.showMessageDialog(null, "Resultado: conecado");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
}
