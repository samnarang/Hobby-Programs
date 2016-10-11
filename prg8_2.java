class prg8_2
{
    void sumseries()
    {
        int x,sum=0,y=10;
        for(x=1;x<=10;x++)
        {
            sum+=x*y;
            y--;
        }
        System.out.println(sum);
    }
}