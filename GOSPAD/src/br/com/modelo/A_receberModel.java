/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

import br.com.dao.a_receberDao;
import java.sql.Time;
import java.text.ParseException;

/**
 *
 * @author Rafael Paes Leme
 */
public class A_receberModel {
    
    private int id = 0;
    private String documento = "";
    private Double vl_total = 0.0;
    private ClienteModel FK_cliente = new ClienteModel();
    private String recebimento_dt = null;
    private String vencimento_dt = null;
    private String lancamento_dt = null;
    private Double vl_recebido = 0.0;
    private Double vl_areceber = 0.0;
    private String situacao = "";
    private String observacao = "";
    
    
    public void Salvar() throws ParseException {
        a_receberDao.salvar(this);
    }

    public void Atualizar() throws ParseException {
        a_receberDao.atualizar(this);
    }

    public void Excluir() {
        a_receberDao.excluir(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getVl_total() {
        return vl_total;
    }

    public void setVl_total(Double vl_total) {
        this.vl_total = vl_total;
    }

    public ClienteModel getFK_cliente() {
        return FK_cliente;
    }

    public void setFK_cliente(ClienteModel FK_cliente) {
        this.FK_cliente = FK_cliente;
    }

    public String getRecebimento_dt() {
        return recebimento_dt;
    }

    public void setRecebimento_dt(String recebimento_dt) {
        this.recebimento_dt = recebimento_dt;
    }

    public String getVencimento_dt() {
        return vencimento_dt;
    }

    public void setVencimento_dt(String vencimento_dt) {
        this.vencimento_dt = vencimento_dt;
    }

    public String getLancamento_dt() {
        return lancamento_dt;
    }

    public void setLancamento_dt(String lancamento_dt) {
        this.lancamento_dt = lancamento_dt;
    }

    public Double getVl_recebido() {
        return vl_recebido;
    }

    public void setVl_recebido(Double vl_recebido) {
        this.vl_recebido = vl_recebido;
    }

    public Double getVl_areceber() {
        return vl_areceber;
    }

    public void setVl_areceber(Double vl_areceber) {
        this.vl_areceber = vl_areceber;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}
