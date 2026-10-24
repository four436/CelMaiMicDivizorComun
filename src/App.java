import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class App extends JFrame {
    public JLabel a=new JLabel("a = ");
    public JLabel b=new JLabel("b = ");
    public JLabel cmmdc=new JLabel("cmmdc = ");
    public JLabel rez=new JLabel("             ");
    public JLabel cmmmc=new JLabel("cmmmc = ");
    public JLabel rez2=new JLabel("             ");
    public static JTextField aIn=new JTextField(10);
    public static JTextField bIn=new JTextField(10);
    public JButton calc=new JButton("Calculeaza");
    public static  int aint;
    public static int bint;
    public static void main(String[] args) throws Exception {
        JFrame window=new App();
        
        while (true) {
        
        try{
          aint =Integer.parseInt(aIn.getText());
        }catch(Exception e){System.out.println("doar cifre");
        }
        
        try{
          bint =Integer.parseInt(bIn.getText());
        }catch(Exception e){ System.out.println("doar cifre");
        }
    }
    }

    public App(){
        setSize(new Dimension(550,500));
        JPanel aPanel=new JPanel();
        aPanel.add(a);
        aPanel.add(aIn);
        a.setFont(new Font(getName(), ABORT, 48));
        aIn.setFont(new Font(getName(), ABORT, 48));
        JPanel bPanel=new JPanel();
        bPanel.add(b);
        bPanel.add(bIn);
        b.setFont(new Font(getName(), ABORT, 48));
        bIn.setFont(new Font(getName(), ABORT, 48));
        JPanel cmmdcPanel=new JPanel();
        cmmdc.setHorizontalAlignment(JLabel.RIGHT);
        cmmdcPanel.add(cmmdc);
        rez.setHorizontalAlignment(JLabel.LEFT);
        cmmdcPanel.add(rez);
        cmmdc.setFont(new Font(getName(), ABORT, 48));
        rez.setFont(new Font(getName(), ABORT, 48));


        JPanel cmmmcPanel=new JPanel();
        cmmmc.setHorizontalAlignment(JLabel.RIGHT);
        cmmmcPanel.add(cmmmc);
        rez2.setHorizontalAlignment(JLabel.LEFT);
        cmmmcPanel.add(rez2);
        cmmmc.setFont(new Font(getName(), ABORT, 48));
        rez2.setFont(new Font(getName(), ABORT, 48));



        JPanel buttonPanel=new JPanel();
        buttonPanel.add(calc);
        calc.setFont(new Font(getName(), ABORT, 48));
        calc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                mainloop:
            try{
                int n=aint;
                int m=bint;
                int x=aint;
                int y=bint;
                if(n==0||m==0||x==0||y==0)
                    break mainloop;
                while(n != m)
        if(n > m)
            n -= m;
        else
            m -= n;
            rez.setText(Integer.toString(n));

            
    rez2.setText(Integer.toString(x*y/n));
            }catch(Exception exp){ System.out.println("erorr"); }
            }
        
        });
        setLayout(new GridLayout(5, 1));
        add(aPanel);
        add(bPanel);
        add(cmmdcPanel);
        add(cmmmcPanel);
        add(buttonPanel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(0,0);
    }
}

    
