class Prg5
{
    double s,c;
    int x;
    void Q18_first()
    {
        for(x=1,s=0;x<=9;x++)
        s+=x*(x+1);
        System.out.println(s);
    }
    void Q18_second()
    {
        for(x=1,s=0;x<=9;x+=2)
        s+=x*(x+1);
        System.out.println(s);
    }
    void Q18_fourth()
    {
        for(x=1,s=0;x<=19;x+=2)
        s+=x-(x+1);
        System.out.println(s);
    }
    void Q18_fifth()
    {        
        for(c=1,s=1;c<=10;c++)
        s+=1/c;
        System.out.println(s);
    }
}

    