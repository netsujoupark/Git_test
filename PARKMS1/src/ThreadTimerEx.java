import java.awt.*;
import java.util.Calendar;

import javax.swing.*;

class TimerThread extends Thread {
	private JLabel  timerLabel;
	
	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	
	}
	
	@Override
	public void run() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
	    int mon = cal.get(Calendar.MONTH);
	    int day = cal.get(Calendar.DAY_OF_MONTH);
	    int hour = cal.get(Calendar.HOUR_OF_DAY);
	    int min = cal.get(Calendar.MINUTE);
	    int sec = cal.get(Calendar.SECOND);
		while(true) {
			timerLabel.setText((Integer.toString(year))+"-"+(Integer.toString(mon+1))+"-"+(Integer.toString(day))+"-"+(Integer.toString(hour))+"-"+(Integer.toString(min))+"-"+(Integer.toString(sec)));
			sec++;
			if(sec==60) {
				sec =0;
				min++;
			}
			if(min==60) {
				min=0;
				hour++;
			}
			if(hour==24) {
				hour=0;
				day++;
			}
			try {
    			Thread.sleep(1000);
			
    		}
    		catch(InterruptedException e) {
    			return;
    			}

			
		}
	}


}
	public class ThreadTimerEx extends JFrame {
		public ThreadTimerEx() {
			setTitle("Runnable을 구현한 타이머 스레드 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			JLabel timerLabel = new JLabel();
			timerLabel.setFont(new Font("Gothic",Font.ITALIC,40));
			c.add(timerLabel);
			
			TimerThread th =new TimerThread(timerLabel);
			
			
			setSize(400,330);
			setVisible(true);
			
			th.start();
		}
		
		public static void main(String[] args) {
			new ThreadTimerEx();
		}
	}

