public class SimpleThread extends Thread
{



    @Override
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + ": Итерация " + (i + 1));
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }

        }

    }
}
