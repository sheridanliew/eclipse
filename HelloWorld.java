package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
public static void main(String[] args) {
	System.out.println("Hello, world!");
	JOptionPane.showMessageDialog(null, "Hello, world 2!");
	String name=JOptionPane.showInputDialog("Enter your name:");
	JOptionPane.showMessageDialog(null, "Hello, "+name+"!");
}
}
