package serietaylor;

/**
 * @author Miguel Ponce
 */
public class SerieTaylor {

    public static void main(String[] args) {
        Metodos metodo = new Metodos();
            for(int i=1;i<=13;i+=2){
            System.out.println("factorial de "+i+" "+metodo.factorial(i));
            }
            for(int j=1;j<=7;j+=2){
            System.out.println("el exponente de "+j+" es " +metodo.exponente(j));
            }
    }    
}
