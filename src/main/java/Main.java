public class Main {
    public static void main(String[] args) {
        BeelineTariff tariffPeoples1 = new BeelineTariff();
        tariffPeoples1.tariffName = "Близкие люди 1";
        tariffPeoples1.internetGB = 15;
        tariffPeoples1.minutesRussia = 400;
        tariffPeoples1.sms = 300;
        tariffPeoples1.bonusDiscountPercent = 0;
        tariffPeoples1.priceMonthly = 350;
        tariffPeoples1.eSim = true;

        BeelineTariff tariffPeoples2 = new BeelineTariff();
        tariffPeoples2.tariffName = "Близкие люди 2";
        tariffPeoples2.internetGB = 30;
        tariffPeoples2.minutesRussia = 600;
        tariffPeoples2.sms = 300;
        tariffPeoples2.bonusDiscountPercent = 20;
        tariffPeoples2.priceMonthly = 400;
        tariffPeoples2.eSim = true;
    }
}