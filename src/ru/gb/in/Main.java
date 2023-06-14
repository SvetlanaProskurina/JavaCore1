package ru.gb.in;

import ru.gb.otherclass.Calc;
import ru.gb.otherclass.Decoration;

public class Main {

  /**
   * ТОчка входа в программу, с нее все начинается
   * @param args стандартные аргументы командной строки
   */
  public static void main(String[] args) {
    int result = Calc.summary(3,4);
    System.out.println(Decoration.decorate(result));
    result = Calc.divide(3,4);
    System.out.println(Decoration.decorate(result));
    result = Calc.multiply(3,4);
    System.out.println(Decoration.decorate(result));
    result = Calc.subtraction(3,4);
    System.out.println(Decoration.decorate(result));
  }
}