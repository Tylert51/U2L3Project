public class Letter
{
    /** Prints out a complete letter by printing the greeting,
     Followed by the special message, followed by the closing */
    private String fromName;
    private String toName;


    public Letter(String fromName)
    {
        this.fromName = fromName;
    }
    public void writeLetter(String toName)
    {
        this.toName = toName;
        greeting();
        specialMessage();
        closing();

    }

    public void greeting()
    {
        System.out.println("Hello, " + toName + "!");
    }

    public void specialMessage()
    {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing()
    {
        System.out.println("See you later!");
        System.out.println("From, " + fromName);
    }
}

