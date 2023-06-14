import javax.swing.*;
import java.awt.*;

public class PasswordGenerator extends JFrame{

    JLabel label1;
    JLabel label2;
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    JButton genButton;
    JTextField textField;
    Integer [] nums = {4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    JComboBox <Integer> comboBox;
    JCheckBox checkBox1;
    JCheckBox checkBox2;
    JCheckBox checkBox3;
    JCheckBox checkBox4;
    PasswordGenerator (){
        ImageIcon laptop = new ImageIcon("laptop.png");
        ImageIcon shield = new ImageIcon("shield.png");
        ImageIcon add = new ImageIcon("add.png");


        this.setIconImage(shield.getImage());
        this.setTitle("Password Generator");
        this.getContentPane().setBackground(new Color(0,128,128));
        this.setFont(new Font("Sansserif", Font.PLAIN,20));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(650,550);
        this.setResizable(false);
        this.setLayout( null);

        label1 = new JLabel("Generate your passwords here.");
        label1.setFont(new Font("MV Boli",Font.PLAIN,20));
        label1.setForeground(new Color(2111));
        label1.setBackground(new Color(0,128,128));
        label1.setOpaque(true);
        label1.setIcon(laptop);
        label1.setBounds(0,0,300,300);
        label1.setVerticalTextPosition(JLabel.TOP);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.LEFT);

        genButton = new JButton();
        genButton.setIcon(add);
        genButton.setFocusable(false);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200,30));


        panel1= new JPanel();
        panel1.setBounds(300,150,300,50);
        panel1.setBackground(new Color(0,128,128));
        panel1.setOpaque(true);
        panel1.setLayout(new FlowLayout());
        panel1.add(genButton);
        panel1.add(textField);

        label2 = new JLabel("Password Length");
        label2.setFont(new Font("MV Boli",Font.PLAIN,20));
        label2.setBackground(new Color(0,128,128));
        label2.setOpaque(true);

        comboBox = new JComboBox<>(nums);


        panel2 = new JPanel();
        panel2.setBounds(300,220,300,50);
        panel2.setBackground(new Color(0,128,128));
        panel2.setOpaque(true);
        panel2.setLayout(new FlowLayout());
        panel2.add(label2);
        panel2.add(comboBox);


        checkBox1 = new JCheckBox();
        checkBox1.setText("Add Uppercase");
        checkBox1.setFont(new Font("MV Boli",Font.PLAIN,20));
        checkBox1.setBackground(new Color(0,128,128));
        checkBox1.setOpaque(true);

        checkBox2 = new JCheckBox();
        checkBox2.setText("Add Lowercase");
        checkBox2.setFont(new Font("MV Boli",Font.PLAIN,20));
        checkBox2.setBackground(new Color(0,128,128));
        checkBox2.setOpaque(true);

        checkBox3 = new JCheckBox();
        checkBox3.setText("Add Numbers");
        checkBox3.setFont(new Font("MV Boli",Font.PLAIN,20));
        checkBox3.setBackground(new Color(0,128,128));
        checkBox3.setOpaque(true);

        checkBox4 = new JCheckBox();
        checkBox4.setText("Add Symbols");
        checkBox4.setFont(new Font("MV Boli",Font.PLAIN,20));
        checkBox4.setBackground(new Color(0,128,128));
        checkBox4.setOpaque(true);

        panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));
        panel3.setBackground(new Color(0,128,128));
        panel3.setOpaque(true);
        panel3.setBounds(300,300,300,200);
        panel3.add(checkBox1);
        panel3.add(checkBox2);
        panel3.add(checkBox3);
        panel3.add(checkBox4);



        this.add(label1);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.setVisible(true);
//        this.pack();
    }

}
