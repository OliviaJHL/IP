package duke.Tasks;

public class Event extends Task{
    protected String from;

    protected String to;

    public Event(String description, String from, String to, boolean isInFile) {
        super(description);
        this.from = from;
        this.to = to;

        if (!isInFile) {
            System.out.println(" " + "____________________________________________________________");
            System.out.println(" Got it. I've added this task:");
            System.out.println("  " + toString());
            System.out.println(" Now you have " + taskNum + " tasks in the list.");
            System.out.println(" " + "____________________________________________________________");
        }
    }
    @Override
    public String toString() {
        return "[E]" + "[" + getStatusIcon() + "] " + getDescription() +
                " (" + "from: " + this.from
                + " " + "to: " + this.to+ ")";
    }
    @Override
    public String file() {
        String status = isDone? "1" : "0";
        return "E | " + status + " | " + getDescription() + " | "
                + this.from
                + " | " + this.to;
    }
}
