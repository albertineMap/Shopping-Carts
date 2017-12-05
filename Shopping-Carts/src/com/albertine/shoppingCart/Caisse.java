/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.albertine.shoppingCart;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author albertine
 */
public class Caisse {
    String Commande;
    static int nbPomme =0;
    static int nbOrange =0;

    public Caisse(String Commande) {
        this.Commande = Commande;
        nbPomme=0;
        nbOrange =0;
    }
    //prend une commande String et scinde en liste de pommes et orange
    public void getquantite(String liste)
    {
        String [] commande = liste.split(",");
        Pommes p =new Pommes();
        double prixHorsTaxe=0.0,prixToutTaxe=0.0;
        for(int i=0;i<commande.length;i++)
        {
            if(commande[i].trim().equalsIgnoreCase("Pommes"))
                nbPomme++;
            if(commande[i].trim().equalsIgnoreCase("Oranges"))
                nbOrange++;
                
        }
    }
        
    public double getMontantTotal()
    {
        int nbPommes=0,nbOranges=0;
        double MontantHorsTaxes=0.0,MontantToutTaxes=0.0;
         nbPommes = Pommes.getQuantiteNet(nbPomme);
         nbOranges = Oranges.getQuantiteNet(nbOrange);
         MontantHorsTaxes = (nbPommes*0.60) + (nbOranges*1.25);
         MontantToutTaxes = Taxes.getMontantTTC(MontantHorsTaxes);
        return MontantToutTaxes;
    }
       
   }
    
    

