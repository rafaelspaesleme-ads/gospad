/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dao;

import br.com.conexao.conexao;
import br.com.modelo.ClienteModel;
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
public class clienteDao {

    //Codigo fonte de Cadastro, salvamento de dados no banco
    public static void salvar(ClienteModel cliente) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "insert into GOSPAD_BD.clientes values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            insereSt = cnx.prepareStatement(sql);

            insereSt.setInt(1, cliente.getId());
            insereSt.setString(2, cliente.getNome());
            insereSt.setString(3, cliente.getEndereco());
            insereSt.setString(4, cliente.getCep());
            insereSt.setString(5, cliente.getCidade());
            insereSt.setString(6, cliente.getUf());
            insereSt.setString(7, cliente.getCnpj());

//        java.util.Date dataSistema = new java.util.Date();
//        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//        JLDATA.setText(formato.format(dataSistema));
            
//        String dataString = request.getParameter("data");  
//        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");  
//        java.sql.Date data = new java.sql.Date(fmt.parse(dataString).getTime()); 
//        
//        java.util.Date dataUtil = new java.util.Date();
//        java.sql.Date dataSql = new java.sql.Date(dataUtil.getTime());
            
            String data_registro = cliente.getRegistro_dt();
            DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data1 = new java.sql.Date(fmt.parse(data_registro).getTime());
            
            insereSt.setDate(8, data1);
            insereSt.setString(9, cliente.getCpf());
            
            String data_nascimento = cliente.getNascimento_dt();
            DateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2 = new java.sql.Date(fmt2.parse(data_nascimento).getTime());
            
            insereSt.setDate(10, data2);
            insereSt.setString(11, cliente.getTel_comercial());
            insereSt.setString(12, cliente.getTel_residencial());
            insereSt.setString(13, cliente.getCelular());
            insereSt.setString(14, cliente.getFax());
            insereSt.setString(15, cliente.getEmail());
            insereSt.setString(16, cliente.getObservacao());

            insereSt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Informações Cadastradas com Sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar cliente: " + e.getMessage() + "\n");
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
    public static ClienteModel RecuperaObjCodigo(int cliente) {
        Connection cnx = conexao.GeraConexao();
        ClienteModel cid = new ClienteModel();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from GOSPAD_BD.clientes where id =" + String.valueOf(cliente));
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {
                cid = new ClienteModel();
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
    public static List<ClienteModel> RecuperaObjts(String cliente) {
        Connection cnx = conexao.GeraConexao();
        List<ClienteModel> cid = new ArrayList<>();
        try {
            Statement objStm = cnx.createStatement();
            objStm.executeQuery("Select * from GOSPAD_BD.clientes where nome like '%" + cliente + "%'");
            ResultSet objRsSt = objStm.getResultSet();
            while (objRsSt.next()) {

                ClienteModel c = new ClienteModel();

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
    public static void atualizar(ClienteModel cliente) throws ParseException {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sqlU = "update GOSPAD_BD.clientes set id = ?, "
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
                + "  where id = " + cliente.getId();

        try {
            insereSt = cnx.prepareStatement(sqlU);

            insereSt.setInt(1, cliente.getId());
            insereSt.setString(2, cliente.getNome());
            insereSt.setString(3, cliente.getEndereco());
            insereSt.setString(4, cliente.getCep());
            insereSt.setString(5, cliente.getCidade());
            insereSt.setString(6, cliente.getUf());
            insereSt.setString(7, cliente.getCnpj());
            
            String atualiza_registro = cliente.getRegistro_dt();
            DateFormat fmtA1 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data1At = new java.sql.Date(fmtA1.parse(atualiza_registro).getTime());
            
            insereSt.setDate(8, data1At);
            insereSt.setString(9, cliente.getCpf());
            
            String atualiza_nascimento = cliente.getNascimento_dt();
            DateFormat fmtA2 = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date data2At = new java.sql.Date(fmtA2.parse(atualiza_nascimento).getTime());
            
            insereSt.setDate(10, data2At);
            insereSt.setString(11, cliente.getTel_comercial());
            insereSt.setString(12, cliente.getTel_residencial());
            insereSt.setString(13, cliente.getCelular());
            insereSt.setString(14, cliente.getFax());
            insereSt.setString(15, cliente.getEmail());
            insereSt.setString(16, cliente.getObservacao());

            insereSt.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente: " + e.getMessage());
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
    public static void excluir(ClienteModel cliente) {
        Connection cnx = conexao.GeraConexao();
        PreparedStatement insereSt = null;
        String sql = "delete from GOSPAD_BD.clientes where id = ?";
        try {
            insereSt = cnx.prepareStatement(sql);
            insereSt.setInt(1, cliente.getId());
            insereSt.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente: " + e.getMessage() + "\n");
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
