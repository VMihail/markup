package org.markup.elements;

import org.markup.intarfaces.TexAndMarkdown;

import java.util.List;

/**
 * Сильно выделенный текст. Для Markdown выделенный текст окружается символами '__',
 * Для Tex textbf{}.
 * @see AbstractMarkupElement
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:28
 */
public class Strong extends AbstractMarkupElement {
  /**
   * Тег для сильно выделенного текста в Markdown {@value #MARKUP_BORDER}
   */
  private static final String MARKUP_BORDER = "__";

  /**
   * Левая граница тега сильного выделения для Tex {@value #LEFT_TEX_BORDER}
   * @see AbstractMarkupElement#RIGHT_TEX_BORDER
   */
  private static final String LEFT_TEX_BORDER = "\\textbf{";

  /**
   * @see AbstractMarkupElement#AbstractMarkupElement(String, String, List)
   * @param elementList is not {@code null}
   */
  public Strong(final List<TexAndMarkdown> elementList) {
    super(MARKUP_BORDER, LEFT_TEX_BORDER, elementList);
  }
}