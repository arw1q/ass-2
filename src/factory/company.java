package factory;

import interfaces.phone;
import interfaces.headphone;

public abstract class company{
    public abstract phone createPhone ();
    public abstract headphone createHeadphone ();
}
