package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (double) (x + y) / 2.0;
  }

  public int sumAll(int start, int end) {
    int sum = 0;

    if (start > end) {
      int temp = start;
      start = end;
      end = temp;
    }

    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public int sumOdd(int start, int end) {
    int sum = 0;

    if (start > end) {
      int temp = start;
      start = end;
      end = temp;
    }

    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }

  public int sumEven(int start, int end) {
    int sum = 0;

    if (start > end) {
      int temp = start;
      start = end;
      end = temp;
    }

    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public double averageAll(int start, int end) {
    int sum = sumAll(start, end);

    if (start > end) {
      int temp = start;
      start = end;
      end = temp;
    }

    int count = end - start + 1;
    return (double) sum / (double) count;
  }
}
