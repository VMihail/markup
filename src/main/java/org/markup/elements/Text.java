package org.markup.elements;

import org.markup.intarfaces.TexAndMarkdown;

import java.util.Objects;

/**
 * Произвольный текст для любой разметки.
 * @see TexAndMarkdown
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:29
 */
public class Text implements TexAndMarkdown {
  /**
   * Текст
   */
  private final String text;

  /**
   * @param text is not {@code}
   * @throws NullPointerException if text is {@code null}
   */
  public Text(String text) {
    this.text = Objects.requireNonNull(text);
  }

  /**
   * @see AbstractMarkupElement#toMarkdown(StringBuilder)
   * @param sb is not {@code null}
   */
  @Override
  public void toMarkdown(StringBuilder sb) {
    appendTextToStringBuilder(sb);
  }

  /**
   * @see AbstractMarkupElement#toTex(StringBuilder)
   * @param sb is not {@code null}
   */
  @Override
  public void toTex(StringBuilder sb) {
    appendTextToStringBuilder(sb);
  }

  private void appendTextToStringBuilder(final StringBuilder sb) {
    sb.append(text);
  }
}
