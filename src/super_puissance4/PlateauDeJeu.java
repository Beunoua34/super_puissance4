/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_puissance4;

/**
 *
 * @author guilh
 */
public class PlateauDeJeu {
    CelluledeGrille [][] grille = new CelluledeGrille [7][6];  

    public PlateauDeJeu() {
        for (int i=0;i<7;i++){
            for (int j=0;j<6;j++){
                grille[i][j] = new CelluledeGrille(); //les cellules sont vides initialement
            }
        }
    }
    public  int ajouterJetonDansColonne(Jeton jeton, int colonne){
        for (int ligne = 0;ligne<6;ligne++){
            if (grille[ligne][2].presenceJeton()==false) {
                grille[ligne][2].affecterJeton(jeton); //si la case du bas est libre, on y ajoute le jeton
                return ligne; //puis on retourne l'indice de la ligne
            }              
        }
        return 99; //si aucune case n'est vide, il y a une errur, donc on retourne 99 pour le signaler
    }
    
}
