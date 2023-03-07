public class Main {
    public static void main(String[] args) {
        System.out.println("Задача№1");
        int age = 8;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил," +
                    " нужно немного подождать");
        }
        System.out.println("Задача№2");
        if (age >= 7 && age <= 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Человек уже закончил школу и может отправлятся в университет");
        } else if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println("Задача№3");
        int capacity = 80;
        int seating = 60;
        if (capacity<102 && seating <60) {
            System.out.println("В вагоне еще есть сидячие места");
        } else if
            (capacity < 102) {
            System.out.println("В вагоне еще остались стоячие места");
        }else {
            System.out.println("Вагон уже полностью забит!");
            }

        }
    }
