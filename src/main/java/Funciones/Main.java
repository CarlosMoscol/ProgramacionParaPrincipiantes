package Funciones;

public class Main {
    public static void main(String[] args){
        int resultado;
        resultado = suma(20, 30);
        System.out.println("Total = " + resultado);

        Potato miPotato = new Potato();
        miPotato.QuitarBrazos();
        miPotato.QuitarBrazos();
        miPotato.QuitarBrazos();
        System.out.println("Total de brazos = " + miPotato.brazos);
    }

    // ways to pass parameters
    // 1. Pass by value
    public static int suma(int a, int b){
        return a + b;
    }
}

// 2. Pass by reference
class Potato{
    public int brazos = 0;

    public void QuitarBrazos(){
        this.brazos--;
    }
}
