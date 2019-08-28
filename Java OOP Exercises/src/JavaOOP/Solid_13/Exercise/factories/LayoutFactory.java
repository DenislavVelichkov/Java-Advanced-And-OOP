package JavaOOP.Solid_13.Exercise.factories;

import JavaOOP.Solid_13.Exercise.interfaces.Factory;
import JavaOOP.Solid_13.Exercise.interfaces.Layout;
import JavaOOP.Solid_13.Exercise.models.SimpleLayout;
import JavaOOP.Solid_13.Exercise.models.XmlLayout;

public class LayoutFactory implements Factory<Layout> {

    @Override
    public Layout produce(String produceData) {
        Layout layout = null;
        if (produceData.equals("SimpleLayout")) {
            layout = new SimpleLayout();
        } else if (produceData.equals("XmlLayout")) {
            layout = new XmlLayout();
        }

        return layout;
    }
}
