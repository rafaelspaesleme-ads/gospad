/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.conexao.conexao;
import br.com.modelo.FornecedorModel;
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
public class fornecedorDao {

    Connection connection;

    public ResultSet carregaCbx() throws Exception {
        connection = conexao.getInstance().getConnection();
        String sql = "SELECT * FROM fornecedor";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        return rs;

    }

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(FornecedorModel fornecedor) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into GOSPAD_BD.fornecedor values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, fornecedor.getId());
            insereSt.setString(2, fornecedor.getNome());
            insereSt.setString(3, fornecedor.getEndereco());
            insereSt.setString(4, fornecedor.getCep());
            insereSt.setString(5, fornecedor.getCidade());
            insereSt.setString(6, fornecedor.getUf());
            insereSt.setString(7, fornecedor.getCnpj());

//        java.util.Date dataSistema = new java.util.Date();
//        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//        JLDATA.setText(formato.format(dataSistema));
//        String dataString = request.getParameter("data");  
//        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");  
//        java.sql.Date data = new java.sql.Date(fmt.parse(dataString).getTime()); 
//        
//        java.util.Date dataUtil = new java.util.Date();
//        java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
            String data_registro = fornecedor.getRegistro_dt();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data1 = new java.sql.Date(fmt.parse(data_registro).getTime());

            insereSt.setDate(8, data1);
            insereSt.setString(9, fornecedor.getCpf());

            String data_nascimento = fornecedor.getNascimento_dt();
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(data_nascimento).getTime());

            insereSt.setDate(10, data2);
            insereSt.setString(11, fornecedor.getTel_comercial());
            insereSt.setString(12, fornecedor.getTel_residencial());
            insereSt.setString(13, fornecedor.getCelular());
            insereSt.setString(14, fornecedor.getFax());
            insereSt.setString(15, fornecedor.getEmail());
            insereSt.setString(16, fornecedor.getObservacao());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar fornecedor: " + e.getMessage() + "\n");
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
    public static FornecedorModel RecuperaObjCodigo(int fornecedor) {
        Connection cnx = conexao.GeraConexao();
        FornecedorModel cid = new FornecedorModel();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from GOSPAD_BD.fornecedor where id =" + String.valueOf(fornecedor));
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {
                cid = new FornecedorModel();
                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vNome = objRsSt.getString("nome");
                String vEndereco = objRsSt.getString("endereco");
                String vCEP = objRsSt.getString("cep");
                String vCidade = objRsSt.getString("cidade");
                String vUf = objRsSt.getString("uf");
                String vCnpj = objRsSt.getString("cnpj");
                Date vRegistro_dt = Date.valueOf(objRsSt.getString("registro_dt"));
                String vCpf = objRsSt.getString("cpf");
                Date vNascimento_dt = Date.valueOf(objRsSt.getString("nascimento_dt"));
                String vTel_comercial = objRsSt.getString("tel_comercial");
                String vTel_residencial = objRsSt.getString("tel_residencial");
                String vCelular = objRsSt.getString("celular");
                String vFax = objRsSt.getString("fax");
                String vEmail = objRsSt.getString("email");
                String vObservacao = objRsSt.getString("observacao");

                //
                //
                cid.setId(vID);
                cid.setNome(vNome);
                cid.setEndereco(vEndereco);
                cid.setCep(vCEP);
                cid.setCidade(vCidade);
                cid.setUf(vUf);
                cid.setCnpj(vCnpj);
                cid.setRegistro_dt(String.valueOf(vRegistro_dt));
                cid.setCpf(vCpf);
                cid.setNascimento_dt(String.valueOf(vNascimento_dt));
                cid.setTel_comercial(vTel_comercial);
                cid.setTel_residencial(vTel_residencial);
                cid.setCelular(vCelular);
                cid.setFax(vFax);
                cid.setEmail(vEmail);
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
    public static List<FornecedorModel> RecuperaObjts(String fornecedor) {
        Connection cnx = conexao.GeraConexao();
        List<FornecedorModel> cid = new ArrayList<>();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from GOSPAD_BD.fornecedor where nome like '%" + fornecedor + "%'");
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {

                FornecedorModel c = new FornecedorModel();

                int vID = Integer.parseInt(objRsSt.getString("id"));
                String vNome = objRsSt.getString("nome");
                String vEndereco = objRsSt.getString("endereco");
                String vCEP = objRsSt.getString("cep");
                String vCidade = objRsSt.getString("cidade");
                String vUf = objRsSt.getString("uf");
                String vCnpj = objRsSt.getString("cnpj");
                Date vRegistro_dt = Date.valueOf(objRsSt.getString("registro_dt"));
                String vCpf = objRsSt.getString("cpf");
                Date vNascimento_dt = Date.valueOf(objRsSt.getString("nascimento_dt"));
                String vTel_comercial = objRsSt.getString("tel_comercial");
                String vTel_residencial = objRsSt.getString("tel_residencial");
                String vCelular = objRsSt.getString("celular");
                String vFax = objRsSt.getString("fax");
                String vEmail = objRsSt.getString("email");
                String vObservacao = objRsSt.getString("observacao");

                c.setId(vID);
                c.setNome(vNome);
                c.setEndereco(vEndereco);
                c.setCep(vCEP);
                c.setCidade(vCidade);
                c.setUf(vUf);
                c.setCnpj(vCnpj);
                c.setRegistro_dt(String.valueOf(vRegistro_dt));
                c.setCpf(vCpf);
                c.setNascimento_dt(String.valueOf(vNascimento_dt));
                c.setTel_comercial(vTel_comercial);
                c.setTel_residencial(vTel_residencial);
                c.setCelular(vCelular);
                c.setFax(vFax);
                c.setEmail(vEmail);
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
    public static void atualizar(FornecedorModel fornecedor) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update GOSPAD_BD.fornecedor set id = ?, "
                + "  nome = ?, "
                + "  endereco = ?, "
                + "  cep = ?, "
                + "  cidade = ?, "
                + "  uf = ?, "
                + "  cnpj = ?, "
                + "  registro_dt = ?, "
                + "  cpf = ?, "
                + "  nascimento_dt = ?, "
                + "  tel_comercial = ?, "
                + "  tel_residencial = ?, "
                + "  celular = ?, "
                + "  fax = ?, "
                + "  email = ?, "
                + "  observacao = ? "
                + "  where id = " + fornecedor.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, fornecedor.getId());
            insereSt.setString(2, fornecedor.getNome());
            insereSt.setString(3, fornecedor.getEndereco());
            insereSt.setString(4, fornecedor.getCep());
            insereSt.setString(5, fornecedor.getCidade());
            insereSt.setString(6, fornecedor.getUf());
            insereSt.setString(7, fornecedor.getCnpj());

            String atualiza_registro = fornecedor.getRegistro_dt();
            DateFormat fmtA1 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data1At = new java.sql.Date(fmtA1.parse(atualiza_registro).getTime());

            insereSt.setDate(8, data1At);
            insereSt.setString(9, fornecedor.getCpf());

            String atualiza_nascimento = fornecedor.getNascimento_dt();
            DateFormat fmtA2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2At = new java.sql.Date(fmtA2.parse(atualiza_nascimento).getTime());

            insereSt.setDate(10, data2At);
            insereSt.setString(11, fornecedor.getTel_comercial());
            insereSt.setString(12, fornecedor.getTel_residencial());
            insereSt.setString(13, fornecedor.getCelular());
            insereSt.setString(14, fornecedor.getFax());
            insereSt.setString(15, fornecedor.getEmail());
            insereSt.setString(16, fornecedor.getObservacao());

            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Atualizadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar fornecedor: " + e.getMessage());
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
    public static void excluir(FornecedorModel fornecedor) {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from GOSPAD_BD.fornecedor where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, fornecedor.getId());
            insereSt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Informações Deletadas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir fornecedor: " + e.getMessage() + "\n");
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
