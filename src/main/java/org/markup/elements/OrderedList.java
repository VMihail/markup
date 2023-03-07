package org.markup.elements;

import java.util.List;

/**
 * Нумерованный список.
 * @see AbstractMarkupList
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 20:17
 */
public class OrderedList extends AbstractMarkupList {
  /**
   * Левая границе тега {@value #LEFT_BORDER}.
   */
  private static final String LEFT_BORDER = "\\begin{enumerate}";

  /**
   * Правая границе тега {@value #RIGHT_BORDER}
   */
  private static final String RIGHT_BORDER = "\\end{enumerate}";

  /**
   * Стандартный конструктор.
   * @param itemList элементы списка
   * @throws NullPointerException if {@link #itemList} is {@code null}
   */
  public OrderedList(final List<ListItem> itemList) {
    super(LEFT_BORDER, RIGHT_BORDER, itemList);
  }
}
