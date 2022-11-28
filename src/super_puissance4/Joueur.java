/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_puissance4;

import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class Joueur {
    private String nom;
    private String couleur;
    private ArrayList <Jeton> reserveJetons= new ArrayList <Jeton>();

    public Joueur(String nom) {
        this.nom = nom;
    }
    public void affecterCouleur(String couleur){
        this.couleur=couleur;
    }
    public int nombreDeJetons(){
        return reserveJetons.size();
    }
    public void ajouterJeton(Jeton jeton){
        reserveJetons.add(jeton);
    }
}
