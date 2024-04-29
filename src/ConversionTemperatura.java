public class ConversionTemperatura {

    public static void main(String[] args) {

        double temperaturaCelsius = 25.5;
        double temperaturaFahrenheit = (temperaturaCelsius *1.8) + 32;

        String mensaje = String.format("La temperatura en Grados Celsius es de %.2f eso equivale a %.2f grados Fahrenheit", temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(mensaje);
    }
}
