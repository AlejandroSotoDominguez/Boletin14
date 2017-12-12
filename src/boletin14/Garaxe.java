
package boletin14;

import javax.swing.JOptionPane;

public class Garaxe {
    private int numeroCoches;
    private String matricula;
    private int horas;
    private double precio;
    private int plazas=5;
    private double dineroRecibido;
    private double dineroDevuelto;
    
    public void aparcar(){
        for(int i=0;i<5;i++){
            int ax = JOptionPane.showConfirmDialog(null, "¿Aparcar coche?");
                if(ax == JOptionPane.YES_OPTION)
                    --plazas;
                else if(ax == JOptionPane.NO_OPTION);
                    
            matricula = JOptionPane.showInputDialog("Escribe la matrícula del coche:");
            horas = Integer.parseInt(JOptionPane.showInputDialog("Introduce horas:"));
            if(numeroCoches<=4){    
                
                if(horas<=3){
                    precio=1.5;
                }else{
                    precio=horas-3*0.2;
                }   
                
                JOptionPane.showMessageDialog(null, "PLAZAS DISPOÑIBLES"+"\n"+"Precio: "+precio);
                
                do{
                    dineroRecibido = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce dinero e efectivo:"));
                }while(dineroRecibido<precio);    
                
                dineroDevuelto = dineroRecibido-precio;
                
                JOptionPane.showMessageDialog(null, "FACTURA"+"\n"+"Plazas: "+plazas+"\n"+"MATRÍCULA COCHE: "+
                matricula+"\n"+"TEMPO: "+horas+" horas"+"\n"+"PRECIO: "+precio+"\n"+"DINERO RECIBIDO: "+
                dineroRecibido+"\n"+"DINERO DEVUELTO: "+dineroDevuelto);
       
            }else{
                JOptionPane.showMessageDialog(null, "COMPLETO");
            }
        }JOptionPane.showMessageDialog(null,"No quedan plazas disponibles");   
    }
}

