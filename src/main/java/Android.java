public class Android extends Mobile{
    public Android (String name, String color, String brand) {

        super(name,color,brand);
    }

    public void makeACall (String inputMessage) {

        if (inputMessage.length() <= 20)
            System.out.println("<Android>Message : " + inputMessage);
        else
            System.out.println("<Android>Message cannot be sent");
    }
}
