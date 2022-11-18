/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package super_puissance4;

/**
 *
 * @author benba
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jeton jaune= new Jeton("jaune");
        System.out.println(jaune.lireCouleur());
        System.out.println(jaune);
        CelluledeGrille case1 = new CelluledeGrille();
        case1.affecterJeton(jaune);
        System.out.println(case1.lireCouleurDuJeton());
        case1.recupererJeton();
        System.out.println(case1.lireCouleurDuJeton());
        
    }
    
}
