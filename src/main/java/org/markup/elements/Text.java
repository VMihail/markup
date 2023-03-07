package org.markup.elements;

import org.markup.intarfaces.TexAndMarkdown;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:29
 */
public class Text implements TexAndMarkdown {
  private final String text;

  public Text(String text) {
    this.text = text;
  }

  @Override
  public void toMarkdown(StringBuilder sb) {
    appendTextToStringBuilder(sb);
  }

  @Override
  public void toTex(StringBuilder sb) {
    appendTextToStringBuilder(sb);
  }

  private void appendTextToStringBuilder(final StringBuilder sb) {
    sb.append(text);
  }
}
