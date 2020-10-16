public class ATM {
    private int atmCash;

    public ATM(int atmCash) {
        this.atmCash = atmCash;
    }

    public int getAtmCash() {
        return atmCash;
    }

    private int getCash(int cash) {
        atmCash = atmCash + cash;
        return atmCash;
    }

    private int takeCash(int cash) {
        if (atmCash < cash) {
            cash = 0;
        }
        atmCash = atmCash - cash;
        return atmCash;
    }
}
