/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;
import javax.swing.JOptionPane;
public class Practica3 {

    public static void main(String[] args) {
        Iglesia iglesia = new Iglesia();
        iglesia.pastores();
        iglesia.solicitarinfo();
        
        JOptionPane.showMessageDialog(null,
                "\n Cantidad de pastores" + iglesia.getPastores() +
                "\n Nombre de la iglesia " + iglesia.getNomdeiglesia() + 
                "\n Nombre del pastor " + iglesia.getNomdepastor() + 
                "\n Cantidad de Feligreses registrados " + iglesia.getFeligreses() +
                "\n Ingrese la Cedula " + iglesia.getCedula() +
                "\n Ingrese la cantidad del Diezmo " + iglesia.getDiezmo());
    }
    
}
