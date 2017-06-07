/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmodelaburbuja;

/**
 *
 * @author rojo5
 */
public class AlgoritmoDeLaBurbuja {

    static int[] numeros = {10, 7, 21, 32, 4};

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ordenaNumeros(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    static public void ordenaNumeros(int[] numeros) {
        int numeroMayor;
        int numeroMenor;
        int chivato = 0;
        while (chivato < numeros.length) {
            for (int i = 0; i < numeros.length - 1; i++) {

                if (numeros[i] > numeros[i + 1]) {
                    numeroMayor = numeros[i];
                    numeroMenor = numeros[i + 1];
                    numeros[i] = numeroMenor;
                    numeros[i + 1] = numeroMayor;
                    chivato++;
                }

            }
        }
    }
}
