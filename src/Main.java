public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("Задача № 1");
        short age = 31;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача № 2");
        byte degree = 6;
        if (degree >= 5) {
            System.out.println("На улице " + degree + " градусов, сегодня тепло, можно идти без шапки.");
        } else {
            System.out.println("На улице " + degree + " градусов, холодно, нужно надеть шапку.");
        }

        System.out.println("Задача № 3");
        short speed = 70;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, превышения скорости нет, можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, скорость первышена, придётся заплатить штраф.");
        }

        System.out.println("Задача № 4");
        short years = 25;
        if (years >= 2 && years <= 6) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад.");
        } else if (years >= 7 && years <= 17) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу.");
        } else if (years >= 18 && years <= 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему ему место в университете.");
        } else if (years > 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему пора ходить на работу.");
        }

        System.out.println("Задача № 5");
        byte child = 7;
        if (child < 5) {
            System.out.println("Если возраст ребёнка равен " + child + ", то он не может кататься на аттракционе.");
        }
        if (child >= 5 && child < 14) {
            System.out.println("Если возраст ребёнка равен " + child + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (child >= 14) {
            System.out.println("Если возраст ребёнка равен " + child + ", то он может кататься на аттракционе.");
        }

        System.out.println("Задача № 6");
        byte numberOfPassengers = 70;
        byte totalCapacity = 102;
        byte seatingArea = 60;
        if (numberOfPassengers < seatingArea) {
            System.out.println("В вагоне есть места, еще остались сидячие.");
        } else if (numberOfPassengers < totalCapacity) {
            System.out.println("В вагоне есть места, но остались только стоячие.");
        } else {
            System.out.println("Мест нет!");
        }

        System.out.println("Задача № 7");
        long one = 135646545156165L;
        long two = 878945615165L;
        long three = 2615648484848548L;
        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("Наибольшее число " + two);
            } else {
                if (three > two && three > one) {
                    System.out.println("Наибольшее число " + three);
                }
            }


        }
    }
}