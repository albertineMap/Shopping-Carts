/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nombresuperieur;

/**
 *
 * @author albertine
 */
public class NombreSup {
    //prend un entier et retourne un tableau d'entier
    public int[]  getTabInt(int n) 
    {
        String nombre = ""+n;  
        int[] tab = new int[nombre.length()];
        for ( int i=0; i<nombre.length(); i++) 
        {
          tab[i]=Integer.parseInt(""+nombre.charAt(i));
        }
        return tab;
    }
    
    //verifie si un chriffre appartient a un tableau de chriffre 
    public  boolean appartient(int n,int[] t){
        for(int i=0; i<t.length;i++)
        {
            if(t[i] == n)
                return true;
        }
        return false;
    }
    
    //retorne la somme d'un tableau
    public int somme(int[] t)
    {
        int s= 0;
        for(int i=0; i<t.length;i++)
            s+=t[i];
        return s;
    }
    
    public int getLeNbreSup(int entree)
    {
        int resultat = entree+1;
        boolean t=false,f=true,sortie=false;
        int [] tab = getTabInt(entree);
        int [] result = getTabInt(resultat);
        while(sortie==false)
        {
            for(int i=0;i<result.length;i++)
            {
                if(appartient(result[i],tab))
                {
                     t = true; 
                     f=true;
                }
                else{
                    f=false;
                }

            }
            if(t==true && f==true)
            {
                if(somme(tab)==somme(result))
                    sortie=true;
                else{
                    sortie=false;
                    result = getTabInt(++resultat);
                }
            }
            else
            {
                sortie=false;
                result = getTabInt(++resultat);
            }
            
        }

        return resultat;
    }
    
}
