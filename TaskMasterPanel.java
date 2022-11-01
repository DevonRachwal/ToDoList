import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 * Lesson 18-19: Activity - Task Master GUI
 * 
 * This class represents the main TaskMaster JPanel. 
 * 
 * It contains a ToDoListPanel and the control sub-panel.
 * 
 * @author CS121 Instructors
 * @version [semester]
 * @author [your name]
 */
@SuppressWarnings("serial")
public class TaskMasterPanel extends JPanel
{	
	private ToDoListPanel listPanel; 
	JTextField descriptionField = new JTextField(15);
	JButton addTaskButton = new JButton("Add Task");
	JScrollPane listScrollPane; 
	/**
	 * Creates a new TaskMasterPanel.
	 */
	public TaskMasterPanel()
	{
//		Task task1 = new Task("build the Button");
//		TaskButton button = new TaskButton(task1);
//		this.add(button);
		this.setPreferredSize(new Dimension(500, 400));		
		setLayout(new BorderLayout());
		listPanel = new ToDoListPanel("My TODO List");
		JPanel controlPanel = new JPanel();
		add(controlPanel, BorderLayout.SOUTH);
		add(listPanel, BorderLayout.CENTER);
		listPanel.addTask(new Task("Finish Activity 19"));
		listPanel.addTask(new Task("Finish everything",6));
		listPanel.addTask(new Task("Drink Beer"));
		listScrollPane = new JScrollPane(listPanel);
		listScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		listScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(listScrollPane, BorderLayout.CENTER);
		JButton getWorkButton = new JButton("Get Work");
		getWorkButton.addActionListener(new GetWorkButtonListener());
		addTaskButton.addActionListener(new addTaskListener());
		descriptionField.addActionListener(new addTaskListener());
		controlPanel.add(descriptionField);
		controlPanel.add(addTaskButton);
		controlPanel.add(getWorkButton);
		
	}
	private class GetWorkButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			listPanel.showWorkDialog();	
		}	
	}
	private class addTaskListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Task t = new Task(descriptionField.getText());
			listPanel.addTask(t);
			
		}
		
	}
}