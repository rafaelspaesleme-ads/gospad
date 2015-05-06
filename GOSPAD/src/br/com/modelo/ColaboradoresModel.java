/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

import br.com.dao.colaboradoresDao;
import java.text.ParseException;

/**
 *
 * @author rafae
 */
public class ColaboradoresModel {
    
    private int id = 0;
    private String nome = "";
    private String sexo = "";
    private String cpf = "";
    private String rg = "";
    private String ctps = "";
    private String cnh = "";
    private String validade_cnh = "";
    private String tipo_cnh = "";
    private String tipo_sangue = "";
    private String telefone = "";
    private String celular = "";
    private String outro = "";
    private String email = "";
    private String endereco = "";
    private String cep = "";
    private String cidade = "";
    private String uf = "";
    private String setor = "";
    private String cargo = "";
    private String funcao = "";
    private String usuario_sistema = "";
    private String perfil = "";
    private String login = "";
    private String conf_login = "";
    private String senha = "";
    private String conf_senha = "";
    private String email_senha = "";
    private String observacao = "";

    
    public void Salvar() throws ParseException {
        colaboradoresDao.salvar(this);
    }
    
    public void Atualizar() throws ParseException {
        colaboradoresDao.atualizar(this);
    }
    
    public void Excluir() {
        colaboradoresDao.excluir(this);
    }

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getValidade_cnh() {
        return validade_cnh;
    }

    public void setValidade_cnh(String validade_cnh) {
        this.validade_cnh = validade_cnh;
    }

    public String getTipo_cnh() {
        return tipo_cnh;
    }

    public void setTipo_cnh(String tipo_cnh) {
        this.tipo_cnh = tipo_cnh;
    }

    public String getTipo_sangue() {
        return tipo_sangue;
    }

    public void setTipo_sangue(String tipo_sangue) {
        this.tipo_sangue = tipo_sangue;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getOutro() {
        return outro;
    }

    public void setOutro(String outro) {
        this.outro = outro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getUsuario_sistema() {
        return usuario_sistema;
    }

    public void setUsuario_sistema(String usuario_sistema) {
        this.usuario_sistema = usuario_sistema;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getConf_login() {
        return conf_login;
    }

    public void setConf_login(String conf_login) {
        this.conf_login = conf_login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConf_senha() {
        return conf_senha;
    }

    public void setConf_senha(String conf_senha) {
        this.conf_senha = conf_senha;
    }

    public String getEmail_senha() {
        return email_senha;
    }

    public void setEmail_senha(String email_senha) {
        this.email_senha = email_senha;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    
    
}
