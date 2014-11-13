package deporte;
public class Salud {
	/**
         * Calcula la frecuencia máxima cardiaca en funcion de la edad y del sexo
         * del individuo. Para ello hace uso de los métodos calcularFCMHombre y 
         * calcularFCMMujer, que están por completar.
         * @param edad edad del individuo.
         * @param sexo caracter que indica el sexo del individuo. Si es el carácter 'H'
         * calcula la FCM de un hombre y si es distinto de 'H', de una mujer.
         * @return la Frecuencia Cardiaca Máxima.
         */
	public static int calcularFCM(int edad, char sexo){
            //Este método ya está implementado. No se debe modificar
            if (sexo == 'H') return calcularFCMHombre(edad);
            else return calcularFCMMujer(edad);
	}
	
	public static int calcularFCMHombre(int edad){
            //Completar
            int fcmH = (220-edad);
            return fcmH;
	}
      
	public static int calcularFCMMujer(int edad){
            //Completar
            int fcmM = (226-edad);           
            return fcmM;
	}
	/** Calcula la FCE(frecuencia cardíaca de Esfuerzo) en función de la FCM, FCR
         * y el porcentaje de esfuerzo que se quiere obtener. 
         * Para ello hace uso del método calcularFCE.
         * 
         * @param fcm frecuencia cardiaca máxima, calculada con la edad y el sexo.
         * @param fcr frecuencia cardiaca en reposo facilitada por el individuo.
         * @param porcentajeEsfuerzo estos son los pocentajes de esfuerzo relacionados con la actividad del individuo
         * @return la Frecuencia cardíaca de esfuerzo(fce)
         */
	public static double calcularFCE( int edad, char sexo, int fcr, double porcentajeEsfuerzo){
            //Completar
            int fcm = calcularFCM(edad,sexo);
            double fce =(fcm-fcr)*(porcentajeEsfuerzo/100) + fcr;
           fce = Math.round(fce);
            return fce;
            
	}
        /**Calcula el IMC en función del peso y la estatura del individuo.
         * 
         * @param peso peso del individuo en KG.
         * @param estatura Altura del individuo en Metros.
         * @return Indice de masa corporal(imc).
         */
        public static double calcularIMC(double peso, double estatura){
            //Completar
            //Scanner tec = new Scanner(System.in);
           // System.out.println("Introduce peso: ");
            double imc = (peso/(estatura*estatura));
            imc = imc*10;
            imc = Math.round(imc);
            imc = imc/10;
                   
            return imc;
        }
}
