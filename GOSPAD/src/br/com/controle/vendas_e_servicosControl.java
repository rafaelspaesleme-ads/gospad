/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.modelo.Vendas_e_servicosModel;
import java.sql.Time;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Rafael Paes Leme
 */
public class vendas_e_servicosControl {

    private final Vendas_e_servicosModel objVeS;

    public vendas_e_servicosControl() {
        this.objVeS = new Vendas_e_servicosModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException {

        this.objVeS.setTipo(pLista.get(1));
        this.objVeS.setNome(pLista.get(2));
        this.objVeS.setProduto(pLista.get(3));
        this.objVeS.getFK_produto().setId(Integer.parseInt(pLista.get(4)));
        this.objVeS.setLocal(pLista.get(5));
        this.objVeS.setData(pLista.get(6));
        this.objVeS.setHora(Time.valueOf(pLista.get(7)));
        this.objVeS.setVendedor(pLista.get(8));
        this.objVeS.setFK_vendedor(Integer.parseInt(pLista.get(9)));
        this.objVeS.setObservacao(pLista.get(10));

        this.objVeS.Salvar();

        return this.objVeS.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException {
        
        this.objVeS.setId(Integer.parseInt(pLista.get(0)));
        this.objVeS.setTipo(pLista.get(1));
        this.objVeS.setNome(pLista.get(2));
        this.objVeS.setProduto(pLista.get(3));
        this.objVeS.getFK_produto().setId(Integer.parseInt(pLista.get(4)));
        this.objVeS.setLocal(pLista.get(5));
        this.objVeS.setData(pLista.get(6));
        this.objVeS.setHora(Time.valueOf(pLista.get(7)));
        this.objVeS.setVendedor(pLista.get(8));
        this.objVeS.setFK_vendedor(Integer.parseInt(pLista.get(9)));
        this.objVeS.setObservacao(pLista.get(10));

        this.objVeS.Atualizar();
    }

    public void Excluir(int iChave) {
        this.objVeS.setId(iChave);
        this.objVeS.Excluir();

    }

}
