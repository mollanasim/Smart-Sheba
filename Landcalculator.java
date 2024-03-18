package smartseba;

public class Landcalculator extends javax.swing.JFrame {

    double area, total, price, totalarea;

    public Landcalculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField32 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField2.setText("Feet");

        jTextField3.setText("Feet");

        jLabel1.setText("Please input length and width");

        jLabel2.setText("Rectangale:-");

        jTextField4.setText("Feet");

        jLabel5.setText("calculate area of your land and its marker price");

        jLabel3.setText("Length-1");

        jTextField1.setText("Feet");

        jLabel4.setText("Width-1");

        jTextField5.setText("Feet");

        jTextField6.setText("Feet");

        jTextField7.setText("Feet");

        jTextField8.setText("Feet");

        jButton1.setText("Area of the Rectangular landpart( Squire-feet)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Triangle:-");

        jButton3.setText("reset value");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("length-1");

        jTextField9.setText("Feet");

        jTextField10.setText("Feet");
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        jTextField11.setText("Feet");

        jButton4.setText("reset value");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Area of the Triangular landpart( Squire-feet)");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setText("Length-2");

        jTextField12.setText("Feet");

        jTextField13.setText("Feet");

        jTextField14.setText("Feet");

        jLabel9.setText("Length-3");

        jTextField15.setText("Feet");

        jTextField16.setText("Feet");

        jTextField17.setText("Feet");

        jLabel10.setText("Length-2");

        jLabel11.setText("Width-1");

        jTextField18.setText("Feet");

        jTextField19.setText("Feet");

        jTextField20.setText("Feet");

        jTextField21.setText("Feet");

        jTextField22.setText("Feet");

        jTextField23.setText("Feet");

        jTextField24.setText("Feet");

        jTextField25.setText("Feet");

        jButton7.setText("Reset value");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel12.setText("Area of the Rectangular landpart( Hundredth)");

        jLabel13.setText("Area of the Triangular landpart( Hundredth)");

        jLabel14.setText("Enter the price (per hundredth)");

        jButton2.setText("Total price=");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("Total Area=");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(11, 11, 11)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(513, 513, 513)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                                        .addComponent(jTextField8)
                                                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(68, 68, 68)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(75, 75, 75)
                                                                                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGap(77, 77, 77)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(0, 113, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                                                                                .addComponent(jTextField5))
                                                                                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(62, 62, 62)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                                                                                .addComponent(jTextField6))
                                                                                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(44, 44, 44)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                                                                                .addComponent(jTextField7))))
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                                                                .addGap(41, 41, 41)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(202, 202, 202))))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(279, 279, 279)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(245, 245, 245)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(119, 119, 119)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(54, 54, 54)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(45, 45, 45)
                                                                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(jButton7)
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton1)
                                                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(35, 35, 35)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton5)
                                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton6)
                                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton2)
                                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        double a, b, c, d, e, f, g, h, i;
        a = Double.parseDouble(jTextField1.getText());
        b = Double.parseDouble(jTextField1.getText());
        c = Double.parseDouble(jTextField1.getText());
        d = Double.parseDouble(jTextField1.getText());
        e = Double.parseDouble(jTextField1.getText());
        f = Double.parseDouble(jTextField1.getText());
        g = Double.parseDouble(jTextField1.getText());
        h = Double.parseDouble(jTextField1.getText());
        i = Double.parseDouble(jTextField1.getText());

        double s1, s, area1, area2, area3;
        s = (a + b + c) / 2;
        s1 = s * (s - a) * (s - b) * (s - c);
        area1 = Math.sqrt(s1);

        double s3, s4, s5, s6;
        s3 = (d + e + f) / 2;
        s4 = s3 * (s3 - d) * (s3 - e) * (s3 - f);
        area2 = Math.sqrt(s4);

        s5 = (g + h + i) / 2;
        s6 = s5 * (s5 - g) * (s5 - h) * (s5 - i);
        area3 = Math.sqrt(s6);

        area = area1 + area2 + area3;
        double areah = area / 435.6;
        String sl = String.valueOf(area);

        jTextField28.setText(sl);
        String sp = String.valueOf(areah);
        jTextField29.setText(sp);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextField18.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField24.setText("");
        jTextField25.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p;
        a = Double.parseDouble(jTextField1.getText());
        b = Double.parseDouble(jTextField1.getText());
        c = Double.parseDouble(jTextField1.getText());
        d = Double.parseDouble(jTextField1.getText());
        e = Double.parseDouble(jTextField1.getText());
        f = Double.parseDouble(jTextField1.getText());
        g = Double.parseDouble(jTextField1.getText());
        h = Double.parseDouble(jTextField1.getText());
        i = Double.parseDouble(jTextField1.getText());
        j = Double.parseDouble(jTextField1.getText());
        k = Double.parseDouble(jTextField1.getText());
        l = Double.parseDouble(jTextField1.getText());
        m = Double.parseDouble(jTextField1.getText());
        n = Double.parseDouble(jTextField1.getText());
        o = Double.parseDouble(jTextField1.getText());
        p = Double.parseDouble(jTextField1.getText());

        double l1, w1, sum;
        l1 = (a + b + c + d) / 4;
        w1 = (e + f + g + h) / 4;
        sum = l1 * w1;

        double l2, w2, sum1;
        l2 = (i + j + k + l) / 4;
        w2 = (m + n + o + p) / 4;
        sum1 = l2 * w2;

        total = sum + sum1;
        String s = String.valueOf(total);

        jTextField26.setText(s);

        double hundredth;
        hundredth = total / 435.6;
        String s1 = String.valueOf(hundredth);
        jTextField27.setText(s1);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double totalprice;
        price = Double.parseDouble(jTextField30.getText());
        totalprice = totalarea * price;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        totalarea = total + area;
        jTextField32.setText(String.valueOf(totalarea));

    }//GEN-LAST:event_jButton6ActionPerformed

    public Landcalculator(String s) {

        java.awt.EventQueue.invokeLater(() -> {
            new Landcalculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private double s(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
