package org.markup.elements;

import org.markup.intarfaces.Markdown;
import org.markup.intarfaces.Tex;
import org.markup.intarfaces.TexAndMarkdown;

import java.util.List;

/**
 * Абстрактный класс, содержит общие детали реализации интерфейса {@link TexAndMarkdown}.
 * Содержит левые границы тега.
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:18
 */
public abstract class AbstractMarkupElement implements TexAndMarkdown {
  /**
   * Самая распространенная правая граница в Tex {@value #RIGHT_TEX_BORDER}.
   */
  protected static final String RIGHT_TEX_BORDER = "}";

  /**
   * Левая граница тега в Tex.
   */
  protected final String leftTexBorder;

  /**
   * Общая (левая и правая) граница тега в markdown.
   */
  protected final String markupBorder;

  /**
   * Список других элементов разметки {@link TexAndMarkdown}.
   */
  protected final List<TexAndMarkdown> elementList;

  /**
   * Стандартный конструктор.
   * Инициализировать объект можно передав ему список других элементов разметки.
   * @param elementList is not {@code null}, markupBorder и leftTexBorder могут иметь значение {@code null}
   */
  protected AbstractMarkupElement(final String markupBorder, final String leftTexBorder, final List<TexAndMarkdown> elementList) {
    this.elementList = elementList;
    this.leftTexBorder = leftTexBorder;
    this.markupBorder = markupBorder;
  }

  /**
   * @see Markdown#toMarkdown(StringBuilder)
   * @param sb is not {@code null}
   * @throws NullPointerException if {@link #elementList} is {@code null}
   */
  @Override
  public void toMarkdown(StringBuilder sb) {
    sb.append(getBorder());
    for (Markdown paragraphContent : elementList) {
      paragraphContent.toMarkdown(sb);
    }
    sb.append(getBorder());
  }

  /**
   * @see Tex#toTex(StringBuilder)
   * @param sb is not {@code null}
   * @throws NullPointerException if {@link #elementList} is {@code null}
   */
  @Override
  public void toTex(StringBuilder sb) {
    sb.append(getLeftTexBorder());
    for (Tex paragraphContent : elementList) {
      paragraphContent.toTex(sb);
    }
    sb.append(RIGHT_TEX_BORDER);
  }

  /**
   * Геттер {@link #markupBorder}.
   * @return markupBorder
   */
  public String getBorder() {
    return markupBorder;
  }

  /**
   * Геттер {@link #leftTexBorder}
   * @return leftTexBorder
   */
  public String getLeftTexBorder() {
    return leftTexBorder;
  }
}
