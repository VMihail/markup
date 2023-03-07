package org.markup.intarfaces;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:17
 */
public interface ParagraphContent {
  void toMarkdown(StringBuilder sb);
  void toTex(StringBuilder sb);
}
