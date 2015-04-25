/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

import br.com.dao.fornecedorDao;
import java.text.ParseException;

/**
 *
 * @author rafae
 */
public class FornecedorModel {
    
    private int id = 0;
    private String nome = "";
    private String endereco = "";
    private String cep = "";
    private String cidade = "";
    private String uf = "";
    private String cnpj = "";
    private String registro_dt = null;
    private String cpf = "";
    private String nascimento_dt = null;
    private String tel_comercial = "";
    private String tel_residencial = "";
    private String celular = "";
    private String fax = "";
    private String email = "";
    private String observacao = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRegistro_dt() {
        return registro_dt;
    }

    public void setRegistro_dt(String registro_dt) {
        this.registro_dt = registro_dt;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento_dt() {
        return nascimento_dt;
    }

    public void setNascimento_dt(String nascimento_dt) {
        this.nascimento_dt = nascimento_dt;
    }

    public String getTel_comercial() {
        return tel_comercial;
    }

    public void setTel_comercial(String tel_comercial) {
        this.tel_comercial = tel_comercial;
    }

    public String getTel_residencial() {
        return tel_residencial;
    }

    public void setTel_residencial(String tel_residencial) {
        this.tel_residencial = tel_residencial;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    public void Salvar() throws ParseException {
        fornecedorDao.salvar(this);
    }
    
    public void Atualizar() throws ParseException {
        fornecedorDao.atualizar(this);
    }
    
    public void RecuperaObjeto(int iCodigo) {
        
        FornecedorModel cityTemp = fornecedorDao.RecuperaObjCodigo(iCodigo);
        
        this.setId(cityTemp.getId());
        this.setNome(cityTemp.getNome());
        this.setEndereco(cityTemp.getEndereco());
        this.setCep(cityTemp.getCep());
        this.setCidade(cityTemp.getCidade());
        this.setUf(cityTemp.getUf());
        this.setCnpj(cityTemp.getCnpj());
        this.setRegistro_dt(cityTemp.getRegistro_dt());
        this.setCpf(cityTemp.getCpf());
        this.setNascimento_dt(cityTemp.getNascimento_dt());
        this.setTel_comercial(cityTemp.getTel_comercial());
        this.setTel_residencial(cityTemp.getTel_residencial());
        this.setCelular(cityTemp.getCelular());
        this.setFax(cityTemp.getFax());
        this.setEmail(cityTemp.getEmail());
        this.setObservacao(cityTemp.getObservacao());
    }
    
    public void Excluir() {
        fornecedorDao.excluir(this);
    }

    
    
}
