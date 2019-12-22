
package pogriban.ex10;

/**
  * @author ThinkPad
 */
public class Sfera {

    public static void main(String args[]) {
        int radius = 2;
        System.out.println(sphereVolume(radius));
    }

    static double sphereVolume(int radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}
