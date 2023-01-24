package duke.Tasks;

public class Task {
    protected String description;
    public boolean isDone;

    public static int taskNum;

    public Task (String description) {
        this.description = description;
        this.isDone = false;
        taskNum++;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return "[" + getStatusIcon() + "]" + this.description;
    }

    public String file() {
        String status = isDone? "1" : "0";
        return " | " + status + " | " + getDescription();
    }

}
