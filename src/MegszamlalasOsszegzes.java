/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class MegszamlalasOsszegzes {
    public static void main(String[]args){
        int[] a=new int[16];
        int ossz=0;
        for(int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*10);
            System.out.print(a[i]+" ");
            ossz=ossz+a[i];            
        }
        System.out.println();
        System.out.println("Összesen: "+ossz);
        int db=0;
        for(int i=0; i<a.length; i++){
            if(a[i]>7){
                db=db+1;
            }
        }
        System.out.println("A hetesnél nagyobb számok száma: "+db);
    }   
}
