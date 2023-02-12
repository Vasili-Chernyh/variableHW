public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var paper = 763789;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    private static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    private static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    private static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    private static void task6() {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weight2Man = boxer1 + boxer2;
        System.out.println("Вес двух бойцов " + weight2Man + " кг");
        var differenceWeight = boxer2 % boxer1;
        System.out.println("Разница в весе " + differenceWeight + " кг");
    }
    private static void task7() {
        System.out.println("Задача 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var differenceWeight1 = boxer2 % boxer1;
        System.out.println("Остаток от деления " + differenceWeight1);
        var differenceWeight2 = boxer2 - boxer1;
        System.out.println("Вычитание " + differenceWeight2);
    }
    private static void task8() {
        System.out.println("Задача 8");
        var totalWorkTime = 640;
        var manWorkTime = 8;
        var workers = totalWorkTime / manWorkTime;
        System.out.println("Всего работников в компании - " + workers + " человек");
        var workers2 = workers + 94;
        var manWorkTime2 = manWorkTime * workers2;
        System.out.println("Если в компании работает " + workers2 + " человек, то всего " + manWorkTime2 + " часов работы может быть поделено между сотрудниками");
    }
}