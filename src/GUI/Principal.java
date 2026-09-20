
package GUI;


public class Principal {
    
    
        
        



    public static void main(String[] args) {

        javax.swing.JFrame ventana = new javax.swing.JFrame("Sistema de Inventario");

        ventana.setDefaultCloseOperation(
                javax.swing.JFrame.EXIT_ON_CLOSE
        );

        ventana.setContentPane(new INVENTARIO_GRAFICO());

        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
    
    
    

