
import javax.swing.JOptionPane;


import javax.swing.*;
import java.beans.JavaBean;



class main{


     public static void main  (String[] args) {


          String placa;
          String nombre;
          double horaInicio,horasalida,valor1,resta1,valor2,vehiculo;
          int moto=1000,carro=2000;


          JOptionPane.showInternalMessageDialog(null,"Bienvenidos al parqueadero");
          vehiculo =Integer.parseInt(JOptionPane.showInputDialog ("escriba el 1 si su vehiculo es un moto o el 2 si es un carro"));
          placa =JOptionPane.showInputDialog(" ingrese la placa del vehiculo:");
          nombre = JOptionPane.showInputDialog(" ingrese el nombre del conductor:");

          horaInicio = java.lang.Double.parseDouble(JOptionPane.showInputDialog("ingrese la hora de llegada:"));



          JOptionPane.showInternalMessageDialog(null,"su nombre es: " + nombre
                  +"          su placa es: "+placa
                  + "     su hora de entrada es: " + horaInicio);

          horasalida =  java.lang.Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la hora de salida: "));


          /*if (vehiculo==1){
               resta1 = horasalida - horaInicio;

               double numero = resta1;
               long resultado = Math.round( numero );

               valor2 = resultado*moto;

               JOptionPane.showInternalMessageDialog(null,"el valor a pagar es: " + valor2);

               JOptionPane.showInternalMessageDialog(null,"horas que estuvo en el parqueadero: " + resultado);}


          else {
               resta1 = horasalida - horaInicio;

               double numero = resta1;
               long resultado = Math.round( numero );

               valor2 = resultado *carro;

               JOptionPane.showInternalMessageDialog(null,"el valor a pagar es:" + valor2);

               JOptionPane.showInternalMessageDialog(null,"horas que estuvo en el parqueadero:" + resultado);}*/

          switch ((int) vehiculo){
               case 1:
                    resta1 = horasalida - horaInicio;

                    double numero = resta1;
                    long resultado = Math.round( numero );

                    valor2 = resultado*moto;

                    JOptionPane.showInternalMessageDialog(null,"el valor a pagar es: " + valor2);

                    JOptionPane.showInternalMessageDialog(null,"horas que estuvo en el parqueadero: " + resultado);
                    break;
               case 2:
                    resta1 = horasalida - horaInicio;

                    double numer = resta1;
                    long resultad = Math.round( numer );

                    valor2 = resultad*carro;

                    JOptionPane.showInternalMessageDialog(null,"el valor a pagar es: " + valor2);

                    JOptionPane.showInternalMessageDialog(null,"horas que estuvo en el parqueadero: " + resultad);
                    break;


               default: JOptionPane.showInternalMessageDialog(null, "no aceptamos ese tipo de vehiculos");











          }


    }
}