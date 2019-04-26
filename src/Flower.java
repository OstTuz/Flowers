import java.util.ArrayList;

class NewException extends Exception{

    public NewException(String message) {
        System.out.println(message);
    }

}
public class Flower {

    String name;
    double price;
    String color;
    int length;

    public Flower()
    {
        name = "No name";
        price = 0;
        color = "No color";
        length = 0;
    }

    public Flower(String name, double price, String color, int length)throws NewException {
        this.name = name;
        this.price = price;
        this.color = color;
        if (length<1 || length>100)
        {
            throw new NewException("Flower's length can't be less than 1 and more than 100 !!!");
        }
        this.length = length;
    }

    public String getName()
    {
        return this.name;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length)throws NewException{
        if (length<1 || length>100)
        {
            throw new NewException("Flower's length can't be less than 1 and more than 100 !!!");
        }
        this.length = length;
    }

    public void Display() {
        System.out.print(getName()+" "+getPrice()+" "+getColor()+" "+getLength()+" ");
    }

    public ArrayList<Flower> Create_bouquet(ArrayList<Flower> bouqet, String name)
    {
        if (getName() == name)
        {
            bouqet.add(this);
        }
        return bouqet;
    }

    public static void Cut_bouquet(ArrayList<Flower> bouqet)throws NewException
    {
        int min_length = bouqet.get(0).getLength();
        for (Flower f : bouqet)
        {
            if (f.getLength()<min_length)
            {
                min_length = f.getLength();
            }
        }
        for (Flower f: bouqet)
        {
            f.setLength(min_length);
        }
    }

}
