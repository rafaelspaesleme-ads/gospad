/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.modelo.ClienteModel;
import java.sql.Date;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class clienteControl {

    private final ClienteModel objCliente;

    public clienteControl() {
        this.objCliente = new ClienteModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException {
        
        this.objCliente.setNome(pLista.get(1));
        this.objCliente.setEndereco(pLista.get(2));
        this.objCliente.setCep(pLista.get(3));
        this.objCliente.setCidade(pLista.get(4));
        this.objCliente.setUf(pLista.get(5));
        this.objCliente.setCnpj(pLista.get(6));
        this.objCliente.setRegistro_dt((pLista.get(7)));
        this.objCliente.setCpf(pLista.get(8));
        this.objCliente.setNascimento_dt((pLista.get(9)));
        this.objCliente.setTel_comercial(pLista.get(10));
        this.objCliente.setTel_residencial(pLista.get(11));
        this.objCliente.setCelular(pLista.get(12));
        this.objCliente.setFax(pLista.get(13));
        this.objCliente.setEmail(pLista.get(14));
        this.objCliente.setObservacao(pLista.get(15));

        this.objCliente.Salvar();

        return this.objCliente.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException {
        this.objCliente.setId(Integer.parseInt(pLista.get(0)));
        this.objCliente.setNome(pLista.get(1));
        this.objCliente.setEndereco(pLista.get(2));
        this.objCliente.setCep(pLista.get(3));
        this.objCliente.setCidade(pLista.get(4));
        this.objCliente.setUf(pLista.get(5));
        this.objCliente.setCnpj(pLista.get(6));
        this.objCliente.setRegistro_dt((pLista.get(7)));
        this.objCliente.setCpf(pLista.get(8));
        this.objCliente.setNascimento_dt((pLista.get(9)));
        this.objCliente.setTel_comercial(pLista.get(10));
        this.objCliente.setTel_residencial(pLista.get(11));
        this.objCliente.setCelular(pLista.get(12));
        this.objCliente.setFax(pLista.get(13));
        this.objCliente.setEmail(pLista.get(14));
        this.objCliente.setObservacao(pLista.get(15));

        this.objCliente.Atualizar();
    }

    private ArrayList<String> converterObjetoParaArray() {
        ArrayList<String> vetCampos = new ArrayList<String>();
        vetCampos.add(String.valueOf(this.objCliente.getId()));
        vetCampos.add(this.objCliente.getNome());
        vetCampos.add(this.objCliente.getEndereco());
        vetCampos.add(this.objCliente.getCep());
        vetCampos.add(this.objCliente.getCidade());
        vetCampos.add(this.objCliente.getUf());
        vetCampos.add(this.objCliente.getCnpj());
        vetCampos.add(String.valueOf(this.objCliente.getRegistro_dt()));
        vetCampos.add(this.objCliente.getCpf());
        vetCampos.add(String.valueOf(this.objCliente.getNascimento_dt()));
        vetCampos.add(this.objCliente.getTel_comercial());
        vetCampos.add(this.objCliente.getTel_residencial());
        vetCampos.add(this.objCliente.getCelular());
        vetCampos.add(this.objCliente.getFax());
        vetCampos.add(this.objCliente.getEmail());
        vetCampos.add(this.objCliente.getObservacao());

        return vetCampos;
    }

    public ArrayList<String> RecuperaObjeto(int iCodigo) {
        this.objCliente.RecuperaObjeto(iCodigo);
        return converterObjetoParaArray();
    }
    
    public void Excluir(int iChave) {
        this.objCliente.setId(iChave);
        this.objCliente.Excluir();

    }

}
