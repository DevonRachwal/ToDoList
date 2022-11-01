import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TaskButton extends JButton {
	private Task task;
	
	
	
	public TaskButton(Task task) {
		this.task = task;
		setText(task.toString());
		addActionListener(new TaskButtonListener());
	}
	private class TaskButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(task.isComplete() == true) {
				task.setComplete(false);
				setForeground(Color.BLACK);
			}else {
				task.setComplete(true);
				setForeground(Color.gray);
			}
			setText(task.toString());
		}
		
	}
}
