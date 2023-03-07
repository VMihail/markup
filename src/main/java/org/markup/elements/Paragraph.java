package org.markup.elements;

import org.markup.intarfaces.Markdown;
import org.markup.intarfaces.Tex;
import org.markup.intarfaces.TexAndMarkdown;

import java.util.List;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:27
 */
public class Paragraph implements TexAndMarkdown {
  private final List<TexAndMarkdown> elementList;

  public Paragraph(final List<TexAndMarkdown> elementList) {
    this.elementList = elementList;
  }

  @Override
  public void toMarkdown(StringBuilder sb) {
    for (Markdown paragraphContent : elementList) {
      paragraphContent.toMarkdown(sb);
    }
  }

  @Override
  public void toTex(StringBuilder sb) {
    for (Tex paragraphContent : elementList) {
      paragraphContent.toTex(sb);
    }
  }
}
