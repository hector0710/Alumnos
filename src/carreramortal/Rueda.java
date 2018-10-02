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
public class Rueda {
    private int cantidadDeTuercas;
    private double presion;
    
    public Rueda(int cantidadDeTuercas) {
        this.cantidadDeTuercas = cantidadDeTuercas;
        this.presion = 30;
    }
    
    public void desinflar(double aire) {
        presion -= aire;
    }
    
    public void inflar() {
       presion = 30;
    }

    public double getPresion() {
        return presion;
    }
}
