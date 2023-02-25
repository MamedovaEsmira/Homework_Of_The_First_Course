public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int dog = 8;
        System.out.println("Значение переменной dog с типом int равно " + dog);
        byte cat = 21;
        System.out.println("Значение переменной cat с типом byte равно " + cat);
        short ping = 18;
        System.out.println("Значение переменной ping с типом short равно " + ping);
        long num = 56L;
        System.out.println("Значение переменной num с типом long равно " + num);
        float nums = 25.8f;
        System.out.println("Значение переменной nums с типом float равно " + nums);
        double number = 2581.6;
        System.out.println("Значение переменной number с типом double равно " + number);
        boolean IsAdult = cat >= 10;
        System.out.println("Значение переменной IsAdult с типом boolean равно " + IsAdult);
        char s =38;
        System.out.println("Значение переменной s с типом char равно " + s);

        System.out.println("Задача №2");
        float a = 27.12f;
        System.out.println(a);
        long b = 987_678_965_549L;
        System.out.println(b);
        double c =2.786;
        System.out.println(c);
        boolean d = false;
        System.out.println(d);
        char i = 569;
        System.out.println(i);
        int f = -159;
        System.out.println(f);
        short j = 27897;
        System.out.println(j);
        byte h = 67;
        System.out.println(h);

        System.out.println("Задача №3");
        int lP = 23;
        int aS = 27;
        int eA = 30;
        int totalLeaf = 480;
        int sheetsForEachStudent =  totalLeaf /(lP+aS+eA);
        System.out.println("На каждого ученика рассчитано "+sheetsForEachStudent+" листов бумаги");

         System.out.println("Задача №4");
         int bottles = 16;
         int time = 2;
         int productivityPerMinute =bottles/time;
         int twentyMinutes = 20;
        System.out.println("За "+twentyMinutes+" минут  машина произвела "+productivityPerMinute*twentyMinutes+" штук бутылок");
         int perDay = (24*60);
        System.out.println("За "+perDay+" минут  машина произвела "+productivityPerMinute*perDay+" штук бутылок");
        int inThreeDays = perDay *3;
        System.out.println("За "+inThreeDays +" минут машина произвела "+productivityPerMinute*inThreeDays+" штук бутылок");
        int month = perDay *30;
        System.out.println("За "+month+" минут машина произвела "+productivityPerMinute*month+" штук бутылок");

        System.out.println("Задача №5");
         int totalCansOfPaint=120;
         int whitePaint =2;
         int brownPaint = 4;
         int totalClass=totalCansOfPaint/(whitePaint+brownPaint);
         int totalWhitePaint=totalClass*whitePaint;
         int totalBrownPaint=totalCansOfPaint-totalWhitePaint;
        System.out.println("В школе, где "+totalClass+" классов, нужно "+totalWhitePaint+" банок белой краски и " +totalBrownPaint+" банок коричневой краски");

        System.out.println("Задача №6");
        int bananas = 5*80;
        int milk = 2*105;
        int iceCream = 2*100;
        int eggs = 4*70;
        int totalWeightProduct = bananas+milk+iceCream+eggs;
        float totalWeightProductKg = totalWeightProduct/1000F;
        System.out.println("Общий вес продуктов составляет "+totalWeightProductKg+"кг");

        System.out.println("Задача №7");
        int totalWeight = 7*1000;
        int firstOption = 250;
        int secondOption = 500;
        int howManyDaysFirstOption = totalWeight/firstOption;
        System.out.println( howManyDaysFirstOption+" дней уйдет на похудение, если спортсмен будет терять по "+firstOption+" грамм в день");
        int howManyDaysSecondOption = totalWeight/secondOption;
        System.out.println(howManyDaysSecondOption +" дней уйдет на похудение, если спортсмен будет терять по "+secondOption+" грамм в день");
        int averageValue=(howManyDaysFirstOption+howManyDaysSecondOption)/2;
        System.out.println("В среднем  на похудение уйдет "+ averageValue+" дней");

        System.out.println("Задача №8");
        int price = 10;
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float mashaNewPrice =mashaSalary * price/100f;
        float mashaNewSalary =mashaSalary+mashaNewPrice;
        float mashaBeforeYearSalary = mashaSalary*12f;
        float mashaNewYearSalary = mashaNewSalary *12f;
        float mashaDifferenceYearSalary =mashaNewYearSalary-mashaBeforeYearSalary;
        System.out.println("Маша теперь получает "+ mashaNewSalary +" годовой доход вырос на "+ mashaDifferenceYearSalary);
        float denisNewPrice =denisSalary * price/100f;
        float denisNewSalary =denisSalary+denisNewPrice;
        float denisBeforeYearSalary = denisSalary*12f;
        float denisNewYearSalary = denisNewSalary *12f;
        float denisDifferenceYearSalary =denisNewYearSalary-denisBeforeYearSalary;
        System.out.println("Денис теперь получает "+denisNewSalary+" годовой доход вырос на "+denisDifferenceYearSalary);
        float kristinaNewPrice =kristinaSalary * price/100f;
        float kristinaNewSalary =kristinaSalary+kristinaNewPrice;
        float kristinaBeforeYearSalary = kristinaSalary*12f;
        float kristinaNewYearSalary = kristinaNewSalary *12f;
        float kristinaDifferenceYearSalary =kristinaNewYearSalary-kristinaBeforeYearSalary;
        System.out.println("Кристина теперь получает "+kristinaNewSalary+" годовой доход вырос на "+kristinaDifferenceYearSalary);
    }

}