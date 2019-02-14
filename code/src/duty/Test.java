package duty;

public class Test {
    public static void main(String[] args) {
        Vacation vacation = new Vacation(10);
        new Test().leave(vacation);
    }



    public void leave(Vacation vacation) {
        User boss=new Boss();
        User director=new Director();
        User manager=new Manager();

        manager.nextUser=director;
        director.nextUser=boss;

        manager.handleRequest(vacation);
    }

}
