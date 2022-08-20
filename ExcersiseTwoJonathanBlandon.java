import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExcersiseTwoJonathanBlandon{
    public static void main (String args[]){
        Scanner read= new Scanner(System.in);
        String textStringOne="", textStringTwo="";
        
        int status=1;
        do{//do while loop to the users can select from the menu, what action want to do, more than once.
            int optionSelected =Integer.parseInt(JOptionPane.showInputDialog(
            "MENÚ DE OPCIONES \n"+
            "1: Leer Frase 1 \n" +
            "2: Leer Frase 2 \n" +
            "3: Imprimir Ambas Frases \n" +
            "4: Convertir a Mayúsculas \n" +
            "5: Convertir a Minúsculas \n" +
            "6: Comparar Si Ambas Frases son Iguales \n" +
            "7: Busca Una Palabra En la Frase \n" +
            "8: Salir. " +
            "¿Cual opcion desea realizar?"));
            switch(optionSelected){
                case 1:
                //leer frase 1
                do{
                    textStringOne=(JOptionPane.showInputDialog("Escriba Una Frase Correcta, Max. 25 Carácteres, Por Favor: "));
                }while(textStringOne.length()>25);

                break;
                case 2:
                //leer frase 2
                do{
                    textStringTwo=(JOptionPane.showInputDialog("Escriba Una Frase Correcta, Max. 25 Carácteres, Por Favor: "));
                }while(textStringTwo.length()>25);
                break;
                case 3:
                //imprimir ambas frases
                System.out.println("\nFrase 1: "+ textStringOne);
                System.out.println("Frase 2: "+ textStringTwo);
                break;
                case 4:
                //Convertir a Mayúsculas
                int textChoosed =Integer.parseInt(JOptionPane.showInputDialog(" Cual Frase Desea Modificar, [1|2] "));
                // if the user choose one, the phrase one is modified to UpperCase.
                if(textChoosed==1){
                    textStringOne=textStringOne.toUpperCase();
                    System.out.println("\n"+textStringOne);
                    //else if the user choose one, the phrase one is modified to UpperCase.
                }else if(textChoosed==2){
                    textStringTwo=textStringTwo.toUpperCase();
                    System.out.println(textStringTwo);
                }
                break;
                case 5:
                //Convertir a Minúsculas
                textChoosed =Integer.parseInt(JOptionPane.showInputDialog(" Cual Frase Desea Modificar, [1|2] "));
                if(textChoosed==1){
                    textStringOne=textStringOne.toLowerCase();
                    System.out.println("\n"+textStringOne);
                }else if(textChoosed==2){
                    textStringTwo=textStringTwo.toLowerCase();
                    System.out.println(textStringTwo);
                }

                break;
                case 6:
                //Comparacion de strings
                boolean result= textStringOne.equals(textStringTwo);
                if(result== true){
                    System.out.println("\nAmbas Frases son Iguales.");
                }else if(result==false){
                    System.out.println("\nLas Frases No Son Iguales.");
                }
                break;
                case 7:
                //Busca una SubCadena y devuelse si esta existe en la frase.
                String findTheString = JOptionPane.showInputDialog("Cual Palabra Desea Buscar? ");
                textChoosed =Integer.parseInt(JOptionPane.showInputDialog(" En ual Frase Desea Buscar la Subcadena? , [1|2] "));
                if(textChoosed==1){
                    int index = textStringOne.indexOf(findTheString);
                    System.out.println("La Subcadena Seleccionada Sí Existe En La Cadena Principal.");
                }else if(textChoosed==2){
                    int index = textStringTwo.indexOf(findTheString);
                    System.out.println("La Subcadena Seleccionada No Existe En La Cadena Principal.");
                }
                break;
                case 8:
                //salir del menú.
                status=0;
                break;

            }
        }while(status==1);





    }

}