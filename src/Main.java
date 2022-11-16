public class Main {
    public static void main(String[] args) {
        //Задачи из раздела переменные. Часть 2.
        System.out.println("Задачи из раздела переменные. Часть 2.");
        System.out.println("Задача 1.");
        byte byteType = 127;
        System.out.println("Значение переменной byteType с типом byte равно " + byteType);
        short shortType = 32127;
        System.out.println("Значение переменной shortType с типом short равно " + shortType);
        int intType = 1000000;
        System.out.println("Значение переменной intType с типом int равно " + intType);
        long longType = 3000000000L;
        System.out.println("Значение переменной longType с типом long равно " + longType);
        float floatType = 12.00001f;
        System.out.println("Значение переменной floatType с типом float равно " + floatType);
        double doubleType = 0.0000001;
        System.out.println("Значение переменной doubleType с типом double равно " + doubleType);

        System.out.println();
        System.out.println("Задача 2.");
        float floatTest = 27.12f;
        System.out.println("Значение переменной с типом float равно " + floatTest);
        long longTest = 987_678_965_549L;
        System.out.println("Значение переменной longTest с типом long равно " + longTest);
        short byteV1 = 2;
        short shortV1 = 786;
        boolean boolTest = 1 > 3;
        System.out.println("Значение переменной boolTest с типом bool равно " + boolTest);
        short shortV2 = 569;
        short shortV3 = -159;
        short shortV4 = 27_897;
        byte byteV2 = 67;
        System.out.println();

        //Задача 3.
        System.out.println("Задача 3.");
        int studentOfFirstTeacher = 23, studentOfSecondTeacher = 27, studentOfThirdTeacher = 30;
        int totalNumbersOfSheetsOfPaper = 480;
        System.out.println("На каждого ученика расчитано " + totalNumbersOfSheetsOfPaper / (studentOfFirstTeacher +
                studentOfSecondTeacher + studentOfThirdTeacher) + " листов бумаги.");
        System.out.println();

        //Задача 4.
        System.out.println("Задача 4.");
        int productivityOfMachinePerTwoMinutes = 16;
        int twoMinutes = 2;
        int productivityOfMachinePerOneMinutes = productivityOfMachinePerTwoMinutes / twoMinutes;
        int timeIntervalIn20Minutes = 20;
        int productivityOfMachinePer20Minutes = productivityOfMachinePerOneMinutes * twoMinutes;
        System.out.println("За 20 минут работы машины машина произвела  булылок " + productivityOfMachinePer20Minutes + " штук.");
        int minutesPerDay = 24*60;
        int productivityOfMfchinePerDay = productivityOfMachinePerOneMinutes * minutesPerDay;
        System.out.println("За сутки работы машины машина произвела " + productivityOfMfchinePerDay + " штук.");
        int productivityOfMachinePerThreeDays = productivityOfMfchinePerDay * 3;
        System.out.println("За трое суток работы машины машина произвела " + productivityOfMachinePerThreeDays + " штук.");
        int productivityOfMachinePerMonth = productivityOfMfchinePerDay * 30;
        System.out.println("За месяц работы машины машина произвела " + productivityOfMachinePerMonth + " штук.");
        System.out.println();

        //Задача 5.
        System.out.println("Задача 5.");
        int totalNumberOfPainCans = 120;
        int totalNumberOfWhitePainCansPerOneClass = 2;
        int totalNumberOfBrownPainCansPerOneClass = 4;

        int numberOfClasses = totalNumberOfPainCans / (totalNumberOfWhitePainCansPerOneClass + totalNumberOfBrownPainCansPerOneClass);
        int numberOfWhitePainCans = numberOfClasses * totalNumberOfWhitePainCansPerOneClass;
        int numberOfBrownPainCans = numberOfClasses * totalNumberOfBrownPainCansPerOneClass;
        System.out.println("В школе где " +  numberOfClasses+
                " классов, нужно " + numberOfWhitePainCans + " банок белой краски и " + numberOfBrownPainCans + " банок коричневой краски.");
        System.out.println();

        //Задача 6.
        System.out.println("Задача 6.");
        int weightOfBananaInGrams = 80, numberOfBananas = 5;
        int weightOfMilkInGrams = 105, numberOfMillilitersIn105GramsOfMilk = 100, numberOfMilkInMilliliters = 200;
        int weightOfIceCreamInGrams = 100, numbersOfIceCreamBriquettes = 2;
        int weightOfEggsInGrams = 70, numberOfEggs = 4;
        int weightOfIngredientsInGrams = weightOfBananaInGrams * numberOfBananas + weightOfMilkInGrams * (numberOfMilkInMilliliters / numberOfMillilitersIn105GramsOfMilk) +
                weightOfIceCreamInGrams * numbersOfIceCreamBriquettes + weightOfEggsInGrams * numberOfEggs;
        float weightOfIngredientsInKilograms = (float) weightOfIngredientsInGrams / 1000;
        System.out.println("Вес спорт-завтрака равен " + weightOfIngredientsInKilograms + " кг.");
        System.out.println();

        //Задача 7.
        System.out.println("Задача 7.");
        double totalWeightForWeightLoss = 7;
        double weightForWeightLossPerDayInFirstCaseInGrams = 250;
        double weightForWeightLossPerDayInFirstCaseInKilograms = weightForWeightLossPerDayInFirstCaseInGrams/1000;
        double weightForWeightLossPerDayInSecondCaseInGrams = 500;
        double weightForWeightLossPerDayInSecondCaseInKilograms = weightForWeightLossPerDayInSecondCaseInGrams/1000;
        double numberOfDaysForWeightLossInFirstCase = totalWeightForWeightLoss / weightForWeightLossPerDayInFirstCaseInKilograms;
        System.out.println(numberOfDaysForWeightLossInFirstCase + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        double numberOfDaysForWeightLossPerDayInSecondCase = totalWeightForWeightLoss / weightForWeightLossPerDayInSecondCaseInKilograms;
        System.out.println(numberOfDaysForWeightLossPerDayInSecondCase + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        System.out.println();

        //Задача 8.
        System.out.println("Задача 8.");
        double oldSalaryOfMasha = 67_760;
        double oldSalaryOfDenis = 83_690;
        double oldSalaryOfKristina = 76_230;
        double percentOfSalaryIncrease = 10;
        double currentSalaryOfMasha = oldSalaryOfMasha * (100 + percentOfSalaryIncrease) / 100;
        double differenceOfSalaryForYearForMasha = (currentSalaryOfMasha * 12) - (oldSalaryOfMasha * 12);
        System.out.println("Маша теперь получает " + currentSalaryOfMasha + " рублей." +
                " Годовой доход вырос на " + differenceOfSalaryForYearForMasha + " рублей.");
        double currentSalaryOfDenis = oldSalaryOfDenis * (100 + percentOfSalaryIncrease) / 100;
        double differenceOfSalaryForYearForDenis = (currentSalaryOfDenis * 12) - (oldSalaryOfDenis * 12);
        System.out.println("Денис теперь получает " + currentSalaryOfDenis + " рублей." +
                " Годовой доход вырос на " + differenceOfSalaryForYearForDenis + " рублей.");
        double currentSalaryOfKristina = oldSalaryOfKristina * (100 + percentOfSalaryIncrease) / 100;
        double differenceOfSalaryForYearForKristina = (currentSalaryOfKristina * 12) - (oldSalaryOfKristina * 12);
        System.out.println("Кристина теперь получает " + currentSalaryOfKristina + " рублей." +
                " Годовой доход вырос на " + differenceOfSalaryForYearForKristina + " рублей.");

    }
}