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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //test 19
    //partition: reducedPeriods == null
    @Test (expected = IllegalArgumentException.class)
    public void test19() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod1 = new Period(9,13);
        normalPeriods.add(normalPeriod1);

        new Rate(kind, normalRate, reducedRate, null, normalPeriods);
    }

    //test 20
    //partition: normalPeriods == null
    @Test (expected = IllegalArgumentException.class)
    public void test20() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        reducedPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, null);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //--- Calculate method ---

    //test 24
    @Test
    public void test24() {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,17);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(17,21);
        normalPeriods.add(reducedPeriod);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(new BigDecimal("2"), rate.calculate(new Period(9,10)));
    }

    //test 25
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

        assertEquals(new BigDecimal("23.6250"), rate.calculate(new Period(9,10)));
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

        assertEquals(new BigDecimal("248.6250"), rate.calculate(new Period(10, 20)));
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

        assertEquals(new BigDecimal("248.6250"), rate.calculate(new Period(10,20)));
    }
    //calculate method end ^^^

    //---------------------------------------------------------------------------------------------------------------
    //------------------------------------------- New tests begin here ----------------------------------------------
    //-------------------------------------------      Task 2          ----------------------------------------------
    //---------------------------------------------------------------------------------------------------------------

    @Test(expected = IllegalArgumentException.class)
    public void test28()  {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = null;

        ArrayList<Period> reducedPeriods = null;

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
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

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }


    //---------------------------------------------------------------------------------------------------------------
    //------------------------------------------- New tests begin here ----------------------------------------------
    //-------------------------------------------      Task 3          ----------------------------------------------
    //---------------------------------------------------------------------------------------------------------------

    //kind = visitor
    //calculation < 8.00
    //amount should be free
    @Test
    public void test32(){
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        CarParkKind kind = CarParkKind.VISITOR;

        Period normalPeriod = new Period(9, 12);
        Period reducedPeriod = new Period(13, 18);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);
        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(new BigDecimal(0), rate.calculate(new Period(11,12)));
    }

    //kind = visitor
    //calculation == 8.00
    //amount should be 0.00
    @Test
    public void test33(){
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        CarParkKind kind = CarParkKind.VISITOR;

        Period normalPeriod = new Period(9, 12);
        Period reducedPeriod = new Period(13, 18);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);
        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(new BigDecimal(0), rate.calculate(new Period(9,11)));
    }

    //kind = visitor
    //calculation > 8.00
    //amount greater than 8.00 means return 50% of amount greater than 8.00
    @Test
    public void test34(){
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        CarParkKind kind = CarParkKind.VISITOR;

        Period normalPeriod = new Period(9, 12);
        Period reducedPeriod = new Period(13, 18);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);
        BigDecimal normalRate = new BigDecimal(3);
        BigDecimal reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(new BigDecimal("0.500"), rate.calculate(new Period(9,12)));
    }

    //kind = management
    //calculation < 3.00
    //return minimum payable of 3.00
    @Test
    public void test35(){
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        CarParkKind kind = CarParkKind.MANAGEMENT;

        Period normalPeriod = new Period(9, 12);
        Period reducedPeriod = new Period(13, 18);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);
        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(new BigDecimal("3.00"), rate.calculate(new Period(17,18)));
    }

    //kind = management
    //calculation > 3.00
    //return calculation
    @Test
    public void test36(){
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        CarParkKind kind = CarParkKind.MANAGEMENT;

        Period normalPeriod = new Period(9, 12);
        Period reducedPeriod = new Period(13, 18);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);
        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(new BigDecimal(5), rate.calculate(new Period(12,18)));
    }

    //kind = student
    //calculation > 5.50
    //amount above 5.50 receives 25% reduction
    @Test
    public void test37(){
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        CarParkKind kind = CarParkKind.STUDENT;

        Period normalPeriod = new Period(9, 12);
        Period reducedPeriod = new Period(13, 18);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);
        BigDecimal normalRate = new BigDecimal(3);
        BigDecimal reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);


        assertEquals(new BigDecimal("8.6250"), rate.calculate(new Period(12,17)));
    }

    //kind = student
    //calculation < 5.50
    //amount < 5.50 so does not receive 25% reduction
    @Test
    public void test38(){
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        CarParkKind kind = CarParkKind.STUDENT;

        Period normalPeriod = new Period(9, 12);
        Period reducedPeriod = new Period(13, 18);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);
        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(new BigDecimal(2), rate.calculate(new Period(9,10)));
    }

    //kind = staff
    //amount is > 16 and so return maximum payable of 16.00
    @Test
    public void test39(){
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        CarParkKind kind = CarParkKind.STAFF;

        Period normalPeriod = new Period(9, 12);
        Period reducedPeriod = new Period(13, 18);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);
        BigDecimal normalRate = new BigDecimal(3);
        BigDecimal reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        assertEquals(new BigDecimal("16.00"), rate.calculate(new Period(9,18)));
    }

    //kind = staff
    //amount is < 16 and so return amount
    @Test
    public void test40(){
        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        CarParkKind kind = CarParkKind.STAFF;

        Period normalPeriod = new Period(9, 12);
        Period reducedPeriod = new Period(13, 18);

        normalPeriods.add(normalPeriod);
        reducedPeriods.add(reducedPeriod);
        BigDecimal normalRate = new BigDecimal(3);
        BigDecimal reducedRate = new BigDecimal(2);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);

        if(rate.calculate(new Period(15,18)).compareTo(new BigDecimal("16.00")) == 1){
            throw new IllegalArgumentException(); //period calculation is not less than or equal to 16 so throw exception
        }
    }

    //---------------------------------------------------------------------------------------------------------------
    //------------------------------------------- Mistakes made in task 2 -------------------------------------------
    //--------------------------------------- To achieve 100 % branch coverage --------------------------------------
    //---------------------------------------------------------------------------------------------------------------

    //normalperiods == null
    @Test(expected = IllegalArgumentException.class)
    public void test41()  {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = null;

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(14,19);
        reducedPeriods.add(reducedPeriod);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //!isValidPeriods(normalPeriod) returns false
    @Test(expected = IllegalArgumentException.class)
    public void test42()  {
        CarParkKind kind = CarParkKind.STAFF;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("15");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod1 = new Period(9,13);
        normalPeriods.add(normalPeriod1);
        Period normalPeriod2 = new Period(12,17);
        normalPeriods.add(normalPeriod2);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(14,19);
        reducedPeriods.add(reducedPeriod);
        Period reducedPeriod2 = new Period(20,21);
        reducedPeriods.add(reducedPeriod2);

        new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //BUG - if periodStay == null should through IllegalArgumentException but throws NullPointerException
    //calculate input == null
    @Test (expected = IllegalArgumentException.class)
    public void test43() {
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
        rate.calculate(null);
    }

    //BUG
    //when normalRate and reducedRate are equal to eachother should not throw exception
    //according to specification

    //made changes to Rate class to fix this error
    @Test
    public void test44() {
        CarParkKind kind = CarParkKind.STUDENT;
        BigDecimal normalRate = new BigDecimal("20");
        BigDecimal reducedRate = new BigDecimal("20");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        Period normalPeriod = new Period(9,12);
        normalPeriods.add(normalPeriod);

        ArrayList<Period> reducedPeriods = new ArrayList<Period>();
        Period reducedPeriod = new Period(13,21);
        normalPeriods.add(reducedPeriod);

        Rate rate = new Rate(kind, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
}
