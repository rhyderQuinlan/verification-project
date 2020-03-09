import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class QuinlanRhyderTestTask3 {
    //test 1
    //partition: normalRate < 0
    //expected output: IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void test1()  {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("-2");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 2
    //partition: normalRate > 0
    //expected output: pass
    @Test
    public void test2() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 3
    //partition: reducedRate < 0
    //expected output: IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void test3() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("-3");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 4
    //partition: reducedRate > 0
    //expected output: pass
    @Test
    public void test4() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 5
    //partition: normalRate <= reducedRate
    //expected output: IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void test5() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("13");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 6
    //partition: normalRate >= reducedRate
    //expected output: pass
    @Test
    public void test6() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 7
    //partition: normalPeriods overlaps reducedPeriods
    //expected output: IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void test7() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("13");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(12,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 8
    //partition: normalPeriods does not overlap reducedPeriods
    //expected output: pass
    @Test
    public void test8() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 9
    //partition: normalRate == null
    //expected output: IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void test9() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = null;
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(12,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 10
    //partition: normalRate != null
    //expected output: pass
    @Test
    public void test10() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 11
    //partition: reducedRate == null
    //expected output: IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void test11() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = null;

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(12,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 12
    //partition: reducedRate != null
    //expected output: pass
    @Test
    public void test12() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 13
    //partition: normalRate != Number
    //expected output: IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void test13() {
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

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 14
    //partition: normalRate != Number
    //expected output: IllegalArgumentException
    @Test (expected = NumberFormatException.class)
    public void test14() {
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

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 15
    //partition: reducedRate != Number
    //expected output: IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void test15() {
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

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 16
    //partition: reducedRate != Number
    //expected output: IllegalArgumentException
    @Test (expected = NumberFormatException.class)
    public void test16() {
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

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 17
    //partition: Multiple reducedPeriods overlap
    //expected output: IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void test17() {
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

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 18
    //partition: Multiple normalPeriods overlap
    //expected output: IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void test18() {
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

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 19
    //partition: reducedPeriods == null
    //expected output: NullPointerException
    @Test (expected = NullPointerException.class)
    public void test19() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod1 = new Period(9,13);
        normalPeriods.add(normalPeriod1);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod1 = null;
        normalPeriods.add(reducedPeriod1);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 20
    //partition: normalPeriods == null
    //expected output: NullPointerException
    @Test (expected = NullPointerException.class)
    public void test20() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = null;
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 21
    //partition: pass - staff
    //expected output: pass
    @Test
    public void test21() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 22
    //partition: pass - management
    //expected output: pass
    @Test
    public void test22() {
        CarParkKind kind = CarParkKind.MANAGEMENT;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //test 23
    //partition: pass - student
    //expected output: pass
    @Test
    public void test23() {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //--- Calculate method ---

    //test 24
    //expected output: pass
    @Test
    public void test24() {
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
    public void test25() {
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
    public void test26() {
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
    public void test27() {
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

    //---------------------------------------------------------------------------------------------------------------
    //------------------------------------------- New tests begin here ----------------------------------------------
    //-------------------------------------------      Task 2          ----------------------------------------------
    //---------------------------------------------------------------------------------------------------------------
    //branch coverage
    @Test(expected = IllegalArgumentException.class)
    public void test28()  {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = null;

        ArrayList<Period> reducedPeriods = null;

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @Test (expected = IllegalArgumentException.class)
    public void test29() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(20);
        BigDecimal reducedRate = new BigDecimal(15);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod1 = new Period(9,13);
        normalPeriods.add(normalPeriod1);
        Period normalPeriod2 = new Period(12,17);
        normalPeriods.add(normalPeriod2);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(14,19);
        reducedPeriods.add(reducedPeriod);
        Period reducedPeriod2 = new Period(18,21);
        reducedPeriods.add(reducedPeriod2);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @Test (expected = IllegalArgumentException.class)
    public void test30()  {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);

        ArrayList<Period> normalPeriods = null;

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,22);
        reducedPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @Test (expected = IllegalArgumentException.class)
    public void test31(){
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(10, 12);
        Period normalPeriod2 = new Period(12, 13);
        Period normalPeriod3 = new Period(14, 16);
        Period reducedPeriod1 = new Period(9, 13);
        Period reducedPeriod2 = new Period(20, 21);
        Period reducedPeriod3 = new Period(22, 23);

        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);
        normalPeriods.add(normalPeriod3);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);
        reducedPeriods.add(reducedPeriod3);
        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(5);
        CarParkKind kind = CarParkKind.STUDENT;

        new Rate(kind, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }


    //---------------------------------------------------------------------------------------------------------------
    //------------------------------------------- New tests begin here ----------------------------------------------
    //-------------------------------------------      Task 3          ----------------------------------------------
    //---------------------------------------------------------------------------------------------------------------


}
