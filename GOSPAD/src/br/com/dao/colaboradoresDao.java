/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.conexao.conexao;
import br.com.modelo.ColaboradoresModel;
import java.sql.Connection;
import java.sql.Date;
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
 * @author rafael
 */
public class colaboradoresDao {

    Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = conexao.getInstance().getConnection();
        String sql = "SELECT * FROM colaboradores";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(ColaboradoresModel colaboradores) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into GOSPAD_BD.colaboradores values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, colaboradores.getId());
            insereSt.setString(2, colaboradores.getNome());
            insereSt.setString(3, colaboradores.getSexo());
            insereSt.setString(4, colaboradores.getCpf());
            insereSt.setString(5, colaboradores.getRg());
            insereSt.setString(6, colaboradores.getCtps());
            insereSt.setString(7, colaboradores.getCnh());

            String val_cnh = colaboradores.getValidade_cnh();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data1 = new java.sql.Date(fmt.parse(val_cnh).getTime());

            insereSt.setDate(8, data1);

            insereSt.setString(9, colaboradores.getTipo_cnh());
            insereSt.setString(10, colaboradores.getTipo_sangue());
            insereSt.setString(11, colaboradores.getTelefone());
            insereSt.setString(12, colaboradores.getCelular());
            insereSt.setString(13, colaboradores.getOutro());
            insereSt.setString(14, colaboradores.getEmail());
            insereSt.setString(15, colaboradores.getEndereco());
            insereSt.setString(16, colaboradores.getCep());
            insereSt.setString(17, colaboradores.getCidade());
            insereSt.setString(18, colaboradores.getUf());
            insereSt.setString(19, colaboradores.getSetor());
            insereSt.setString(20, colaboradores.getCargo());
            insereSt.setString(21, colaboradores.getFuncao());
            insereSt.setString(22, colaboradores.getUsuario_sistema());
            insereSt.setString(23, colaboradores.getPerfil());
            insereSt.setString(24, colaboradores.getLogin());
            insereSt.setString(25, colaboradores.getConf_login());
            insereSt.setString(26, colaboradores.getSenha());
            insereSt.setString(27, colaboradores.getConf_senha());
            insereSt.setString(28, colaboradores.getEmail_senha());
            insereSt.setString(29, colaboradores.getObservacao());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar colaboradores: " + e.getMessage() + "\n");
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
    public static void atualizar(ColaboradoresModel colaboradores) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update GOSPAD_BD.colaboradores set id = ?, "
                + "  nome = ?, "
                + "  sexo = ?, "
                + "  cpf = ?, "
                + "  rg = ?, "
                + "  ctps = ?, "
                + "  cnh = ?, "
                + "  validade_cnh = ?, "
                + "  tipo_cnh = ?, "
                + "  tipo_sangue = ?, "
                + "  telefone = ?, "
                + "  celular = ?, "
                + "  outro = ?, "
                + "  email = ?, "
                + "  endereco = ?, "
                + "  cep = ?, "
                + "  cidade = ?, "
                + "  uf = ?, "
                + "  setor = ?, "
                + "  cargo = ?, "
                + "  funcao = ?, "
                + "  usuario_sistema = ?, "
                + "  perfil = ?, "
                + "  login = ?, "
                + "  conf_login = ?, "
                + "  senha = ?, "
                + "  conf_senha = ?, "
                + "  email_senha = ?, "
                + "  observacao = ? "
                + "  where id = " + colaboradores.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, colaboradores.getId());
            insereSt.setString(2, colaboradores.getNome());
            insereSt.setString(3, colaboradores.getSexo());
            insereSt.setString(4, colaboradores.getCpf());
            insereSt.setString(5, colaboradores.getRg());
            insereSt.setString(6, colaboradores.getCtps());
            insereSt.setString(7, colaboradores.getCnh());

            String val_cnh = colaboradores.getValidade_cnh();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data1 = new java.sql.Date(fmt.parse(val_cnh).getTime());

            insereSt.setDate(8, data1);

            insereSt.setString(9, colaboradores.getTipo_cnh());
            insereSt.setString(10, colaboradores.getTipo_sangue());
            insereSt.setString(11, colaboradores.getTelefone());
            insereSt.setString(12, colaboradores.getCelular());
            insereSt.setString(13, colaboradores.getOutro());
            insereSt.setString(14, colaboradores.getEmail());
            insereSt.setString(15, colaboradores.getEndereco());
            insereSt.setString(16, colaboradores.getCep());
            insereSt.setString(17, colaboradores.getCidade());
            insereSt.setString(18, colaboradores.getUf());
            insereSt.setString(19, colaboradores.getSetor());
            insereSt.setString(20, colaboradores.getCargo());
            insereSt.setString(21, colaboradores.getFuncao());
            insereSt.setString(22, colaboradores.getUsuario_sistema());
            insereSt.setString(23, colaboradores.getPerfil());
            insereSt.setString(24, colaboradores.getLogin());
            insereSt.setString(25, colaboradores.getConf_login());
            insereSt.setString(26, colaboradores.getSenha());
            insereSt.setString(27, colaboradores.getConf_senha());
            insereSt.setString(28, colaboradores.getEmail_senha());
            insereSt.setString(29, colaboradores.getObservacao());

            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar colaboradores: " + e.getMessage());
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
    public static void excluir(ColaboradoresModel colaboradores) {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from GOSPAD_BD.colaboradores where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, colaboradores.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir colaboradores: " + e.getMessage() + "\n");
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
