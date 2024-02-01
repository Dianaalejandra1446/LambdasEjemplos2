import java.util.function.Supplier;

//En este ejemplo no tenemos ningun argumento

public class SupplierEjm {
    public static void main(String[] args) {

        //No toma ningún argumento y produce un resultado.
        Supplier <Integer> suma = () -> 3 + 2;
        Supplier <Double> randomnNumerSupplier = () -> Math.random();

        double randomNumber = randomnNumerSupplier.get();
        System.out.println("Numero aleatorio: "+ randomNumber);
        
        int sumaRta = suma.get();
        System.out.println("Resultado suma: "+suma.get());

    }
}
