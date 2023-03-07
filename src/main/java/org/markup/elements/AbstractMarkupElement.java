package org.markup.elements;

import org.markup.intarfaces.Markdown;
import org.markup.intarfaces.Tex;
import org.markup.intarfaces.TexAndMarkdown;

import java.util.List;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:18
 */
public abstract class AbstractMarkupElement implements TexAndMarkdown {
  protected static final String RIGHT_TEX_BORDER = "}";
  protected final String leftTexBorder;

  protected final String markupBorder;

  protected final List<TexAndMarkdown> elementList;

  protected AbstractMarkupElement(final String markupBorder, final String leftTexBorder, final List<TexAndMarkdown> elementList) {
    this.elementList = elementList;
    this.leftTexBorder = leftTexBorder;
    this.markupBorder = markupBorder;
  }

  @Override
  public void toMarkdown(StringBuilder sb) {
    sb.append(getBorder());
    for (Markdown paragraphContent : elementList) {
      paragraphContent.toMarkdown(sb);
    }
    sb.append(getBorder());
  }

  @Override
  public void toTex(StringBuilder sb) {
    sb.append(getLeftTexBorder());
    for (Tex paragraphContent : elementList) {
      paragraphContent.toTex(sb);
    }
    sb.append(RIGHT_TEX_BORDER);
  }

  public String getBorder() {
    return markupBorder;
  }

  public String getLeftTexBorder() {
    return leftTexBorder;
  }
}
