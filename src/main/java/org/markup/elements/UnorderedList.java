package org.markup.elements;

import java.util.List;

/**
 * Ненумерованный список.
 * @see AbstractMarkupList
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 20:04
 */
public class UnorderedList extends AbstractMarkupList {
  /**
   * Левая граница тега {@value #LEFT_BORDER}.
   */
  private static final String LEFT_BORDER = "\\begin{itemize}";

  /**
   * Правая граница тега {@value #RIGHT_BORDER}.
   */
  private static final String RIGHT_BORDER = "\\end{itemize}";

  /**
   * Стандартный конструктор.
   * @param itemList элементы списка
   * @throws NullPointerException if {@link #itemList} is {@code null}
   */
  public UnorderedList(List<ListItem> itemList) {
    super(LEFT_BORDER, RIGHT_BORDER, itemList);
  }
}
