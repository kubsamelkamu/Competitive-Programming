class Solution {
    public double[] convertTemperature(double celsius) {
         if (celsius < 0 || celsius > 1000) {
            throw new IllegalArgumentException("Celsius temperature must be between 0 and 1000");
        }

        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32;
        return new double[]{kelvin, fahrenheit};
    }
}