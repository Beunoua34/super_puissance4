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
            if (grille[ligne][colonne].presenceJeton()==false) {
                grille[ligne][colonne].affecterJeton(jeton); //si la case du bas est libre, on y ajoute le jeton
                return ligne; //puis on retourne l'indice de la ligne
            }              
        }
        return 99; //si aucune case n'est vide, il y a une errur, donc on retourne 99 pour le signaler
    }
    public boolean grilleRemplie(){
        for (int ligne=0;ligne<6;ligne++){
            for (int colonne=0; colonne<7;colonne++){
                if (grille[ligne][colonne].presenceJeton()==false){
                    return false; //des qu'on trouve une case vide, la grille n'est pas pleine
                }
            }
        }
        return true; //si on a trouve aucune case vide, la grille est pleine
    }
    
    public boolean presenceJeton(int x, int y){
        return grille [x][y].presenceJeton();
    }
    public String lireCouleurJeton(int x, int y){
        return grille[x][y].lireCouleurDuJeton();
    }
     public boolean ligneGagnantePourCouleur(String couleur){
         for (int ligne=0;ligne<6;ligne++){
             for (int colonne=0;colonne<4;colonne++){
                 
                if (grille[ligne][colonne].lireCouleurDuJeton().equals(couleur) && grille[ligne][colonne+1].lireCouleurDuJeton().equals(couleur) && grille[ligne][colonne+2].lireCouleurDuJeton().equals(couleur) && grille[ligne][colonne+3].lireCouleurDuJeton().equals(couleur)){  
                    return true; //si la case etudiee et les 3 à sa droite sont de la bonne couleur, on retourne true
                }                                     
                     
             }
         }
         return false; //si on n'a trouve aucune case gagnante, on retourne false
     }
     public boolean colonneGagnantePourCouleur(String couleur){
         for (int ligne=0;ligne<3;ligne++){
             for (int colonne=0;colonne<7;colonne++){
                 
                if (grille[ligne][colonne].lireCouleurDuJeton().equals(couleur) && grille[ligne+1][colonne].lireCouleurDuJeton().equals(couleur) && grille[ligne+2][colonne].lireCouleurDuJeton().equals(couleur) && grille[ligne+3][colonne].lireCouleurDuJeton().equals(couleur)){  
                    return true; //si la case etudiee et les 3 à sa droite sont de la bonne couleur, on retourne true
                }                                     
                     
             }
         }
         return false; //si on n'a trouve aucune case gagnante, on retourne false
     }
     public boolean diagonaleMontanteGagnantePourCouleur(String couleur){
         for (int ligne=0;ligne<3;ligne++){
             for (int colonne=0;colonne<4;colonne++){
                 
                if (grille[ligne][colonne].lireCouleurDuJeton().equals(couleur) && grille[ligne+1][colonne+1].lireCouleurDuJeton().equals(couleur) && grille[ligne+2][colonne+2].lireCouleurDuJeton().equals(couleur) && grille[ligne+3][colonne+3].lireCouleurDuJeton().equals(couleur)){  
                    return true; //si la case etudiee et les 3 dans sa diagonale au dessus sont de la bonne couleur, on retourne true
                }                                     
                     
             }
         }
         return false; //si on n'a trouve aucune case gagnante, on retourne false
     }
     public boolean diagonaleDesencanteGagnantePourCouleur(String couleur){
         for (int ligne=0;ligne<3;ligne++){
             for (int colonne=0;colonne<4;colonne++){
                 
                if (grille[ligne][colonne].lireCouleurDuJeton().equals(couleur) && grille[ligne-1][colonne+1].lireCouleurDuJeton().equals(couleur) && grille[ligne-2][colonne+2].lireCouleurDuJeton().equals(couleur) && grille[ligne-3][colonne+3].lireCouleurDuJeton().equals(couleur)){  
                    return true; //si la case etudiee et les 3 dans sa diagonale en dessous sont de la bonne couleur, on retourne true
                }                                     
                     
             }
         }
         return false; //si on n'a trouve aucune case gagnante, on retourne false
     }
     public Boolean etreGagnantePourCouleur (String couleur){
         if (diagonaleDesencanteGagnantePourCouleur(couleur)){
             return true;
         } else if (diagonaleMontanteGagnantePourCouleur(couleur)){
             return true;
         }
         else if (colonneGagnantePourCouleur(couleur)){
             return true;
         } else if (ligneGagnantePourCouleur(couleur)){
             return true;
         }else {
             return false; //si aucune ligne, colonne ou diagonale n'est gagnante, on retourne false car la grille n'est ps gagnante
         }
         
     }
            
}
