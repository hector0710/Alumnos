/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreramortal;

/**
 *
 * @author programador
 */
public class Auto {
    private String color;
    private String patente;
    private double combustible;
    private Rueda rueda;
    
    //CONSTRUCTOR
    public Auto(String color, String patente) {
        this.combustible = 50;
        this.color = color;
        this.patente = patente;
    }
    
    //METODOS
    public void avanzar(double metros) {
    if (combustible > 0 && rueda.getPresion() > 1)
        combustible -= metros/10;
        rueda.desinflar(10);

    }
    
    public void retroceder(double metros) {
    if (combustible > 0 && rueda.getPresion() > 1)
        combustible -= metros/10;
        rueda.desinflar(10);
        
    }
    
    public void llenarCombustible() {
        combustible = 50;
    }

    public void setRueda(Rueda rueda) {
        this.rueda = rueda;
    }

    public double getCombustible() {
        return combustible;
    }

    public Rueda getRueda() {
        return rueda;
    }
    
    
}
