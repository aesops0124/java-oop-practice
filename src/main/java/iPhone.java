public class iPhone extends Mobile{
    public iPhone (String name, String color, String brand) {
        super(name,color,brand);
    }

    public void makeACall (String inputMessage) {
        if (inputMessage.length() <= 20)
            System.out.println("<iPhone>Message : " + inputMessage);
        else
            System.out.println("<iPhone>Message cannot be sent");
    }
}
