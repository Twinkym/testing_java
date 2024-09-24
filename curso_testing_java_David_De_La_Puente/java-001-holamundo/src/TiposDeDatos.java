public class TiposDeDatos {

    public static void main(String[] args) {
        System.out.println("Tipos de datos");
        System.out.println("int");
        System.out.println("float");
        System.out.println("double");
        System.out.println("boolean");
        System.out.println("char");
        System.out.println("String");

        // El tipo de dato String se define con comillas dobles.
        String cliente1 = "Alan Sastre";
        String direccion = "Calle prueba 1234";
        // El tipo de dato char se define con comillas simples.
        char grupo = 'A';

        // Números con decimales:
        float salario = 1432.55f; // Sufijo f para float.
        double salario1 = 1432.55; // Sufijo sin f para double.

        // Números de tipo entero:
        byte numeroCorto = 5; // 8 bits (1 byte)
        short numeroMedio = 10; // 16 bits (2 bytes)
        int edad = 30; // 32 bits (4 bytes)
        long distanciaPlanetaria = 1000000000000000L; // 64 bits (8 bytes) Sufijo l para long

        // Booleanos: los valores booleanos se pueden asignar a variables de tipo boolean.
        // El tipo boolean se define con la palabra reservada boolean.
        // Los valores booleanos valoran si una condición o estado es true o false.
        boolean esVerde = true;
        boolean esAmarillo = false;

        // Inferencia automática de tipos de datos.
        var cliente2 = "Marina Vallejo";
        var precioAlto = 6789;
        var precioConDecimales = 5500.43f;
        var claseTerminada = true;

        //
    }
}
