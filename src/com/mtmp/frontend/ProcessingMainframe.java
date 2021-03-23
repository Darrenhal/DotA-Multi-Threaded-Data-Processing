package com.mtmp.frontend;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;

import com.mtmp.backend.dataaccess.APIKey;
import com.mtmp.backend.dataaccess.APIThread;

public class ProcessingMainframe extends JFrame{
	
	Toolkit toolkit = getToolkit().getDefaultToolkit();
	Dimension screen = toolkit.getScreenSize();
	
	private ArrayList<APIKey> apiKeys;
	private ArrayList<APIThread> apiThreadPool;
	
	public static void main(String[] args) {
		
	}
	
	
	public ProcessingMainframe() {
		
		setTitle("DotA Multi-Threaded Match Processing Mainframe");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(screen.width / 2, screen.height / 2);
		setLocation(screen.width / 4, screen.height / 4);
		
		setVisible(true);
		
	}
	
	public void fetchAPIKeys() {
		
	}
	
	public void initializeThreadPool() {
		
	}
	
}
