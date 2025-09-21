package factory;

public class factoryprovider {
    public static company getfactory(String brand) {
        if (brand.equalsIgnoreCase("samsung")) {
            return new samsungfactory();
        } else if (brand.equalsIgnoreCase("apple")) {
            return new applefactory();
        }
        return null;
    }
}

