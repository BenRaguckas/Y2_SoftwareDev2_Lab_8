class CurrencyConverter implements BaseCurrency{
    public static double rateEuro = 1.21238;
    public static double rateGBP = 1.37366;
    public static double rateYuan = 0.154607;

    @Override
    public double toBase(double input, Currencies currency) {
        switch (currency) {
            default -> {    return input;   }
            case Euro -> {
                return rateEuro * input;
            }
            case GBP -> {
                return rateGBP * input;
            }
            case Yuan -> {
                return rateYuan * input;
            }
        }
    }

    public Currencies getType(String type) {
        switch (type) {
            default -> {
                return Currencies.USD;
            }
            case "Euro" -> {
                return Currencies.Euro;
            }
            case "GBP" -> {
                return Currencies.GBP;
            }
            case "Yuan" -> {
                return Currencies.Yuan;
            }
        }
    }
}

class MultipleCurrencyConverter extends CurrencyConverter implements OtherCurrency{

    @Override
    public double toOther(double input, Currencies inType, Currencies outType) {
        double base = toBase(input, inType);
        switch (outType) {
            default -> {return base;}
            case Euro -> {return base / rateEuro;}
            case GBP -> {return base / rateGBP;}
            case Yuan -> {return base / rateYuan;}
        }
    }
}
