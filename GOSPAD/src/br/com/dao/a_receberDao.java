/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.conexao.conexao;
import br.com.modelo.FornecedorModel;
import br.com.modelo.A_receberModel;
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
public class a_receberDao {

    Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = conexao.getInstance().getConnection();
        String sql = "SELECT * FROM a_receber";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(A_receberModel a_receber) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into GOSPAD_BD.a_receber values(?,?,?,?,?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, a_receber.getId());
            insereSt.setString(2, a_receber.getDocumento());
            insereSt.setDouble(3, a_receber.getVl_total());
            insereSt.setInt(4, a_receber.getFK_cliente().getId());
            
            String data_pgto = String.valueOf(a_receber.getRecebimento_dt());
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data1 = new java.sql.Date(fmt.parse(data_pgto).getTime());
            insereSt.setDate(5, data1);
            
            String venc_dt = String.valueOf(a_receber.getVencimento_dt());
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(venc_dt).getTime());
            insereSt.setDate(6, data2);
            
            String lanc_dt = String.valueOf(a_receber.getLancamento_dt());
            DateFormat fmt3 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data3 = new java.sql.Date(fmt3.parse(lanc_dt).getTime());
            insereSt.setDate(7, data3);
            
            insereSt.setDouble(8, a_receber.getVl_recebido());
            insereSt.setDouble(9, a_receber.getVl_areceber());
            insereSt.setString(10, a_receber.getSituacao());
            insereSt.setString(11, a_receber.getObservacao());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar a_receber: " + e.getMessage() + "\n");
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
    public static void atualizar(A_receberModel a_receber) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update GOSPAD_BD.a_receber set id = ?, "
                + "  documento = ?, "
                + "  vl_total = ?, "
                + "  id_cliente = ?, "
                + "  recebimento_dt = ?, "
                + "  vencimento_dt = ?, "
                + "  lancamento_dt = ?, "
                + "  vl_recebido = ?, "
                + "  vl_areceber = ?, "
                + "  situacao = ?, "
                + "  observacao = ? "
                + "  where id = " + a_receber.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, a_receber.getId());
            insereSt.setString(2, a_receber.getDocumento());
            insereSt.setDouble(3, a_receber.getVl_total());
            insereSt.setInt(4, a_receber.getFK_cliente().getId());
            
            String data_pgto = String.valueOf(a_receber.getRecebimento_dt());
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data1 = new java.sql.Date(fmt.parse(data_pgto).getTime());
            insereSt.setDate(5, data1);
            
            String venc_dt = String.valueOf(a_receber.getVencimento_dt());
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(venc_dt).getTime());
            insereSt.setDate(6, data2);
            
            String lanc_dt = String.valueOf(a_receber.getLancamento_dt());
            DateFormat fmt3 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data3 = new java.sql.Date(fmt3.parse(lanc_dt).getTime());
            insereSt.setDate(7, data3);
            
            insereSt.setDouble(8, a_receber.getVl_recebido());
            insereSt.setDouble(9, a_receber.getVl_areceber());
            insereSt.setString(10, a_receber.getSituacao());
            insereSt.setString(11, a_receber.getObservacao());

            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar a_receber: " + e.getMessage());
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
    public static void excluir(A_receberModel a_receber) {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from GOSPAD_BD.a_receber where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, a_receber.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir a_receber: " + e.getMessage() + "\n");
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
