/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extende;

import modelos.Promocao;

/**
 *
 * @author ice
 */
public abstract class Produto {
    protected Promocao promocao;
    protected String nome;

    public int desconto() {
        return promocao.obterDesconto();
    }
    
    public Promocao getPromocao() {
        return promocao;
    }

    public String getNome() {
        return nome;
    }
    
}
