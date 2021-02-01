public class TestClass {
    public static void main(String[] args) {
        CurrencyConverter conv = new CurrencyConverter();
        System.out.println(conv.toBase(20, Currencies.Euro));

        MultipleCurrencyConverter conv2 = new MultipleCurrencyConverter();
        System.out.println(conv2.toOther(20, Currencies.USD, Currencies.Yuan));
        System.out.println(conv2.toOther(20, Currencies.USD, Currencies.Euro));
        System.out.println(conv2.toOther(20, Currencies.USD, Currencies.GBP));
    }
}

