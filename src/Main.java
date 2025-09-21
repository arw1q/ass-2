import java.util.Scanner;
import factory.company;
import factory.factoryprovider;
import interfaces.phone;
import interfaces.headphone;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose brand (apple/samsung): ");
        String brand = scanner.nextLine();

        System.out.print("Choose product (phone/headphone): ");
        String productType = scanner.nextLine();

        company factory = factoryprovider.getfactory(brand.toLowerCase());
        if (factory == null) {
            System.out.println("Invalid brand");
            return;
        }

        if (productType.equalsIgnoreCase("phone")) {
            phone p = factory.createPhone();
            System.out.println("You created: " + p.getdesc());
        } else if (productType.equalsIgnoreCase("headphone")) {
            headphone h = factory.createHeadphone();
            System.out.println("You created: " + h.getdesc());
        } else {
            System.out.println("Invalid product");
        }

        scanner.close();
    }
}
