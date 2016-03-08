/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.winkel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arne.simons
 */
public class Catalogus {
    private List<Product> catalogus;

    public Catalogus() {
        catalogus = new ArrayList<>();
        catalogus.add(new Product("Halfvolle melk", 0.85F));
        catalogus.add(new Product("Diepvriesfriet", 1.99F));
        catalogus.add(new Product("Chips zout", 0.35F));
        catalogus.add(new Product("Chips paprika", 0.39F));
        catalogus.add(new Product("Pizza Bolognese", 1.49F));
        catalogus.add(new Product("Pizza Margherita", 1.29F));
        
    }

    public List<Product> getCatalogus() {
        return catalogus;
    }
    
    
    
    
    
}
