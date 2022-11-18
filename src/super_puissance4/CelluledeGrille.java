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
    

    }

    
    
       

