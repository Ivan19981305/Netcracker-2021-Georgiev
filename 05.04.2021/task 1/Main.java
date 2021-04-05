package ivge;

import java.util.Arrays;
import java.util.LinkedList;


public class Main {

    public static void main(String[] args) throws NoSuchFieldException, ClassNotFoundException, NoSuchMethodException {
        Space space = new Space();

        System.out.println(Class.forName("ivge.Space"));
        System.out.println(space.getClass().getName());
        System.out.println(Space.class);

        System.out.println(Arrays.toString(space.getClass().getDeclaredFields()));
        System.out.println(space.getClass().getDeclaredField("name"));

        System.out.println(Arrays.toString(space.getClass().getFields()));
        System.out.println(space.getClass().getField("name"));

        System.out.println(Arrays.toString(space.getClass().getDeclaredMethods()));
        System.out.println(space.getClass().getDeclaredMethod("getCoordinates"));

        System.out.println(Arrays.toString(space.getClass().getMethods()));
        System.out.println(space.getClass().getMethod("getCoordinates"));


        /*
        class ivge.Space
ivge.Space
class ivge.Space
[public java.lang.String ivge.Space.name, private java.lang.Integer[] ivge.Space.coordinates]
public java.lang.String ivge.Space.name
[public java.lang.String ivge.Space.name]
public java.lang.String ivge.Space.name
[public java.lang.String ivge.Space.getName(), public java.lang.String ivge.Space.toString(), public void ivge.Space.setName(java.lang.String), private void ivge.Space.hide(), public void ivge.Space.setCoordinates(java.lang.Integer[]), public void ivge.Space.dropSpace(), public java.lang.Integer[] ivge.Space.getCoordinates()]
public java.lang.Integer[] ivge.Space.getCoordinates()
[public java.lang.String ivge.Space.getName(), public java.lang.String ivge.Space.toString(), public void ivge.Space.setName(java.lang.String), public void ivge.Space.setCoordinates(java.lang.Integer[]), public void ivge.Space.dropSpace(), public java.lang.Integer[] ivge.Space.getCoordinates(), public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException, public final void java.lang.Object.wait() throws java.lang.InterruptedException, public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException, public boolean java.lang.Object.equals(java.lang.Object), public native int java.lang.Object.hashCode(), public final native java.lang.Class java.lang.Object.getClass(), public final native void java.lang.Object.notify(), public final native void java.lang.Object.notifyAll()]
public java.lang.Integer[] ivge.Space.getCoordinates()

Process finished with exit code 0

         */
    }
}