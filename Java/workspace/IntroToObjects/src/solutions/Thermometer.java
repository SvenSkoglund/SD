package solutions;

public class Thermometer {
  public char scale;
  public double currentTemp;

  public double getTempAsCelsius() {
    double result;
    if (scale == 'C') {
      result = currentTemp;
    }
    else {
      result = (currentTemp - 32) / 1.8;
    }

    return result;
  }

  public double getTempAsFahrenheit() {
    double result;
    if (scale == 'C') {
      result = currentTemp * 1.8 + 32;
    }
    else {
      result = currentTemp;
    }
    return result;
  }
}
