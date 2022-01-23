package converter;

import java.util.Scanner;

public class Main {

    public static void test1(){
        Scanner scanner = new Scanner(System.in);
//        String text = "";
//         while (true) {
//             text = scanner.nextLine();
//             if (text.equalsIgnoreCase("Q")) {
//                 System.out.println("Exit: " + text);
//                 break;
//             }
//             else {
//                 System.out.println("You enter line: " + text);
//             }
//        }

//        String text = "";
//        while (!text.equalsIgnoreCase("Q")) {
//            text = scanner.nextLine();
//            System.out.println("You enter line: " + text);
//        }


        String text = "";
        do{
            text = scanner.nextLine();
            System.out.println("You enter line: " + text);
        }while  (!text.equalsIgnoreCase("Q"));
        System.out.println("End ");

    }




    public static void simple1() {

        String inputbase1 = "16";
        int base1 = Integer.parseInt(inputbase1);

        Integer number = Integer.parseInt("12", base1); //  "12" в 16-ой  ---> 18 в 10-ую
//        Integer number1 = Integer.parseInt("1010", 2); //  number1 = 10 (в 10-ой)

        String answer = Integer.toString(number, 2); // 18 в 10-ой --> "10010" в 2-ой

        System.out.println(answer); // answer = "10010"


    }

 // 0011 = 00000011 = 11

    public static void main(String[] args) {
        //simple1();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ввести исходное число");
            String numberString = scanner.nextLine();
            if (numberString.equalsIgnoreCase("Q")) {
                break;
            }

            System.out.println("номер системы исчисления исходного числа");
            String baseFromString = scanner.nextLine();
            if (baseFromString.equalsIgnoreCase("Q")) {
                break;
            }

            System.out.println("номер системы исчисления числа которое нужно получить при конвертации");
            String baseToString = scanner.nextLine();
            if (baseToString.equalsIgnoreCase("Q")) {
                break;
            }

            int baseFrom = Integer.parseInt(baseFromString); // "16" => 16
            Integer number = Integer.parseInt(numberString, baseFrom); //  "12" => 18, число numberString в системе счисления - baseFrom)

            int baseTo = Integer.parseInt(baseToString); // "2" => 2 Integer.parseInt - конвертирует строку   в десятиричную систему счисления
            String answer = Integer.toString(number, baseTo); // number - число, которое конвертируем в baseTo

            System.out.println("Answer: " + answer); // 10100

        }
        // 18(in10) = 12(in16) = 10100(in2)


    }
}
