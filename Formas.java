package Dibujo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Formas extends JPanel{
    
    //ventana
    private  JFrame ventana;
    //contenedor
    private Container contenedor;
    
    public Formas(){

        // inicializar la ventana
        ventana = new JFrame("Tarjeta de Figuras");
        // definir tamaño a ventana
        ventana.setSize(800, 500);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        contenedor = ventana.getContentPane();
        contenedor.setSize(500, 600);
        // agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        //Trazo del marco
        g.setColor(Color.black);
        g.drawRoundRect(10, 10, 760, 440, 20, 20);

        //Marco Figura 1
        g.setColor(Color.pink);
        g.drawRect(20, 20, 220, 140);
        
        //Marco Figura 2
        g.setColor(Color.pink);
        g.drawRect(280, 20, 220, 140);
        
        //Marco Figura 3
        g.setColor(Color.pink);
        g.drawRect(540, 20, 220, 140);
        
        //Marco Figura 4
        g.setColor(Color.pink);
        g.drawRect(20, 220, 220, 140);
        
        //Marco Figura 5
        g.setColor(Color.pink);
        g.drawRect(540, 220, 220, 140);
        
        //Marco Figura 6
        g.setColor(Color.pink);
        g.drawRect(280, 220, 220, 140);
        
        //Textos Figura 1
        g.setColor(Color.gray);
        g.drawString("Dibujando Líneas", 80, 180);
        
        //Textos Figura 2
        g.setColor(Color.gray);
        g.drawString("Dibujando Rectángulos", 320, 180);
        
        //Textos Figura 3
        g.setColor(Color.gray);
        g.drawString("Dibujando Óvalos", 560, 180);
        
        //Textos Figura 4
        g.setColor(Color.gray);
        g.drawString("Dibujando Círculos", 80, 380);
        
        //Textos Figura 5
        g.setColor(Color.gray);
        g.drawString("Dibujando Óvalos/ Círculos", 320, 380);
        
        //Textos Figura 1
        g.setColor(Color.gray);
        g.drawString("Dibujando Triángulos", 560, 380);
        
        //Trazo de Figuras
        //Marco 1
        g.setColor(Color.red);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 200, 100);
        
        g.setColor(Color.black);
        g.drawRect(120, 65, 20, 35);

        g.setColor(Color.gray);
        g.drawLine(100, 50, 150, 20);
        g.drawLine(200, 50, 150, 20);
        
        //Marco 2
        g.setColor(Color.red);
        g.drawRect(420, 60, 20, 80);
        
        g.setColor(Color.red);
        g.drawRect(450, 50, 20, 90);
        
        g.setColor(Color.red);
        g.drawRect(390, 75, 20, 65);
        
        g.setColor(Color.red);
        g.drawRect(360, 90, 20, 50);
        
        //Marco 3
        g.setColor(Color.green);
        g.drawOval(580, 80, 140, 30);
        g.drawOval(630, 40, 30, 100);
        g.drawOval(605, 60, 80, 30);
        
        //Marco 4
        g.setColor(Color.CYAN);
        g.drawOval(90, 250, 90, 90);
        g.drawOval(115, 272, 15, 15);
        g.drawOval(115, 272, 15, 15);
        g.drawOval(121, 276, 5, 5);
        g.drawOval(145, 276, 5, 5);
        g.drawOval(122, 300, 25, 25);
        
        //Marco 5
        g.setColor(Color.yellow);
        g.drawRoundRect(320, 270, 140, 50, 140, 140);
        g.drawRoundRect(350, 245, 80, 40, 80, 80);
        g.drawRoundRect(375, 235, 30, 100, 140, 140);
        
        //Marco 6
        g.setColor(Color.black);
        g.drawLine(600, 320, 700, 320);
        g.drawLine(600, 320, 650, 280);
        g.drawLine(700, 320, 650, 280);
        
        g.setColor(Color.black);
        g.drawLine(590, 295, 615, 295);
        g.drawLine(590, 295, 590, 260);
        
        g.setColor(Color.black);
        g.drawLine(615, 295, 590, 260);
        
        g.drawLine(650, 280, 705, 280);
        g.drawLine(650, 280, 650, 265);
        g.setColor(Color.black);
        g.drawLine(705, 280, 650, 265);
        
    }
}
