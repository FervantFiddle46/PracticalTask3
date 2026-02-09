public class ThreadTwo implements Runnable
{
    @Override
    public void run()
    {
        Thread.currentThread().setName("Время действовать");
        System.out.println(Thread.currentThread().getName() + ": Действие 1");
        try
        {
            Thread.sleep(400);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}