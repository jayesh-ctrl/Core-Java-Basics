
class Printer{
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel,boolean duplex,int pagesPrinted)
    {

        if(tonerLevel>=1 && tonerLevel<=100)
        this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount)
    {
        if(tonerAmount>0 && tonerAmount<=100)
        {
            if(this.tonerLevel + tonerAmount > 100)
            {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
        else{
            return -1;
        }
    }

    public int printPages(int pages)
    {
        int pagesToPrint = pages;
        if(this.duplex)
        {
            pagesToPrint/=2;
            System.out.println("printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted()
    {
        return pagesPrinted;
    }
}


public class Encapsulation1{
    public static void main(String []args)
    {
        Printer printer = new Printer(50,true,0);
        System.out.println("Initial Page count = "+printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("pages printed was "+pagesPrinted + " new total print count for printer = "+printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("pages printed was "+pagesPrinted + " new total print count for printer = "+printer.getPagesPrinted());

    }
}