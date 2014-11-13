
package ecuacion;

import java.util.*;
public class Ecuacion {
    public static void main(String[]args) {
        
        Scanner tec =new Scanner(System.in).useLocale(Locale.US);
        
        double varA, varB, varC;
        
        //
        if(args.length == 3){
            varA = Double.parseDouble(args[0]);
            varB = Double.parseDouble(args[1]);
            varC = Double.parseDouble(args[2]);
            
        }else{
            if(args.length != 0)
                System.out.println("Los datos proporcionados al programa son insuficientes. \n Uso: Ecuacion coeficiente_a coeficiente_b coeficiente\n" );
           
            System.out.println("Introduzca el valor de 'a': ");
            varA= tec.nextDouble();

            System.out.println("Introduzca el valor de 'b': ");
            varB= tec.nextDouble();

            System.out.println("Introduzca el valor de 'c': ");
            varC= tec.nextDouble();
           
        }
        
             double suma = ((-varB) + (Math.sqrt(calcularDiscriminante(varA, varB, varC)))) / (2 * varA);
             
             double resta = ((-varB) - (Math.sqrt(calcularDiscriminante(varA, varB, varC)))) / (2 * varA);
             
             double imaginario = Math.sqrt(calcularDiscriminante(varA, varB, varC)*(-1))/ 2 * varA ;
        
             double real = (-varB) / 2 * varA;
             //sentencias if indicando las posibles soluciones a la ecuación propuesta
         if(varA == 0 && varB == 0 && varC == 0)System.out.println("La ecuación tiene infinitas soluciones.");  
         
            else if(varA == 0 && varB == 0 && varC != 0)System.out.println("Ecuación incorrecta.");
         
                else if(varA == 0 && varB != 0 && varC != 0)System.out.println("Es una ecuación de primer grado con solución x = " + (-varC / varB));
         
                    else if(varA != 0){
             
                        if(calcularDiscriminante(varA, varB, varC) == 0)System.out.println("La solución es x = " + real);
                          
                            if(calcularDiscriminante(varA, varB, varC) > 0)System.out.println("Las soluciones son x1 = " + suma + " y x2 = " + resta);

                                 else if(calcularDiscriminante(varA, varB, varC) < 0)System.out.println("Las soluciones son x1 = " + real + " + " + imaginario + "i y x2 = " + real + " - " + imaginario + "i");
                                 
                    }
         }
    
     
    /**
     * El método calcula el discriminante de la ecuación
     * @param varA número por el que se multiplica  la variable elevada al cuadrado
     * @param varB número por el que se multiplica la variable 
     * @param varC número real llamado término independiente
     * @return el resultado del cálculo de la variable discriminante
     */
    public static double calcularDiscriminante (double varA,double varB, double varC){
        
             double discriminante = Math.pow(varB, 2)-4*varA*varC;
     
                        return discriminante;
    }
}
    

