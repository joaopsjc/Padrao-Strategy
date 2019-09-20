/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import extende.*;

/**
 *
 * @author ice
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto produto1 = new TV();
        Produto produto2 = new Camera();
        Produto produto3 = new Celular();
        
        System.out.println(produto1.getNome() +
                " na promocao " + produto1.desconto() + "%");
        System.out.println(produto2.getNome() +
                " na promocao " + produto2.desconto() + "%");
        System.out.println(produto3.getNome() +
                " na promocao " + produto3.desconto() + "%");
    }
    
}
