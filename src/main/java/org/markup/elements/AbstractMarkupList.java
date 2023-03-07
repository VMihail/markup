package org.markup.elements;

import org.markup.intarfaces.MarkupList;

import java.util.List;
import java.util.Objects;

/**
 * Общие детали реализации списка элементов разметки.
 * @see MarkupList
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 20:02
 */
public abstract class AbstractMarkupList implements MarkupList {
  /**
   * Левая граница тега.
   */
  protected final String leftBorder;

  /**
   * Правая граница тега.
   */
  protected final String rightBorder;

  /**
   * Элементы списка.
   * @see ListItem
   */
  protected final List<ListItem> itemList;

  /**
   * Стандартный конструктор.
   * @param leftBorder is not {@code null}
   * @param rightBorder is not {@code null}
   * @param itemList может принять значение is not {@code null},
   * тк при вызове {@link #toTex(StringBuilder)} броситься обещанный {@link NullPointerException}
   * @throws NullPointerException если нашелся {@code null}
   */
  public AbstractMarkupList(final String leftBorder, final String rightBorder, final List<ListItem> itemList) {
    this.itemList = itemList;
    this.leftBorder = Objects.requireNonNull(leftBorder);
    this.rightBorder = Objects.requireNonNull(rightBorder);
  }

  /**
   * @see AbstractMarkupElement#toMarkdown(StringBuilder)
   * @param sb is not {@code null}
   * @throws UnsupportedOperationException в этой реализации всегда
   */
  public void toMarkdown(StringBuilder sb) {
    throw new UnsupportedOperationException("Not supported for tex element");
  }

  /**
   * Переопределенная версия {@link AbstractMarkupElement#toTex(StringBuilder)}
   * @param sb is not {@code null}
   * @throws NullPointerException if {@link #itemList} is {@code null}
   */
  @Override
  public void toTex(StringBuilder sb) {
    sb.append(leftBorder);
    for (ListItem listItem : itemList) {
      listItem.toTex(sb);
    }
    sb.append(rightBorder);
  }
}
