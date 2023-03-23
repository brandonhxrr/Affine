package Affine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Start extends javax.swing.JFrame {

    int x, y; 
    static ImageIcon icon;
    
    public Start() {
        initComponents();
        close_btn.setIcon(new ImageIcon("src/main/java/icons/close_disabled.png")); 
        title.setIcon(new ImageIcon("src/main/java/icons/favicon.png"));
        bntGetFunction.setIcon(new ImageIcon("src/main/java/icons/encrypt_icon.png"));
        alert.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close_btn = new javax.swing.JButton();
        ins = new javax.swing.JLabel();
        bntGetFunction = new javax.swing.JButton();
        textN = new javax.swing.JTextField();
        title = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        textA = new javax.swing.JTextField();
        titlee = new javax.swing.JLabel();
        textB = new javax.swing.JTextField();
        titleb = new javax.swing.JLabel();
        title5 = new javax.swing.JLabel();
        title6 = new javax.swing.JLabel();
        decryptFunction = new javax.swing.JLabel();
        encryptFunction = new javax.swing.JLabel();
        alert = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        close_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        close_btn.setBorderPainted(false);
        close_btn.setContentAreaFilled(false);
        close_btn.setFocusable(false);
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close_btnMouseExited(evt);
            }
        });
        close_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                close_btnActionPerformed(evt);
            }
        });

        ins.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        ins.setText("Ingresa los siguientes valores");

        bntGetFunction.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        bntGetFunction.setText("Obtener función");
        bntGetFunction.setBorder(null);
        bntGetFunction.setContentAreaFilled(false);
        bntGetFunction.setFocusPainted(false);
        bntGetFunction.setFocusable(false);
        bntGetFunction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bntGetFunctionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bntGetFunctionMouseExited(evt);
            }
        });
        bntGetFunction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGetFunctionActionPerformed(evt);
            }
        });

        textN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textNMouseClicked(evt);
            }
        });

        title.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        title.setText("Affine");

        title2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        title2.setText("n");

        textA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textAMouseClicked(evt);
            }
        });

        titlee.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titlee.setText("α");

        textB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textBMouseClicked(evt);
            }
        });

        titleb.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titleb.setText("β");

        title5.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        title5.setText("Función de cifrado:");

        title6.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        title6.setText("Función de descifrado:");

        decryptFunction.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N

        encryptFunction.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N

        alert.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        alert.setForeground(new java.awt.Color(255, 0, 0));
        alert.setText("El valor no es válido, ingresa otro valor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bntGetFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(title)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ins)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(titlee)
                                        .addGap(18, 18, 18)
                                        .addComponent(textA, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(title2)
                                        .addGap(18, 18, 18)
                                        .addComponent(textN))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(titleb)
                                        .addGap(18, 18, 18)
                                        .addComponent(textB)))))))
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title5)
                    .addComponent(title6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(decryptFunction))
                    .addComponent(encryptFunction)
                    .addComponent(alert))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(close_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ins))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(title5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(title2)
                            .addComponent(textN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(encryptFunction)
                        .addGap(13, 13, 13)
                        .addComponent(title6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlee)
                    .addComponent(textA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decryptFunction))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleb)
                    .addComponent(textB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntGetFunction, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alert))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseEntered
        close_btn.setIcon(new ImageIcon("src/main/java/icons/close_enabled.png"));
    }//GEN-LAST:event_close_btnMouseEntered

    private void close_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseExited
        close_btn.setIcon(new ImageIcon("src/main/java/icons/close_disabled.png"));
    }//GEN-LAST:event_close_btnMouseExited

    private void close_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_close_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_close_btnActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        this.setLocation(this.getLocation().x + evt.getX()-x, this.getLocation().y + evt.getY()-y );
        this.setOpacity(0.9f);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        this.setOpacity(1f);
    }//GEN-LAST:event_jPanel1MouseReleased

    private void bntGetFunctionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntGetFunctionMouseEntered
        bntGetFunction.setForeground(new java.awt.Color(51, 51, 51));
        bntGetFunction.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK, 1));
    }//GEN-LAST:event_bntGetFunctionMouseEntered

    private void bntGetFunctionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntGetFunctionMouseExited
        bntGetFunction.setForeground(java.awt.Color.BLACK);
        bntGetFunction.setBorder(null);
    }//GEN-LAST:event_bntGetFunctionMouseExited

    private void bntGetFunctionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGetFunctionActionPerformed
        int n = !textN.getText().isEmpty() ? Integer.parseInt(textN.getText()) : 0;
        int a = !textA.getText().isEmpty() ? Integer.parseInt(textA.getText()) : 0;
        int b = !textB.getText().isEmpty() ? Integer.parseInt(textB.getText()) : 0;
        
        System.out.println("mcd: " + maximoComunDivisor(a, b));
        
        if(maximoComunDivisor(a, b) == 1){
            
            encryptFunction.setText("C = " + String.valueOf(a) + " p + " + String.valueOf(b) + " mod " + String.valueOf(n));
        }else {
            alert.setVisible(true);
        }
        
        
    }//GEN-LAST:event_bntGetFunctionActionPerformed

    private void textNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textNMouseClicked
        alert.setVisible(false);
    }//GEN-LAST:event_textNMouseClicked

    private void textAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAMouseClicked
        alert.setVisible(false);
    }//GEN-LAST:event_textAMouseClicked

    private void textBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textBMouseClicked
        alert.setVisible(false);
    }//GEN-LAST:event_textBMouseClicked

    public static int maximoComunDivisor(int a, int b) {
        int temporal;
        while (b != 0) {
            temporal = b;
            b = a % b;
            a = temporal;
        }
        return a;
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alert;
    private javax.swing.JButton bntGetFunction;
    private javax.swing.JButton close_btn;
    private javax.swing.JLabel decryptFunction;
    private javax.swing.JLabel encryptFunction;
    private javax.swing.JLabel ins;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textA;
    private javax.swing.JTextField textB;
    private javax.swing.JTextField textN;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    private javax.swing.JLabel titleb;
    private javax.swing.JLabel titlee;
    // End of variables declaration//GEN-END:variables
}
