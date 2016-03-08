/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.winkel;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author arne.simons
 */
public class Mandje {
    private Map<Product, Integer> mandje = new HashMap<>();

    public Mandje() {
    }

    public void add(Product p, int aantal) {
        if (mandje.containsKey(p)) {
            int oudeAantal = mandje.get(p);
            mandje.put(p, aantal+oudeAantal);
        }
        else {
            mandje.put(p, aantal);
        }
    }
    
    public void set(Product p, int aantal) {
        if (mandje.containsKey(p)) {
            mandje.put(p, aantal);
        }
    }
    
    public void remove(Product p) {
        mandje.remove(p);
    }
    
    public void clear() {
        mandje.clear();
    }
    
    public float getTotalePrijs() {
        float totalePrijs = 0;
        for (Entry eenBestellijn : mandje.entrySet()) {
            Product p = (Product)eenBestellijn.getKey();
            int aantal = (int)eenBestellijn.getValue();
            totalePrijs += (p.getPrijs() * aantal);
        }
        return totalePrijs;
    }

    @Override
    public String toString() {
        return "Mandje{" + "mandje=" + mandje + '}';
    }

    public Map<Product, Integer> getMandje() {
        return mandje;
    }
    
}
