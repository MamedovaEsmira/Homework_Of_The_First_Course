public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        System.out.println("Задача № 2");
        var dog1 = dog + 4;
        System.out.println(dog1);
        var cat1 = cat + 4;
        System.out.println(cat1);
        var paper1 =paper +4;
        System.out.println(paper1);

        System.out.println("Задача № 3");
        var dog2 = dog - 3.5;
        System.out.println(dog2);
        var cat2 = cat - 1.6;
        System.out.println(cat2);
        var paper2 =paper - 7639;
        System.out.println(paper2);

        System.out.println("Задача № 4");
        var friend = 19;
        System.out.println(friend);
        var friend1 = friend + 2;
        System.out.println(friend1);
        var friend2 = friend1 / 7;
        System.out.println(friend2);

        System.out.println("Задача № 5");
        var frog = 3.5;
        System.out.println(frog);
        var frog1 = frog * 10;
        System.out.println(frog1);
        var frog2 = frog1 / 3.5;
        System.out.println(frog2);
        var frog3 = frog2 + 4;
        System.out.println(frog3);

        System.out.println("Задача № 6");
       var boxerWeight1 = 78.2;
       var boxerWeight2 = 82.7;
        System.out.println("Общий вес боксера "+(boxerWeight1+ boxerWeight2)+" кг");
        System.out.println("Разница веса двух боксеров "+(boxerWeight2 -boxerWeight1)+" кг");

        System.out.println("Задача № 7");
        System.out.println("Разница веса двух боксеров "+(boxerWeight2 -boxerWeight1)+" кг");
        System.out.println("Разница веса двух боксеров "+(boxerWeight2 % boxerWeight1)+" кг");

        System.out.println("Задача № 8");
        var totalTime=640;
        var time=8;
        var workers=totalTime/time;
        System.out.println("Всего работников в компании " +workers+ " человек");

        var workers1= workers+94;
        var totalTime1=workers1*time;
        System.out.println("Если в компании работает " +workers1+ ", то всего "
                +totalTime1+" часов работы может быть поделено между сотрудниками");
    }
}