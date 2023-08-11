public class Main {
    public static void main(String[] args) {
        double[] numbers = {4.5, 3.4, -6.4, 3.7, 38.3, 6.8, 7.6, 8.4, -8.8, 9.3, 7.6, 0.7, -5.6, -8.3, 9.3};

        double result = 0;
        int quantity = 0;
        boolean negativeNumber = false;

        for (double number : numbers) {
            if (negativeNumber && number > 0) {
                    result += number;
                    quantity++;
            }else if (number < 0) {
                negativeNumber = true;
            }
        }
        if (quantity > 0) {
            double arithmeticMean = result / quantity;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + arithmeticMean);
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            double temporaryValue = numbers[minIndex];
            numbers[minIndex] = numbers[i];
            numbers[i] = temporaryValue;
        }

        System.out.print("Отсортированный массив: ");
        for (double number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}