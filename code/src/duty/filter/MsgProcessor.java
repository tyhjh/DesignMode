package duty.filter;

import java.util.ArrayList;
import java.util.List;

public class MsgProcessor {
    /**
     * 字符串信息
     */
    String msg;

    List<StringFilter> filterList = new ArrayList<>();

    public MsgProcessor(String msg) {
        this.msg = msg;
    }

    /**
     * 过滤信息
     *
     * @return
     */
    public String process() {
        String str = msg;
        for (StringFilter filter : filterList) {
            str = filter.doFilter(str);
        }
        return str;
    }

    /**
     * 添加过滤方法
     *
     * @param filter
     */
    public void addFilter(StringFilter filter) {
        filterList.add(filter);
    }

}
