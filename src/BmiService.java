public class BmiService {
    public int calculate(double weightKilogram, double heightMetre) {
        double doubleResult = weightKilogram / Math.pow(heightMetre, 2);
        int result = (int) doubleResult;
        return result;
    }
}

// ИМТ = вес в килограммах / квадрат роста в метрах
