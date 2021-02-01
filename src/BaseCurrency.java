interface BaseCurrency {
    double toBase (double input, Currencies currency);
}

interface OtherCurrency extends BaseCurrency{
    double toOther (double input, Currencies inType, Currencies outType);
}