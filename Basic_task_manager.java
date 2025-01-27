import com.simojava.taskmanager.TaskManager;
import com.simojava.taskmanager.Task;

public class Project_JS101 {
    public static void main(String[] args) {
        // Initialize the task manager
        TaskManager manager = new TaskManager();

        // Create and execute a simple task
        Task task = Task.builder()
            .name("EmailSender")
            .priority(Priority.HIGH)
            .action(() -> System.out.println("Sending email..."))
            .build();

        manager.executeTask(task);
    }
}
TaskManager manager = new TaskManager();

// Create a scheduled task that runs every hour
manager.scheduleTask(
    Task.builder()
        .name("DataBackup")
        .interval(Duration.ofHours(1))
        .action(() -> backupData())
        .build()
);
