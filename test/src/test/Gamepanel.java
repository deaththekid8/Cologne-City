package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gamepanel extends JPanel implements ActionListener {

	

	JButton start_button;
	JButton links_button;
	JButton rechts_button;
	JButton died;
	JButton next;
	JLabel question;
	JLabel storybad;
	JLabel storygood;

	public Gamepanel() {
		super();

		setLayout(new BorderLayout());

		JPanel top = new JPanel();
		JPanel right = new JPanel();
		JPanel bottom = new JPanel();
		JPanel left = new JPanel();
		JPanel center = new JPanel();

		top.setBackground(new Color(58, 58, 58));
		right.setBackground(new Color(58, 58, 58));
		bottom.setBackground(new Color(58, 58, 58));
		left.setBackground(new Color(58, 58, 58));
		center.setBackground(new Color(58, 58, 58));

		top.setPreferredSize(new Dimension(100, 200));
		right.setPreferredSize(new Dimension(100, 100));
		bottom.setPreferredSize(new Dimension(100, 200));
		left.setPreferredSize(new Dimension(100, 100));
		center.setPreferredSize(new Dimension(100, 100));

		start_button = new JButton();
		start_button.setBackground(Color.DARK_GRAY);
		start_button.setBounds(600, 500, 250, 50);
		start_button.setText("START");
		start_button.addActionListener(this);
		start_button.setBorderPainted(false);
		start_button.setFocusable(false);
		start_button.setFont(new Font("Bitter thin", Font.BOLD, 50));
		start_button.setOpaque(false);
		start_button.setFocusPainted(false);
		start_button.setContentAreaFilled(false);

		links_button = new JButton();
		links_button.setBackground(Color.DARK_GRAY);
//		links.setHorizontalAlignment(links.CENTER);
		links_button.setText("WARTEN...");
		links_button.addActionListener(this);
//		links.setBorderPainted(false);
		links_button.setFocusable(false);
		links_button.setFont(new Font("Bitter thin", Font.BOLD, 50));
//		links.setOpaque(false);
		links_button.setFocusPainted(false);
//		links.setContentAreaFilled(false);
		links_button.setEnabled(false);
		links_button.setVisible(false);

		rechts_button = new JButton();
		rechts_button.setBackground(Color.DARK_GRAY);
//		rechts.setBounds(700, 500, 600, 50);
		rechts_button.setText("TIEFER IN DEN WALD");
		rechts_button.addActionListener(this);
//		rechts.setBorderPainted(false);
		rechts_button.setFocusable(false);
		rechts_button.setFont(new Font("Bitter thin", Font.BOLD, 50));
//		rechts.setOpaque(false);
		rechts_button.setFocusPainted(false);
//		rechts.setContentAreaFilled(false);
		rechts_button.setEnabled(false);
		rechts_button.setVisible(false);

		next = new JButton();
		next.setBackground(Color.DARK_GRAY);
		next.setBounds(900, 500, 600, 50);
		next.setText("YOU DIED !");
		next.addActionListener(this);
		next.setBorderPainted(false);
		next.setFocusable(false);
		next.setFont(new Font("Bitter thin", Font.BOLD, 50));
		next.setForeground(Color.RED);
		next.setOpaque(false);
		next.setFocusPainted(false);
		next.setContentAreaFilled(false);
		next.setEnabled(false);
		next.setVisible(false);

		died = new JButton();
		died.setBackground(Color.DARK_GRAY);
		died.setBounds(900, 500, 600, 50);
		died.setText("YOU DIED !");
		died.addActionListener(this);
		died.setBorderPainted(false);
		died.setFocusable(false);
		died.setFont(new Font("Bitter thin", Font.BOLD, 50));
		died.setForeground(Color.RED);
		died.setOpaque(false);
		died.setFocusPainted(false);
		died.setContentAreaFilled(false);
		died.setEnabled(false);
		died.setVisible(false);

		storybad = new JLabel();
		storybad.setBounds(40, 40, 650, 40);
		storybad.setText("Ein Bär nähert sich dir und frisst dich...");
		storybad.setVisible(false);
		storybad.setFont(new Font("Bitter thin", Font.BOLD, 50));
		storybad.setForeground(Color.WHITE);

		storygood = new JLabel();
		storygood.setBounds(100, 40, 1500, 100);
		storygood.setText("DU HAST DURST UND TRIFFST AUF EINEN KLEINEN BACH");
		storygood.setVisible(false);
		storygood.setFont(new Font("Bitter thin", Font.BOLD, 50));
		storygood.setForeground(Color.WHITE);

		question = new JLabel();
		question.setBounds(200, 40, 1200, 100);
		question.setText("DU BEFINDEST DICH IN EINEM DUNKLEN WALD");
		question.setVisible(false);
		question.setFont(new Font("Bitter thin", Font.BOLD, 50));
		question.setForeground(Color.WHITE);

		bottom.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));

		top.add(question);
		top.add(storybad);
		top.add(storygood);
		bottom.add(start_button);
		bottom.add(links_button);
		bottom.add(rechts_button);
		add(next);
		bottom.add(died);

		add(top, BorderLayout.NORTH);
//		add(right,BorderLayout.EAST);
		add(bottom, BorderLayout.SOUTH);
//		add(left,BorderLayout.WEST);
		add(center, BorderLayout.CENTER);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == start_button) {

			start_button.setEnabled(false);
			start_button.setVisible(false);
			links_button.setVisible(true);
			links_button.setEnabled(true);
			rechts_button.setEnabled(true);
			rechts_button.setVisible(true);
			question.setVisible(true);

		} else if (e.getSource() == links_button) {
			start_button.setEnabled(false);
			start_button.setVisible(false);
			storybad.setVisible(true);
			storygood.setVisible(false);
			died.setEnabled(true);
			died.setVisible(true);
			links_button.setVisible(false);
			rechts_button.setVisible(false);
			question.setVisible(false);

		} else if (e.getSource() == died) {
			start_button.setEnabled(false);
			start_button.setVisible(false);
			links_button.setVisible(true);
			links_button.setEnabled(true);
			rechts_button.setEnabled(true);
			rechts_button.setVisible(true);
			question.setVisible(true);
			storybad.setVisible(false);
			died.setVisible(false);

		} else {
			start_button.setEnabled(false);
			start_button.setVisible(false);
			storygood.setVisible(true);
			storybad.setVisible(false);
			links_button.setVisible(false);
			question.setVisible(false);
			rechts_button.setVisible(false);
			links_button.setText("Trinken");
			links_button.setVisible(true);
			rechts_button.setEnabled(true);

		}

	}

}
