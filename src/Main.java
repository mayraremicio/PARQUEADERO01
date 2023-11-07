import javax.swing.JOptionPane;


import javax.swing.*;
import java.beans.JavaBean;



class main{


    public static void main  (String[] args) {


        double opci=0;

        double resta1, valor2=0, valor2c=0, resta1c;
        String salida="", salidac="";
        int placa[]=new int[4];
        int hora1[]=new int[4];
        int hora2[]=new int[4];
        int mostrar[]=new int[8];

        int placac[]=new int[4];
        int hora1c[]=new int[4];
        int hora2c[]=new int[4];
        int mostrarc[]=new int[8];


        JOptionPane.showMessageDialog(null, "bienvenido a nuestros parqueaderos");

        while (opci != 4) {
            opci=Integer.parseInt(JOptionPane.showInputDialog("1.ingresar moto 2.ingresar carro 3.mostrar 4.salir"));
            switch ((int)opci) {
                case 1:


                    for (int i=1; i < 4; i++) {
                        placa[i]=Integer.parseInt(JOptionPane.showInputDialog(" INGRESE LA PLACA  " + i));
                    }
                    for (int i=1; i < 4; i++) {
                        hora1[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese la hora de entrada  " + i));
                    }
                    for (int i=1; i < 4; i++) {
                        hora2[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese la hora de salida  " + i));
                    }


                    break;

                case 2:


                    for (int i=1; i < 4; i++) {
                        placac[i]=Integer.parseInt(JOptionPane.showInputDialog(" INGRESE LA PLACA  " + i));
                    }
                    for (int i=1; i < 4; i++) {
                        hora1c[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese la hora de entrada  " + i));
                    }
                    for (int i=1; i < 4; i++) {
                        hora2c[i]=Integer.parseInt(JOptionPane.showInputDialog("ingrese la hora de salida  " + i));

                    }

                    break;

                case 3:

                    for (int i=1; i < 4; i++) {

                        resta1=hora2[i] - hora1[i];
                        double numero=resta1;
                        long resultado=Math.round(numero);

                        valor2=resultado * 1000;


                        resta1c=hora2c[i] - hora1c[i];
                        double numeroc=resta1c;
                        long resultadoc=Math.round(numeroc);

                        valor2c=resultadoc * 2000;


                        JOptionPane.showMessageDialog(null, "DATOS DE MOTOS \n" + " placas de moto : " + (placa[i] + "    hora de entrada  :  " + hora1[i] + "   hora de salida  : " + hora2[i] + "\n valor a pagar  " + valor2));


                    }

                    for (int i=1; i < 4; i++) {

                        resta1c=hora2c[i] - hora1c[i];
                        double numeroc=resta1c;
                        long resultadoc=Math.round(numeroc);

                        valor2c=resultadoc * 2000;

                        JOptionPane.showMessageDialog(null, "DATOS DE CARROS \n" + "placas de carro : " + (placac[i] + "   hora de entrada  :  " + hora1c[i] + "   hora de salida  : " + hora2c[i] + "\n valor a pagar 3" + valor2c));


                        break;

                    }
                case 4:
                    break;
            }


        }
    }
}






















