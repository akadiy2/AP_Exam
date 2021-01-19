import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Delimeters {
    private String openDel;
    private String closeDel;

    public Delimeters(String open, String close) {
        this.openDel  = open;
        this.closeDel = close;
    }

    // +5
    public boolean isBalanced(List<String> delimiters) {
        if (delimiters == null || delimiters.size() <= 1) {
            return false;
        }

        Stack<String> st = new Stack<>();
        for (String s : delimiters) {

            if (closeDel.equalsIgnoreCase(s)) {
                String str = st.isEmpty() ? "" : st.peek();
                if (str.equalsIgnoreCase(this.openDel)) {
                    st.pop();
                }
            } else {
                st.push(s);
            }
        }

        return st.isEmpty();
    }

    public List<String> getDelimitersList(String [] tokens) {
        if (tokens == null || tokens.length == 0) {
            return Collections.emptyList();
        }

        // + 4
        List<String> list = new ArrayList<>();
        for (String s : tokens) {
            if (s.equals(this.openDel) || s.equals(this.closeDel)) {
                list.add(s);
            }
        }

        return list;
    }
}
