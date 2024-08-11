import java.util.concurrent.Executor;

class SimpleExecutor implements Executor {
    @Override
    public void execute(Runnable task) {

        new Thread(task).start();         // (1a) Asynchronous call
//  task.run();                       // (1b) Synchronous call. Not recommended.
    }


    public static void main(String[] args) {
        // Client code
        SimpleExecutor executor = new SimpleExecutor();
        Runnable task = () -> System.out.println("Executing task ...");
        executor.execute(task);
    }
}