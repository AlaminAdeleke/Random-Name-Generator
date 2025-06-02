//Basic driver to use the Random Name Generator to Make then print a number of names.
public class driver
{
    public static void main(int num)
    {
        for(int i = 0 ; i < num ; i++)
            System.out.println(RandomName.make());
    }
}
