package EjercicioTema3;

public class Main {
    public static void main(String[] args){
        // One part
        int resultado = suma(20, 30, 50);
        System.out.println("suma total = " + resultado);

        // Two Part
        coche miCoche = new coche();
        miCoche.AgregarPuertas();
        System.out.println("Total de puertas = " + miCoche.numeroPuertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class coche{
    public int numeroPuertas = 0;

    public void AgregarPuertas(){
        this.numeroPuertas++;
    }
}
