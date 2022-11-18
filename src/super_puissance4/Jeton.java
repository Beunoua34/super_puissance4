/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_puissance4;

/**
 *
 * @author guilhem
 */
public class Jeton {
   private String couleur;

    public Jeton(String couleur) {
        this.couleur = couleur;
    }

    public String lireCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        if (couleur.equals("rouge")) return "R";
        else return "J";
    }
    
    
    
   
}
