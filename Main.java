import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        VendingMashine VM = new VendingMashine();
        VM.initProductName(List.of(new Product("Marmelade", 9.9),(new Product("Water", 3.0)),(new Product("Chips", 7.8))));
        System.out.println(VM.getProductName());

        System.out.println();
        mashineCola colaMashine = new mashineCola();
        System.out.println();
        colaMashine.initProductName(List.of(new Product("Fanta", 8.9)));
        System.out.println(colaMashine.getProductName());

        System.out.println();
        VendingMashineHotDrinks vmHD = new VendingMashineHotDrinks();

        //vmHD.initProductName(List.of(new HotDrinks("Latte", 3.9, 85, 500),(new HotDrinks("GreenTea", 2.0, 90,300)),(new HotDrinks("BlackCoffe", 1.8, 95, 200))));
        //System.out.println(vmHD.getProductName());

        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Latte", 3.9, 85, 500),
                new HotDrinks("Latte", 8.9, 85, 1000),
                new HotDrinks("GreenTea", 2.0, 90,300),
                new HotDrinks("BlackCoffe", 1.8, 95, 200)));
        vmHD.initProduct(hotDrinksList);
        System.out.println();
        System.out.println(hotDrinksList);

        System.out.println();
        System.out.println("Поиск: " + vmHD.getProduct("Latte", 3.9, 85, 500));

    }
}