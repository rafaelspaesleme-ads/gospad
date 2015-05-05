/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.modelo.A_receberModel;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Rafael Paes Leme
 */
public class a_receberControl {

    private final A_receberModel objVeS;

    public a_receberControl() {
        this.objVeS = new A_receberModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException {

        this.objVeS.setDocumento(pLista.get(1));
        this.objVeS.setVl_total(Double.parseDouble(pLista.get(2)));
        this.objVeS.getFK_cliente().setId(Integer.parseInt(pLista.get(3)));
        this.objVeS.setRecebimento_dt((pLista.get(4)));
        this.objVeS.setVencimento_dt((pLista.get(5)));
        this.objVeS.setLancamento_dt((pLista.get(6)));
        this.objVeS.setVl_recebido(Double.parseDouble(pLista.get(7)));
        this.objVeS.setVl_areceber(Double.parseDouble(pLista.get(8)));
        this.objVeS.setSituacao(pLista.get(9));
        this.objVeS.setObservacao(pLista.get(10));

        this.objVeS.Salvar();

        return this.objVeS.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException {
        
        this.objVeS.setId(Integer.parseInt(pLista.get(0)));
        this.objVeS.setDocumento(pLista.get(1));
        this.objVeS.setVl_total(Double.parseDouble(pLista.get(2)));
        this.objVeS.getFK_cliente().setId(Integer.parseInt(pLista.get(3)));
        this.objVeS.setRecebimento_dt((pLista.get(4)));
        this.objVeS.setVencimento_dt((pLista.get(5)));
        this.objVeS.setLancamento_dt((pLista.get(6)));
        this.objVeS.setVl_recebido(Double.parseDouble(pLista.get(7)));
        this.objVeS.setVl_areceber(Double.parseDouble(pLista.get(8)));
        this.objVeS.setSituacao(pLista.get(9));
        this.objVeS.setObservacao(pLista.get(10));

        this.objVeS.Atualizar();
    }

    public void Excluir(int iChave) {
        this.objVeS.setId(iChave);
        this.objVeS.Excluir();

    }

}
