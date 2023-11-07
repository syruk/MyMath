package tema2;

public class MyMath {
    public static double squarePerimeter(double squareSide) {
        double square = 0;
        if (squareSide >= 0) {
            square = squareSide * 4;

        }
        return square;
    }

    public static double squareArea(double squareSide){
        double square = 0;
        if (squareSide >= 0) {
            square = squareSide*squareSide;
        }
        return square;
    }
    public static double rectanglePerimeter(double rectangleHigh, double rectangleBase) {
        double rectangle = 0;
        if ( rectangleHigh<=0 || rectangleBase<=0) {
            rectangle=0;
        } else {
            rectangle = ((rectangleBase * 2) + (rectangleHigh * 2));
        }
        return rectangle;
    }
    public static double rectangleArea(double rectangleHigh, double rectangleBase) {
        double rectangle = 0;
        if (rectangleHigh<=0 || rectangleBase<=0) {
            rectangle=0;
        } else {
            rectangle = rectangleBase*rectangleHigh;
        }
        return rectangle;
    }
    public static double circlePerimeter(double circleRadius) {
        double circle = 0;
        if (circleRadius <= 0) {
            circle = 0;
        } else {
            circle = 2*Math.PI*circleRadius;
        }
        return circle;
    }
    public static double circleArea(double circleRadius) {
        double circle = 0;
        if (circleRadius <= 0) {
            circle = 0;
        } else {
            circle = Math.PI*(circleRadius*circleRadius);
        }
        return circle;
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isNotPrime(int number) {
        return !isPrime(number);
    }
    public static int figureCount (int number) {
        int figureCount = 0;
        if(number ==0) {
            figureCount=1;
        }
        while (number!=0) {
            number = number / 10;
            figureCount++;
        }
        return figureCount;
    }
    public static int evenFigureCount (int number) {
        int figureCountEven = 0;
        if (number == 0) {
            figureCountEven=1;
        } else {
        while (number != 0) {
            int figure = number % 10;
            if (figure % 2 == 0) {
                figureCountEven++;
            }
            number = number / 10;
        }}
        return figureCountEven;
    }
    public static int oddFigureCount (int number) {
        return figureCount(number) - evenFigureCount(number);
    }
    public static int factorial (int number) {
        int factorial = 1;
        if (number<0) {
            factorial=0;
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
        } return factorial;
    }
   /* public static long factorialRecursive(int number) {
        int factorial = 0;
        if (number < 0) {
            factorial = 0;
        } else if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorialRecursive(number - 1);
        }
        return number;
    }*/
    public static int quadraticEcuationSolutions (int number1, int number2, int number3) {
        double discriminante = number2 * number2 - 4 * number1 * number3;

        if (discriminante > 0) {
            return 2;
        } else if (discriminante == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static int figuresSumatory (int number) {
        int sumatory = 0;
        number = Math.abs(number);
        while (number > 0) {
            int digit = number % 10;
            sumatory += digit;
            number = number / 10;
        }
        return sumatory;
    }

}


