import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField txtGuess; // text field for the user's guess
	private JLabel lblOutput;	 // label for too high/too low output
	private int theNumber;		 // the number we're trying to guess
	
	public void checkGuess() { // method/function to check too high or too low
		// get the user's guess
		String guessText = txtGuess.getText();
		String message = "";
		
		try {
					
				
				// check the guess for too high/too low
				int guess = Integer.parseInt(guessText);
				
				//too high
				if (guess > theNumber)
				{
					message = guess + " was to high. Guess again!";
					lblOutput.setText(message);
				}
				// too low
				else if (guess < theNumber)
				{
					message = guess + " was too low. Guess again!";
					lblOutput.setText(message);
				}
				else //guessesd correctly
				{
					message = guess + " was right! You win! Let's play again!";
					lblOutput.setText(message);
					newGame();
				}
			}
		catch(Exception e) {
			lblOutput.setText("Enter a whole number between 1 and 100.");
		}
		finally {
		txtGuess.requestFocus();
		txtGuess.selectAll();
		} 
	}
	public void newGame() { // create  a new random number 1..100
		
		theNumber = (int)(Math.random() *100 + 1);
		
	}
	
	public GuessingGame() {
		setTitle("Guessing Game");
		getContentPane().setBackground(new Color(102, 153, 204));
		setBackground(new Color(51, 204, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblDantesHiloGuessing = new JLabel("Dante's Hi-Lo Guessing Game");
		lblDantesHiloGuessing.setHorizontalAlignment(SwingConstants.CENTER);
		lblDantesHiloGuessing.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		lblDantesHiloGuessing.setBounds(6, 33, 438, 26);
		getContentPane().add(lblDantesHiloGuessing);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 0));
		panel.setBackground(new Color(102, 153, 204));
		panel.setBounds(48, 92, 354, 42);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Guess a number beteewn 1 and 100:");
		lblNewLabel.setBounds(19, 11, 228, 16);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		
		txtGuess = new JTextField();
		txtGuess.setForeground(new Color(255, 0, 0));
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		txtGuess.setBounds(247, 6, 69, 26);
		panel.add(txtGuess);
		txtGuess.setHorizontalAlignment(SwingConstants.CENTER);
		txtGuess.setColumns(10);
		
		JButton btnGuess =  new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setBounds(167, 167, 117, 29);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number above, and click Guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(82, 237, 289, 16);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(430, 330));
		theGame.setVisible(true);

	}
}
