public class ThreadOne extends Thread
{
    @Override
    public void run()
    {
        Thread.currentThread().setName("Вам письмо");
        System.out.println(Thread.currentThread().getName() + ": Сообщение 1");
        try
        {
            Thread.sleep(200);;
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
}
