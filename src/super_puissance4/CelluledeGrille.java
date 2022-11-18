/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package super_puissance4;

/**
 *
 * @author guilh
 */
public class CelluledeGrille {
    private Jeton jetonCourant;

    public CelluledeGrille() {
        this.jetonCourant = null;
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
    public String lireCouleurDuJeton() {
        if (jetonCourant!=null){
            return jetonCourant.lireCouleur();
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

    }

    
    
       

