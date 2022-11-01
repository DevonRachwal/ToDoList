
public class Task implements Comparable<Task> {
	private String desciption;
	private int priority;
	private Boolean complete;
	private Category category;
	
	
	public Task (String description) {
		this.desciption = description;
		priority =0;
		complete = false;
		category =Category.NONE;
	}
	
	public Task(String description, int priority) {
		this.desciption = description;
		this.priority = priority;
		complete = false;
		category = Category.NONE;
	}
	
	public String toString() {
		String comp;
		if(complete == true) {
			comp = "[X] ";
		}else {
			comp = "[ ] ";
		}
		
		return comp +  desciption + ", " + category.toString() + ", " + priority;
		
	}
	public Boolean equals(Task t) {
		boolean e;
		if(t.getDescription().equalsIgnoreCase(this.desciption) && t.getCategory().equals(this.getCategory())) {
			e = true;
		}else {
			e = false;
		}
		return e;
		
	}
	
	public int compareTo(Task t) {
		
		if(this.isComplete() == t.isComplete()){
			int priority1 = this.getPriority();
			int priority2 = t.getPriority();
			if(priority1 == priority2) {
				return 0;
			}else if(priority1 < priority2) {
				return -1;
			}else {
				return 1;
			}
		}else if(this.isComplete() == true) {
			return -1;
		}else {
			return 1;
		}
		
	}
	
	public String getDescription() {
		return desciption;
		
	}
	
	public void setDescription(String description) {
		this.desciption = description;
	}
	
	public Integer getPriority() {
		return priority;
		
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Boolean isComplete() {
		return complete;
		
	}
	public void setComplete(boolean t) {
		this.complete = t;
	}
	public Category getCategory() {
		return category;	
	}
	public void setCategory(Category category) {
		this.category = category;
	}

}
