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
    
    /**Metodo para calcular el exponente,numero impar 2n-1
     * @param n variable del exponente
     * @return el valor del exponente
     */
    public int exponente(int n){
        int operacion=1;
        for (int i=1; i<=n;i++){
         operacion= 2*i-1;
        }
        return operacion;
    }
}
