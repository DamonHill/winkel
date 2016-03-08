/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.winkel;

/**
 *
 * @author arne.simons
 */
public class Product implements Comparable<Product> {
    private String omschrijving;
    private float prijs;

    public Product(String omschrijving, float prijs) {
        this.omschrijving = omschrijving;
        this.prijs = prijs;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public float getPrijs() {
        return prijs;
    }

    public void setPrijs(float prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return omschrijving + " (prijs per stuk is " + prijs + " euro)";
    }
    
    @Override 
    public boolean equals (Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Product)) {
            return false;
        }
        Product p = (Product) o;
        return (omschrijving.equals(p.getOmschrijving()));
    }

    @Override 
    public int hashCode() {
        return (int)prijs;
    }
  
    @Override
    public int compareTo(Product p) { 
        if (p == null) 
            throw new NullPointerException();
        else {
            if (this.equals(p)) 
                return 0; 
            else  
                return omschrijving.compareTo(p.getOmschrijving()); 
        } 
    }   
    
}
