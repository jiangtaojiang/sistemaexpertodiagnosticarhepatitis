
package sediagnosticarhepatitis;


import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author alex
 * Esta clase contiene los atributos y operaciones nacesarias para
 * realizar la impresion de los resultados del modelo Cocomo
 */

public class Imprimir{

Font fuente = new Font("Dialog", Font.PLAIN, 10);//
    PrintJob pj; //especifica que el contenido sea impreso en una o varias paginas
    Graphics pagina; //especifica las operaciones graficas

    String enfermedad, tratamiento;
    //especifican los valores totales que se van a calcular en esta clase

    //Constructor que inicializa la impresion para iprimir los resultados de los valores de
    //punto de fusion, la cuenta total, las k lineas de codigo, el esfuerzo y el tiempo
    public Imprimir(String enfermedad,String tratamiento) {
        this.enfermedad=enfermedad;
        this.tratamiento=tratamiento;
        pj = Toolkit.getDefaultToolkit().getPrintJob(new Frame(), "SCAT", null);
    }
    //Esta metodo permite realizar el proceso
    //de imprimir los resultados del modelo Cocomo
    public void imprimir() {
        int posY=200; //la posicion Y vertical
        int posx=100; //la posicion X horizontal
        try {
            pagina = pj.getGraphics();
            pagina.setFont(fuente);
            pagina.setColor(Color.black);
            pagina.drawString("     DIAGNOSTICO DE LA HEPATITIS  "+"",60,100);
            pagina.drawString("-------------------------------"+  "" ,60,200);
            pagina.drawString("ENFERMEDAD" +"",60,100);
            pagina.drawString("                                   "+"",60,100);
            pagina.drawString("Paciente que:     "+        enfermedad,60,110);
            pagina.drawString("                                   "+"",60,100);
            pagina.drawString("TRATAMIENTO"+"",60,100);
            pagina.drawString("                                   "+"",60,100);
            pagina.drawString("Su tratamiento es:     "+        tratamiento,60,110);
            pagina.drawString("-------------------------------"+  "" ,60,200);
            
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null,"LA IMPRESION HA SIDO CANCELADA"+e,"Informacion",
                        JOptionPane.ERROR_MESSAGE);
            System.out.println("LA IMPRESION HA SIDO CANCELADA...");
        }
    }
}