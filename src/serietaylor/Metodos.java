package serietaylor;

/**
 * @author Miguel Ponce
 */
public class Metodos {

    /** Metodo para calcular el factorial
     * @param n variable del numero factorial
     * @return el valor del factorial
     */
    public long factorial(int n){
        long resultado = 1;
        if (n==0){
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }    
}
