
public class TaskMaster {
	public static void main(String[] args) {
		ToDoList tasks = new ToDoList("tasks");
//		ToDoList tasks1 = new ToDoList("tasks");
		
		Task task1 = new Task("Finish Activity 14");
		Task task2 = new Task("Give Tiger a bath", 10);
		Task task3 = new Task("Finish Activity 14");
		task2.setPriority(20);
		task1.setComplete(true);
		task3.setCategory(Category.PERSONAL);
		System.out.println(task1.toString());
		System.out.println(task2.toString());
		tasks.addTask(task1);
		tasks.addTask(task2);
		tasks.addTask(task3);
		tasks.addTask("finish");
		System.out.println(tasks.toString());
		
		if(task1.equals(task3)) {
			System.out.println("Task 1 and Task 3 are the same!");
		}else {
			System.out.println("Task 1 and Task 3 are the different!");
		}
		if(task1.compareTo(task2) == 0) {
			System.out.println("Task 1 and 2 are equal");
		}else if(task1.compareTo(task2) == 1) {
			System.out.println("Task 1 has a higher priority than task 2");
		}else {
			System.out.println("Task 1 has a lower priority than task 2");
		}
		if(task2.compareTo(task3) == 0) {
			System.out.println("Task 2 and 3 are equal");
		}else if(task2.compareTo(task3) == 1) {
			System.out.println("Task 2 has a higher priority than task 3");
		}else {
			System.out.println("Task 2 has a lower priority than task 3");
		}
	}
}
