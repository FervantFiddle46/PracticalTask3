public class RunnableTask implements Runnable
{


    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Задача в потоке " + Thread.currentThread().getName() + ": Шаг " + (i + 1));
            try
            {
                Thread.sleep(300);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

        }
    }

}
