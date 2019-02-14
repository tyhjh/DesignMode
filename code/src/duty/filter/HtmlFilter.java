package duty.filter;

public class HtmlFilter implements StringFilter {
    @Override
    public String doFilter(String msg) {
        msg = msg.replace("<", "&lt;").replace(">", "&gt;");
        return msg;
    }
}
