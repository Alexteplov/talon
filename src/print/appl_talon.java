package print;

import javax.swing.JFrame;
/*
import javax.swing.*;
import javax.swing.JTable;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
/*
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;

import javax.print.event.PrintJobAdapter;
import javax.print.event.PrintJobEvent;
*/

//import javax.swing.table.AbstractTableModel;

//import application.ColorEditor;
//import application.ColorRenderer;
//import print.TableDialogEditDemo;
//import application.TableDialogEditDemo.MyTableModel;

//import java.sql.*; 


//import java.text.*;
//import java.net.InetAddress;

// START APPLICATION
public class appl_talon {
	public static void  createAndShowGUI(){
        //Create and set up the window.
//		System.out.println("+");
		JFrame frame = new JFrame("АРМ регистратора версия от 23 октября 2013г.");
			 //exit
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//alternative exit
//			 frame.addWindowListener(new WindowAdapter(){	
//			 	public void windowClosing(WindowEvent e){
//			 		System.exit(0);
//				}
//			});
		  
	        JComponent newContentPane = new TableDialogEditDemo();
//	        newContentPane.setOpaque(true); //content panes must be opaque
//	        frame.setContentPane(newContentPane);

	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	}
	
	
	public static void main(String[] args){ 
			//throws PrintException, IOException{ 
		
			 
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
       javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
       });

    }
}
	
	

	
	
	  

	  
	  






