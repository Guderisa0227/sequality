package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    // 2と3の和は5
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAve() {
    Calculate calculate = new Calculate();

    // 2と3の平均は2.5
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 0.001);
  }

  @Test
  public void testSumAll() {
    Calculate calculate = new Calculate();

    // 1から10までの平均は55
    int expected = 55;
    assertEquals(expected, calculate.sumAll(1, 10));

    // 逆順になっても同じ合計値
    assertEquals(expected, calculate.sumAll(10, 1));
  }

  @Test
  public void testAveAll() {
    Calculate calculate = new Calculate();

    // 1~10までの平均は5.5
    double expected = 5.5;
    assertEquals(expected, calculate.averageAll(1, 10), 0.001);
  }

  @Test
  public void testSumOdd() {
    Calculate calculate = new Calculate();

    // 1~10までの奇数の和は25
    int expected = 25;
    assertEquals(expected, calculate.sumOdd(1, 10));

    // 2~9までの奇数の和は24
    assertEquals(24, calculate.sumOdd(2, 9));
  }

  @Test
  public void testSumEven() {
    Calculate calculate = new Calculate();

    // 1~10までの偶数の和は30
    int expected = 30;
    assertEquals(expected, calculate.sumEven(1, 10));

    // 1~9までの偶数の和は20
    assertEquals(20, calculate.sumEven(1, 9));
  }

  // 同じ値の場合
  @Test
  public void testSameVariable() {
    Calculate calculate = new Calculate();

    // 同じ数の場合
    assertEquals(5, calculate.sumAll(5, 5));
    assertEquals(5.0, calculate.averageAll(5, 5), 0.001);

    // 奇数が一つの場合
    assertEquals(5, calculate.sumOdd(5, 5));
    assertEquals(0, calculate.sumEven(5, 5));

    // 偶数が一つの場合
    assertEquals(0, calculate.sumOdd(4, 4));
    assertEquals(4, calculate.sumEven(4, 4));
  }
}
