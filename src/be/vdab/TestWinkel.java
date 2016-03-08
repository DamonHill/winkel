/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab;

import be.vdab.winkel.Catalogus;
import be.vdab.winkel.Mandje;
import be.vdab.winkel.Product;
import java.util.Map;

/**
 *
 * @author arne.simons
 */
public class TestWinkel {

    public static void main(String[] args) {
        Catalogus cat = new Catalogus();
        Mandje mandje = new Mandje();
        
        for (Product p: cat.getCatalogus()) {
            mandje.add(p, 1);   // 1 stuk per product momenteel
        }
        
        Product p2 = new Product("Chips paprika", 0.39F);
        mandje.add(p2, 5);
        Product p3 = new Product("Halfvolle melk", 0.85F);
        mandje.set(p3, 10);
        Product p4 = new Product("Chips zout", 0.85F);
        mandje.remove(p4);
        Product p5 = new Product("Pizza Bolognese", 1.49F);
        mandje.set(p5, 4);
        
        
        // System.out.println(mandje.toString());
        for (Map.Entry e : mandje.getMandje().entrySet()) {
            Product pp = (Product)e.getKey();
            System.out.println(e.getValue() + " stuk(s) van " + e.getKey() + " voor een totale prijs van "+ ((int)e.getValue()*pp.getPrijs()) + " euro.");
        }
        
        System.out.println("De totale prijs is " + mandje.getTotalePrijs() + " euro.");
    }

    
}
