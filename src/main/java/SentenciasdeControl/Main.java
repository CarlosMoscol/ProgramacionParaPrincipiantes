package SentenciasdeControl;

public class Main {
    public static void main(String[] args) {

        /*
        String estacion = "invierno";
        System.out.println("Conditionals");
        if (estacion == "primavera") {
            System.out.println("Es primavera :)");
        } else if (estacion == "verano") {
            System.out.println("Es verano");
        } else {
            System.out.println("Es otra estacion :(");
        }*/



        /*
        int contador = 10;
        System.out.println("\nLoop while");
        while (contador > 0) {
            System.out.println(contador);
            contador = contador - 1;
        }
        */

        /*
        System.out.println("\nLoop do while");
        do{
            System.out.println(contador);
            contador = contador - 1;
        }while(contador > 5);
        */

        /*
        System.out.println("\nLoop for");
        for (int contador = 1; contador <= 10; contador = contador + 1){
            System.out.println(contador);
        }*/

        int valores[] = {10, 20, 30, 40, 50};

        for (int i = 0; i < valores.length; i++){
            System.out.println(valores[i]);
        }

        System.out.println("\nLoop Switch");
        var estacion = "VERANO";

        switch (estacion){
            case "VERANO":
                System.out.println("es verano");
                break;
            case "INVIERNO":
                break;
            default:
                System.out.println("estoy en default");
        }
    }
}
