public class Main {
    public static void main(String[] args) {

       byte integerValue1 = 127;
       short integerValue2 = 32767;
       int integerValue3 = 2147483647;
       long integerValue4 = 9223372036854775807l;

       float floatingPoint1 = 3.4f;
       double floatingPoint2 = 1.7;

        char symbolVariable = 0;
        boolean logicalVariable = true;

        double floatingPoint =27.12;
        long integerValue5 = 987678965549l;
        float  floatingPoint3 = 2.786f;
        short integerValue6 = 569;
        short integerValue7 = -159;
        short integerValue8 = 27897;
        byte integerValue9 = 67;


        System.out.println("Задача 3");

        byte ludmilaStudents =32;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;
        float pieceOfPaper =480;
        float pieceOfPaperForEachStud = pieceOfPaper / (ludmilaStudents +annaStudents+ekaterinaStudents);

        System.out.println("На каждого ученика расчитано"+" "+pieceOfPaperForEachStud+" "+"листов бумаги.");

        System.out.println("Задача 4");

        byte workingMin20 = 20;   //  количество минут
        byte workingHours24 = 24; //  в сутки
        byte workingHours72 = 72;  // за три дня
        short workingHours720 = 720;  // за месяц (30 дней)
        short bottleQuantity1Hours = 16*30;  //количество бутылок в час

        short bottleQuantity20min = 16*10;
        int bottleQuantity24Hours =bottleQuantity1Hours * 24;
        int bottleQuantity72Hours =bottleQuantity1Hours * 72;
        int bottleQuantity720Hours =bottleQuantity1Hours* 720;
        System.out.println("За"+" "+ workingMin20+" минут машина произвела "+bottleQuantity20min+" штук бутылок.");
        System.out.println("За"+" "+ workingHours24+" часа машина произвела "+bottleQuantity24Hours+" штук бутылок.");
        System.out.println("За"+" "+ workingHours72+" часа машина произвела "+bottleQuantity72Hours+" штук бутылок.");
        System.out.println("За"+" "+ workingHours720+" часов машина произвела "+bottleQuantity720Hours+" штук бутылок.");

        System.out.println("Задача 5");

        byte totalNumberOfCans = 120;   //общее кол-во краски
        byte whitePaintForOneClass = 2; //количество белой краски на один класс
        byte brownPaintForOneClass = 4;  //кол-во коричневой краски на один класс

        byte numberOfClasses = (byte) (totalNumberOfCans /(whitePaintForOneClass + brownPaintForOneClass));   //общее количество классов
        byte totalAmountOfWhitePaint = (byte) (numberOfClasses * whitePaintForOneClass);                      //общее количество белой на все классы
        byte totalAmountOfBrownPaint = (byte) (numberOfClasses * brownPaintForOneClass);                      // общее количество коричневой на все классы

        System.out.println("В школе, где "+ numberOfClasses+" классов, нужно "+ totalAmountOfWhitePaint+" банок белой краски и "+totalAmountOfBrownPaint+" банок коричневой краски.");

        System.out.println("Задача 6");

        byte bananas = 5;
        short milkML = 200;  //миллилитры
        byte iceCream = 2;  // брикет
        byte eggs = 4;

        byte bananasWeight = 80;   // грамм за один банан
        byte milkWeight = 105;    //100мл = 105грамм
        byte iceCreamWeight = 100;//100 грамм на один брикет
        byte eggsWeight = 70;      //70 грамм на одно яйцо

        short totalBananaWeight = (short) (bananas * bananasWeight);
        short totalMilkWeight = (short) (milkML * milkWeight /100);
        short totalIceCreamWeight = (short) (iceCream * iceCreamWeight);
        short totalEggsWeight = (short) (eggs * eggsWeight);

        float weightOfASportsBreakfastGrams = (short) (totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggsWeight);//общий вес завтрака в гр.
        float weightOfASportsBreakfastKg =  weightOfASportsBreakfastGrams / 1000;
        System.out.println("Вес спортзавтрака в граммах "+weightOfASportsBreakfastGrams+" гр. в килограммах "+weightOfASportsBreakfastKg+" кг.");

        System.out.println("Задача 7");

        short loseWeight1 = 250;  //терять в день гр.
        short loseWeight2 = 500;  //терять в день гр.
        short needToLoseWeightKg = 7; //сколько нужно скинуть кг.
        short needToLoseWeightGr = (short) (needToLoseWeightKg * 1000);
        short numberOfDays1 = (short) (needToLoseWeightGr / loseWeight1); //количество дней если скидывать 250
        short numberOfDays2 = (short) (needToLoseWeightGr / loseWeight2); //количество дней если 500
        short averageNumberOfDays = (short) ((numberOfDays1 * 50 / 100)+(numberOfDays2 * 50 / 100));  //среднне количество дней
        System.out.println("Если скидывать по 250 гр. в день то понадобится "+numberOfDays1+" дней.Если скидывать по 500 гр в день то " +
                "понадобится "+numberOfDays2+" дней.В среднем понадобится "+averageNumberOfDays+"дней.");

        System.out.println("задача 8");

        int masha = 67760;   //  текущая зп за месяц
        int denis = 83690;
        int kristina = 76230;


        int mashAnnualSalary =masha *12;  //текущая зп за год
        int denisAnnualSalary =  denis*12;
        int kristinaAnnualSalary= kristina*12;


        float masha10Interest = masha +(masha / 100)*10; //увеличить на 10% мес.
        float denis10Interest = denis + (denis /100)*10;
        float kristina10Interest = kristina+(kristina /100)*10;

        float mash10InterestAnnualSalary = masha10Interest *12; //увеличить зп 10% год.
        float denis10InterestAnnualSalary =denis10Interest *12;
        float kristina10InterestAnnualSalary = kristina10Interest *12;



        System.out.println("Маша теперь получает "+masha10Interest+" рублей. Годовой доход вырос на "+ (mash10InterestAnnualSalary-mashAnnualSalary)+" рублей.");
        System.out.println("Денис теперь получает "+denis10Interest+" рублей. Годовой доход вырос на "+ (denis10InterestAnnualSalary-denisAnnualSalary)+" рублей.");
        System.out.println("Кристина теперь получает "+kristina10Interest+" рублей. Годовой доход вырос на "+ (kristina10InterestAnnualSalary-kristinaAnnualSalary)+" рублей.");




















    }
}