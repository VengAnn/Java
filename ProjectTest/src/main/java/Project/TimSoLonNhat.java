
package Project;

import javax.swing.JOptionPane;


public class TimSoLonNhat extends javax.swing.JFrame {


    public TimSoLonNhat() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Do_dai_cua_Mang = new javax.swing.JTextField();
        TimSoLonNhat = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_KetQua = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nhap Do dai cua Mang:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tim So Lon nhat Trong Mang");

        txt_Do_dai_cua_Mang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Do_dai_cua_MangKeyPressed(evt);
            }
        });

        TimSoLonNhat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TimSoLonNhat.setText("Tim So Lon nhat Di");
        TimSoLonNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimSoLonNhatActionPerformed(evt);
            }
        });

        txt_KetQua.setColumns(20);
        txt_KetQua.setRows(5);
        jScrollPane2.setViewportView(txt_KetQua);

        jLabel3.setText("Ket Qua :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TimSoLonNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Do_dai_cua_Mang, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Do_dai_cua_Mang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(TimSoLonNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    public static int findMax(int array[])
    {
        int Max =array[0];
        for(int i=0 ; i<array.length; i++)
        {
            if(array[i] > Max)
            {
                Max = array[i];
            }
        }
        return Max;
    }
        
        public void getValue() {
        String doDaiStr = txt_Do_dai_cua_Mang.getText();
        try {
            int doDaiInt = Integer.parseInt(doDaiStr);
            
            if (doDaiInt <= 0) {
                JOptionPane.showMessageDialog(null, "Độ dài mảng phải là một số nguyên dương!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Tiếp tục thực hiện các hành động mong muốn với giá trị số nguyên ở đây

            // Ví dụ: Khởi tạo mảng và nhập giá trị cho mảng
            int[] array = new int[doDaiInt];
            for (int i = 0; i < doDaiInt; i++) {
                String input = JOptionPane.showInputDialog("Nhập giá trị cho phần tử thứ " + (i + 1));
                int value = Integer.parseInt(input);
                array[i] = value;
            }

            // Tìm giá trị lớn nhất trong mảng
            int max = findMax(array);
            System.out.println("Giá trị lớn nhất trong mảng là: " + max);
            txt_KetQua.setText("Gai lon la:"+max);

        } catch (NumberFormatException e) {
            // Người dùng không nhập một số nguyên
            // Hiển thị thông báo yêu cầu nhập lại
            JOptionPane.showMessageDialog(null, "Vui lòng nhập một số nguyên!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void TimSoLonNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimSoLonNhatActionPerformed
        
        getValue();
        // TODO add your handling code here:
    }//GEN-LAST:event_TimSoLonNhatActionPerformed

    private void txt_Do_dai_cua_MangKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Do_dai_cua_MangKeyPressed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Do_dai_cua_MangKeyPressed


    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TimSoLonNhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimSoLonNhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimSoLonNhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimSoLonNhat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimSoLonNhat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TimSoLonNhat;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_Do_dai_cua_Mang;
    private javax.swing.JTextArea txt_KetQua;
    // End of variables declaration//GEN-END:variables
}
