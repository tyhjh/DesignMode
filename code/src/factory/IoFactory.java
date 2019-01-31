package factory;

public interface IoFactory {
    /**
     * 创建IoHandler
     *
     * @param tClass
     * @param <T>
     * @return
     */
    <T extends IoHandler> T createIoHandler(Class<T> tClass);
}
