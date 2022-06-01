package EjercicioTema4;

public class Main {
    public static void main(String[] args){
        System.out.println("Condicional if");
        int numeroIf = 0;
        if(numeroIf == 0){
            System.out.println("El numero es cero");
        }else if (numeroIf < 0){
            System.out.println("El " + numeroIf + " es negativo");

        }else{
            System.out.println("El " + numeroIf + " es positivo");
        }

        System.out.println("\nLoop While");
        int numeroWhile = -5;
        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        System.out.println("\nLoop Do while");
        int numeroDoWhile = 0;
        do {
            numeroDoWhile = numeroDoWhile + 1;
            System.out.println(numeroDoWhile);
        }while (numeroWhile < 1);

        System.out.println("\nLoop for");
        for(int numeroFor = 0; numeroFor < 3; numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }

        System.out.println("\nSwitch");
        var estacion = "INVIERNO";
        switch (estacion){
            case "VERANO":
                System.out.println("Estamos en la estacion de Verano");
                break;
            case "INVIERNO":
                System.out.println("Estamos en la estacion de Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en la estacion de Primavera");
                break;
            case "OTOÑO":
                System.out.println("Estamos en la estacion de Otoño");
                break;
            default:
                System.out.println("Estoy en default");
        }
    }
}
