/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.albertine.shoppingCart;



/**
 *
 * @author albertine
 */
public class Article {
    public String nom;
    public double prix;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
    public double getCoutTotal(String liste)
    {
        String [] commande = liste.split(",");
        double prixHorsTaxe=0.0,prixToutTaxe=0.0;
        for(int i=0;i<commande.length;i++)
        {
            if(commande[i].trim().equalsIgnoreCase("Pommes"))
                prixHorsTaxe+=0.60;
            else
                prixHorsTaxe+=1.25;
                
        }
        prixToutTaxe+= Taxes.getMontantTTC(prixHorsTaxe);
        return prixToutTaxe;
    }
    
}
