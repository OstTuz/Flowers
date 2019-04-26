public class Home_flower extends Flower {

    enum Size{
        Small, Middle, Big;
    }

    String soil;
    Size pot_size;

    public Home_flower()
    {
        super();
        soil = "No type of earth";
        pot_size = null;
    }

    public  Home_flower(String name, double price, String color, int length, String soil, Size pot_size)throws NewException
    {
        super(name, price, color, length);
        this.soil = soil;
        this.pot_size = pot_size;
    }

    public String getSoil() {
        return soil;
    }

    public Size getPot_size() {
        return pot_size;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.print(getSoil()+" "+getPot_size());
    }
}
