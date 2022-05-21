import com.antlr.FirstHomeworkLexer;
import com.antlr.FirstHomeworkParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Programm {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("test.txt");
            FirstHomeworkLexer lexer = new FirstHomeworkLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            FirstHomeworkParser parser = new FirstHomeworkParser(tokens);
            ParseTree tree = parser.progr();
            System.out.println(tree.toStringTree(parser));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
