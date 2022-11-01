import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ToDoListPanel extends JPanel{
	private ToDoList list;
	
	public ToDoListPanel (String name) {
		this.list = new ToDoList(name);
		JLabel label = new JLabel (name);
		add(label);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	public void addTask(Task t) {
		list.addTask(t);
		TaskButton button = new TaskButton(t);
		add(button);
		revalidate();
	}
	public void showWorkDialog() {
		if(list.getWork() == null) {
			JOptionPane.showMessageDialog(null, "Go Get Yourself a Beer");			
		}else {
			JOptionPane.showInternalMessageDialog(null, list.getWork().toString());
		}
	}

}
