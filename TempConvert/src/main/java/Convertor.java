public class Convertor {

    public Convertor (double num) {

    }

    public double celciumToFahrenheit (double c) {
        double f = c*1.8 + 32;
        return f;
    }

    public double celciumToKalvin (double c) {
        double k = c + 273.15;
        return k;
    }

    public double fahrenheitToCelcium (double f) {
        double c = (f-32)/1.8;
        return c;
    }

    public double fahrenheitToKalvin (double f) {
        double k = ((f-32)/1.8) + 273.15;
        return k;
    }

    public double kalvinToCelcium (double k) {
        double c = k - 273.15;
        return c;
    }

    public double kalvinToFahrenheit (double k) {
        double f = (k-173.15)*1.8 + 32;
        return f;
    }
}

