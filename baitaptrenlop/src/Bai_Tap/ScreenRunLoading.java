package Bai_Tap;

import com.mysql.cj.util.DnsSrv;

public class ScreenRunLoading extends javax.swing.JFrame {
    public ScreenRunLoading() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        LoadingLabel = new javax.swing.JLabel();
        Label_PerCount = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BackGround_Label_Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackGroundPanel.setBackground(new java.awt.Color(0, 204, 255));
        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BackGroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 374, 420, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baitap/image_Bill/home.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        BackGroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 420, 360));
        BackGroundPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 670, 20));

        LoadingLabel.setText("Loading....");
        BackGroundPanel.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        Label_PerCount.setText("%");
        BackGroundPanel.add(Label_PerCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Hoa Don");
        jLabel3.setToolTipText("");
        BackGroundPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        BackGround_Label_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baitap/image_Bill/billing background.png"))); // NOI18N
        BackGround_Label_Image.setText("jLabel1");
        BackGroundPanel.add(BackGround_Label_Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
            ScreenRunLoading Sr = new ScreenRunLoading();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sr.setVisible(true);
                
                //new ScreenRunLoading().setVisible(true);
            }
        });
        //
        try {
            for(int i=0; i<=100; i++)
            {
                Thread.sleep(100); //delay of Loading Progress Bar;
                Sr.LoadingBar.setValue(i);//here progress is variable name of jprogressBar;
                Sr.Label_PerCount.setText(Integer.toString(i)+"%");//perCount is variable name of jlabel which count percentage upto100%;
                
            }
        } catch (Exception e) {
            
        }
        //
        Home_Screen_ScreenRunLoading hm = new  Home_Screen_ScreenRunLoading();
        //And Close or hide before open HomeScreen;
        Sr.setVisible(false);
        hm.setVisible(true); // show home Screen
        //close load Screen
        Sr.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JLabel BackGround_Label_Image;
    private javax.swing.JLabel Label_PerCount;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
