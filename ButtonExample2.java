import java.awt.event.*;
import javax.swing.*;
public class ButtonExample2
{
	ButtonExample2()
	{
		JFrame f=new JFrame("My Frame");
		JButton b=new JButton("click");
		b.setBounds(100,100,100,40);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String args[])
	{
		new ButtonExample2();
	}
}