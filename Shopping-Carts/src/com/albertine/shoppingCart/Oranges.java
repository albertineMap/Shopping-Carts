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
public class Oranges extends Article
{

    public Oranges(int prix) 
    {
        super(prix);
    }
    
    public int getQuantiteNet(int qteCourant)
    {
        int rest =0,quantite_A_Payer;
        int facteur = qteCourant/3; //nous donne le nombre d'orange gratuit
        if(qteCourant%3 == 0)
            quantite_A_Payer = qteCourant-facteur; //nombre initial - le nombre gratuit
        else
        {
            rest = qteCourant-(qteCourant-Math.round(facteur));
            quantite_A_Payer = qteCourant-facteur+rest;
        }
        return quantite_A_Payer;
            
    }
    
    
}
