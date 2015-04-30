/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.conexao.conexao;
import br.com.modelo.FornecedorModel;
import br.com.modelo.Vendas_e_servicosModel;
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
public class vendas_e_servicosDao {

    Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = conexao.getInstance().getConnection();
        String sql = "SELECT * FROM vendas_e_servicos";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(Vendas_e_servicosModel vendas_e_servicos) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into GOSPAD_BD.vendas_e_servicos values(?,?,?,?,?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, vendas_e_servicos.getId());
            insereSt.setString(2, vendas_e_servicos.getTipo());
            insereSt.setString(3, vendas_e_servicos.getNome());
            insereSt.setString(4, vendas_e_servicos.getProduto());
            insereSt.setInt(5, vendas_e_servicos.getFK_produto().getId());
            insereSt.setString(6, vendas_e_servicos.getLocal());
            
            String data_registro = vendas_e_servicos.getData();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data1 = new java.sql.Date(fmt.parse(data_registro).getTime());
            insereSt.setDate(7, data1);
            
            insereSt.setTime(8, vendas_e_servicos.getHora());
            insereSt.setString(9, vendas_e_servicos.getVendedor());
            insereSt.setInt(10, vendas_e_servicos.getFK_vendedor());
            insereSt.setString(11, vendas_e_servicos.getObservacao());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar vendas_e_servicos: " + e.getMessage() + "\n");
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
    public static void atualizar(Vendas_e_servicosModel vendas_e_servicos) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update GOSPAD_BD.vendas_e_servicos set id = ?, "
                + "  tipo = ?, "
                + "  nome = ?, "
                + "  produto = ?, "
                + "  id_produto = ?, "
                + "  local = ?, "
                + "  data = ?, "
                + "  hora = ?, "
                + "  vendedor = ?, "
                + "  id_vendedor = ?, "
                + "  observacao = ? "
                + "  where id = " + vendas_e_servicos.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, vendas_e_servicos.getId());
            insereSt.setString(2, vendas_e_servicos.getTipo());
            insereSt.setString(3, vendas_e_servicos.getNome());
            insereSt.setString(4, vendas_e_servicos.getProduto());
            insereSt.setInt(5, vendas_e_servicos.getFK_produto().getId());
            insereSt.setString(6, vendas_e_servicos.getLocal());
            
            String data_registro = vendas_e_servicos.getData();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data1 = new java.sql.Date(fmt.parse(data_registro).getTime());
            insereSt.setDate(7, data1);
            
            insereSt.setTime(8, vendas_e_servicos.getHora());
            insereSt.setString(9, vendas_e_servicos.getVendedor());
            insereSt.setInt(10, vendas_e_servicos.getFK_vendedor());
            insereSt.setString(11, vendas_e_servicos.getObservacao());

            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar vendas_e_servicos: " + e.getMessage());
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
    public static void excluir(Vendas_e_servicosModel vendas_e_servicos) {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from GOSPAD_BD.vendas_e_servicos where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, vendas_e_servicos.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir vendas_e_servicos: " + e.getMessage() + "\n");
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
