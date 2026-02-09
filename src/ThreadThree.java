public class ThreadThree implements Runnable
{
    @Override
    public void run()
    {
        Thread.currentThread().setName("Работяга");
        System.out.println(Thread.currentThread().getName() + ": Работа 1");
        try
        {
            Thread.sleep(600);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
