import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите ваш вес(кг): ");
        double weight = input.nextDouble();

        System.out.println("Введите ваш рост(м): ");
        double height = input.nextDouble();

        System.out.println("Введите ваш возраст: ");
        double age = input.nextDouble();

        double imt = weight / (height * height);
        double idealweight = 24.9 * (height * height);
        double Calories = (weight * 10) + (height * 6.25) - (age * 5 + 5);

        if(imt > 24.9)
        {
            double ideal1weight = weight - idealweight;
            System.out.println("Рекомендуется меньше есть, так как вы привысили норму идеального веса. Идельный вес: " + idealweight + " кг. Рекомендуется похудеть на: " + ideal1weight + " кг. Рекомендуемый приём калорий: " + Calories + " кал.");
        } else if (imt < 18.5) {
            double ideal2weight = idealweight - weight;
            System.out.println("Вам стоит есть больше еды. Ваш идеальный вес: " + idealweight + " кг. Необходимо набрать: " + ideal2weight + " кг. Рекомендуемый приём калорий: " + Calories + " кал.");
        }
        else {
            System.out.println("Ваш вес в пределах нормы, поддерживайте свой рацион питания таким же. Идеальный вес: " + idealweight + " кг. Рекомендованный приём калорий: " + Calories + " кал.");
        }

        double HB = 655.1 + (9.6 * weight) + (1.85 * height) - (age * 4.68);
        System.out.println("Дневная норма калорий: " + HB + ".");
    }
}