/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import br.com.modelo.ColaboradoresModel;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public class colaboradoresControl {

    private final ColaboradoresModel objColaborador;

    public colaboradoresControl() {
        this.objColaborador = new ColaboradoresModel();
    }

    public int Salvar(ArrayList<String> pLista) throws ParseException {
        
        this.objColaborador.setNome(pLista.get(1));
        this.objColaborador.setSexo(pLista.get(2));
        this.objColaborador.setCpf(pLista.get(3));
        this.objColaborador.setRg(pLista.get(4));
        this.objColaborador.setCtps(pLista.get(5));
        this.objColaborador.setCnh(pLista.get(6));
        this.objColaborador.setValidade_cnh((pLista.get(7)));
        this.objColaborador.setTipo_cnh(pLista.get(8));
        this.objColaborador.setTipo_sangue((pLista.get(9)));
        this.objColaborador.setTelefone(pLista.get(10));
        this.objColaborador.setCelular(pLista.get(11));
        this.objColaborador.setOutro(pLista.get(12));
        this.objColaborador.setEmail(pLista.get(13));
        this.objColaborador.setEndereco(pLista.get(14));
        this.objColaborador.setCep(pLista.get(15));
        this.objColaborador.setCidade(pLista.get(16));
        this.objColaborador.setUf(pLista.get(17));
        this.objColaborador.setSetor(pLista.get(18));
        this.objColaborador.setCargo(pLista.get(19));
        this.objColaborador.setFuncao(pLista.get(20));
        this.objColaborador.setUsuario_sistema(pLista.get(21));
        this.objColaborador.setPerfil(pLista.get(22));
        this.objColaborador.setLogin(pLista.get(23));
        this.objColaborador.setConf_login(pLista.get(24));
        this.objColaborador.setSenha(pLista.get(25));
        this.objColaborador.setConf_senha(pLista.get(26));
        this.objColaborador.setEmail_senha(pLista.get(27));
        this.objColaborador.setObservacao(pLista.get(28));

        this.objColaborador.Salvar();

        return this.objColaborador.getId();
    }

    public void Atualizar(ArrayList<String> pLista) throws ParseException {
       
        this.objColaborador.setId(Integer.parseInt(pLista.get(0)));
        this.objColaborador.setNome(pLista.get(1));
        this.objColaborador.setSexo(pLista.get(2));
        this.objColaborador.setCpf(pLista.get(3));
        this.objColaborador.setRg(pLista.get(4));
        this.objColaborador.setCtps(pLista.get(5));
        this.objColaborador.setCnh(pLista.get(6));
        this.objColaborador.setValidade_cnh((pLista.get(7)));
        this.objColaborador.setTipo_cnh(pLista.get(8));
        this.objColaborador.setTipo_sangue((pLista.get(9)));
        this.objColaborador.setTelefone(pLista.get(10));
        this.objColaborador.setCelular(pLista.get(11));
        this.objColaborador.setOutro(pLista.get(12));
        this.objColaborador.setEmail(pLista.get(13));
        this.objColaborador.setEndereco(pLista.get(14));
        this.objColaborador.setCep(pLista.get(15));
        this.objColaborador.setCidade(pLista.get(16));
        this.objColaborador.setUf(pLista.get(17));
        this.objColaborador.setSetor(pLista.get(18));
        this.objColaborador.setCargo(pLista.get(19));
        this.objColaborador.setFuncao(pLista.get(20));
        this.objColaborador.setUsuario_sistema(pLista.get(21));
        this.objColaborador.setPerfil(pLista.get(22));
        this.objColaborador.setLogin(pLista.get(23));
        this.objColaborador.setConf_login(pLista.get(24));
        this.objColaborador.setSenha(pLista.get(25));
        this.objColaborador.setConf_senha(pLista.get(26));
        this.objColaborador.setEmail_senha(pLista.get(27));
        this.objColaborador.setObservacao(pLista.get(28));

        this.objColaborador.Atualizar();
    }

    public void Excluir(int iChave) {
        this.objColaborador.setId(iChave);
        this.objColaborador.Excluir();

    }

}
