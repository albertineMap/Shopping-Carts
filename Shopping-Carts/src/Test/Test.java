/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.albertine.nombreSuperieur.NombreSup;
import com.albertine.shoppingCart.Article;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author albertine
 */
public class Test 
{
     public static void main(String[] args) 
    {
        Scanner lecteur = new Scanner(System.in);
        System.out.print("Entrer un nombre: ");
        
        int nombreLu = lecteur.nextInt();
        NombreSup nbSup = new NombreSup();
        int soe = nbSup.getLeNbreSup(nombreLu);
        
        System.out.println("ce nombre est: "+soe);
        System.out.println("\n"
                + "");
        
         
         //System.out.println("\nMontant total des achats est: "+df.format(montant)+"$");
    }
    
}
