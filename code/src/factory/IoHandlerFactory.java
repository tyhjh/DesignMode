package factory;

public class IoHandlerFactory implements IoFactory {

    @Override
    public <T extends IoHandler> T createIoHandler(Class<T> tClass) {
        IoHandler ioHandler = null;
        try {
            ioHandler = (IoHandler) Class.forName(tClass.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) ioHandler;
    }

    public static void main(String[] args) {
        ServerHandler serverHandler=new IoHandlerFactory().createIoHandler(ServerHandler.class);
        SqlLiteHandler sqlLiteHandler=new IoHandlerFactory().createIoHandler(SqlLiteHandler.class);
    }

}
