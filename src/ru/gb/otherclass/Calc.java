package ru.gb.otherclass;

/**
 * Здесь можно описать основное назначение и способы взаимодействия с ним
 * */
public class Calc {

  /**
   * Функция вычисления суммы
   * @param a первое число для вычисления
   * @param b второе число для вычисления
   * @return результат вычисления двух числе a , b
   */
  public static int summary (int a,int b){
  return a+b;
}
  /**
   * Функция вычисления разницы
   * @param a первое число для вычисления
   * @param b второе число для вычисления
   * @return результат вычисления двух числе a , b
   */
  public static int subtraction (int a,int b){
    return a-b;
  }
  /**
   * Функция вычисления деления
   * @param a первое число для вычисления
   * @param b второе число для вычисления
   * @return result результат вычисления двух числе a , b
   */
  public static int divide(int a,int b){
    return b == 0? a : a/b;
  }
  /**
   * Функция вычисления умножения
   * @param a первое число для вычисления
   * @param b второе число для вычисления
   * @return результат вычисления двух числе a , b
   */
  public static int multiply(int a,int b){
    return a*b;
  }
}
