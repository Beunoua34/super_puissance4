/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_puissance4;

import java.util.Scanner;

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
    public void attribuerCouleurAuxJoueurs(){   
        double alea = Math.random(); //on genere un double aleatoire entre 0 et 1   
        if (alea<0.5){       //une chance sur 2 d'etre inferieur a 0,5
            listeJoueurs[0].affecterCouleur("rouge");        
            listeJoueurs[1].affecterCouleur("jaune");    
        }else {     
            listeJoueurs[0].affecterCouleur("jaune");       
            listeJoueurs[1].affecterCouleur("rouge");   
        }
    }   
    public void creerEtAffecterJeton(Joueur player){
        for (int i=0;i<30;i++){       
            player.ajouterJeton(new Jeton(player.getCouleur()));
        }
    }
    public void initialiserPartie(){
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(listeJoueurs[0]);
        creerEtAffecterJeton(listeJoueurs[1]);       
    }
    public void lancerPartie(){
        joueurCourant=listeJoueurs[0];//le joueur classé en premier comence
        boolean finito = false;
        while (finito==false){ //tant que la partie n'est pas finie
            Scanner sc;
            int colonneJouee;
            sc = new Scanner(System.in);
            System.out.println("Au tour de " +joueurCourant+" (couleur "+joueurCourant.getCouleur()+")");
            System.out.println("Sur quelle colonne voulez-vous jouer? (1 a 7)");
            colonneJouee=sc.nextInt(); //saisie sur l'interface
            int ligneJouee;
            ligneJouee= plateau.ajouterJetonDansColonne(joueurCourant.jouerJeton(),colonneJouee);
            if (ligneJouee==99){
                System.out.println("Erreur: la colonne est pleine");
            } else{
                System.out.println("pion place dans la ligne numero "+ligneJouee);
            }
            if (plateau.colonneGagnantePourCouleur(joueurCourant.getCouleur())&&plateau.diagonaleDesencanteGagnantePourCouleur(joueurCourant.getCouleur()) && plateau.diagonaleMontanteGagnantePourCouleur(joueurCourant.getCouleur())&&plateau.ligneGagnantePourCouleur(joueurCourant.getCouleur())){
                finito=true;
                System.out.println("Felicitations, le joueur "+joueurCourant+" a gagne");
            }
            if (plateau.grilleRemplie()){
                System.out.println("La grille est pleine: fin de partie");
                finito=true;
            }
            if (joueurCourant==listeJoueurs[0]) joueurCourant=listeJoueurs[1];
            if (joueurCourant==listeJoueurs[1]) joueurCourant=listeJoueurs[0]; //on inverse le joueur courant
        }
        return;
    }
       
}
