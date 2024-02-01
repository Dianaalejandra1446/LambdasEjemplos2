import java.util.function.Consumer;

public class ConsumerEjm {
    public static void main(String[] args) {
        
        Consumer<String> printMessage = message -> System.out.println("Mensaje: "+message);
    
        printMessage.accept("Hola habla Diana");

        
    }

    
}