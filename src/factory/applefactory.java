package factory;
import interfaces.phone;
import interfaces.headphone;
import products.apple;
import products.appleheadphones;

public class applefactory extends company {
    public phone createPhone () {
        return new apple();
    }
    public headphone createHeadphone () {
        return new appleheadphones();
    }
}