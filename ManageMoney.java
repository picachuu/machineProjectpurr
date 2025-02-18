import java.awt.event.ActionListener;

/**
 * ManageMoney is the GUI of the Vending Machine's manage money menu. It is the view class of the MVC pattern.
 */
public class ManageMoney extends javax.swing.JFrame {

    /**
     * Creates new form VMView
     */
    public ManageMoney() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        onePesoReplenishBTN = new javax.swing.JButton();
        fivePesoReplenishBTN = new javax.swing.JButton();
        tenPesoReplenishBTN = new javax.swing.JButton();
        twentyPesoReplenishBTN = new javax.swing.JButton();
        fiftyPesoReplenishBTN = new javax.swing.JButton();
        hundredPesoReplenishBTN = new javax.swing.JButton();
        twohundPesoReplenishBTN = new javax.swing.JButton();
        fivehundPesoReplenishBTN = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        Returnbtn = new javax.swing.JButton();
        collectAllBTN = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        moneyVMTextArea = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        Returnbtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(616, 550));
        setPreferredSize(new java.awt.Dimension(616, 550));

        jPanel3.setBackground(new java.awt.Color(243, 245, 249));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 150));

        jPanel2.setBackground(new java.awt.Color(17, 105, 226));

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Money Management");

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(247, 244, 168));
        jLabel3.setText("MCO2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(14, 14, 14))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(17, 105, 226), 2, true));

        onePesoReplenishBTN.setBackground(new java.awt.Color(17, 105, 226));
        onePesoReplenishBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        onePesoReplenishBTN.setForeground(new java.awt.Color(255, 255, 255));
        onePesoReplenishBTN.setText("P1");
        onePesoReplenishBTN.setMaximumSize(new java.awt.Dimension(63, 24));
        onePesoReplenishBTN.setMinimumSize(new java.awt.Dimension(63, 24));
        onePesoReplenishBTN.setPreferredSize(new java.awt.Dimension(63, 24));
        
        fivePesoReplenishBTN.setBackground(new java.awt.Color(17, 105, 226));
        fivePesoReplenishBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        fivePesoReplenishBTN.setForeground(new java.awt.Color(255, 255, 255));
        fivePesoReplenishBTN.setText("P5");
        fivePesoReplenishBTN.setPreferredSize(new java.awt.Dimension(250, 40));
        
        tenPesoReplenishBTN.setBackground(new java.awt.Color(17, 105, 226));
        tenPesoReplenishBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        tenPesoReplenishBTN.setForeground(new java.awt.Color(255, 255, 255));
        tenPesoReplenishBTN.setText("P10");
        tenPesoReplenishBTN.setPreferredSize(new java.awt.Dimension(250, 40));

        twentyPesoReplenishBTN.setBackground(new java.awt.Color(17, 105, 226));
        twentyPesoReplenishBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        twentyPesoReplenishBTN.setForeground(new java.awt.Color(255, 255, 255));
        twentyPesoReplenishBTN.setText("P20");
        twentyPesoReplenishBTN.setPreferredSize(new java.awt.Dimension(250, 40));

        fiftyPesoReplenishBTN.setBackground(new java.awt.Color(17, 105, 226));
        fiftyPesoReplenishBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        fiftyPesoReplenishBTN.setForeground(new java.awt.Color(255, 255, 255));
        fiftyPesoReplenishBTN.setText("P50");
        fiftyPesoReplenishBTN.setPreferredSize(new java.awt.Dimension(250, 40));

        hundredPesoReplenishBTN.setBackground(new java.awt.Color(17, 105, 226));
        hundredPesoReplenishBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        hundredPesoReplenishBTN.setForeground(new java.awt.Color(255, 255, 255));
        hundredPesoReplenishBTN.setText("P100");
        hundredPesoReplenishBTN.setPreferredSize(new java.awt.Dimension(250, 40));     

        twohundPesoReplenishBTN.setBackground(new java.awt.Color(17, 105, 226));
        twohundPesoReplenishBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        twohundPesoReplenishBTN.setForeground(new java.awt.Color(255, 255, 255));
        twohundPesoReplenishBTN.setText("P200");
        twohundPesoReplenishBTN.setPreferredSize(new java.awt.Dimension(250, 40));

        fivehundPesoReplenishBTN.setBackground(new java.awt.Color(17, 105, 226));
        fivehundPesoReplenishBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        fivehundPesoReplenishBTN.setForeground(new java.awt.Color(255, 255, 255));
        fivehundPesoReplenishBTN.setText("P500");
        fivehundPesoReplenishBTN.setMaximumSize(new java.awt.Dimension(63, 24));
        fivehundPesoReplenishBTN.setMinimumSize(new java.awt.Dimension(63, 24));
        fivehundPesoReplenishBTN.setPreferredSize(new java.awt.Dimension(63, 24));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(17, 105, 226));
        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(17, 105, 226));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Replenish Money");

        jSeparator1.setBackground(new java.awt.Color(17, 105, 226));
        jSeparator1.setForeground(new java.awt.Color(17, 105, 226));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Coins        Bills");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tenPesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fivePesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onePesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fivehundPesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twohundPesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hundredPesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiftyPesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twentyPesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(onePesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fivePesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tenPesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(twentyPesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fiftyPesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hundredPesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(twohundPesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fivehundPesoReplenishBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Returnbtn.setBackground(new java.awt.Color(243, 245, 249));
        Returnbtn.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        Returnbtn.setForeground(new java.awt.Color(17, 105, 226));
        Returnbtn.setText("Return to Test Menu");
        Returnbtn.setBorder(null);

        collectAllBTN.setBackground(new java.awt.Color(243, 245, 249));
        collectAllBTN.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        collectAllBTN.setForeground(new java.awt.Color(17, 105, 226));
        collectAllBTN.setText("Collect All");
        collectAllBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 105, 226)));
        collectAllBTN.setPreferredSize(new java.awt.Dimension(250, 40));

        jPanel12.setBackground(new java.awt.Color(235, 235, 235));

        moneyVMTextArea.setEditable(false);
        moneyVMTextArea.setColumns(20);
        moneyVMTextArea.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        moneyVMTextArea.setRows(5);
        jScrollPane1.setViewportView(moneyVMTextArea);

        jLabel7.setBackground(new java.awt.Color(17, 105, 226));
        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(17, 105, 226));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Vending Machine:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Returnbtn1.setBackground(new java.awt.Color(243, 245, 249));
        Returnbtn1.setFont(new java.awt.Font("Leelawadee UI", 2, 14)); // NOI18N
        Returnbtn1.setForeground(new java.awt.Color(17, 105, 226));
        Returnbtn1.setText("View Denominations");
        Returnbtn1.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(collectAllBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(Returnbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Returnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(Returnbtn)
                        .addContainerGap(9, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(collectAllBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Returnbtn1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }

    public void addTextArea(String text) {
        this.moneyVMTextArea.append(text);
    }

    public void clearTextArea() {
        this.moneyVMTextArea.setText("");
    }

    public void setOnePesoReplenishBTN(ActionListener actionListener) {
        this.onePesoReplenishBTN.addActionListener(actionListener);
    }

    public void setFivePesoReplenishBTN(ActionListener actionListener) {
        this.fivePesoReplenishBTN.addActionListener(actionListener);
    }

    public void setTenPesoReplenishBTN(ActionListener actionListener) {
        this.tenPesoReplenishBTN.addActionListener(actionListener);
    }

    public void setTwentyPesoReplenishBTN(ActionListener actionListener) {
        this.twentyPesoReplenishBTN.addActionListener(actionListener);
    }

    public void setFiftyPesoReplenishBTN(ActionListener actionListener) {
        this.fiftyPesoReplenishBTN.addActionListener(actionListener);
    }   
    
    public void setHundredPesoReplenishBTN(ActionListener actionListener) {
        this.hundredPesoReplenishBTN.addActionListener(actionListener);
    }

    public void setTwoHundredPesoReplenishBTN(ActionListener actionListener) {
        this.twohundPesoReplenishBTN.addActionListener(actionListener);
    }

    public void setFiveHundredPesoReplenishBTN(ActionListener actionListener) {
        this.fivehundPesoReplenishBTN.addActionListener(actionListener);
    }

    public void setCollectAllBTN(ActionListener actionListener) {
        this.collectAllBTN.addActionListener(actionListener);
    }
 
    public void ReturnbtnActionPerformed(ActionListener actionListener) {
        this.Returnbtn.addActionListener(actionListener);
    }

    public void ViewDenominations(ActionListener actionListener) {
        this.Returnbtn1.addActionListener(actionListener);
    }

    // Variables declaration
    private javax.swing.JButton Returnbtn;
    private javax.swing.JButton Returnbtn1;
    private javax.swing.JButton collectAllBTN;
    private javax.swing.JButton fiftyPesoReplenishBTN;
    private javax.swing.JButton fivePesoReplenishBTN;
    private javax.swing.JButton fivehundPesoReplenishBTN;
    private javax.swing.JButton hundredPesoReplenishBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea moneyVMTextArea;
    private javax.swing.JButton onePesoReplenishBTN;
    private javax.swing.JButton tenPesoReplenishBTN;
    private javax.swing.JButton twentyPesoReplenishBTN;
    private javax.swing.JButton twohundPesoReplenishBTN;
    // End of variables declaration
}
