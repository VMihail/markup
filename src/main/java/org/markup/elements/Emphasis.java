package org.markup.elements;

import org.markup.intarfaces.TexAndMarkdown;

import java.util.List;

/**
 * Выделенный текст. Для Markdown выделенный текст окружается символами '*',
 * Для Tex emph{}.
 * @see AbstractMarkupElement
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:26
 */
public class Emphasis extends AbstractMarkupElement {
  /**
   * Тег для выделенного текста в Markdown {@value #MARKUP_BORDER}
   */
  private static final String MARKUP_BORDER = "*";

  /**
   * Левая граница тега выделения для Tex {@value #LEFT_TEX_BORDER}
   * @see AbstractMarkupElement#RIGHT_TEX_BORDER
   */
  private static final String LEFT_TEX_BORDER = "\\emph{";

  /**
   * @see AbstractMarkupElement#AbstractMarkupElement(String, String, List)
   * @param elementList is not {@code null}
   */
  public Emphasis(final List<TexAndMarkdown> elementList) {
    super(MARKUP_BORDER, LEFT_TEX_BORDER, elementList);
  }
}
