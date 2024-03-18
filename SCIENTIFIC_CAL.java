package smartseba;

import java.awt.event.KeyEvent;


public class SCIENTIFIC_CAL extends javax.swing.JFrame {

    double firstnum;
    double secondnum;
    double result;
    String operation;
    private Object math;
    
    
    public SCIENTIFIC_CAL() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jtxtDisplay = new javax.swing.JTextField();
        jbtnBackspace = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtxtDisplay.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtxtDisplay.setToolTipText("");
        jtxtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDisplayActionPerformed(evt);
            }
        });
        jtxtDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDisplayKeyTyped(evt);
            }
        });

        jbtnBackspace.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jbtnBackspace.setText("⇦");
        jbtnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackspaceActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 5)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setText("√");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton4.setText("+");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton5.setText("6");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton6.setText("*");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton7.setText("4");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton8.setText("5");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton9.setText("3");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton10.setText("/");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton11.setText("1");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton12.setText("2");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton13.setText(" ±");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton14.setText("=");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton15.setText("0");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton16.setText(".");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton17.setText("9");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton18.setText("-");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton19.setText("7");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton20.setText("8");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton21.setText("Sin");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton22.setText("HEX");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton23.setText("Sinh");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton24.setText("Tan");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton25.setText("x^3");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton26.setText("Tanh");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton27.setText("Cos");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton28.setText("Cosh");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 8)); // NOI18N
        jButton29.setText("x^y");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton30.setText("Cbr");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton31.setText("π");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setFont(new java.awt.Font("Dialog", 1, 5)); // NOI18N
        jButton32.setText("RUND");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton33.setText("x^2");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton34.setText("Log");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jButton35.setText("BIN");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("STANDARD");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("SCIENTIFIC");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                    .addComponent(jbtnBackspace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addGap(43, 243, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 344, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jtxtDisplayActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        this.setResizable(true);
        this.setSize(305,505);
    }                                    

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setResizable(true);
        this.setSize(305,505);
    }                                          

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.setResizable(true);
        this.setSize(510,505);
        jtxtDisplay.setSize(480,39);
    }                                          

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        jtxtDisplay.setText("");
    }                                        

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops =Math.log(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {                                          
 
        String inum =jtxtDisplay.getText() + jButton19.getText();
        jtxtDisplay.setText(inum);
    }                                         

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       String inum =jtxtDisplay.getText() + jButton20.getText();
        jtxtDisplay.setText(inum);
    }                                         

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {                                          
      String inum =jtxtDisplay.getText() + jButton17.getText();
        jtxtDisplay.setText(inum);
    }                                         

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       String inum =jtxtDisplay.getText() + jButton7.getText();
        jtxtDisplay.setText(inum);
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String inum =jtxtDisplay.getText() + jButton8.getText();
        jtxtDisplay.setText(inum);
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String inum =jtxtDisplay.getText() + jButton5.getText();
        jtxtDisplay.setText(inum);
    }                                        

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String inum =jtxtDisplay.getText() + jButton11.getText();
        jtxtDisplay.setText(inum);
    }                                         

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String inum =jtxtDisplay.getText() + jButton12.getText();
        jtxtDisplay.setText(inum);
    }                                         

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       String inum =jtxtDisplay.getText() + jButton9.getText();
        jtxtDisplay.setText(inum);
    }                                        

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       String inum =jtxtDisplay.getText() + jButton15.getText();
        jtxtDisplay.setText(inum);
    }                                         

    private void jbtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String bsp= null;
        if(jtxtDisplay.getText().length()>0)
        {
        StringBuilder strB= new StringBuilder(jtxtDisplay.getText());
        strB.deleteCharAt(jtxtDisplay.getText().length()-1);
        bsp =strB.toString();
        jtxtDisplay.setText(bsp);
        
        }
            
    }                                             

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(!jtxtDisplay.getText().contains("."))
        {
            jtxtDisplay.setText(jtxtDisplay.getText() + jButton16.getText());
        }
        
    }                                         

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops = ops*(-1);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops =Math.sqrt(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                        

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops = Math.sin(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops =Math.sinh(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops =Math.cos(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops =Math.cosh(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {                                          
      double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops =Math.tan(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops =Math.tanh(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double ops;
        ops=(3.14159265358979323846264338);
        jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops =Math.round(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops =Math.cbrt(ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops =Math.pow(ops,ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops =(ops*ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops =(ops*ops*ops);
       jtxtDisplay.setText(String.valueOf(ops));
    }                                         

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       int a = Integer.parseInt(jtxtDisplay.getText());
       jtxtDisplay.setText(Integer.toString(a, 2));
       
    }                                         

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         int a = Integer.parseInt(jtxtDisplay.getText());
       jtxtDisplay.setText(Integer.toString(a, 16));
    }                                         

    private void jtxtDisplayKeyTyped(java.awt.event.KeyEvent evt) {                                     
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        
        }
    }                                    

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {                                          
         firstnum= Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operation=("-");
    }                                         

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {                                          
       String answer;
       secondnum= Double.parseDouble(jtxtDisplay.getText());
       if(operation =="+")
       {
          result= firstnum + secondnum;
          answer = String.format("%.2f", result);
          jtxtDisplay.setText(answer);
    }                                         
else if(operation =="-")
       {
           
          result= firstnum - secondnum;
          answer = String.format("%.2f", result);
          jtxtDisplay.setText(answer);
       }
       else if(operation =="*")
       {
           
          result= firstnum *secondnum;
          answer = String.format("%.2f", result);
          jtxtDisplay.setText(answer);
       }
       else if(operation =="/")
       {
           
          result= firstnum / secondnum;
          answer = String.format("%.2f", result);
          jtxtDisplay.setText(answer);
       }
       else if(operation =="%")
       {
           
          result= firstnum % secondnum;
          answer = String.format("%.2f", result);
          jtxtDisplay.setText(answer);
       }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        firstnum= Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operation=("+");
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         firstnum= Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operation=("*");
    }                                        

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        firstnum= Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText(null);
        operation=("/");
    }                                         
       

    /**
     * @param args the command line arguments
     */
    public SCIENTIFIC_CAL(String name) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SCIENTIFIC_CAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SCIENTIFIC_CAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SCIENTIFIC_CAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SCIENTIFIC_CAL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SCIENTIFIC_CAL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JButton jbtnBackspace;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration                   
}
