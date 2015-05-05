/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.conexao.conexao;
import br.com.modelo.FornecedorModel;
import br.com.modelo.ContatosModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Paes Leme
 */
public class contatosDao {

    Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = conexao.getInstance().getConnection();
        String sql = "SELECT * FROM contato";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(ContatosModel contato) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into GOSPAD_BD.contato values(?,?,?,?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, contato.getId());
            insereSt.setString(2, contato.getNome());
            insereSt.setString(3, contato.getTel_1());
            insereSt.setString(4, contato.getTel_2());
            insereSt.setString(5, contato.getFax());
            insereSt.setString(6, contato.getCel_1());
            insereSt.setString(7, contato.getCel_2());
            insereSt.setString(8, contato.getOutro());
            insereSt.setString(9, contato.getEmail());
            insereSt.setString(10, contato.getObservacao());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar contato: " + e.getMessage() + "\n");
        } finally {
            try {
                insereSt.close();
                cnx.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao encerrar conexão: " + e.getMessage() + "\n");
            }
        }

    }

    //Codigo fonte de Atualização de dados no banco
    public static void atualizar(ContatosModel contato) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update GOSPAD_BD.contato set id = ?, "
                + "  nome = ?, "
                + "  tel_1 = ?, "
                + "  tel_2 = ?, "
                + "  fax = ?, "
                + "  cel_1= ?, "
                + "  cel_2= ?, "
                + "  outro= ?, "
                + "  email = ?, "
                + "  observacao = ? "
                + "  where id = " + contato.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, contato.getId());
            insereSt.setString(2, contato.getNome());
            insereSt.setString(3, contato.getTel_1());
            insereSt.setString(4, contato.getTel_2());
            insereSt.setString(5, contato.getFax());
            insereSt.setString(6, contato.getCel_1());
            insereSt.setString(7, contato.getCel_2());
            insereSt.setString(8, contato.getOutro());
            insereSt.setString(9, contato.getEmail());
            insereSt.setString(10, contato.getObservacao());

            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar contato: " + e.getMessage());
        } finally {
            try {
                insereSt.close();
                cnx.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao encerrar conexão: " + e.getMessage() + "\n");
            }
        }
    }

    //Codigo fonte de Exclusão de dados no banco
    public static void excluir(ContatosModel contato) {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from GOSPAD_BD.contato where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, contato.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir contato: " + e.getMessage() + "\n");
        } finally {
            try {
                insereSt.close();
                cnx.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao encerrar conexão: " + e.getMessage() + "\n");
            }
        }
    }

}
