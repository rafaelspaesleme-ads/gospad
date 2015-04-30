/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

import br.com.dao.vendas_e_servicosDao;
import java.sql.Time;
import java.text.ParseException;

/**
 *
 * @author Rafael Paes Leme
 */
public class Vendas_e_servicosModel {
    
    private int id = 0;
    private String tipo = "";
    private String nome = "";
    private String produto = "";
    private ProdutosModel FK_produto = new ProdutosModel();
    private String local = "";
    private String data = "";
    private Time hora = null;
    private String vendedor = "";
    private int FK_vendedor = 0;
    private String observacao = "";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public ProdutosModel getFK_produto() {
        return FK_produto;
    }

    public void setFK_produto(ProdutosModel FK_produto) {
        this.FK_produto = FK_produto;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getFK_vendedor() {
        return FK_vendedor;
    }

    public void setFK_vendedor(int FK_vendedor) {
        this.FK_vendedor = FK_vendedor;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    public void Salvar() throws ParseException {
        vendas_e_servicosDao.salvar(this);
    }

    public void Atualizar() throws ParseException {
        vendas_e_servicosDao.atualizar(this);
    }

    public void Excluir() {
        vendas_e_servicosDao.excluir(this);
    }

    
}
