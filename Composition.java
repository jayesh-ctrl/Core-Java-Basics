class Monitor{
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model,String manufacturer,int size,Resolution nativeResolution)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x,int y,String color)
    {
        System.out.println("Drawing pixel at "+x+","+y+" in colour "+color);
    }

    public String getModel()
    {
        return model;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public int getSize()
    {
        return size;
    }
    public Resolution getNativeResolution()
    {
        return nativeResolution;
    }
}
class Motherboard{
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model,String manufacturer,int ramSlots,int cardSlots,String bios)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName)
    {
        System.out.println("Program "+programName+ "is Loading...");
    }

    public String getModel(){
        return model;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public int getRamSlots(){
        return ramSlots;
    }
    public int getCardSlots()
    {
        return cardSlots;
    }
    public String getBios(){
        return bios;
    }
}

class Resolution{
    private int width;
    private int height;

    public Resolution(int width,int height)
    {
        this.width = width;
        this.height = height;
    }
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
}
class Case
{
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model,String manufacturer,String powerSupply,Dimensions dimensions)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply=powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton()
    {
        System.out.println("Power button pressed...");
    }
    public String getModel()
    {
        return model;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public String getPowerSupply(){
        return powerSupply;
    }
    public Dimensions getDimensions()
    {
        return dimensions;
    }
}
class Dimensions{
    private int width;
    private int height;
    private int depth;

    public Dimensions(int width,int height,int depth)
    {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public int getDepth()
    {
        return depth;
    }
}

class PC{
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public  PC(Case theCase,Monitor monitor,Motherboard motherboard)
    {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public void powerUp()
    {
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"yellow");
    }
    // private Case getTheCase()
    // {
    //     return theCase;
    // }

    // private Monitor getMonitor()
    // {
    //     return monitor;
    // }
    // private Motherboard getMotherboard()
    // {
    //     return motherboard;
    // }
}
public class Composition{
    public static void main(String []args)
    {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimensions);


        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200","Asus",4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
        // thePC.getMonitor().drawPixelAt(1500,1200,"red");

        // thePC.getMotherboard().loadProgram("Windows 1.0");
        // thePC.getTheCase().pressPowerButton();

        thePC.powerUp();
        

    }
}