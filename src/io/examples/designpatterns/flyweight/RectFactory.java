package io.examples.designpatterns.flyweight;

import java.awt.*;
import java.util.HashMap;

/**
 * This factory only creates a new rectangle if it uses color not previously used
 * <p>
 * Intrinsic State: Color
 * Extrinsic State: X & Y Values
 */
public class RectFactory {

    /**
     * The HashMap uses the color as the key for every rectangle it will make
     * up to 8 total
     */
    private static final HashMap<Color, MyRect> rectsByColor = new HashMap<>();

    public static MyRect getRect(Color color) {

        MyRect rect = rectsByColor.get(color);

        /**
         * Checks if a rectangle with a specific color has been made. If not it makes a
         * new one, otherwise it returns one made already
         */

        if (rect == null) {
            rect = new MyRect(color);

            // Add new rectangle to HashMap

            rectsByColor.put(color, rect);

        }

        return rect;
    }

}
