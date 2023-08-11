package taskmanagement;

import java.util.Scanner;

import models.Task;

public class TaskService {

	Scanner scanner = new Scanner(System.in);

	public Task createTask() {

		System.out.println("Enter Task Id");
		String taskId = scanner.nextLine();

		System.out.println("Enter Task Name");
		String taskName = scanner.nextLine();

		scanner.nextLine();

		Task task = new Task();
		task.setTaskId(taskId);
		task.setTaskName(taskName);

		System.out.println("My Task Details :");

		System.out.println(" Task Id " + taskId);
		System.out.println(" Task Name " + taskName);

		return task;

	}

}
