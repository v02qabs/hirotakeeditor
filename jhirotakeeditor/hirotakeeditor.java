import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class hirotakeeditor{
	public hirotakeeditor(){
	}
	private static void start_editor(String progname, String fname){
		String hello = "ようこそ、hirotakeeditor へ.";
		System.out.println(hello);
		String filename = fname;
		System.out.println("0: " + progname + "\n" + "1:" + fname);
		new MainActivity(fname).initalized_MainActivity();
	}
	public static void main(String[] args){
		String args0 = args[0];
		String args1 = args[1];
		start_editor(args0, args1);
	}
	
}
