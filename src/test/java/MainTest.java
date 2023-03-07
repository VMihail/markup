import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.markup.elements.*;

import java.util.List;

/**
 * @author VMihail (vmihail399@gmail.com)
 * created: 07.03.2023 15:30
 */
public class MainTest {
  @Test
  public void testMarkup() {
    final String expected = "__1~2*34*5~6__";
    Paragraph paragraph = new Paragraph(List.of(
      new Strong(List.of(
        new Text("1"),
        new Strikeout(List.of(
          new Text("2"),
          new Emphasis(List.of(
            new Text("3"),
            new Text("4")
          )),
          new Text("5")
        )),
        new Text("6")
      ))
    ));
    StringBuilder result = new StringBuilder();
    paragraph.toMarkdown(result);
    Assertions.assertEquals(expected, result.toString());
  }

  @Test
  public void testTex() {
    final String excepted = "\\textbf{1\\textst{2\\emph{34}5}6}";
    Paragraph paragraph = new Paragraph(List.of(
      new Strong(List.of(
        new Text("1"),
        new Strikeout(List.of(
          new Text("2"),
          new Emphasis(List.of(
            new Text("3"),
            new Text("4")
          )),
          new Text("5")
        )),
        new Text("6")
      ))
    ));
    StringBuilder result = new StringBuilder();
    paragraph.toTex(result);
    Assertions.assertEquals(excepted, result.toString());
  }

  @Test
  public void testOrderedListTex() {
    final String excepted = "\\begin{enumerate}\\item hello\\emph{aaaa}\\item hello hello\\item \\emph{hahahha}\\end{enumerate}";
    Paragraph paragraph = new Paragraph(List.of(
      new OrderedList(List.of(
        new ListItem(List.of(new Text("hello"), new Emphasis(List.of(new Text("aaaa"))))),
        new ListItem(List.of(new Text("hello hello"))),
        new ListItem(List.of(new Emphasis(List.of(new Text("hahahha")))))
      ))
    ));
    StringBuilder result = new StringBuilder();
    paragraph.toTex(result);
    Assertions.assertEquals(excepted, result.toString());
  }

  @Test
  public void testUnorderedListTex() {
    final String excepted = "\\begin{itemize}\\item hello\\emph{aaaa}\\item hello hello\\item \\emph{hahahha}\\end{itemize}";
    Paragraph paragraph = new Paragraph(List.of(
      new UnorderedList(List.of(
        new ListItem(List.of(new Text("hello"), new Emphasis(List.of(new Text("aaaa"))))),
        new ListItem(List.of(new Text("hello hello"))),
        new ListItem(List.of(new Emphasis(List.of(new Text("hahahha")))))
      ))
    ));
    StringBuilder result = new StringBuilder();
    paragraph.toTex(result);
    Assertions.assertEquals(excepted, result.toString());
  }
}
