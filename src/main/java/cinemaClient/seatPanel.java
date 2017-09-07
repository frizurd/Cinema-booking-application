package cinemaClient;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class seatPanel extends javax.swing.JPanel {

    private ClientFrame parentFrame;
    private clientThread thread;
    
    public seatPanel(String time, ClientFrame frame, clientThread thread) {
        initComponents();
        
        this.thread = thread;
        this.parentFrame = frame;
        seatLabel.setText("Select your seat for the movie on " + time + ".");
       
        calculateSeats();

        seatGroup.getSelection();
    }
    
    public void calculateSeats() {
                
        int[][] seatsAvailable = thread.getSeatsAvailable();

        JButton[][] buttonArray = {
            {s1, s2, s3, s4, s5, s6, s7, s8, s9, s10},
            {s11, s12, s13, s14, s15, s16, s17, s18, s19, s20},
            {s21, s22, s23, s24, s25, s26, s27, s28, s29, s30},
            {s31, s32, s33, s34, s35, s36, s37, s38, s39, s40}
        };

        int counter = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                buttonArray[i][j].setName(Integer.toString(counter));
                buttonArray[i][j].addActionListener((ActionEvent e) -> {
                    parentFrame.sendMsg(((JComponent) e.getSource()).getName());
                    parentFrame.dispose();
                    
                    BookMovie mv = new BookMovie();
                            
                    JOptionPane.showMessageDialog (null, "Your booking has been made!", 
                            "Success", JOptionPane.INFORMATION_MESSAGE);
                });

                if (seatsAvailable[i][j] == 1) {
                    buttonArray[i][j].setEnabled(false);
                }
                counter++;
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        seatGroup = new javax.swing.ButtonGroup();
        s1 = new javax.swing.JButton();
        s2 = new javax.swing.JButton();
        s3 = new javax.swing.JButton();
        s4 = new javax.swing.JButton();
        s5 = new javax.swing.JButton();
        s6 = new javax.swing.JButton();
        s7 = new javax.swing.JButton();
        s10 = new javax.swing.JButton();
        s8 = new javax.swing.JButton();
        s9 = new javax.swing.JButton();
        s12 = new javax.swing.JButton();
        s13 = new javax.swing.JButton();
        s14 = new javax.swing.JButton();
        s15 = new javax.swing.JButton();
        s16 = new javax.swing.JButton();
        s17 = new javax.swing.JButton();
        s20 = new javax.swing.JButton();
        s18 = new javax.swing.JButton();
        s11 = new javax.swing.JButton();
        s19 = new javax.swing.JButton();
        s22 = new javax.swing.JButton();
        s23 = new javax.swing.JButton();
        s24 = new javax.swing.JButton();
        s25 = new javax.swing.JButton();
        s26 = new javax.swing.JButton();
        s27 = new javax.swing.JButton();
        s30 = new javax.swing.JButton();
        s28 = new javax.swing.JButton();
        s21 = new javax.swing.JButton();
        s29 = new javax.swing.JButton();
        s32 = new javax.swing.JButton();
        s33 = new javax.swing.JButton();
        s34 = new javax.swing.JButton();
        s35 = new javax.swing.JButton();
        s36 = new javax.swing.JButton();
        s37 = new javax.swing.JButton();
        s40 = new javax.swing.JButton();
        s38 = new javax.swing.JButton();
        s31 = new javax.swing.JButton();
        s39 = new javax.swing.JButton();
        seatLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(595, 480));

        s1.setText("1");
        seatGroup.add(s1);

        s2.setText("2");
        seatGroup.add(s2);

        s3.setText("3");
        seatGroup.add(s3);

        s4.setText("4");
        seatGroup.add(s4);

        s5.setText("5");
        seatGroup.add(s5);

        s6.setText("6");
        seatGroup.add(s6);
        s6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6ActionPerformed(evt);
            }
        });

        s7.setText("7");
        seatGroup.add(s7);
        s7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s7ActionPerformed(evt);
            }
        });

        s10.setText("10");
        seatGroup.add(s10);

        s8.setText("8");
        seatGroup.add(s8);

        s9.setText("9");
        seatGroup.add(s9);

        s12.setText("12");
        seatGroup.add(s12);

        s13.setText("13");
        seatGroup.add(s13);

        s14.setText("14");
        seatGroup.add(s14);

        s15.setText("15");
        seatGroup.add(s15);

        s16.setText("16");
        seatGroup.add(s16);
        s16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s16ActionPerformed(evt);
            }
        });

        s17.setText("17");
        seatGroup.add(s17);
        s17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s17ActionPerformed(evt);
            }
        });

        s20.setText("20");
        seatGroup.add(s20);

        s18.setText("18");
        seatGroup.add(s18);

        s11.setText("11");
        seatGroup.add(s11);

        s19.setText("19");
        seatGroup.add(s19);

        s22.setText("22");
        seatGroup.add(s22);

        s23.setText("23");
        seatGroup.add(s23);

        s24.setText("24");
        seatGroup.add(s24);

        s25.setText("25");
        seatGroup.add(s25);

        s26.setText("26");
        seatGroup.add(s26);
        s26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s26ActionPerformed(evt);
            }
        });

        s27.setText("27");
        seatGroup.add(s27);
        s27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s27ActionPerformed(evt);
            }
        });

        s30.setText("30");
        seatGroup.add(s30);

        s28.setText("28");
        seatGroup.add(s28);

        s21.setText("21");
        seatGroup.add(s21);

        s29.setText("29");
        seatGroup.add(s29);

        s32.setText("32");
        seatGroup.add(s32);

        s33.setText("33");
        seatGroup.add(s33);

        s34.setText("34");
        seatGroup.add(s34);

        s35.setText("35");
        seatGroup.add(s35);

        s36.setText("36");
        seatGroup.add(s36);
        s36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s36ActionPerformed(evt);
            }
        });

        s37.setText("37");
        seatGroup.add(s37);
        s37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s37ActionPerformed(evt);
            }
        });

        s40.setText("40");
        seatGroup.add(s40);

        s38.setText("38");
        seatGroup.add(s38);

        s31.setText("31");
        seatGroup.add(s31);

        s39.setText("39");
        seatGroup.add(s39);

        seatLabel.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        seatLabel.setText("Select your seat for the movie on 12:00");

        jLabel1.setText("Movie screen");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s23, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s24, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s28, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s29, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s30, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(s31, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s32, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s33, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s34, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s35, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s36, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s37, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s38, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s39, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(s40, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(seatLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(seatLabel)
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s1)
                    .addComponent(s2)
                    .addComponent(s3)
                    .addComponent(s4)
                    .addComponent(s5)
                    .addComponent(s6)
                    .addComponent(s7)
                    .addComponent(s8)
                    .addComponent(s9)
                    .addComponent(s10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s11)
                    .addComponent(s12)
                    .addComponent(s13)
                    .addComponent(s14)
                    .addComponent(s15)
                    .addComponent(s16)
                    .addComponent(s17)
                    .addComponent(s18)
                    .addComponent(s19)
                    .addComponent(s20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s21)
                    .addComponent(s22)
                    .addComponent(s23)
                    .addComponent(s24)
                    .addComponent(s25)
                    .addComponent(s26)
                    .addComponent(s27)
                    .addComponent(s28)
                    .addComponent(s29)
                    .addComponent(s30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s31)
                    .addComponent(s32)
                    .addComponent(s33)
                    .addComponent(s34)
                    .addComponent(s35)
                    .addComponent(s36)
                    .addComponent(s37)
                    .addComponent(s38)
                    .addComponent(s39)
                    .addComponent(s40))
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void s6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s6ActionPerformed

    private void s7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s7ActionPerformed

    private void s16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s16ActionPerformed

    private void s17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s17ActionPerformed

    private void s26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s26ActionPerformed

    private void s27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s27ActionPerformed

    private void s36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s36ActionPerformed

    private void s37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s37ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton s1;
    private javax.swing.JButton s10;
    private javax.swing.JButton s11;
    private javax.swing.JButton s12;
    private javax.swing.JButton s13;
    private javax.swing.JButton s14;
    private javax.swing.JButton s15;
    private javax.swing.JButton s16;
    private javax.swing.JButton s17;
    private javax.swing.JButton s18;
    private javax.swing.JButton s19;
    private javax.swing.JButton s2;
    private javax.swing.JButton s20;
    private javax.swing.JButton s21;
    private javax.swing.JButton s22;
    private javax.swing.JButton s23;
    private javax.swing.JButton s24;
    private javax.swing.JButton s25;
    private javax.swing.JButton s26;
    private javax.swing.JButton s27;
    private javax.swing.JButton s28;
    private javax.swing.JButton s29;
    private javax.swing.JButton s3;
    private javax.swing.JButton s30;
    private javax.swing.JButton s31;
    private javax.swing.JButton s32;
    private javax.swing.JButton s33;
    private javax.swing.JButton s34;
    private javax.swing.JButton s35;
    private javax.swing.JButton s36;
    private javax.swing.JButton s37;
    private javax.swing.JButton s38;
    private javax.swing.JButton s39;
    private javax.swing.JButton s4;
    private javax.swing.JButton s40;
    private javax.swing.JButton s5;
    private javax.swing.JButton s6;
    private javax.swing.JButton s7;
    private javax.swing.JButton s8;
    private javax.swing.JButton s9;
    private javax.swing.ButtonGroup seatGroup;
    private javax.swing.JLabel seatLabel;
    // End of variables declaration//GEN-END:variables
}
