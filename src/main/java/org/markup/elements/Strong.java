package org.markup.elements;

import org.markup.intarfaces.ParagraphContent;

import java.util.List;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:28
 */
public class Strong extends AbstractMarkupElement {
  private static final String MARKUP_BORDER = "__";

  public Strong(final List<ParagraphContent> elementList) {
    super(elementList);
  }

  @Override
  protected String getBorder() {
    return MARKUP_BORDER;
  }
}