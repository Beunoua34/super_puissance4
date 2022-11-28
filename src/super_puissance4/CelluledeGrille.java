/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_puissance4;

/**
 *
 * @author guilhem
 */
public class CelluledeGrille {
    private Jeton jetonCourant;
    private Jeton avoirTrouNoir;
    private Jeton avoirDesintegrateur;

    public CelluledeGrille() {
        this.jetonCourant = null;
        this.avoirTrouNoir = null;
    }

    @Override
    public String toString() { //toString a modifier quand on voudra traiter les trou noirs
        if (this.jetonCourant==null) return "[     ]"; 
        return "["+this.jetonCourant.lireCouleur()+"]";
    }
    
    
    public boolean presenceJeton(){
        if (jetonCourant==null) {
            return false;
        } else {
            return true;
        }
    }
    public void affecterJeton(Jeton jeton) {
        this.jetonCourant = jeton;
    }
    public void supprimerJeton(Jeton jeton){
        if (jetonCourant.equals(jeton)) {
            this.jetonCourant = null;
        }
    }
    public String lireCouleurDuJeton() {
        if (jetonCourant!=null){
            return jetonCourant.lireCouleur(); //on utilise la methode de la classe Jeton
        }else {
            return "vide";
        }            
    }
    public Jeton recupererJeton(){ //cette fonction sert a enlever un jeton dans la version 1, mais renvoie aussi le jeton enleve pour la future version 3
        Jeton jeton_enleve; //on utlise une variable temporaire pour ne pas perdre le jeton
        jeton_enleve=jetonCourant;
        jetonCourant=null;
        return jeton_enleve;
    }
    
    
    
    public void placerTrouNoir(Jeton trounoir){
        this.avoirTrouNoir = trounoir;
    }
    public void supprimerTrouNoir(Jeton trounoir){
        if (avoirTrouNoir.equals(trounoir)) {
            this.avoirTrouNoir = null;
        }
    }
    public boolean presenceTrouNoir(){
        if (avoirTrouNoir==null) {
            return false;
        } else {
            return true;
        }
    }
    public void activerTrouNoir(){
        supprimerTrouNoir(avoirTrouNoir);
        supprimerJeton(jetonCourant);
    }
    
    
    
    public boolean presenceDesintegrateur(){
        if (avoirDesintegrateur==null) {
            return false;
        } else {
            return true;
        }
    }
    public void placerDesintegrateur(Jeton desintegrateur){
        this.avoirTrouNoir = desintegrateur;
    }
        public void supprimerDesintegrateur(Jeton desintegrateur){
        if (avoirDesintegrateur.equals(desintegrateur)) {
            this.avoirDesintegrateur = null;
        }
    }
   

    }

    
    
       

