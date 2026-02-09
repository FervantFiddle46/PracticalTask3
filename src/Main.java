

class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread t = Thread.currentThread();

        t.getName();
        t.setName("start");

        t.getPriority();
        t.setPriority(5);
        t.setPriority(Thread.MIN_PRIORITY);
        t.setPriority(Thread.MAX_PRIORITY);
        t.setPriority(Thread.NORM_PRIORITY);

        t.getState();

        t.isAlive();
        t.isDaemon();

        t.isVirtual();

        t.threadId();

        System.out.println("Задание 1\n");

        SimpleThread st = new SimpleThread();
        st.start();
        st.join();


        System.out.println("\n");
        System.out.println("Задание 2\n");

        RunnableTask two = new RunnableTask();
        Thread NewTrhead  = new Thread(two);
        NewTrhead.start();
        NewTrhead.join();


        System.out.println("\n");
        System.out.println("Задание 3\n");

        ThreadOne oneT = new ThreadOne();
        ThreadTwo twoT = new ThreadTwo();
        ThreadThree threeT = new ThreadThree();
        Thread startTwoThread = new Thread(twoT);
        Thread startThreeThreead = new Thread(threeT);
        oneT.start();
        oneT.join();
        startTwoThread.start();
        startTwoThread.join();
        startThreeThreead.start();
        startThreeThreead.join();


        System.out.println("\n");
        System.out.println("Задание 4\n");

        NameThread name = new NameThread();
        name.start();
        name.join();



    }
}