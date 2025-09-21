package factory;
import interfaces.phone;
import interfaces.headphone;
import products.apple;
import products.appleheadphones;
import products.samsung;
import products.samsungheadphone;

public class samsungfactory extends company{
    public phone createPhone() {
        return new samsung();
    }
    public headphone createHeadphone() {
        return new samsungheadphone();
    }
}
