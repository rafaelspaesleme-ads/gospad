/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

import br.com.dao.produtosDao;
import java.text.ParseException;

/**
 *
 * @author Rafael Paes Leme
 */
public class ProdutosModel {

    private int id = 0;
    private String nome = "";
    private Double compra = 0.0;
    private Double venda = 0.0;
    private Double quantidade = 0.0;
    private String tipo = "";
    private String fornecedor = "";
    private FornecedorModel FK_fornecedor = new FornecedorModel();
    private String comprador = "";
    private int FK_comprador = 0;
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

    public Double getCompra() {
        return compra;
    }

    public void setCompra(Double compra) {
        this.compra = compra;
    }

    public Double getVenda() {
        return venda;
    }

    public void setVenda(Double venda) {
        this.venda = venda;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public FornecedorModel getFK_fornecedor() {
        return FK_fornecedor;
    }

    public void setFK_fornecedor(FornecedorModel FK_fornecedor) {
        this.FK_fornecedor = FK_fornecedor;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public int getFK_comprador() {
        return FK_comprador;
    }

    public void setFK_comprador(int FK_comprador) {
        this.FK_comprador = FK_comprador;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void Salvar() throws ParseException {
        produtosDao.salvar(this);
    }

    public void Atualizar() throws ParseException {
        produtosDao.atualizar(this);
    }

    public void RecuperaObjeto(int iCodigo) {

        ProdutosModel cityTemp = produtosDao.RecuperaObjCodigo(iCodigo);

        this.setId(cityTemp.getId());
        this.setNome(cityTemp.getNome());
        this.setCompra(cityTemp.getCompra());
        this.setVenda(cityTemp.getVenda());
        this.setQuantidade(cityTemp.getQuantidade());
        this.setTipo(cityTemp.getTipo());
        this.setFornecedor(cityTemp.getFornecedor());
        this.setFK_fornecedor(cityTemp.getFK_fornecedor());
        this.setComprador(cityTemp.getComprador());
        this.setFK_comprador(cityTemp.getFK_comprador());
        this.setObservacao(cityTemp.getObservacao());
    }

    public void Excluir() {
        produtosDao.excluir(this);
    }


}
