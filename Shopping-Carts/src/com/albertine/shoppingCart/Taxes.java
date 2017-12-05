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
public class Taxes {

	public static final double TPS = 0.05, TVQ = 0.085;
	
	public static double getMontantTPS(double montant)
	{
		return montant*TPS;
	}
	public static double getMontantTVQ(double montant)
	{
		return (montant+getMontantTPS(montant))*TVQ;
	}
	public static double getMontantTTC(double montant)
	{
		return montant+getMontantTPS(montant)+getMontantTVQ(montant);
	}
}

    

