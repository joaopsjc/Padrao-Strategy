/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementa;

import modelos.Promocao;

/**
 *
 * @author ice
 */
public class PromocaoQueimaEstoque implements Promocao{
    
    public int obterDesconto()
    {
        return 20;
    }
    public String ObterPromocao()
    {
        return "Queima de Estoque";
    }
}
