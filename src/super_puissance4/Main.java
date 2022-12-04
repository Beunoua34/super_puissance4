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
        double alea = Math.random()*7; //on genere un double aleatoire entre 0 et 7
        System.out.println(alea);
        int ligne = (int)alea;
        System.out.println(ligne);
       Joueur j1= new Joueur("benoit");
       Joueur j2=new Joueur("Guilhem");
       Partie game = new Partie (j1,j2);
       game.initialiserPartie();
       game.lancerPartie();
        
    }
    
}
