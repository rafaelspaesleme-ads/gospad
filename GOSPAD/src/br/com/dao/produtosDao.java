/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.conexao.conexao;
import br.com.modelo.ProdutosModel;
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
 * @author Rafael Paes Leme
 */
public class produtosDao {
    
    
    Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = conexao.getInstance().getConnection();
        String sql = "SELECT * FROM produtos";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(ProdutosModel produtos) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into GOSPAD_BD.produtos values(?,?,?,?,?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, produtos.getId());
            insereSt.setString(2, produtos.getNome());
            insereSt.setDouble(3, produtos.getCompra());
            insereSt.setDouble(4, produtos.getVenda());
            insereSt.setDouble(5, produtos.getQuantidade());
            insereSt.setString(6, produtos.getTipo());
            insereSt.setString(7, produtos.getFornecedor());
            insereSt.setInt(8, produtos.getFK_fornecedor());
            insereSt.setString(9, produtos.getComprador());
            insereSt.setInt(10, produtos.getFK_comprador());
            insereSt.setString(11, produtos.getObservacao());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar produtos: " + e.getMessage() + "\n");
        } finally {
            try {
                insereSt.close();
                cnx.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao encerrar conexão: " + e.getMessage() + "\n");
            }
        }

    }

    //Codigo fonte da listagem, criação de lista buscando dados do banco através do ID
    //
    public static ProdutosModel RecuperaObjCodigo(int produtos) {
        Connection cnx = conexao.GeraConexao();
        ProdutosModel cid = new ProdutosModel();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from GOSPAD_BD.produtos where id =" + String.valueOf(produtos));
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {
                cid = new ProdutosModel();
                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vNome = objRsSt.getString("nome");
                Double vCompra = Double.parseDouble(objRsSt.getString("compra"));
                Double vVenda = Double.parseDouble(objRsSt.getString("venda"));
                Double vQuantidade = Double.parseDouble(objRsSt.getString("quantidade"));
                String vTipo = objRsSt.getString("tipo");
                String vFornecedor = objRsSt.getString("fornecedor");
                int vFK_fornecedor = Integer.parseInt(objRsSt.getString("id_fornecedor"));
                String vComprador = objRsSt.getString("comprador");
                int vFK_comprador = Integer.parseInt(objRsSt.getString("id_comprador"));
                String vObservacao = objRsSt.getString("observacao");

                //
                //
                cid.setId(vID);
                cid.setNome(vNome);
                cid.setCompra(vCompra);
                cid.setVenda(vVenda);
                cid.setQuantidade(vQuantidade);
                cid.setTipo(vTipo);
                cid.setFornecedor(vFornecedor);
                cid.setFK_fornecedor(vFK_fornecedor);
                cid.setComprador(vComprador);
                cid.setFK_comprador(vFK_comprador);
                cid.setObservacao(vObservacao);

            }

            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);

        }

        return cid;
    }

    //Codigo fonte da listagem, criação de lista buscando dados do banco através do Nome
    public static List<ProdutosModel> RecuperaObjts(String produtos) {
        Connection cnx = conexao.GeraConexao();
        List<ProdutosModel> cid = new ArrayList<>();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from GOSPAD_BD.produtos where nome like '%" + produtos + "%'");
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {

                ProdutosModel c = new ProdutosModel();
                
                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vNome = objRsSt.getString("nome");
                Double vCompra = Double.parseDouble(objRsSt.getString("compra"));
                Double vVenda = Double.parseDouble(objRsSt.getString("venda"));
                Double vQuantidade = Double.parseDouble(objRsSt.getString("quantidade"));
                String vTipo = objRsSt.getString("tipo");
                String vFornecedor = objRsSt.getString("fornecedor");
                int vFK_fornecedor = Integer.parseInt(objRsSt.getString("id_fornecedor"));
                String vComprador = objRsSt.getString("comprador");
                int vFK_comprador = Integer.parseInt(objRsSt.getString("id_comprador"));
                String vObservacao = objRsSt.getString("observacao");

                //
                //
                c.setId(vID);
                c.setNome(vNome);
                c.setCompra(vCompra);
                c.setVenda(vVenda);
                c.setQuantidade(vQuantidade);
                c.setTipo(vTipo);
                c.setFornecedor(vFornecedor);
                c.setFK_fornecedor(vFK_fornecedor);
                c.setComprador(vComprador);
                c.setFK_comprador(vFK_comprador);
                c.setObservacao(vObservacao);

                cid.add(c);
            }
            objRsSt.close();
            objStm.close();
            cnx.close();
        } catch (NumberFormatException | SQLException erro) {
            String erroMsg = "Erro ao recuperar objetos: " + erro.getMessage();
            JOptionPane.showMessageDialog(null, erroMsg, "Mensagem", JOptionPane.ERROR_MESSAGE);
        }

        return cid;
    }

    //Codigo fonte de Atualização de dados no banco
    public static void atualizar(ProdutosModel produtos) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update GOSPAD_BD.produtos set id = ?, "
                + "  nome = ?, "
                + "  compra = ?, "
                + "  venda = ?, "
                + "  quantidade = ?, "
                + "  tipo = ?, "
                + "  fornecedor = ?, "
                + "  id_fornecedor = ?, "
                + "  comprador = ?, "
                + "  id_comprador = ?, "
                + "  observacao = ? "
                + "  where id = " + produtos.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, produtos.getId());
            insereSt.setString(2, produtos.getNome());
            insereSt.setDouble(3, produtos.getCompra());
            insereSt.setDouble(4, produtos.getVenda());
            insereSt.setDouble(5, produtos.getQuantidade());
            insereSt.setString(6, produtos.getTipo());
            insereSt.setString(7, produtos.getFornecedor());
            insereSt.setInt(8, produtos.getFK_fornecedor());
            insereSt.setString(9, produtos.getComprador());
            insereSt.setInt(10, produtos.getFK_comprador());
            insereSt.setString(11, produtos.getObservacao());

            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar produtos: " + e.getMessage());
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
    public static void excluir(ProdutosModel produtos) {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from GOSPAD_BD.produtos where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, produtos.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir produtos: " + e.getMessage() + "\n");
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
