/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.modelo.ProdutosModel;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Rafael Paes Leme
 */
public class produtosControl {
    
    
    private final ProdutosModel objProdutos;

    public produtosControl() {
        this.objProdutos = new ProdutosModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException {
        
        this.objProdutos.setNome(pLista.get(1));
        this.objProdutos.setCompra(Double.parseDouble(pLista.get(2)));
        this.objProdutos.setVenda(Double.parseDouble(pLista.get(3)));
        this.objProdutos.setQuantidade(Double.parseDouble(pLista.get(4)));
        this.objProdutos.setTipo(pLista.get(5));
        this.objProdutos.setFornecedor(pLista.get(6));
        this.objProdutos.setFK_fornecedor(Integer.parseInt((pLista.get(7))));
        this.objProdutos.setComprador(pLista.get(8));
        this.objProdutos.setFK_comprador(Integer.parseInt(pLista.get(9)));
        this.objProdutos.setObservacao(pLista.get(10));
        
        this.objProdutos.Salvar();

        return this.objProdutos.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException {
        this.objProdutos.setId(Integer.parseInt(pLista.get(0)));
        this.objProdutos.setNome(pLista.get(1));
        this.objProdutos.setCompra(Double.parseDouble(pLista.get(2)));
        this.objProdutos.setVenda(Double.parseDouble(pLista.get(3)));
        this.objProdutos.setQuantidade(Double.parseDouble(pLista.get(4)));
        this.objProdutos.setTipo(pLista.get(5));
        this.objProdutos.setFornecedor(pLista.get(6));
        this.objProdutos.setFK_fornecedor(Integer.parseInt(pLista.get(7)));
        this.objProdutos.setComprador(pLista.get(8));
        this.objProdutos.setFK_comprador(Integer.parseInt(pLista.get(9)));
        this.objProdutos.setObservacao(pLista.get(10));

        this.objProdutos.Atualizar();
    }

    private ArrayList<String> converterObjetoParaArray() {
        ArrayList<String> vetCampos = new ArrayList<String>();
        vetCampos.add(String.valueOf(this.objProdutos.getId()));
        vetCampos.add(this.objProdutos.getNome());
        vetCampos.add(String.valueOf(this.objProdutos.getCompra()));
        vetCampos.add(String.valueOf(this.objProdutos.getVenda()));
        vetCampos.add(String.valueOf(this.objProdutos.getQuantidade()));
        vetCampos.add(this.objProdutos.getTipo());
        vetCampos.add(this.objProdutos.getFornecedor());
        vetCampos.add(String.valueOf(this.objProdutos.getFK_fornecedor()));
        vetCampos.add(this.objProdutos.getComprador());
        vetCampos.add(String.valueOf(this.objProdutos.getFK_comprador()));
        vetCampos.add(this.objProdutos.getObservacao());
        return vetCampos;
    }

    public ArrayList<String> RecuperaObjeto(int iCodigo) {
        this.objProdutos.RecuperaObjeto(iCodigo);
        return converterObjetoParaArray();
    }
    
    public void Excluir(int iChave) {
        this.objProdutos.setId(iChave);
        this.objProdutos.Excluir();

    }

    
}
