import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.script.*;
class calci extends JFrame
{
public static void main(String[] vmetupmoieumofdjytuj79oi)
{JFrame f=new JFrame();f.setDefaultCloseOperation(EXIT_ON_CLOSE);
f.setLayout(null);
f.setLocation(600,100);
f.setResizable(false);

	Label l1=new Label("Calculation:");
	Label l2=new Label("Result is:");
	JTextField tf1=new JTextField();
	JTextField tf2=new JTextField();tf2.setEnabled(false);
	JButton b2=new JButton("Clear");
	JButton b3=new JButton("Exit");
	JButton b4=new JButton("ON");
	JButton b5=new JButton("OFF");
	JButton b1=new JButton("Delete");
	JPanel p1=new JPanel();
	JButton[] btn=new JButton[16]; 
	
	tf2.setBackground(Color.white);
	tf1.setBackground(Color.white);
	
	for(int i=0;i<16;i++){
	btn[i]= new JButton();
	p1.add(btn[i]);}
	
	Font fnt= new Font("Arial", Font.BOLD, 35);
	Font fnt1= new Font("SansSerif", 2, 25);
	
	tf1.setFont(fnt1);tf2.setFont(fnt1);
for (Component comp : p1.getComponents()) {
    if (comp instanceof JButton) {
        ((JButton)comp).setFont(fnt);
    }
}
	 
	f.add(b1);	b1.setBounds(150,420,100,30);
	f.add(l1);
	f.add(tf1);
	f.add(l2);	f.add(tf2);	
	f.add(p1);
	f.add(b2);
	f.add(b3);f.add(b4);f.add(b5);
	b4.setBounds(320,10,75,40);b5.setBounds(320,50,75,40);
	p1.setVisible(true);p1.setLayout(new GridLayout(4,2,5,5));
	p1.setBounds(10,150,350,250);
	
	btn[12].setText("0");
	btn[13].setText(".");
	btn[14].setText("/");
	btn[15].setText("=");
	btn[8].setText("7");
	btn[9].setText("8");
	btn[10].setText("9");
	btn[11].setText("+");
	btn[4].setText("4");
	btn[5].setText("5");
	btn[6].setText("6");
	btn[7].setText("-");
	btn[0].setText("1");
	btn[1].setText("2");
	btn[2].setText("3");
	btn[3].setText("*");
	for(int i=0;i<16;i++){btn[i].setEnabled(false);}
	
l1.setBounds(10,5,90,20);
l2.setBounds(10,60,90,20);
tf1.setBounds(100,5,220,50);
tf2.setBounds(100,55,220,40);
b2.setBounds(10,420,80,30);
b3.setBounds(300,420,70,30);
f.setSize(400,500);
f.setTitle("Deva's CALCULATOR");
f.setVisible(true);
tf1.setEnabled(false);b5.setEnabled(false);

b1.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent e){
	String s=tf1.getText();
            tf1.setText("");
            for(int i=0;i<s.length()-1;i++)
            tf1.setText(tf1.getText()+s.charAt(i));
	}
});	
b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
	tf1.setEnabled(true);
	b4.setEnabled(false);b5.setEnabled(true);
	for(int i=0;i<16;i++){btn[i].setEnabled(true);}
}});
b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){
	tf1.setEnabled(false);
	b4.setEnabled(true);b5.setEnabled(false);
	for(int i=0;i<16;i++){btn[i].setEnabled(false);}
	tf1.setText(null);
		tf2.setText(null);
}});
b2.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent dj)
	{
		tf1.setText(null);
		tf2.setText(null);
	}
});
b3.addActionListener(new ActionListener()
{public void actionPerformed(ActionEvent d)
	{
		System.exit(0);
	}
});
btn[0].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[0].getText()));
			}
		}
		);	
		btn[1].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[1].getText()));
			}
		}
		);	
		btn[2].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[2].getText()));
			}
		}
		);	
		btn[3].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[3].getText()));
			}
		}
		);	
		btn[4].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[4].getText()));
			}
		}
		);	
		btn[5].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[5].getText()));
			}
		}
		);	
		btn[6].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[6].getText()));
			}
		}
		);	
		btn[7].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[7].getText()));
			}
		}
		);	btn[8].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[8].getText()));
			}
		}
		);	
		btn[9].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[9].getText()));
			}
		}
		);	
		btn[10].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[10].getText()));
			}
		}
		);	
		btn[11].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[11].getText()));
			}
		}
		);	
		btn[12].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[12].getText()));
			}
		}
		);	
		btn[13].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[13].getText()));
			}
		}
		);	
		btn[14].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				tf1.setText(tf1.getText()+(btn[14].getText()));
			}
		}
		);	
		btn[15].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				try
        {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");
            tf2.setText(engine.eval(tf1.getText()).toString());
        }
        catch(ScriptException e)
        {
            tf2.setText("Syntax error");
        }
			}
		}
		);	
}
}










