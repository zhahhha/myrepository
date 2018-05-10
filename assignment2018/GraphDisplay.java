package assignment2018;
import assignment2018.codeprovided.*;
import java.awt.*;
import javax.swing.*;
public class GraphDisplay extends JFrame{
	Board board;
	public GraphDisplay(Board b) {
		board=b;
		setTitle("chess");
		setSize(800,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contains = getContentPane();
		contains.setLayout(new GridLayout(0,8));
		for(int i=0;i<8;i++) {
			//the board
			for(int j=0;j<8;j++) {
				JLabel l = new JLabel();
				l.setSize(100,100);
				l.setLocation(i*100,j*100);
				if((i+j)%2==0){
					l.setBackground(Color.black);   
				    l.setOpaque(true);
				    l.setForeground(Color.white);
				    
				}
				if(b.getPiece(j, i)!=null)
				  l.setText(b.getPiece(j, i).toString());
				  l.setFont(new Font("Arial",Font.PLAIN,100));
				  
				l.setBorder(BorderFactory.createLineBorder(Color.black));   
				contains.add(l);
			}
			
			
			
		}
		JTextField inputx1=new JTextField(100);
		JTextField inputy1=new JTextField(100);
		JTextField inputx2=new JTextField(100);
		JTextField inputy2=new JTextField(100);
		contains.add(inputx1);
		contains.add(inputx2);
		contains.add(inputy1);
		contains.add(inputy2);
		//add pieces
		setVisible(true);
	}

}
