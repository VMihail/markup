package org.markup.elements;

import org.markup.intarfaces.MarkupList;

import java.util.List;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 20:02
 */
public abstract class AbstractMarkupList implements MarkupList {
  protected final String leftBorder;
  protected final String rightBorder;

  protected final List<ListItem> itemList;

  public AbstractMarkupList(final String leftBorder, final String rightBorder, final List<ListItem> itemList) {
    this.itemList = itemList;
    this.leftBorder = leftBorder;
    this.rightBorder = rightBorder;
  }

  public void toMarkdown(StringBuilder sb) {
    throw new UnsupportedOperationException("Not supported for tex element");
  }

  public void toTex(StringBuilder sb) {
    sb.append(leftBorder);
    for (ListItem listItem : itemList) {
      listItem.toTex(sb);
    }
    sb.append(rightBorder);
  }
}
