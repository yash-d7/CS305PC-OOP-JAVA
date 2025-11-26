import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

class TreeDemo extends JFrame{
		Label l;
		
		TreeDemo(){
					super("JTree Demo");
					
					DefaultMutableTreeNode root =  new DefaultMutableTreeNode("Automobiles");
					DefaultMutableTreeNode cars =  new DefaultMutableTreeNode("Cars");
					
					cars.add(new DefaultMutableTreeNode("Audi"));
					cars.add(new DefaultMutableTreeNode("Bugatti"));
					cars.add(new DefaultMutableTreeNode("Ferrari"));
					cars.add(new DefaultMutableTreeNode("BMW"));
					root.add(cars);
					
					DefaultMutableTreeNode bikes =  new DefaultMutableTreeNode("Bikes");
					bikes.add(new DefaultMutableTreeNode("Harley Davidson"));
					bikes.add(new DefaultMutableTreeNode("BMW"));
					root.add(bikes);
					
					
					JTree jt = new JTree(root);
					JScrollPane jsp = new JScrollPane(jt);
					add(jsp);				
					
					setVisible(true);
					setSize(500,500);
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
					public static void main(String...args){
								new TreeDemo();
					}
	}
