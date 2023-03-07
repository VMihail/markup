package org.markup.elements;

import java.util.List;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 20:04
 */
public class UnorderedList extends AbstractMarkupList {
  private static final String LEFT_BORDER = "\\begin{itemize}";
  private static final String RIGHT_BORDER = "\\end{itemize}";

  public UnorderedList(List<ListItem> itemList) {
    super(LEFT_BORDER, RIGHT_BORDER, itemList);
  }
}
