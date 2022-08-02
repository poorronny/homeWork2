public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");




        byte a = 36;
        short b = 458;
        int c = 36852;
        long d = 1000000;
        float e = 7;
        double f = 207.3;
        char g = 2;

        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
        double totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
double weightDifference=secondBoxerWeight-firstBoxerWeight;
System.out.println("Разница веса двух бойцов "+weightDifference+" кг");


short oneBanana=80;
short milkOneHundredMl=105;
short iceCream=100;
short oneEgg=70;

int breakfast=oneBanana*5+milkOneHundredMl*2+iceCream*2+oneEgg*4;
System.out.println ("Вес спортивного завтрака "+breakfast+" грамм");
double breakFastInKg=breakfast*0.001;
System.out.println("Вес спортивного завтрака "+breakFastInKg+ " кг");


short dropWeight=7;
double fitstDietVersion=0.25;
double secondDietVersion=0.5;
double firstLoosingWeight=7/0.25;
double secondLoosingWeight=7/0.5;
double averageLoosingWeight=(firstLoosingWeight+secondLoosingWeight
)/2;
System.out.println("В среднем потребуется "+(long)averageLoosingWeight+" день ");


int mashaSallary=67_760;
int denisSallary=83_690;
int kristinaSallary=76_230;


double mashaSallaryAfterPromotion=((mashaSallary*0.1)+mashaSallary)*12;
double denisSallaryAfterPromotion=((denisSallary*0.1)+denisSallary)*12;
double kristinaSallaryAfterPromotion=((kristinaSallary*0.1)+kristinaSallary)*12;

double oneYearDifferenceMashSallary=mashaSallaryAfterPromotion-(mashaSallary*12);
double oneYearDifferenceDenisSallary=denisSallaryAfterPromotion-(denisSallary*12);
double oneYearDifferenseKristinaSallary=kristinaSallaryAfterPromotion-(kristinaSallary*12);



System.out.println("Маша теперь получает " + (long)mashaSallaryAfterPromotion+ " рублей");
        System.out.println("Денис теперь получает "+(long)denisSallaryAfterPromotion+" рублей");
        System.out.println ("Кристина теперь получает "+(long)kristinaSallaryAfterPromotion+" рублей");

        System.out.println("годовой доход Маши вырос на "+(long)oneYearDifferenceMashSallary+" рублей");
        System.out.println("годовой доход Дениса вырос на "+(long)oneYearDifferenceDenisSallary+" рублей");
        System.out.println("годовой доход Кристины вырос на " +(long)oneYearDifferenseKristinaSallary+ " рублей");

    }
}









