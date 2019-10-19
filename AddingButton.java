import javax.swing.*;
import java.awt.event.*;
public class AddingButton{
	public static void main(String args[]){
		JFrame f=new JFrame("Adding Button To Frame");
		JButton b=new JButton("click");
		final JTextField tf=new JTextField();
		tf.setBounds(100,50,150,30);
		b.setBounds(100,100,100,40);
		f.add(b);
		f.add(tf);
		f.setLayout(null);
		f.setSize(400,500);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			tf.setText("welcome to techtutes");
		}	
		});
	}
}