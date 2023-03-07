package org.markup.elements;

import java.util.List;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 20:17
 */
public class OrderedList extends AbstractMarkupList {
  private static final String LEFT_BORDER = "\\begin{enumerate}";
  private static final String RIGHT_BORDER = "\\end{enumerate}";

  public OrderedList(List<ListItem> itemList) {
    super(LEFT_BORDER, RIGHT_BORDER, itemList);
  }
}
