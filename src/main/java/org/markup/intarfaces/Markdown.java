package org.markup.intarfaces;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:17
 */
public interface Markdown {
  /**
   * Генерирует Markdown разметку. Метод может быть не реализован,
   * по условию домашнего задания.
   * @param sb is not {@code null}
   * @throws UnsupportedOperationException если это не требуется по условию
   */
  void toMarkdown(StringBuilder sb);
}
