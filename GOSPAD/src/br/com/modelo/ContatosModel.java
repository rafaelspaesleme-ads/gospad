/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

import br.com.dao.contatosDao;
import java.sql.Time;
import java.text.ParseException;

/**
 *
 * @author Rafael Paes Leme
 */
public class ContatosModel {
    
    private int id = 0;
    private String nome = "";
    private String tel_1 = "";
    private String tel_2 = "";
    private String fax = "";
    private String cel_1 = "";
    private String cel_2 = "";
    private String outro = "";
    private String email = "";
    private String observacao = "";
    
    
    
    public void Salvar() throws ParseException {
        contatosDao.salvar(this);
    }

    public void Atualizar() throws ParseException {
        contatosDao.atualizar(this);
    }

    public void Excluir() {
        contatosDao.excluir(this);
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

    public String getTel_1() {
        return tel_1;
    }

    public void setTel_1(String tel_1) {
        this.tel_1 = tel_1;
    }

    public String getTel_2() {
        return tel_2;
    }

    public void setTel_2(String tel_2) {
        this.tel_2 = tel_2;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCel_1() {
        return cel_1;
    }

    public void setCel_1(String cel_1) {
        this.cel_1 = cel_1;
    }

    public String getCel_2() {
        return cel_2;
    }

    public void setCel_2(String cel_2) {
        this.cel_2 = cel_2;
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

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


    
}
