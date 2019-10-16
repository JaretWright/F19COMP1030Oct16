public class ForLoopWarmUp {
    public static void main(String[] args)
    {
        for (int i=1; i<=26; i++)
        {
            System.out.printf("%d", i);

            if (i<26)
                System.out.printf(",");
        }

        System.out.printf("%nUsing the 2 line method%n");
        twoLineMethod();
    }

    public static void twoLineMethod()
    {
        for (int i=1; i<=26; i++)
            System.out.printf("%d%s",i, (i<26)?",":"");
    }
}
