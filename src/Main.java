public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1\n");

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 1000000000L;
        float f = (float) 10.100500;
        double d = 10.100500100;

        System.out.println("The value of a variable b with type byte is " + b);
        System.out.println("The value of a variable s with type short is " + s);
        System.out.println("The value of a variable i with type int is " + i);
        System.out.println("The value of a variable l with type long is " + l);
        System.out.println("The value of a variable f with type float is " + f);
        System.out.println("The value of a variable d with type double is " + d);

        //Task 2

        float fVar1 = (float) 27.12;
        long lVar = 987678965549L;
        float fVar2 = 2.786f;
        short sVar1 = 569;
        short sVar2 = -159;
        short sVar3 = 27897;
        byte bVar = 67;

        //Task 3
        System.out.println("\nTask 3\n");

        short studentsCountClass1 = 23;
        short studentsCountClass2 = 27;
        short studentsCountClass3 = 30;
        short paperSheetsCount = 480;
        short studentsCountTotal = (short) (studentsCountClass1 + studentsCountClass2 + studentsCountClass3);
        float paperSheetsPerStudent = (float) (paperSheetsCount / studentsCountTotal);

        System.out.println("Paper sheets count per student is " + paperSheetsPerStudent);

        //Task 4
        System.out.println("\nTask 4\n");

        byte bottlesProducedIn2Min = 16;
        byte bottlesProducedIn1Min = (byte) (bottlesProducedIn2Min / 2);

        short bottlesProducedIn20Min = (short) (bottlesProducedIn1Min * 20);
        int bottlesProducedInDay = bottlesProducedIn1Min * 60 * 24;
        int bottlesProducedIn3Days = bottlesProducedInDay * 3;
        int bottlesProducedInMonth = bottlesProducedInDay * 30;

        System.out.println("In 20 minutes the machine produced " + bottlesProducedIn20Min + " bottles");
        System.out.println("In 1 day the machine produced " + bottlesProducedInDay + " bottles");
        System.out.println("In 3 days the machine produced " + bottlesProducedIn3Days + " bottles");
        System.out.println("In a month the machine produced " + bottlesProducedInMonth + " bottles");

        //Task 5
        System.out.println("\nTask 5\n");

        short classesCount = 120 / (2 + 4);
        short whitePaintTintCount = 120 / 3;
        short brownPaintTintCount = (short) (whitePaintTintCount * 2);
        System.out.println("In a school having " + classesCount + " classes requires " + whitePaintTintCount + " tints of white paint and " + brownPaintTintCount + " tints of brown paint");

        //Task 6
        System.out.println("\nTask 6\n");

        short weightBananasG = 5 * 80;
        short weightMilkG = 105 * 2;
        short weightIceCreamG = 2 * 100;
        short weightEggsG = 4 * 70;

        short weightTotalG = (short) (weightBananasG + weightMilkG + weightIceCreamG + weightEggsG);
        float weightTotalKg = (float) weightTotalG / 1000;

        System.out.println("Breakfast weight in grams is " + weightTotalG + "g, weight in kilograms is " + weightTotalKg + "kg");

        //Task 7
        System.out.println("\nTask 7\n");

        short daysToTargetWeight250 = 7 * 1000 / 250;
        short daysToTargetWeight500 = 7 * 1000 / 500;
        short averageDaysToTargetWeight = (short) ((daysToTargetWeight250 + daysToTargetWeight500) / 2);

        System.out.println("Number of days required to achieve target weight on -250g diet is " + daysToTargetWeight250);
        System.out.println("Number of days required to achieve target weight on -500g diet is " + daysToTargetWeight500);
        System.out.println("Average number of days required to achieve target weight is " + averageDaysToTargetWeight);

        //Task 8
        System.out.println("\nTask 8\n");

        float currentSalaryMaria = 67760;
        float currentSalaryDenis = 83690;
        float currentSalaryKristina = 76230;

        float increasedSalaryMaria = (float) (currentSalaryMaria * 1.1);
        float increasedSalaryDenis = (float) (currentSalaryDenis * 1.1);
        float increasedSalaryKristina = (float) (currentSalaryKristina * 1.1);

        float annualIncomeIncreaseMaria = (increasedSalaryMaria - currentSalaryMaria) * 12;
        float annualIncomeIncreaseDenis = (increasedSalaryDenis - currentSalaryDenis) * 12;
        float annualIncomeIncreaseKristina = (increasedSalaryKristina - currentSalaryKristina) * 12;

        System.out.println("Maria now recieves " + increasedSalaryMaria + " RUB. Annual income increased by " + annualIncomeIncreaseMaria + " RUB");
        System.out.println("Denis now recieves " + increasedSalaryDenis + " RUB. Annual income increased by " + annualIncomeIncreaseDenis + " RUB");
        System.out.println("Kristina now recieves " + increasedSalaryKristina + " RUB. Annual income increased by " + annualIncomeIncreaseKristina + " RUB");
    }
}