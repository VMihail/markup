package org.markup.elements;

import org.markup.intarfaces.TexAndMarkdown;

import java.util.List;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:26
 */
public class Emphasis extends AbstractMarkupElement {
  private static final String MARKUP_BORDER = "*";

  private static final String LEFT_TEX_BORDER = "\\emph{";

  public Emphasis(final List<TexAndMarkdown> elementList) {
    super(MARKUP_BORDER, LEFT_TEX_BORDER, elementList);
  }
}
