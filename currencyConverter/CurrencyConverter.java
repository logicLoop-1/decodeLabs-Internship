package currencyConverter;
import java.util.HashMap;
import java.math.BigDecimal;
public class CurrencyConverter {
    private HashMap<String, BigDecimal> ratesToUSD = new HashMap<>();
    public CurrencyConverter(){
        ratesToUSD.put("USD", new BigDecimal("1"));
        ratesToUSD.put("PAK", new BigDecimal("278.50"));
        ratesToUSD.put("IND", new BigDecimal("83.40"));
        ratesToUSD.put("EUR", new BigDecimal("0.92"));
        ratesToUSD.put("GBP", new BigDecimal("0.78"));
    }
    public BigDecimal convert(String from, String to, BigDecimal amount){
        BigDecimal fromRate = ratesToUSD.get(from.toUpperCase());
        BigDecimal toRate = ratesToUSD.get(to.toUpperCase());
        BigDecimal amountInUSD= amount.divide(fromRate, 10, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal result = amountInUSD.multiply(toRate);
        return result;
    }
    }

