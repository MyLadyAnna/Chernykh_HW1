import java.util.ArrayList;
import java.util.List;

public class VendingMashineHotDrinks extends VendingMashine{
    List<HotDrinks> hotDrinksList = new ArrayList<>();
    List<HotDrinks> resultFind = new ArrayList<>();

    public void initProduct(List<HotDrinks> list) {
        this.hotDrinksList = list;
        System.out.println("You added new drink to VendingMashineHotDrinks!");
    }

    public String getProduct(String name, double cost,int temp, double volume) {
        resultFind.clear();
        for (HotDrinks el: hotDrinksList) {
            if (el.getName().equalsIgnoreCase(name) && el.getCost() <= cost && el.getTemp() == temp && el.getVolume() == volume) resultFind.add(el);
        }
        return resultFind.toString();
    }
}
