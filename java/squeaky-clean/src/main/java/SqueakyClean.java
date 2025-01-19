import java.lang.StringBuilder;
import java.util.ArrayList;
import java.lang.Character;

class SqueakyClean {
    static String clean(String identifier) {
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < identifier.length(); i++) {
        char c = identifier.charAt(i);
        switch (c) {
          case ' ':
            c = '_';
            break;
          case '-':
            char ch = identifier.charAt(i+1);
            c = Character.toUpperCase(ch);
            i++;
            break;
          case '4':
            c = 'a';
            break;
          case '3':
            c = 'e';
            break;
          case '0':
            c = 'o';
            break;
          case '1':
            c = 'l';
            break;
          case '7':
            c = 't';
            break;
          default:
            if(! Character.isLetter(c)) {
              continue;
            }
            break;
        }
        builder.append(c);
      }
        return builder.toString();
    }
}
