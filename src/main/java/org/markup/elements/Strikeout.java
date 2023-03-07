package org.markup.elements;

import org.markup.intarfaces.TexAndMarkdown;

import java.util.List;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:28
 */
public class Strikeout extends AbstractMarkupElement {
  private static final String MARKUP_BORDER = "~";
  private static final String LEFT_TEX_BORDER = "\\textst{";

  public Strikeout(final List<TexAndMarkdown> elementList) {
    super(MARKUP_BORDER, LEFT_TEX_BORDER, elementList);
  }
}