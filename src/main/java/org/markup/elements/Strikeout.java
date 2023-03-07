package org.markup.elements;

import org.markup.intarfaces.TexAndMarkdown;

import java.util.List;

/**
 * Зачеркнутый текст. Для Markdown выделенный текст окружается символами '~',
 * Для Tex textst{}.
 * @see AbstractMarkupElement
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:28
 */
public class Strikeout extends AbstractMarkupElement {
  /**
   * Тег для зачеркнутого текста в Markdown {@value #MARKUP_BORDER}
   */
  private static final String MARKUP_BORDER = "~";

  /**
   * Левая граница тега зачеркнутого текста для Tex {@value #LEFT_TEX_BORDER}
   * @see AbstractMarkupElement#RIGHT_TEX_BORDER
   */
  private static final String LEFT_TEX_BORDER = "\\textst{";

  /**
   * @see AbstractMarkupElement#AbstractMarkupElement(String, String, List)
   * @param elementList is not {@code null}
   */
  public Strikeout(final List<TexAndMarkdown> elementList) {
    super(MARKUP_BORDER, LEFT_TEX_BORDER, elementList);
  }
}