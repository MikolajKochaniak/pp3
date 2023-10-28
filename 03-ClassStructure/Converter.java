public class Converter {

    static double celciusFinal;
    static double fahrenheitFinal;
    void celsiusToFahrenheit(double celsius) {
        fahrenheitFinal = (celsius * 9 / 5) + 32;
    }
    void fahrenheitToCelsius(double fahrenheit) {
        celciusFinal =  (fahrenheit - 32) * 5 / 9;
    }
}
