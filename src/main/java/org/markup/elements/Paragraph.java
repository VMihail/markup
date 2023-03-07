package org.markup.elements;

import org.markup.intarfaces.Markdown;
import org.markup.intarfaces.Tex;
import org.markup.intarfaces.TexAndMarkdown;

import java.util.List;

/**
 * Основной элемент разметки.
 * Содержит другие элементы разметки {@link TexAndMarkdown}.
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:27
 */
public class Paragraph implements TexAndMarkdown {
  /**
   * Список элементов разметки.
   */
  private final List<TexAndMarkdown> elementList;

  /**
   * Стандартный конструктор
   * @param elementList is not {@code null},
   * обещанный {@link NullPointerException} произойдет при вызове {@link #toMarkdown(StringBuilder)}
   * или {@link #toTex(StringBuilder)}
   */
  public Paragraph(final List<TexAndMarkdown> elementList) {
    this.elementList = elementList;
  }

  /**
   * @see Markdown#toMarkdown(StringBuilder)
   * @param sb is not {@code null}
   * @throws NullPointerException if {@link #elementList} is {@code null}
   */
  @Override
  public void toMarkdown(StringBuilder sb) {
    for (Markdown paragraphContent : elementList) {
      paragraphContent.toMarkdown(sb);
    }
  }

  /**
   * @see Tex#toTex(StringBuilder)
   * @param sb is not {@code null}
   * @throws NullPointerException if {@link #elementList} is {@code null}
   */
  @Override
  public void toTex(StringBuilder sb) {
    for (Tex paragraphContent : elementList) {
      paragraphContent.toTex(sb);
    }
  }
}
