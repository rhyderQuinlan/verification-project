import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by CM on 01/02/2018.
 */
public class Rate {
    private CarParkKind kind;
    private BigDecimal hourlyNormalRate;
    private BigDecimal hourlyReducedRate;
    private ArrayList<Period> reduced = new ArrayList<>();
    private ArrayList<Period> normal = new ArrayList<>();

    public Rate(CarParkKind kind, BigDecimal normalRate, BigDecimal reducedRate, ArrayList<Period> reducedPeriods
            , ArrayList<Period> normalPeriods) {
        if (reducedPeriods == null || normalPeriods == null) {
            throw new IllegalArgumentException("periods cannot be null");
        }
        if (normalRate == null || reducedRate == null) {
            throw new IllegalArgumentException("The rates cannot be null");
        }
        if (normalRate.compareTo(BigDecimal.ZERO) < 0 || reducedRate.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("A rate cannot be negative");
        }
        if (normalRate.compareTo(reducedRate) <= 0) {
            throw new IllegalArgumentException("The normal rate cannot be less or equal to the reduced rate");
        }
        if (!isValidPeriods(reducedPeriods) || !isValidPeriods(normalPeriods)) {
            throw new IllegalArgumentException("The periods are not valid individually");
        }
        if (!isValidPeriods(reducedPeriods, normalPeriods)) {
            throw new IllegalArgumentException("The periods overlaps");
        }
        this.kind = kind;
        this.hourlyNormalRate = normalRate;
        this.hourlyReducedRate = reducedRate;
        this.reduced = reducedPeriods;
        this.normal = normalPeriods;
    }

    /**
     * Checks if two collections of periods are valid together
     * @param periods1
     * @param periods2
     * @return true if the two collections of periods are valid together
     */
    private boolean isValidPeriods(ArrayList<Period> periods1, ArrayList<Period> periods2) {
        Boolean isValid = true;
        int i = 0;
        while (i < periods1.size() && isValid) {
            isValid = isValidPeriod(periods1.get(i), periods2);
            i++;
        }
        return isValid;
    }

    /**
     * checks if a collection of periods is valid
     * @param list the collection of periods to check
     * @return true if the periods do not overlap
     */
    private Boolean isValidPeriods(ArrayList<Period> list) {
        Boolean isValid = true;
        if (list.size() >= 2) {
            Period secondPeriod;
            int i = 0;
            int lastIndex = list.size()-1;
            while (i < lastIndex && isValid) {
                isValid = isValidPeriod(list.get(i), ((List<Period>)list).subList(i + 1, lastIndex+1));
                i++;
            }
        }
        return isValid;
    }

    /**
     * checks if a period is a valid addition to a collection of periods
     * @param period the Period addition
     * @param list the collection of periods to check
     * @return true if the period does not overlap in the collecton of periods
     */
    private Boolean isValidPeriod(Period period, List<Period> list) {
        Boolean isValid = true;
        int i = 0;
        while (i < list.size() && isValid) {
            isValid = !period.overlaps(list.get(i));
            i++;
        }
        return isValid;
    }
    public BigDecimal calculate(Period periodStay) {
        int normalRateHours = periodStay.occurences(normal);
        int reducedRateHours = periodStay.occurences(reduced);

        BigDecimal calculation = this.hourlyNormalRate.multiply(BigDecimal.valueOf(normalRateHours)).add(this.hourlyReducedRate.multiply(BigDecimal.valueOf(reducedRateHours)));

        if(this.kind.equals(CarParkKind.VISITOR)){
            if (calculation.compareTo(new BigDecimal("8.00")) == 1){
                return new BigDecimal((0)); //less then 8.00 return free (0)
            } else {
                return calculation.subtract(new BigDecimal("8.00")).multiply(new BigDecimal("0.5")); //subtract 8.00 and multiply by 50%
            }
        }

        if(this.kind.equals(CarParkKind.MANAGEMENT)){
            if (calculation.compareTo(new BigDecimal(("3.00"))) == -1){
                return new BigDecimal("3.00"); //calculation is less than 3.00 so return minimum payable (3.00)
            }
        }

        if(this.kind.equals(CarParkKind.STUDENT)){
            if (calculation.compareTo(new BigDecimal(("5.50"))) == 1){
                return calculation.add(calculation.subtract(new BigDecimal("5.50")).multiply(new BigDecimal("0.25"))); //calculation is greater than 5.50 so give 25% amount greater than 5.50
            }
        }

        if(this.kind.equals(CarParkKind.STAFF)){
            if(calculation.compareTo((new BigDecimal("16.00"))) == 1){
                return new BigDecimal("16.00"); //calculation is greater than 16.00, max amount payable is 16.00 so return 16.00
            }
        }

    }

}
