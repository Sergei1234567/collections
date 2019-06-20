package ua.com.collections.parameterized.and.typed.containers;
//добавление и извлечение обьектов

import java.util.ArrayList;

    class Apple {
        private static int counter;
        private int id = counter++;

        public int counterId() {
            return id;
        }

        public static void main(String[] args) {
            ArrayList<Apple> apples = new ArrayList<>();
            ArrayList<Orange> oranges = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                apples.add(new Apple());
                oranges.add(new Orange(i));
            }
            for (int i = 0; i < apples.size(); i++) {
                System.out.println(apples.get(i).counterId());

            }
            for (Orange orange : oranges) {
                System.out.println(orange.countId());
            }
        }
    }

    class Orange {
        private int count;
        private int id = count++;

        public Orange(int count) {
            this.count = count;
        }

        public int countId() {
            return id;
        }
    }
