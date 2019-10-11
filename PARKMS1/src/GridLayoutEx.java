import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		setTitle("Good ~~");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(1,1);  
		
		Calendar cal = Calendar.getInstance();
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
		String a ="";
		if(hour<12) {
			a="Good Morning";
		}
		if(hour>12 && hour<18) {
			a="Good Afternoon";
		}
		if(hour>=18) {
			a="Good Evening";
		}
		
		Container c = getContentPane();
		c.setLayout(grid);
		c.add(new JLabel(a));
		

		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridLayoutEx();
	}
}

