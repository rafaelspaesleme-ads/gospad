/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.modelo.FornecedorModel;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class fornecedorControl {

    private final FornecedorModel objFornecedor;

    public fornecedorControl() {
        this.objFornecedor = new FornecedorModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException {
        
        this.objFornecedor.setNome(pLista.get(1));
        this.objFornecedor.setEndereco(pLista.get(2));
        this.objFornecedor.setCep(pLista.get(3));
        this.objFornecedor.setCidade(pLista.get(4));
        this.objFornecedor.setUf(pLista.get(5));
        this.objFornecedor.setCnpj(pLista.get(6));
        this.objFornecedor.setRegistro_dt((pLista.get(7)));
        this.objFornecedor.setCpf(pLista.get(8));
        this.objFornecedor.setNascimento_dt((pLista.get(9)));
        this.objFornecedor.setTel_comercial(pLista.get(10));
        this.objFornecedor.setTel_residencial(pLista.get(11));
        this.objFornecedor.setCelular(pLista.get(12));
        this.objFornecedor.setFax(pLista.get(13));
        this.objFornecedor.setEmail(pLista.get(14));
        this.objFornecedor.setObservacao(pLista.get(15));

        this.objFornecedor.Salvar();

        return this.objFornecedor.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException {
        this.objFornecedor.setId(Integer.parseInt(pLista.get(0)));
        this.objFornecedor.setNome(pLista.get(1));
        this.objFornecedor.setEndereco(pLista.get(2));
        this.objFornecedor.setCep(pLista.get(3));
        this.objFornecedor.setCidade(pLista.get(4));
        this.objFornecedor.setUf(pLista.get(5));
        this.objFornecedor.setCnpj(pLista.get(6));
        this.objFornecedor.setRegistro_dt((pLista.get(7)));
        this.objFornecedor.setCpf(pLista.get(8));
        this.objFornecedor.setNascimento_dt((pLista.get(9)));
        this.objFornecedor.setTel_comercial(pLista.get(10));
        this.objFornecedor.setTel_residencial(pLista.get(11));
        this.objFornecedor.setCelular(pLista.get(12));
        this.objFornecedor.setFax(pLista.get(13));
        this.objFornecedor.setEmail(pLista.get(14));
        this.objFornecedor.setObservacao(pLista.get(15));

        this.objFornecedor.Atualizar();
    }

    private ArrayList<String> converterObjetoParaArray() {
        ArrayList<String> vetCampos = new ArrayList<String>();
        vetCampos.add(String.valueOf(this.objFornecedor.getId()));
        vetCampos.add(this.objFornecedor.getNome());
        vetCampos.add(this.objFornecedor.getEndereco());
        vetCampos.add(this.objFornecedor.getCep());
        vetCampos.add(this.objFornecedor.getCidade());
        vetCampos.add(this.objFornecedor.getUf());
        vetCampos.add(this.objFornecedor.getCnpj());
        vetCampos.add(String.valueOf(this.objFornecedor.getRegistro_dt()));
        vetCampos.add(this.objFornecedor.getCpf());
        vetCampos.add(String.valueOf(this.objFornecedor.getNascimento_dt()));
        vetCampos.add(this.objFornecedor.getTel_comercial());
        vetCampos.add(this.objFornecedor.getTel_residencial());
        vetCampos.add(this.objFornecedor.getCelular());
        vetCampos.add(this.objFornecedor.getFax());
        vetCampos.add(this.objFornecedor.getEmail());
        vetCampos.add(this.objFornecedor.getObservacao());

        return vetCampos;
    }

    public ArrayList<String> RecuperaObjeto(int iCodigo) {
        this.objFornecedor.RecuperaObjeto(iCodigo);
        return converterObjetoParaArray();
    }
    
    public void Excluir(int iChave) {
        this.objFornecedor.setId(iChave);
        this.objFornecedor.Excluir();

    }

}
