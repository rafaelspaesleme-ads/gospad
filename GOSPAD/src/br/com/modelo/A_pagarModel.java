/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.modelo;

import br.com.dao.a_pagarDao;
import java.sql.Time;
import java.text.ParseException;

/**
 *
 * @author Rafael Paes Leme
 */
public class A_pagarModel {
    
    private int id = 0;
    private String documento = "";
    private Double vl_total = 0.0;
    private FornecedorModel FK_fornecedor = new FornecedorModel();
    private String pgto_dt = null;
    private String vencimento_dt = null;
    private String lancamento_dt = null;
    private Double vl_pago = 0.0;
    private Double vl_apagar = 0.0;
    private String situacao = "";
    private String observacao = "";
    
    
    
    public void Salvar() throws ParseException {
        a_pagarDao.salvar(this);
    }

    public void Atualizar() throws ParseException {
        a_pagarDao.atualizar(this);
    }

    public void Excluir() {
        a_pagarDao.excluir(this);
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

    public FornecedorModel getFK_fornecedor() {
        return FK_fornecedor;
    }

    public void setFK_fornecedor(FornecedorModel FK_fornecedor) {
        this.FK_fornecedor = FK_fornecedor;
    }

    public String getPgto_dt() {
        return pgto_dt;
    }

    public void setPgto_dt(String pgto_dt) {
        this.pgto_dt = pgto_dt;
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

    public Double getVl_pago() {
        return vl_pago;
    }

    public void setVl_pago(Double vl_pago) {
        this.vl_pago = vl_pago;
    }

    public Double getVl_apagar() {
        return vl_apagar;
    }

    public void setVl_apagar(Double vl_apagar) {
        this.vl_apagar = vl_apagar;
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
