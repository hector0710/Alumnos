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
public class CarreraMortal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Auto al = new Auto("Azul", "tt 11");
        Rueda ru = new Rueda(1);
        al.setRueda(ru);
        al.getRueda().inflar();
        al.avanzar(10);
        al.retroceder(10);
        System.out.println(al.getCombustible());
        al.llenarCombustible();
        System.out.println(al.getCombustible());
    
    }
}
