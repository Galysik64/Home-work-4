public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний.");
        }
        int ageTwoMen = 14;
        if (ageTwoMen < 18) {
            System.out.println("Если возраст человека равен " + ageTwoMen + " он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задание 2");
        int cold = 0;
        if (cold <= 5) {
            System.out.println("На улице " + cold + " градусов, нужно надеть шапку.");
        }
        int warm = 11;
        if (warm > 5) {
            System.out.println("На улице " + warm + " градусов, можно идти без шапки.");
        }

        System.out.println("Задание 3");
        int speedDriver1 = 77;
        if (speedDriver1 > 60) {
            System.out.println("Если скорость " + speedDriver1 + ", то придется заплатить штраф.");
        }
        int speedDriver2 = 58;
        if (speedDriver2 <= 60) {
            System.out.println("Если скорость " + speedDriver2 + ", то можно ездить спокойно.");
        }

        System.out.println("Задание 4");
        int child = 5;
        if (child >= 2 && child <= 6) {
            System.out.println("Если возраст человека равен " + child + ", то ему нужно ходить в детский сад.");
        }
        int schoolboy = 11;
        if (schoolboy >= 7 && schoolboy <= 17) {
            System.out.println("Если возраст человека равен " + schoolboy + ", то ему нужно ходить в школу.");
        }
        int student = 22;
        if (student >= 18 || student <= 24) {
            System.out.println("Если возраст человека равен " + student + ", то ему нужно ходить в университет.");
        }
        int worker = 27;
        if (worker > 24) {
            System.out.println("Если возраст человека равен " + worker + ", то ему нужно ходить на работу.");
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
        if(teenager > 14){System.out.println("Если возвраст ребенка " + teenager + ", то можно кататься на аттракционе без сопровождения взрослого.");
        }


        System.out.println("Задание 6");



        }

    }