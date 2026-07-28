# Currency Converter (Java)

A simple console-based currency converter built in Java. Supports multiple currencies, validates user input, and uses `BigDecimal` for accurate financial math.

## Supported Currencies

- USD
- PAK
- IND
- EUR
- GBP

## Project Structure

```
currencyconverter/
├── Main.java              # Menu loop, user input, validation, output
└── CurrencyConverter.java # Exchange rates and conversion logic
```

## How it works?
1. Menu Loop – The program shows a menu (Convert or Exit) in a do-while loop.
2. Input Capture & Validation – When the user picks "Convert," the program asks for the source currency, target currency, and amount (checking that the currencies are supported and the amount is a valid).
3. Conversion via USD Pivot – Instead of storing a rate for every possible currency pair, all rates are stored relative to USD.
4. Precision with BigDecimal – All calculations use BigDecimal instead of double, avoiding floating-point rounding errors.
5. Result Output – The converted amount is printed back to the user, and the loop returns to the menu.

## Sample session

```
1. convert 2. exit
1
conversion:
enter the source currency(e.g PAK):
PAK
enter the target currency(e.g IND):
IND
enter amount:
1000
Result: 299.64...
got it 1000.0 PAK -> IND
```
