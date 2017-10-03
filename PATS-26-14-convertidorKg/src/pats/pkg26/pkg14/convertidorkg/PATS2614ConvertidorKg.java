/*
Ejercicio 14: HAcer un programa que pase de Kg a otra unidad de medida de masa,
mostrar en pantalla un menú con las opcioness posibles.
 */
package pats.pkg26.pkg14.convertidorkg;

import javax.swing.JOptionPane;

/**
 *
 * @author edgardo
 */
public class PATS2614ConvertidorKg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    byte opcion;
    float cantidad, resultado;
    
    cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingresa la cantidad en Kg"));    
    
    opcion = Byte.parseByte(JOptionPane.showInputDialog("Seleciona una de las opciones:\n" +
            "1.- kg -> g\n" +
            "2.- kg -> tonelada"));
    
    switch(opcion){
        case 1:
               resultado = cantidad * 1000;
               JOptionPane.showMessageDialog(null, cantidad + "kg"+" a g, son: "+resultado+"g");
                break;
        case 2:  
               resultado = cantidad / 1000;
               JOptionPane.showMessageDialog(null, cantidad + "kg"+" a Toneladas, son: "+resultado+"Toneladas");
                break;
    }
    
    }
    
}
