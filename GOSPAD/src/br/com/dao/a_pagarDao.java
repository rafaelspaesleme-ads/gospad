/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.conexao.conexao;
import br.com.modelo.FornecedorModel;
import br.com.modelo.A_pagarModel;
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
public class a_pagarDao {

    Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = conexao.getInstance().getConnection();
        String sql = "SELECT * FROM a_pagar";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(A_pagarModel a_pagar) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into GOSPAD_BD.a_pagar values(?,?,?,?,?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, a_pagar.getId());
            insereSt.setString(2, a_pagar.getDocumento());
            insereSt.setDouble(3, a_pagar.getVl_total());
            insereSt.setInt(4, a_pagar.getFK_fornecedor().getId());
            
            String data_pgto = String.valueOf(a_pagar.getPgto_dt());
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data1 = new java.sql.Date(fmt.parse(data_pgto).getTime());
            insereSt.setDate(5, data1);
            
            String venc_dt = String.valueOf(a_pagar.getVencimento_dt());
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(venc_dt).getTime());
            insereSt.setDate(6, data2);
            
            String lanc_dt = String.valueOf(a_pagar.getLancamento_dt());
            DateFormat fmt3 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data3 = new java.sql.Date(fmt3.parse(lanc_dt).getTime());
            insereSt.setDate(7, data3);
            
            insereSt.setDouble(8, a_pagar.getVl_pago());
            insereSt.setDouble(9, a_pagar.getVl_apagar());
            insereSt.setString(10, a_pagar.getSituacao());
            insereSt.setString(11, a_pagar.getObservacao());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar a_pagar: " + e.getMessage() + "\n");
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
    public static void atualizar(A_pagarModel a_pagar) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update GOSPAD_BD.a_pagar set id = ?, "
                + "  documento = ?, "
                + "  vl_total = ?, "
                + "  id_fornecedor = ?, "
                + "  pgto_dt = ?, "
                + "  vencimento_dt = ?, "
                + "  lancamento_dt = ?, "
                + "  vl_pago = ?, "
                + "  vl_apagar = ?, "
                + "  situacao = ?, "
                + "  observacao = ? "
                + "  where id = " + a_pagar.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, a_pagar.getId());
            insereSt.setString(2, a_pagar.getDocumento());
            insereSt.setDouble(3, a_pagar.getVl_total());
            insereSt.setInt(4, a_pagar.getFK_fornecedor().getId());
            
            String data_pgto = String.valueOf(a_pagar.getPgto_dt());
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data1 = new java.sql.Date(fmt.parse(data_pgto).getTime());
            insereSt.setDate(5, data1);
            
            String venc_dt = String.valueOf(a_pagar.getVencimento_dt());
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(venc_dt).getTime());
            insereSt.setDate(6, data2);
            
            String lanc_dt = String.valueOf(a_pagar.getLancamento_dt());
            DateFormat fmt3 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data3 = new java.sql.Date(fmt3.parse(lanc_dt).getTime());
            insereSt.setDate(7, data3);
            
            insereSt.setDouble(8, a_pagar.getVl_pago());
            insereSt.setDouble(9, a_pagar.getVl_apagar());
            insereSt.setString(10, a_pagar.getSituacao());
            insereSt.setString(11, a_pagar.getObservacao());

            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a_pagar: " + e.getMessage());
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
    public static void excluir(A_pagarModel a_pagar) {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from GOSPAD_BD.a_pagar where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, a_pagar.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a_pagar: " + e.getMessage() + "\n");
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
