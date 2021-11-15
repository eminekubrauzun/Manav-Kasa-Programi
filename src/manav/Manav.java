/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manav;
import java.util.Scanner;

/**
 *
 * @author MONSTER
 */
public class Manav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
        */
        
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00,armutkilo,elmakilo,domateskilo,muzkilo,patlıcankilo;
        Scanner inp= new Scanner(System.in);
        System.out.print("armut kaç kilo:");
        armutkilo=inp.nextDouble();
        System.out.print("elma kaç kilo:");
        elmakilo=inp.nextDouble();
        System.out.print("domates kaç kilo:");
        domateskilo=inp.nextDouble();
        System.out.print("muz kaç kilo:");
        muzkilo=inp.nextDouble();
        System.out.print("patlıcan kaç kilo:");
        patlıcankilo=inp.nextDouble();
        
        
        double toplam=(armut*armutkilo)+(elma*elmakilo)+(domates*domateskilo)+(muz*muzkilo)+(patlıcan*patlıcankilo);
        System.out.print("Toplam tutar:" + toplam);
            
        
        
        
        
    }
    
}
