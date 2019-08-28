package JavaOOP.InterfacesAndAbstraction_9.CarShop_1;

import java.io.Serializable;

public interface Car extends Serializable {
    int TIRES = 4;

    String getModel();
    String getColor();
    Integer getHorsePower();
}
