import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.Border;

public class Word_Counter {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		Border border = BorderFactory.createLineBorder(Color.BLACK);
		
		JLabel l1 = new JLabel();
		l1.setBounds(110, 40, 75, 20);
		
		JLabel l2 = new JLabel();
		l2.setBounds(210, 40, 125, 20);
		
		JTextArea t = new JTextArea("Input...");
		t.setFont(new Font("Arial", Font.PLAIN, 14));
	    t.setBorder(BorderFactory.createCompoundBorder(border, BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        t.setLineWrap(true);
        t.setWrapStyleWord(true);
        
        JScrollPane scrollPane = new JScrollPane(t);
        scrollPane.setBounds(100, 75, 200, 100);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		JButton b = new JButton("Count Words");
		b.setBounds(122, 200, 150, 20);
		
		f.add(l1); f.add(l2);
		f.add(b);
		f.add(scrollPane);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] words = t.getText().split("\\s");
				l1.setText("Words: " + words.length);
				l2.setText("Characters: " + t.getText().length());
			}
		});
	}

}
