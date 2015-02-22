class Test
{
    public static void main(String[] args)
    {
        testSum();
        testSub();
	testDiv();
    }

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }

        private static void testSub()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sub(a, b);
        if (result == expected)
        {
            System.out.println("Sub: OK");
        }
        else
        {
            System.out.println("Sub: Failed, expected = " + expected + ", result = " + result);
        }
    }
     private static void testDiv()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.div(a, b);
        if (result == expected)
        {
            System.out.println("Div: OK");
        }
        else
        {
            System.out.println("Div: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
