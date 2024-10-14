public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задание 2");
        int weather = 0;
        if (weather < 5) {
            System.out.println("На улице " + weather + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + weather + " градусов, можно идти без шапки.");
        }

        System.out.println("Задание 3");
        int speedDriver = 77;
        if (speedDriver > 60) {
            System.out.println("Если скорость " + speedDriver + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speedDriver + ", то можно ездить спокойно.");
        }

        System.out.println("Задание 4");
        int personAge = 5;
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад.");
        } else if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу.");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет.");
        } else if (personAge > 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить на работу.");
        } else { System.out.println("Не знаю куда его отправить.");
        }

        System.out.println("Задание 5");
        int baby = 3;
        if (baby < 5) {
            System.out.println("Если возвраст ребенка " + baby + ", то нельзя кататься на аттракционе.");
        }
        int boy = 7;
        if (boy > 5 && boy < 14) {
            System.out.println("Если возвраст ребенка " + boy + ", то можно кататься на аттракционе в сопровождении.");
        }
        int teenager = 16;
        if (teenager > 14) {
            System.out.println("Если возвраст ребенка " + teenager + ", то можно кататься на аттракционе без сопровождения взрослого.");
        }


        System.out.println("Задание 6");
        int totalPlaces = 102;
        int seatingPlaces = 60;
        int passengers = 62;
        if (passengers < seatingPlaces) {
            System.out.println("В вагоне есть сидячие места.");
        } else if (passengers < totalPlaces) {
            System.out.println("Поехать можно только стоя.");
        } else {
            System.out.println("Нет мест.");
        }
        System.out.println("Задание 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one >= two && one >= three){
            System.out.println("Число "+ one + " больше.");
        }
        else if (two >= one && two >= three) {
            System.out.println("Число "+ two + " больше.");
        }
        else { System.out.println("Число "+ three + " больше.");}



        }

    }