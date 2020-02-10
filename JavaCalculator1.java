import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class JavaCalculator1 extends JFrame {

    double 1,2;
    public JButton jb1;
    public JButton jb2;
    public JButton jb3;
    public JButton jb4;
    public JButton jb5;
    public JButton jb6;
    public JButton jb7;
    public JButton jb8;
    public JButton jb9;
    public JButton jb0;
    public JButton jbEqual;

    public JButton jbAdd;
    public JButton jbSubtract;
    public JButton jbMultiply;
    public JButton jbDivide;
    public JButton jbSolve;
    public JButton jbClear;

    public double TEMP;
    public double SolveTEMP;
    public JTextField jtfResult;

    Boolean addBool = false;
    Boolean subBool = false;
    Boolean divBool = false;
    Boolean mulBool = false;

    String display = "";

    public JavaCalculator1() {

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 4));
        p1.add(jb1 = new JButton("1"));
        p1.add(jb2 = new JButton("2"));
        p1.add(jb3 = new JButton("3"));
        p1.add(jb4 = new JButton("4"));
        p1.add(jb5 = new JButton("5"));
        p1.add(jb6 = new JButton("6"));
        p1.add(jb7 = new JButton("7"));
        p1.add(jb8 = new JButton("8"));
        p1.add(jb9 = new JButton("9"));
        p1.add(jb0 = new JButton("0"));
        p1.add(jbClear = new JButton("C"));
        p1.add(jbSolve = new JButton("="));
        p1.add(jbAdd = new JButton("+"));
        p1.add(jbSubtract = new JButton("-"));
        p1.add(jbMultiply = new JButton("*"));
        p1.add(jbDivide = new JButton("/"));

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jtfResult = new JTextField(20));
        jtfResult.setHorizontalAlignment(JTextField.RIGHT);
        jtfResult.setEditable(false);

       
       

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(p2, BorderLayout.NORTH);
        p.add(p1, BorderLayout.SOUTH);
       

        add(p);

        jb1.addActionListener(new ListenTo());
        jb2.addActionListener(new ListenTo());
        jb3.addActionListener(new ListenTo());
        jbAdd.addActionListener(new ListenToAdd());
        jb4.addActionListener(new ListenTo());
        jb5.addActionListener(new ListenTo());
        jb6.addActionListener(new ListenTo());
        jbSubtract.addActionListener(new ListenToSubtract());
        jb7.addActionListener(new ListenTo());
        jb8.addActionListener(new ListenTo());
        jb9.addActionListener(new ListenTo());
        jbMultiply.addActionListener(new ListenToMultiply());
        jbClear.addActionListener(new ListenToClear());
        jb0.addActionListener(new ListenTo());
        jbSolve.addActionListener(new ListenToSolve());
        jbDivide.addActionListener(new ListenToDivide());
   
        

        setSize(200,200);
    }

    class ListenToClear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //display = jtfResult.getText();
            jtfResult.setText("");
            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;

            TEMP = 0;
            SolveTEMP = 0;
        }
    }


    class ListenTo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           
            display = jtfResult.getText();
            jtfResult.setText(display +e.getActionCommand());
        }
    }

   

    class ListenToAdd implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());
1=TEMP;
            jtfResult.setText(jtfResult.getText()+"+");
            addBool = true;
        }
    }

    class ListenToSubtract implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());1=TEMP;
            jtfResult.setText(jtfResult.getText()+"-");
            subBool = true;
        }
    }

    class ListenToMultiply implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());1=TEMP;
            jtfResult.setText(jtfResult.getText()+"*");
            mulBool = true;
        }
    }

    class ListenToDivide implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            TEMP = Double.parseDouble(jtfResult.getText());1=TEMP;
            jtfResult.setText(jtfResult.getText()+"/");
            divBool = true;
        }
    }

    class ListenToSolve implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String sb;
Double ans=0.0;
String st=jtfResult.getText();int s;
            if (addBool == true){
s=st.indexOf('+');
2=Double.parseDouble(st.substring(s+1));
ans=1+2;
                }
            else if (subBool == true){
s=st.indexOf('-');
2=Double.parseDouble(st.substring(s+1));
ans=1-2;
                }
            else if (mulBool == true){
s=st.indexOf('*');
2=Double.parseDouble(st.substring(s+1));
ans=1*2;
                }
            if (divBool == true){
s=st.indexOf('/');
2=Double.parseDouble(st.substring(s+1));
ans=1/2;
                }
            jtfResult.setText(  Double.toString(ans));

            addBool = false;
            subBool = false;
            mulBool = false;
            divBool = false;
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        JavaCalculator1 calc = new JavaCalculator1();
        calc.pack();
        calc.setLocationRelativeTo(null);
                calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setVisible(true);
    }

}
