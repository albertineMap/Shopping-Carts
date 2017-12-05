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

    public Oranges() 
    {
    }
    
    public static  int getQuantiteNet(int qteCourant)
    {
        int quantite_A_Payer;
        int facteur = qteCourant%3; //nous donne le nombre d'orange gratuit
        
            quantite_A_Payer = qteCourant-facteur;
        
        return quantite_A_Payer;
            
    }
    
    
}
