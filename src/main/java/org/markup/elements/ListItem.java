package org.markup.elements;

import org.markup.intarfaces.Tex;
import org.markup.intarfaces.TexAndMarkdown;

import java.util.List;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 19:50
 */
public class ListItem extends AbstractMarkupElement implements TexAndMarkdown {
  private static final String texTag = "\\item ";

  public ListItem(List<TexAndMarkdown> elementList) {
    super(null, texTag, elementList);
  }

  @Override
  public void toTex(StringBuilder sb) {
    sb.append(texTag);
    for (Tex paragraphContent : elementList) {
      paragraphContent.toTex(sb);
    }
  }

  @Override
  public void toMarkdown(StringBuilder sb) {
    throw new UnsupportedOperationException("Not supported for tex element");
  }
}
