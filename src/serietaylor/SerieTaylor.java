package serietaylor;

/**
 * @author Miguel Ponce
 */
public class SerieTaylor {
/*
    Este programa resuelve una funcion trigonometrica senoidal, empleando una
    serie de Taylor, evaluada en la decimo tercera derivada, el valor de "x" es 
    estatico en el codigo de programacion y el resultado es mostrado en consola 
    con un valor decimal representado en radianes.
    */
    public static void main(String[] args) {
        Metodos metodo = new Metodos();
        int x= 1; 
        int signo=1;
        double resultado=0,calculo;
            for(int i=1;i<=13;i+=2){
            calculo= Math.pow (x, i) / (metodo.factorial(i) * (signo));
            signo = signo * (-1);
            resultado = resultado+calculo;
            }
            System.out.println("f("+x+") = "+resultado);
    }    
}
