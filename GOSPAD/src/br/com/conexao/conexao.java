/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * 
 * @author rafael
 */
public class conexao {
    
    Connection connection = null;
    static conexao instance = null;
        public static Connection GeraConexao(){
        Connection conexao = null;
        
       try{
           String url = "jdbc:mysql://localhost/GOSPAD_BD";
           String usuario ="root";
           String senha="12345";
           conexao = DriverManager.getConnection(url,usuario,senha);
           System.out.println("Conexão realizada com sucesso.");
       } catch (SQLException e) {
           System.out.println("Ocorreu um erro ao tentar conectar: " + e.getMessage());
           conexao = null;
       }
        return conexao;
    }   


        public static conexao getInstance() throws Exception{
            if (instance == null){
                instance = new conexao();
            }
            return instance;
        }
        
        public Connection getConnection(){
            return connection;
        }
    
}
