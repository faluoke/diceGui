package labDice;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Dice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dice frame = new Dice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Dice() {
		Random r = new Random();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		ImageIcon[] icons = {
				new ImageIcon(Dice.class.getResource("/labDice/die-1.png")),
				new ImageIcon(Dice.class.getResource("/labDice/die-2.png")),
				new ImageIcon(Dice.class.getResource("/labDice/die-3.png")),
				new ImageIcon(Dice.class.getResource("/labDice/die-4.png")),
				new ImageIcon(Dice.class.getResource("/labDice/die-5.png")),
				new ImageIcon(Dice.class.getResource("/labDice/die-6.png")),
		};
		JLabel label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setIcon(new ImageIcon(Dice.class.getResource("/labDice/die-1.png")));
		contentPane.add(label, BorderLayout.CENTER);
		
		JButton btnRollem = new JButton("Roll 'Em");
		btnRollem.setBorderPainted(false);
		btnRollem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icons[r.nextInt(icons.length)]);
			}
		});
		btnRollem.setForeground(Color.MAGENTA);
		btnRollem.setOpaque(true);
		btnRollem.setBackground(Color.BLACK);
		contentPane.add(btnRollem, BorderLayout.SOUTH);

	}

}
