package duty.filter;

public interface StringFilter {
    /**
     * 过滤操作
     *
     * @param msg 源字符串
     * @return 过滤后字符串
     */
    String doFilter(String msg);
}
