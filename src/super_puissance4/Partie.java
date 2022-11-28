/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_puissance4;

/**
 *
 * @author guilh
 */
public class Partie {
    private Joueur [] listeJoueurs = new Joueur[2];
    private Joueur joueurCourant;
    private PlateauDeJeu plateau;

    public Partie(Joueur joueur1, Joueur joueur2) {
        listeJoueurs[0]=joueur1;
        listeJoueurs[1]=joueur2;
        this.plateau=new PlateauDeJeu();
    }
    
}
