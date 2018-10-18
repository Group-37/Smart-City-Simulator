class Controller
{
    public static void main (String [] args)
    {
        Read_City r = new Read_City();
        r.openFile();
        r.readFile();
        r.closeFile();
    }
}