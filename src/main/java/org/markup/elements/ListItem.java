package org.markup.elements;

import org.markup.intarfaces.Tex;
import org.markup.intarfaces.TexAndMarkdown;

import java.util.List;

/**
 * Содержимое {@link org.markup.intarfaces.MarkupList}.
 * @see AbstractMarkupElement
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 19:50
 */
public class ListItem extends AbstractMarkupElement {
  /**
   * Тэг Tex.
   */
  private static final String texTag = "\\item ";

  /**
   * @param elementList is not {@code null}
   */
  public ListItem(final List<TexAndMarkdown> elementList) {
    super(null, texTag, elementList);
  }

  /**
   * Переопределенная реализация {@link AbstractMarkupElement#toTex(StringBuilder)}.
   * В этой реализации нет правой границы у тега.
   * @param sb is not {@code null}
   * @throws NullPointerException if {@link #elementList} is {@code null}
   */
  @Override
  public void toTex(final StringBuilder sb) {
    sb.append(texTag);
    for (final Tex paragraphContent : elementList) {
      paragraphContent.toTex(sb);
    }
  }

  /**
   * Не имеет реализации.
   * @see AbstractMarkupElement#toMarkdown(StringBuilder)
   * @throws UnsupportedOperationException always
   */
  @Override
  public void toMarkdown(final StringBuilder sb) {
    throw new UnsupportedOperationException("Not supported for tex element");
  }
}
