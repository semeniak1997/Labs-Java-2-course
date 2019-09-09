
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Shop {

    private String mName;
    private String[] mSections;
    private Product[] mProducts;
    private String[] mServices;

    Shop(String name, Product[] products, String[] services) {
        mName = name;
        mProducts = products;
        mServices = services;

        ArrayList<String> sectionsList = new ArrayList<>();
        for (Product product : mProducts)
            if (!sectionsList.contains(product.getProductSection()))
                sectionsList.add(product.getProductSection());

        String[] sections = new String[sectionsList.size()];
        for (int i = 0; i < sections.length; i++)
            sections[i] = sectionsList.get(i);

        mSections = sections;
    }

    public String getName() {
        return mName;
    }

    String[] getSections() {
        return mSections;
    }

    Product[] getProducts() {
        return mProducts;
    }

    String[] getServices() {
        return mServices;
    }

    static class Product {
        private String mProductName;
        private String mProductSection;

        Product(String productName, String productSection) {
            mProductName = productName;
            mProductSection = productSection;
        }

        String getProductName() {
            return mProductName;
        }

        String getProductSection() {
            return mProductSection;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Название:" + "\n\t").append(mName).append("\nОтделы:");
        for (String section : mSections)
            stringBuilder.append("\n\t").append(section);

        stringBuilder.append("\nТовары(отдел):");
        for (Product product : mProducts)
            stringBuilder.append("\n\t").append(product.mProductName).append("(").append(product.mProductSection).append(")");

        stringBuilder.append("\nУслуги:");
        for (String services : mServices)
            stringBuilder.append("\n\t").append(services);

        return stringBuilder.toString();
    }

public static void main(String args[]) {

    Shop shop;

    String[] tovVyp = new String[]{"Хлеб", "Батон", "Лаваш", "Пирог"};
    String[] tovMias = new String[]{"Свинина", "Говядина", "Курица", "Баранина"};
    String[] tovAlc = new String[]{"Виски", "Коньяк", "Водка", "Пиво", "Мартини", "Вино"};
    String[] tovHim = new String[]{"Порошок", "Моющее", "Освежитель", "Мыло"};

    String[] uslug = new String[]{"Рубка мяса", "Доставка"};

    ArrayList<Shop.Product> productsList = new ArrayList<>();
    for (Shop.Product product : Peredacha(tovVyp, "Выпечка"))
        productsList.add(product);
    for (Shop.Product product : Peredacha(tovMias, "Мясо"))
        productsList.add(product);
    for (Shop.Product product : Peredacha(tovAlc, "Алкоголь"))
        productsList.add(product);
    for (Shop.Product product : Peredacha(tovHim, "Химия"))
        productsList.add(product);

    Shop.Product[] products = new Shop.Product[productsList.size()];
    for (int i = 0; i < products.length; i++)
        products[i] = productsList.get(i);

    //отделы получаем из товаров
    shop = new Shop("Евроопт", products, uslug);

    //сортирует отделы
    Arrays.sort(shop.getSections());

    //сортирует товары по названию
    /*Arrays.sort(shop.getProducts(), new Comparator<Shop.Product>() {
        public int compare(Shop.Product o1, Shop.Product o2) {
            return o1.getProductName().compareTo(o2.getProductName());
        }
    });*/

    //сортирует товары по отделам
    Arrays.sort(shop.getProducts(), new Comparator<Shop.Product>() {
        public int compare(Shop.Product o1, Shop.Product o2) {
            return o1.getProductSection().compareTo(o2.getProductSection());
        }
    });

    //сортирует услуги
    Arrays.sort(shop.getServices());

    System.out.println(shop.toString());
}

private static Shop.Product[] Peredacha(String[] tovs, String otdel) {
    Shop.Product[] tovars = new Shop.Product[tovs.length];
    for (int i = 0; i < tovs.length; i++)
        tovars[i] = new Shop.Product(tovs[i], otdel);
    return tovars;

}
}

