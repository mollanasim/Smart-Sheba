package smartseba;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class UserInterface extends javax.swing.JFrame {

    private int x, y;
    
    public UserInterface() {
        initComponents();
        //changeLookAndFeel();
        setLocationRelativeTo(null);
    }

    public void changeLookAndFeel(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(UserInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel.setBackground(new java.awt.Color(38, 50, 56));
        panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panel.setDoubleBuffered(false);
        panel.setFocusable(false);
        panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMouseDragged(evt);
            }
        });
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("LogoImageDream.png")));
        jLabel1.setOpaque(true);

        btnClose.setBackground(new java.awt.Color(55, 71, 79));
        btnClose.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("close");
        btnClose.setFocusable(false);
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jButton1.setText("BMI Calculator");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Scientific Calculator");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Land Calculator");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
       System.exit(0);
       
     
       
    }//GEN-LAST:event_btnCloseActionPerformed

    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        this.x = evt.getX();
        this.y = evt.getY();
    }//GEN-LAST:event_panelMousePressed

    private void panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - this.x, this.getLocation().y + evt.getY() - this.y);
    }//GEN-LAST:event_panelMouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     BMI o=new BMI() ;    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SCIENTIFIC_CAL o1=new SCIENTIFIC_CAL("Cal");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    Landcalculator b=new Landcalculator("Land");    
    }//GEN-LAST:event_jButton3ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
