import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * VMView is the view class of the program's main menu.
 */
public class VMView extends javax.swing.JFrame {

    /**
     * Creates new form VMView
     */
    public VMView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        CreateVMbtn = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        TestVMbtn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        EXitbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 100));
        setPreferredSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 0));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(400, 250));

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        jLabel1.setText("— by Jannica & Niccolo");
        jLabel1.setPreferredSize(new java.awt.Dimension(126, 48));
        jLabel1.setVerifyInputWhenFocusTarget(false);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 105, 226));
        jLabel3.setText("MCO2");

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel4.setText("Vending Machine");

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel5.setText("Factory");
        jLabel5.setPreferredSize(new java.awt.Dimension(126, 48));
        jLabel5.setVerifyInputWhenFocusTarget(false);

        jButton2.setBackground(new java.awt.Color(247, 244, 168));
        jButton2.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jButton2.setText("CCPROG3");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 50));

        CreateVMbtn.setBackground(new java.awt.Color(17, 105, 226));
        CreateVMbtn.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        CreateVMbtn.setForeground(new java.awt.Color(255, 255, 255));
        CreateVMbtn.setText("Create a Vending Machine");
        CreateVMbtn.setPreferredSize(new java.awt.Dimension(250, 30));

        jPanel4.add(CreateVMbtn);

        jPanel1.add(jPanel4);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(400, 50));

        TestVMbtn.setBackground(new java.awt.Color(243, 245, 249));
        TestVMbtn.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        TestVMbtn.setText("Test a Vending Machine");
        TestVMbtn.setPreferredSize(new java.awt.Dimension(250, 30));

        jPanel7.add(TestVMbtn);

        jPanel1.add(jPanel7);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(400, 100));

        EXitbtn.setBackground(new java.awt.Color(243, 245, 249));
        EXitbtn.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        EXitbtn.setText("Exit");
        EXitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(EXitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EXitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(new java.awt.Color(211, 219, 225));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 400));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 20);
        flowLayout1.setAlignOnBaseline(true);
        jPanel2.setLayout(flowLayout1);

        jLabel2.setIcon(new ImageIcon("resources/vendingmachine.png"));
        jPanel2.add(jLabel2);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);
        setVisible(true);
        pack();
    }

    private void EXitbtnActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        System.exit(0);
    }

    public void TestVMbtnActionPerformed(ActionListener actionListener) {
        this.TestVMbtn.addActionListener(actionListener);
    }

    public void CreateVMbtnActionPerformed(ActionListener actionListener) {                                               
        this.CreateVMbtn.addActionListener(actionListener);
    }    

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }

    // Variables declaration
    private javax.swing.JButton CreateVMbtn;
    private javax.swing.JButton EXitbtn;
    private javax.swing.JButton TestVMbtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration
}
