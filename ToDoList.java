import java.util.ArrayList;

public class ToDoList implements ToDoListInterface{
	private String name;
	private ArrayList<Task> tasks;
	
	public ToDoList(String name) {
		this.name = name;
		tasks = new ArrayList<Task>();
		
	}
	
	public String toString() {
		String list = "";
		for(Task t: tasks) {
			list = list.concat(t.toString() + "\n");
		}
		return "------------- \nMY TODO LIST\n-------------\n" + list;
		
	}
	public void addTask(Task task, Category category) {
		// TODO Auto-generated method stub
		Boolean b = false;
		for(Task t: tasks) {
			if(task.equals(t)) {
				b=true;
			}
		}
		if(b == false) {
			tasks.add(task);
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void addTask(Task task) {
		// TODO Auto-generated method stub
		Boolean b = false;
		for(Task t: tasks) {
			if(task.equals(t)) {
				b=true;
			}
		}
		if(b == false) {
			tasks.add(task);
		}
	}
	

	@Override
	public void addTask(String description) {
		// TODO Auto-generated method stub
		Boolean b = false;
		for(Task t: tasks) {
			if(t.getDescription().equals(description)) {
				b=true;
			}
		}
		if(b == false) {
			Task t = new Task(description);
			tasks.add(t);	
		}
	}

	@Override
	public Task getWork() {
		// TODO Auto-generated method stub
		Task maxTask = null;
		int max =-1;
		if (tasks.isEmpty()) {
			return null;
		}else {
			for(Task t:tasks){
				if((t.isComplete()) == false && t.getPriority() > max) {
					max = t.getPriority();
					maxTask = t;
				}}return maxTask;
			}
	}

	@Override
	public ArrayList<Task> getTaskList() {
		// TODO Auto-generated method stub
		return tasks;
	}

}
