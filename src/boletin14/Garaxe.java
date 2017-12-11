
package boletin14;

import javax.swing.JOptionPane;

public class Garaxe {
    private int numeroCoches;
    private String matricula;
    private int horas;
    private double precio;
    
    public void aparcar(){
        for(int i=0;i<5;i++){
            matricula = JOptionPane.showInputDialog("Escribe la matrícula del coche:");
            horas = Integer.parseInt(JOptionPane.showInputDialog("Introduce horas:"));
            if(numeroCoches<=4){
                JOptionPane.showMessageDialog(null, "PLAZAS DISPOÑIBLES");
                ++numeroCoches;
                
                if(horas<=3){
                    precio=1.5;
                }else{
                    precio=horas-3*0.2;
                }

                JOptionPane.showMessageDialog(null, "FACTURA"+"\n"+"MATRÍCULA COCHE: "+
                matricula+"\n"+"TEMPO: "+horas+" horas"+"\n"+"PRECIO: "+precio);
            }else{
                JOptionPane.showMessageDialog(null, "COMPLETO");
            }
        }JOptionPane.showMessageDialog(null,"No quedan plazas disponibles");   
    }
}

