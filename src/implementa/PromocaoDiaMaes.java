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
public class PromocaoDiaMaes implements Promocao{
    
    public int obterDesconto()
    {
        return 10;
    }
    public String ObterPromocao()
    {
        return "Dia das Mães";
    }
}
