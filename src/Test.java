public class Test {
    public static void main(String[] args) {

        //Task1
        byte num = 1;
        short num1 = 2;
        int num2 = 1;
        long num3 = 2L;
        double num4 = 1.2;
        float num5 = 13f;
        char num6 = 21;
        boolean num7 = false;
        //Task2
        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;
        double sumWeight = boxerWeight1 + boxerWeight2;
        System.out.println("Вес боксеров = " + sumWeight+"кг");
        //Task3
        //вес в граммах
        //1 банан
        int bananaWeight = 80;
        //100 мл молока
        int milkWeight = 105;
        //1 брикет мороженного
        int iceCreamWeight = 100;
        //1 яйцо
        int eggWeight = 70;

        //смешиваем
        int sumWeightShake = 5*bananaWeight+2*milkWeight+2*iceCreamWeight+4*eggWeight;
        int sumInKG = sumWeightShake/1000;
        System.out.println("Сумма в граммах = "+sumWeightShake+". Сумма в кг = "+sumInKG);

        //Task4
        int purposePerDay1 = 250;
        int purposePerDay2 = 500;
        int totalResult1 = 7000;
        int countFor250 = 0;
        int countFor500 = 0;
        while (totalResult1 != 0) {
            totalResult1 -= purposePerDay1;
            countFor250++;
        }

        int totalResult2 = 7000;
        while (totalResult2 != 0) {
            totalResult2 -= purposePerDay2;
            countFor500++;
        }

        int avarageDay = (countFor500+countFor250)/2;

        System.out.println("Скольк нужно дней при похудении на 250 грамм в день: "+countFor250);
        System.out.println("Скольк нужно дней при похудении на 500 грамм в день: "+countFor500);
        System.out.println("Скольк нужно дней в среднем: "+avarageDay);

        //task5
        int percent = 10;
        double salaryInMounthMasha = 67760;
        double salaryInYearMasha = salaryInMounthMasha*12;
        double newSalaryInMounthMasha = salaryInMounthMasha*1.1;
        double newSalaryInYearMasha = newSalaryInMounthMasha*12;
        double differentInSalaryMasha = newSalaryInYearMasha - salaryInYearMasha;
        double salaryInMounthDenis = 83690;
        double salaryInYearDenis = salaryInMounthDenis*12;
        double newSalaryInMounthDenis = salaryInMounthDenis*1.1;
        double newSalaryInYearDenis = newSalaryInMounthDenis*12;
        double differentInSalaryDenis = newSalaryInYearDenis - salaryInYearDenis;
        double salaryInMounthKris = 76230;
        double salaryInYearKris = salaryInMounthKris*12;
        double newSalaryInMounthKris = salaryInMounthKris*1.1;
        double newSalaryInYearKris = newSalaryInMounthKris*12;
        double differentInSalaryKris = newSalaryInYearKris - salaryInYearKris;

        System.out.println("Маша теперь получает "+newSalaryInMounthMasha+
                " рублей. Годовой доход вырос на "+differentInSalaryMasha+" рублей.");
        System.out.println("Ден теперь получает "+newSalaryInMounthDenis+
                " рублей. Годовой доход вырос на "+differentInSalaryDenis+" рублей.");
        System.out.println("Крис теперь получает "+newSalaryInMounthKris+
                " рублей. Годовой доход вырос на "+differentInSalaryKris+" рублей.");




    }
}
