//package cm;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;

public class QuinlanRhyderTestTask1 {

    //test 1
    //partition: normalRate < 0
    //expected output: IllegalArgumentException
    @Test
    public void test1() throws IllegalArgumentException {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("-2");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);


    }

    //test 2
    //partition: normalRate > 0
    //expected output: pass
    @Test
    public void test2() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 3
    //partition: reducedRate < 0
    //expected output: IllegalArgumentException
    @Test
    public void test3() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("-3");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 4
    //partition: reducedRate > 0
    //expected output: pass
    @Test
    public void test4() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 5
    //partition: normalRate <= reducedRate
    //expected output: IllegalArgumentException
    @Test
    public void test5() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("13");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 6
    //partition: normalRate >= reducedRate
    //expected output: pass
    @Test
    public void test6() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 7
    //partition: normalPeriods overlaps reducedPeriods
    //expected output: IllegalArgumentException
    @Test
    public void test7() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("13");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(12,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 8
    //partition: normalPeriods does not overlap reducedPeriods
    //expected output: pass
    @Test
    public void test8() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 9
    //partition: normalRate == null
    //expected output: IllegalArgumentException
    @Test
    public void test9() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = null;
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(12,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 10
    //partition: normalRate != null
    //expected output: pass
    @Test
    public void test10() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 11
    //partition: reducedRate == null
    //expected output: IllegalArgumentException
    @Test
    public void test11() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = null;

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(12,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 12
    //partition: reducedRate != null
    //expected output: pass
    @Test
    public void test12() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 13
    //partition: normalRate != Number
    //expected output: IllegalArgumentException
    @Test
    public void test13() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        String string = "20";
        BigDecimal normalRate = new BigDecimal(string);
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(12,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 14
    //partition: normalRate != Number
    //expected output: IllegalArgumentException
    @Test
    public void test14() throws IllegalArgumentException{
        String string = "test";
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(string);
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 15
    //partition: reducedRate != Number
    //expected output: IllegalArgumentException
    @Test
    public void test15() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        String string = "20";
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal(string);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(12,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 16
    //partition: reducedRate != Number
    //expected output: IllegalArgumentException
    @Test
    public void test16() throws IllegalArgumentException{
        String string = "test";
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal(string);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 17
    //partition: Multiple reducedPeriods overlap
    //expected output: IllegalArgumentException
    @Test
    public void test17() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod1 = new Period(9,13);
        normalPeriods.add(normalPeriod1);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod1 = new Period(12,18);
        normalPeriods.add(reducedPeriod1);
        Period reducedPeriod2 = new Period(17,21);
        normalPeriods.add(reducedPeriod2);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 18
    //partition: Multiple normalPeriods overlap
    //expected output: IllegalArgumentException
    @Test
    public void test18() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod1 = new Period(9,13);
        normalPeriods.add(normalPeriod1);
        Period normalPeriod2 = new Period(12,17);
        normalPeriods.add(normalPeriod2);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 19
    //partition: reducedPeriods == null
    //expected output: IllegalArgumentException
    @Test
    public void test19() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod1 = new Period(9,13);
        normalPeriods.add(normalPeriod1);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod1 = null;
        normalPeriods.add(reducedPeriod1);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 20
    //partition: normalPeriods == null
    //expected output: IllegalArgumentException
    @Test
    public void test20() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = null;
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 21
    //partition: pass - staff
    //expected output: pass
    @Test
    public void test21() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 22
    //partition: pass - management
    //expected output: pass
    @Test
    public void test22() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 23
    //partition: pass - student
    //expected output: pass
    @Test
    public void test23() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //--- Calculate method ---

    //test 24
    //expected output: pass
    @Test
    public void test24() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(new BigDecimal("15.00"), rate.calculate(new Period(9,10)));
    }

    //test 25
    //expected output: 20
    //actual output: 15
    @Test
    public void test25() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(new BigDecimal("20.00"), rate.calculate(new Period(9,10)));
    }

    //test 26
    //expected output: pass
    @Test
    public void test26() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(new BigDecimal("150.00"), rate.calculate(new Period(10, 20)));
    }

    //test 27
    //expected output: 75
    //actual output: 150
    @Test
    public void test27() throws IllegalArgumentException{
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(new BigDecimal("75.00"), rate.calculate(new Period(10,20)));
    }
    //calculate method end ^^^
}
