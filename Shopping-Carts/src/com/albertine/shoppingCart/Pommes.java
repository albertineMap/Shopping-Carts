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
public class Pommes extends Article
{
     public Pommes() 
    {
    }
     
     public static int getQuantiteNet(int qteCourant)
    {
        int quantite_A_Payer;
        if(qteCourant%2 == 0)
            quantite_A_Payer = qteCourant/2; 
        else
        {
            quantite_A_Payer = (qteCourant/2)+1;
        }
        return quantite_A_Payer;
            
    }
}
