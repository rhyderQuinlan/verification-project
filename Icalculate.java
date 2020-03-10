import java.math.BigDecimal;

public interface Icalculate {

    public BigDecimal calculate(BigDecimal calculation);

}


class StaffRate implements  Icalculate
{

    BigDecimal maxPayable = new BigDecimal("16.00");
    @Override
    public BigDecimal calculate(BigDecimal calculation) {

        if(calculation.compareTo(maxPayable) == 1) {
            return new BigDecimal("16.00"); //calculation is greater than 16.00, max amount payable is 16.00 so return 16.00
        }
        return calculation;
    }
}

class StudentRate implements  Icalculate
{

    BigDecimal reductionAmount = new BigDecimal("5.50");
    BigDecimal percentage = new BigDecimal(("0.25"));
    @Override
    public BigDecimal calculate(BigDecimal calculation) {

        if (calculation.compareTo(reductionAmount) == 1){
            return calculation.add(calculation.subtract(reductionAmount).multiply(percentage)); //calculation is greater than 5.50 so give 25% amount greater than 5.50
        }
        return calculation;
    }
}

class ManagementRate implements  Icalculate
{

    BigDecimal minimalPayable = new BigDecimal("3.00");
    @Override
    public BigDecimal calculate(BigDecimal calculation) {

        if (calculation.compareTo(minimalPayable) == -1){
            return minimalPayable; //calculation is less than 3.00 so return minimum payable (3.00)
        }

        return calculation;
    }
}

class VisitorRate implements Icalculate {
    BigDecimal freeAmount = new BigDecimal("8.00");
    BigDecimal percentage = new BigDecimal("0.5");

    @Override
    public BigDecimal calculate(BigDecimal calculation) {

        if (calculation.compareTo(freeAmount) == -1 || calculation.compareTo(freeAmount) == 0){
            return new BigDecimal((0)); //less then 8.00 return free (0)
        } else {
            return calculation.subtract(freeAmount).multiply(percentage); //subtract 8.00 and multiply by 50%
        }
    }
}

