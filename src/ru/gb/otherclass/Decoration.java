package ru.gb.otherclass;

/**
 * Здесь можно описать основное назначение и способы взаимодействия с ним.
 * Декоратор. Он декорирует, ьо есть, накладывает на результат декорацию
 */
public class Decoration {

  /**
   * Функция декорирования числа для вывода в консоль
   * @param a число которое нужно как то обрамить в текст, например
   * @return возвращает отформатированную строку
   **/
  public static String decorate(int a){
    return String.format("Result of calculation is: %d",a);
  }
}
