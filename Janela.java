import java.awt.Frame;
import java.awt.Label;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Janela {
      public Janela(double[][] x, double[][] y, double[][] z, double[][] w) 
{
            exibe janela = new exibe( x, y, z, w);
            
            janela.setTitle("Graficos Resultados");
            janela.setSize(800,300);
            janela.setResizable(false);
            janela.setVisible(true);             
            }
      public void main() {}

@SuppressWarnings("serial")
public static class exibe extends JFrame implements WindowListener{
     
      
      // Declaração dos objetos que representarão cada componentes da janela
      public exibe(double[][] x, double[][] y, double[][] z, double[][] w) 
                  { 
            // 1) Instanciando os componentes
            
            JTextArea result = new JTextArea("resultados em segundos:");
            
            JTextArea order1 = new JTextArea("vetor aleatorio");
            JTextArea order2 = new JTextArea("vetor já ordenado crescente");
            JTextArea order3 = new JTextArea("vetor já ordenado decreascente");
            
            JTextArea buble1 = new JTextArea("tempo BubleSort: "+z[0][0] + " |"+z[0][1] +" |"+z[0][2] );
            JTextArea buck1 = new JTextArea("tempo BucketSort: "+y[0][0] + " |"+y[0][1] +" |"+y[0][2] );
            JTextArea ins1=new JTextArea("tempo insertionSort:"+x[0][0] + " |"+x[0][1] +" |"+x[0][2] );
            JTextArea sel1=new JTextArea("tempo SelectionSort:"+w [0][0] + " |"+w[0][1] +" |"+w[0][2] );
            
            JTextArea buble2 = new JTextArea("tempo BubleSort: "+z[1][0] + " |"+z[1][1] +" |"+z[1][2] );
            JTextArea buck2 = new JTextArea("tempo BucketSort: "+y[1][0] + " |"+y[1][1] +" |"+y[1][2] );
            JTextArea ins2=new JTextArea("tempo insertionSort:"+x[1][0] + " |"+x[1][1] +" |"+x[1][2] );
            JTextArea sel2= new JTextArea("tempo SelectionSort:"+w[1][0] + " |"+w[1][1] +" |"+w[1][2] );
            
            JTextArea buble3=  new JTextArea("tempo BubleSort: "+z[2][0] + " |"+z[2][1] +" |"+z[2][2] );
            JTextArea buck3 = new JTextArea("tempo BucketSort: "+y[2][0] + " |"+y[2][1] +" |"+y[2][2] );
            JTextArea ins3=new JTextArea("tempo insertionSort:"+x[2][0] + " |"+x[2][1] +" |"+x[2][2]);
            JTextArea sel3=new JTextArea("tempo SelectionSort:"+ w[2][0] + " |"+w[2][1] +" |"+w[2][2] );
            

            // 2) Definindo valores e propridades para os elementos
            
            result.setEditable(false);
            
            order1.setEditable(false);
            buble1.setEditable(false);
            buck1.setEditable(false);
            ins1.setEditable(false);
            sel1.setEditable(false);
            
            order2.setEditable(false);
            buble2.setEditable(false);
            buck2.setEditable(false);
            ins2.setEditable(false);
            sel2.setEditable(false);
            
            order3.setEditable(false);
            buble3.setEditable(false);
            buck3.setEditable(false);
            ins3.setEditable(false);
            sel3.setEditable(false);
            
      
            // XXXXXX.setBounds(x,y,width,height)
            result.setBounds   (30,10,250,20);//titulo
            
            order1.setBounds     (30,40,250, 20);
            
            buble1.setBounds   (30,80,250, 20);
            buck1.setBounds    (30,100,250,20);
            ins1.setBounds     (30,120,250,20);
            sel1.setBounds     (30,140,250,20);

            order2.setBounds     (290,40,250, 20);
            
            buble2.setBounds   (290,80,250, 20);
            buck2.setBounds    (290,100,250,20);
            ins2.setBounds     (290,120,250,20);
            sel2.setBounds     (290,140,250,20);

            order3.setBounds      (550,40,250, 20);
            
            buble3.setBounds   (550,80,250, 20);
            buck3.setBounds    (550,100,250,20);
            ins3.setBounds     (550,120,250,20);
            sel3.setBounds     (550,140,250,20);


            // 3) Adicionando os elementos no container
            this.setLayout(null);
            this.add(result);
            
            this.add(order1);
            this.add(buble1);
            this.add(buck1);
            this.add(ins1);
            this.add(sel1);

            this.add(order2);
            this.add(buble2);
            this.add(buck2);
            this.add(ins2);
            this.add(sel2);

            this.add(order3);
            this.add(buble3);
            this.add(buck3);
            this.add(ins3);
            this.add(sel3);
            
            
            // 4) Delegando os responsáveis pelo tratamento dos eventos ...
            this.addWindowListener(this);            // da janela
      
      }
 
     
      public void windowActivated(WindowEvent we) { }
      public void windowClosed(WindowEvent we) { }
      public void windowDeactivated(WindowEvent we) { }
      public void windowDeiconified(WindowEvent we) { }
      public void windowIconified(WindowEvent we) { }
     
      public void windowOpened(WindowEvent we) {
            Dimension tamTela = Toolkit.getDefaultToolkit().getScreenSize();
            Dimension tamJanela = this.getSize();
            this.setLocation( (tamTela.width - tamJanela.width) / 2, (tamTela.height - tamJanela.height) / 2 );
            }          
      public void windowClosing(WindowEvent we) {
            System.exit(0);
            }
      }
}