public class iPhoneRobot{
    private String name;
    private iPhone iphone;

    public iPhoneRobot (String name, iPhone iphone) {
        this.name = name;
        this.iphone = iphone;
    }

    public void makeACall (String inputMessage) {
        this.iphone.makeACall(inputMessage);
    }
}
