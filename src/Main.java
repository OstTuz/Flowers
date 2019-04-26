import javax.sql.RowSet;
import java.util.ArrayList;

public class Main {

    public static ArrayList<Flower> Sort(ArrayList<Flower> bouquet) {
        Flower min = null;
        for (int i=0; i<bouquet.size()-1; i++)
        {
            min = bouquet.get(i);
            int i_min = i;

            for (int j = i+1; j<bouquet.size(); j++)
            {
                if (bouquet.get(j).getPrice() < min.getPrice())
                {
                    min = bouquet.get(j);
                    i_min = j;
                }
            }
            bouquet.set(i_min, bouquet.get(i));
            bouquet.set(i, min);
        }
        return bouquet;
    }

    public static void main(String[] args)throws NewException
    {
        Flower f1 = new Flower("Rose", 34.5, "Red", 20);
        Flower f2 = new Flower("Tulip", 56.7, "Yellow", 30);
        Flower f3 = new Flower("Alstromeria", 127.5, "Pink", 10);
        Flower f4 = new Flower("Rose", 14.5, "Red", 22);
        Flower f5 = new Flower("Tulpit", 54.5, "Pink", 25);
        Flower f6 = new Flower("Alstromeria", 12.5, "Pink", 10);
        Flower f7 = new Flower("Rose", 214.5, "White", 52);
        Flower f8 = new Flower("Tulpit", 54.5, "Red", 25);

        Flower hf1 = new Home_flower("Anturium", 300.5, "Red", 50, "Black soil", Home_flower.Size.Middle);
        Flower hf2 = new Home_flower("Angelonia", 600.5, "Blue", 90, "Black soil", Home_flower.Size.Big);
        Flower hf3 = new Home_flower("Geraniums", 100.5, "Green", 20, "Clay", Home_flower.Size.Small);


        ArrayList<Flower>flowers = new ArrayList<>();

        flowers.add(f1);
        flowers.add(f2);
        flowers.add(f3);
        flowers.add(f4);
        flowers.add(f5);
        flowers.add(f6);
        flowers.add(f7);
        flowers.add(f8);
        flowers.add(hf1);
        flowers.add(hf2);
        flowers.add(hf3);

        System.out.println("-----------All flowers----------");
        for (Flower f: flowers)
        {
            f.Display();
            System.out.println();
        }


        System.out.println("\n-----------Create only rose bouquet, sort flowers by price and cut them to minimal length----------");
        ArrayList<Flower>bouquet = new ArrayList<>();
        for (Flower f: flowers)
        {
            f.Create_bouquet(bouquet, "Rose");
        }
        Sort(bouquet);
        Flower.Cut_bouquet(bouquet);

        for (Flower f: bouquet)
            {
            f.Display();
            System.out.println();
        }

    }
}
