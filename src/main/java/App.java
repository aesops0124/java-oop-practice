/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public static void main(String[] args) {

        Mobile mobile = new Mobile ("mobilename", "black", "mobilebrand");
        mobile.makeACall("123");
        Mobile iphone = new iPhone ("iphonename", "white", "iphone");
        iphone.makeACall("234");
        Mobile android = new Android ("androidname", "blue", "android");
        android.makeACall("345");

    }
}
