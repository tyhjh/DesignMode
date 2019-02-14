package duty.filter;

public class Test {
    public static void main(String[] args) {
        MsgProcessor msgProcessor=new MsgProcessor("：)，敏感信息，<script>");
        msgProcessor.addFilter(new HtmlFilter());
        msgProcessor.process();
    }
}
