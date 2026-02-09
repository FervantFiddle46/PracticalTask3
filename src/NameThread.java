public class NameThread extends Thread
{
    public void run()
    {
        for (int i = 0; i < 6; i++)
        {
            Thread.currentThread().setName("Выполнение");
            if (i == 0)
            {
                System.out.println(Thread.currentThread().getName() + " начал работу");
            }
            else if (i == 5)
            {
                System.out.println(Thread.currentThread().getName() + " закончил работу");
            }
            else
            {
                    System.out.println(Thread.currentThread().getName() + ": выполнение " + i);
                }

            try
            {
                Thread.sleep(400);
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }

    }
}
