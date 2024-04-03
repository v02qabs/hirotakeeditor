import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainActivity{
	String fname;
	String filename;
	public MainActivity(String fname){
		filename = this.fname;
	}
	public void initalized_MainActivity(){
		JFrame frame = new JFrame("JhiroEditor");
		JPanel _main_panel = new _Main_Panel();
		frame.add(_main_panel);
		frame.setBounds(0,0,900,900);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

