/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.modelo.ContatosModel;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Rafael Paes Leme
 */
public class contatosControl {

    private final ContatosModel objVeS;

    public contatosControl() {
        this.objVeS = new ContatosModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException {

        this.objVeS.setNome(pLista.get(1));
        this.objVeS.setTel_1((pLista.get(2)));
        this.objVeS.setTel_2((pLista.get(3)));
        this.objVeS.setFax((pLista.get(4)));
        this.objVeS.setCel_1((pLista.get(5)));
        this.objVeS.setCel_2((pLista.get(6)));
        this.objVeS.setOutro((pLista.get(7)));
        this.objVeS.setEmail((pLista.get(8)));
        this.objVeS.setObservacao(pLista.get(9));

        this.objVeS.Salvar();

        return this.objVeS.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException {

        this.objVeS.setId(Integer.parseInt(pLista.get(0)));
        this.objVeS.setNome(pLista.get(1));
        this.objVeS.setTel_1((pLista.get(2)));
        this.objVeS.setTel_2((pLista.get(3)));
        this.objVeS.setFax((pLista.get(4)));
        this.objVeS.setCel_1((pLista.get(5)));
        this.objVeS.setCel_2((pLista.get(6)));
        this.objVeS.setOutro((pLista.get(7)));
        this.objVeS.setEmail((pLista.get(8)));
        this.objVeS.setObservacao(pLista.get(9));

        this.objVeS.Atualizar();
    }

    public void Excluir(int iChave) {
        this.objVeS.setId(iChave);
        this.objVeS.Excluir();

    }

}
