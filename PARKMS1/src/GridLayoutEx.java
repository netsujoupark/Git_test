
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;

import javax.swing.*;

public class GridLayoutEx extends JFrame implements ActionListener {
	
	public static JLabel label_time = new JLabel();
	public static Calendar now = Calendar.getInstance();
	
	public GridLayoutEx() {
		this.setTitle("What time is it now?");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =this.getContentPane();
		c.setLayout(null);
		
		label_time.setBounds(150,20,200,50);
		c.add(label_time);
		
		JButton button = new JButton("Time");
		button.setBounds(20+180,100,100,30);
		c.add(button);
		button.addActionListener(this);
		setSize(500,300);
		setVisible(true);
	}

		public static void main(String[] args) {
			new GridLayoutEx();
			
		}

		


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource();
		if(button.getText().equals("Time")) {
			int hour = GridLayoutEx.now.get(Calendar.HOUR_OF_DAY);
	        int min = GridLayoutEx.now.get(Calendar.MINUTE);
	        int second = GridLayoutEx.now.get(Calendar.SECOND);
	        
	        
	        GridLayoutEx.label_time.setText("Now Time is "+hour + " : " + min + " : " + second );
		}
	}
}


