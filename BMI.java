package smartseba;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BMI {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public BMI() {
        JFrame frame = new JFrame();
        frame.setBounds(650, 175, 550, 600);
        java.awt.Color c = new java.awt.Color(53,233,167);
        frame.getContentPane().setBackground(c);
        frame.setTitle("BMI CALCULATOR");

        JLabel L1 = new JLabel("Height (cm)");
        L1.setBounds(50, 50, 150, 50);
        L1.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(L1);
        frame.setLayout(null);
        
        JLabel L6 = new JLabel("BMI Categories):");
        L6.setBounds(400, 90, 150, 90);
        L6.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(L6);
        frame.setLayout(null);

        JLabel L2 = new JLabel("Weight (kg)");
        L2.setBounds(50, 100, 150, 50);
        L2.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(L2);
        frame.setLayout(null);

        JLabel L3 = new JLabel("BMI");
        L3.setBounds(50, 150, 150, 50);
        L3.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(L3);
        frame.setLayout(null);

        JLabel L4 = new JLabel("Result");
        L4.setBounds(50, 200, 150, 50);
        L4.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(L4);
        frame.setLayout(null);

        JTextField height = new JTextField();
        height.setBounds(200, 60, 150, 30);
        frame.add(height);

        JTextArea BMICategories = new JTextArea("Underweight = <18.5\n"+ "Normal = 18.5–24.9\n"+ "Overweight = 25–39.9\n"+ "Obese = >39.9");
        BMICategories.setBounds(370, 150, 160, 100);
        frame.add(BMICategories);

        JTextField weight = new JTextField();
        weight.setBounds(200, 110, 150, 30);
        frame.add(weight);

        JTextField bmi = new JTextField();
        bmi.setBounds(200, 160, 150, 30);
        frame.add(bmi);

        JTextField result = new JTextField();
        result.setBounds(200, 210, 150, 30);
        frame.add(result);

        JButton calculate = new JButton("Calculate");
        calculate.setBounds(70, 300, 120, 40);
        calculate.setFont(new Font("Arial", Font.PLAIN, 16));
        frame.add(calculate);

        JButton clear = new JButton("Clear");
        clear.setFont(new Font("Arial", Font.PLAIN, 16));
        clear.setBounds(250, 300, 120, 40);
        frame.add(clear);

        calculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                double h = Double.parseDouble(height.getText());
                double w = Double.parseDouble(weight.getText());

                try {
                    double BMI = w / ((h / 100) * (h / 100));
                    bmi.setText("" + df.format(BMI));

                    if (BMI <=18.4) {
                        result.setText(" Underweight!");
                    } else if (BMI >=18.5 || BMI < 24.9) {
                        result.setText(" Normal");
                    } else if (BMI >=25 || BMI < 39.9) {
                        result.setText(" Overweight!");
                    } else {
                        result.setText(" Obese!");
                    }

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                    System.err.println("Error: " + e);
                }
            }
        });

        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                height.setText("");
                weight.setText("");
                bmi.setText("");
                result.setText("");
            }
        });

        frame.setVisible(true);

    }

}
