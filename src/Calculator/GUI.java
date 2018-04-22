
package Calculator;


import java.awt.Color;
import static java.awt.SystemColor.text;
import java.math.*;
import javax.swing.JOptionPane;


public class GUI extends javax.swing.JFrame {

    private giaithuat gt = new giaithuat();
    
    private String vungnho = "";
    private int radian = 0;
    private int pheptinh = 0;// bang 1 pt bat 2, bang 2 pt bat 1 hai an, bang 3 Bin
    private int solan = 0;
    private double a = 0, b = 0, c = 0, m = 0, n = 0, k = 0, x1 = 0, x2 = 0;
    
    public GUI() {
        initComponents();
        this.setLocation(500, 100);
        this.lbCoSo.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Calculator = new javax.swing.JPanel();
        pnPheptoan = new javax.swing.JPanel();
        btphanso = new javax.swing.JButton();
        btcanbac2 = new javax.swing.JButton();
        btbinhphuong = new javax.swing.JButton();
        btln = new javax.swing.JButton();
        btlog = new javax.swing.JButton();
        btsomu = new javax.swing.JButton();
        btgiaithua = new javax.swing.JButton();
        btsin = new javax.swing.JButton();
        btcos = new javax.swing.JButton();
        bttan = new javax.swing.JButton();
        btngoacTrai = new javax.swing.JButton();
        btHex = new javax.swing.JButton();
        btBin = new javax.swing.JButton();
        btdauam = new javax.swing.JButton();
        btcanbac3 = new javax.swing.JButton();
        btlapphuong = new javax.swing.JButton();
        rbtDeg = new javax.swing.JRadioButton();
        rbtRad = new javax.swing.JRadioButton();
        btngoacPhai = new javax.swing.JButton();
        btPT2 = new javax.swing.JButton();
        btPT2an = new javax.swing.JButton();
        btDEC = new javax.swing.JButton();
        pnManhinh = new javax.swing.JPanel();
        txtKetqua = new javax.swing.JTextField();
        txtPheptinh = new javax.swing.JTextField();
        lbCoSo = new javax.swing.JLabel();
        pnSo = new javax.swing.JPanel();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        btdelete = new javax.swing.JButton();
        btac = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        btnhan = new javax.swing.JButton();
        btchia = new javax.swing.JButton();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        btcong = new javax.swing.JButton();
        btbang = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        btdaucham = new javax.swing.JButton();
        btans = new javax.swing.JButton();
        bttru = new javax.swing.JButton();
        btpi = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton13.setText("jButton13");

        jButton20.setText("jButton20");

        jButton38.setText("jButton38");

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        Calculator.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        pnPheptoan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btphanso.setBackground(new java.awt.Color(51, 51, 51));
        btphanso.setForeground(new java.awt.Color(255, 255, 255));
        btphanso.setText("1/x");
        btphanso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btphanso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btphansoActionPerformed(evt);
            }
        });

        btcanbac2.setBackground(new java.awt.Color(51, 51, 51));
        btcanbac2.setForeground(new java.awt.Color(255, 255, 255));
        btcanbac2.setText("√x");
        btcanbac2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btcanbac2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcanbac2ActionPerformed(evt);
            }
        });

        btbinhphuong.setBackground(new java.awt.Color(51, 51, 51));
        btbinhphuong.setForeground(new java.awt.Color(255, 255, 255));
        btbinhphuong.setText("x^2");
        btbinhphuong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btbinhphuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbinhphuongActionPerformed(evt);
            }
        });

        btln.setBackground(new java.awt.Color(51, 51, 51));
        btln.setForeground(new java.awt.Color(255, 255, 255));
        btln.setText("ln");
        btln.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlnActionPerformed(evt);
            }
        });

        btlog.setBackground(new java.awt.Color(51, 51, 51));
        btlog.setForeground(new java.awt.Color(255, 255, 255));
        btlog.setText("log");
        btlog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlogActionPerformed(evt);
            }
        });

        btsomu.setBackground(new java.awt.Color(51, 51, 51));
        btsomu.setForeground(new java.awt.Color(255, 255, 255));
        btsomu.setText("x^");
        btsomu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btsomu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsomuActionPerformed(evt);
            }
        });

        btgiaithua.setBackground(new java.awt.Color(51, 51, 51));
        btgiaithua.setForeground(new java.awt.Color(255, 255, 255));
        btgiaithua.setText("x!");
        btgiaithua.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btgiaithua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btgiaithuaActionPerformed(evt);
            }
        });

        btsin.setBackground(new java.awt.Color(51, 51, 51));
        btsin.setForeground(new java.awt.Color(255, 255, 255));
        btsin.setText("sin");
        btsin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsinActionPerformed(evt);
            }
        });

        btcos.setBackground(new java.awt.Color(51, 51, 51));
        btcos.setForeground(new java.awt.Color(255, 255, 255));
        btcos.setText("cos");
        btcos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcosActionPerformed(evt);
            }
        });

        bttan.setBackground(new java.awt.Color(51, 51, 51));
        bttan.setForeground(new java.awt.Color(255, 255, 255));
        bttan.setText("tan");
        bttan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttanActionPerformed(evt);
            }
        });

        btngoacTrai.setBackground(new java.awt.Color(51, 51, 51));
        btngoacTrai.setForeground(new java.awt.Color(255, 255, 255));
        btngoacTrai.setText("(");
        btngoacTrai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btngoacTrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngoacTraiActionPerformed(evt);
            }
        });

        btHex.setBackground(new java.awt.Color(51, 51, 51));
        btHex.setForeground(new java.awt.Color(255, 255, 255));
        btHex.setText("HEX");
        btHex.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHexActionPerformed(evt);
            }
        });

        btBin.setBackground(new java.awt.Color(51, 51, 51));
        btBin.setForeground(new java.awt.Color(255, 255, 255));
        btBin.setText("BIN");
        btBin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBinActionPerformed(evt);
            }
        });

        btdauam.setBackground(new java.awt.Color(51, 51, 51));
        btdauam.setForeground(new java.awt.Color(255, 255, 255));
        btdauam.setText("( - )");
        btdauam.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btdauam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdauamActionPerformed(evt);
            }
        });

        btcanbac3.setBackground(new java.awt.Color(51, 51, 51));
        btcanbac3.setForeground(new java.awt.Color(255, 255, 255));
        btcanbac3.setText("∛x");
        btcanbac3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btcanbac3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcanbac3ActionPerformed(evt);
            }
        });

        btlapphuong.setBackground(new java.awt.Color(51, 51, 51));
        btlapphuong.setForeground(new java.awt.Color(255, 255, 255));
        btlapphuong.setText("x^3");
        btlapphuong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btlapphuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlapphuongActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtDeg);
        rbtDeg.setSelected(true);
        rbtDeg.setText("Deg");
        rbtDeg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbtDeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtDegActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtRad);
        rbtRad.setText("Rad");
        rbtRad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rbtRad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtRadActionPerformed(evt);
            }
        });

        btngoacPhai.setBackground(new java.awt.Color(51, 51, 51));
        btngoacPhai.setForeground(new java.awt.Color(255, 255, 255));
        btngoacPhai.setText(")");
        btngoacPhai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btngoacPhai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngoacPhaiActionPerformed(evt);
            }
        });

        btPT2.setBackground(new java.awt.Color(51, 51, 51));
        btPT2.setForeground(new java.awt.Color(255, 255, 255));
        btPT2.setText("PTB2");
        btPT2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btPT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPT2ActionPerformed(evt);
            }
        });

        btPT2an.setBackground(new java.awt.Color(51, 51, 51));
        btPT2an.setForeground(new java.awt.Color(255, 255, 255));
        btPT2an.setText("PT 2 Ẩn");
        btPT2an.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btPT2an.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPT2anActionPerformed(evt);
            }
        });

        btDEC.setBackground(new java.awt.Color(51, 51, 51));
        btDEC.setForeground(new java.awt.Color(255, 255, 255));
        btDEC.setText("DEC");
        btDEC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btDEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDECActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPheptoanLayout = new javax.swing.GroupLayout(pnPheptoan);
        pnPheptoan.setLayout(pnPheptoanLayout);
        pnPheptoanLayout.setHorizontalGroup(
            pnPheptoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPheptoanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnPheptoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnPheptoanLayout.createSequentialGroup()
                        .addGroup(pnPheptoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnPheptoanLayout.createSequentialGroup()
                                .addComponent(btBin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btHex, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btDEC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btPT2an, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnPheptoanLayout.createSequentialGroup()
                                .addComponent(btgiaithua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btngoacTrai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btngoacPhai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btln, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnPheptoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btlog, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPT2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnPheptoanLayout.createSequentialGroup()
                        .addComponent(btlapphuong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btphanso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btsin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btcos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bttan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPheptoanLayout.createSequentialGroup()
                        .addGroup(pnPheptoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnPheptoanLayout.createSequentialGroup()
                                .addComponent(btdauam, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btcanbac2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btcanbac3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btsomu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnPheptoanLayout.createSequentialGroup()
                                .addComponent(rbtDeg)
                                .addGap(53, 53, 53)
                                .addComponent(rbtRad)
                                .addGap(15, 15, 15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btbinhphuong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPheptoanLayout.setVerticalGroup(
            pnPheptoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPheptoanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPheptoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtRad)
                    .addComponent(rbtDeg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPheptoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcanbac2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbinhphuong, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsomu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcanbac3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btdauam, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPheptoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btphanso, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btlapphuong, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcos, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttan, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPheptoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btngoacTrai, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btgiaithua, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btngoacPhai, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btln, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btlog, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPheptoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPT2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPT2an, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHex, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDEC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnManhinh.setBorder(javax.swing.BorderFactory.createTitledBorder("CASIO"));
        pnManhinh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtKetqua.setFont(new java.awt.Font("Monospaced", 1, 22)); // NOI18N
        txtKetqua.setForeground(new java.awt.Color(51, 0, 153));
        txtKetqua.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtKetqua.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtPheptinh.setFont(new java.awt.Font("Monospaced", 1, 22)); // NOI18N
        txtPheptinh.setForeground(new java.awt.Color(51, 0, 153));

        lbCoSo.setBackground(new java.awt.Color(255, 255, 255));
        lbCoSo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout pnManhinhLayout = new javax.swing.GroupLayout(pnManhinh);
        pnManhinh.setLayout(pnManhinhLayout);
        pnManhinhLayout.setHorizontalGroup(
            pnManhinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnManhinhLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnManhinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnManhinhLayout.createSequentialGroup()
                        .addComponent(lbCoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtKetqua, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPheptinh))
                .addContainerGap())
        );
        pnManhinhLayout.setVerticalGroup(
            pnManhinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnManhinhLayout.createSequentialGroup()
                .addComponent(txtPheptinh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnManhinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKetqua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCoSo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pnSo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        num7.setBackground(new java.awt.Color(255, 255, 255));
        num7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num7.setText("7");
        num7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setBackground(new java.awt.Color(255, 255, 255));
        num8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num8.setText("8");
        num8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setBackground(new java.awt.Color(255, 255, 255));
        num9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num9.setText("9");
        num9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        btdelete.setBackground(new java.awt.Color(255, 255, 255));
        btdelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btdelete.setText("DEL");
        btdelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteActionPerformed(evt);
            }
        });

        btac.setBackground(new java.awt.Color(255, 255, 255));
        btac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btac.setText("AC");
        btac.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btacActionPerformed(evt);
            }
        });

        num4.setBackground(new java.awt.Color(255, 255, 255));
        num4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num4.setText("4");
        num4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num5.setBackground(new java.awt.Color(255, 255, 255));
        num5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num5.setText("5");
        num5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setBackground(new java.awt.Color(255, 255, 255));
        num6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num6.setText("6");
        num6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        btnhan.setBackground(new java.awt.Color(255, 255, 255));
        btnhan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnhan.setText("×");
        btnhan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhanActionPerformed(evt);
            }
        });

        btchia.setBackground(new java.awt.Color(255, 255, 255));
        btchia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btchia.setText("÷");
        btchia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btchiaActionPerformed(evt);
            }
        });

        num1.setBackground(new java.awt.Color(255, 255, 255));
        num1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num1.setText("1");
        num1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setBackground(new java.awt.Color(255, 255, 255));
        num2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num2.setText("2");
        num2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setBackground(new java.awt.Color(255, 255, 255));
        num3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num3.setText("3");
        num3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        btcong.setBackground(new java.awt.Color(255, 255, 255));
        btcong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btcong.setText("+");
        btcong.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btcong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcongActionPerformed(evt);
            }
        });

        btbang.setBackground(new java.awt.Color(255, 255, 255));
        btbang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btbang.setText("=");
        btbang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btbang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbangActionPerformed(evt);
            }
        });

        num0.setBackground(new java.awt.Color(255, 255, 255));
        num0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        num0.setText("0");
        num0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        btdaucham.setBackground(new java.awt.Color(255, 255, 255));
        btdaucham.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btdaucham.setText(".");
        btdaucham.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btdaucham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdauchamActionPerformed(evt);
            }
        });

        btans.setBackground(new java.awt.Color(255, 255, 255));
        btans.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btans.setText("Ans");
        btans.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btansActionPerformed(evt);
            }
        });

        bttru.setBackground(new java.awt.Color(255, 255, 255));
        bttru.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bttru.setText("-");
        bttru.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bttru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttruActionPerformed(evt);
            }
        });

        btpi.setBackground(new java.awt.Color(255, 255, 255));
        btpi.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        btpi.setText("π");
        btpi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnSoLayout = new javax.swing.GroupLayout(pnSo);
        pnSo.setLayout(pnSoLayout);
        pnSoLayout.setHorizontalGroup(
            pnSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSoLayout.createSequentialGroup()
                        .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btcong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnSoLayout.createSequentialGroup()
                            .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnSoLayout.createSequentialGroup()
                        .addGroup(pnSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnSoLayout.createSequentialGroup()
                                .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btdaucham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnSoLayout.createSequentialGroup()
                                .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnSoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnSoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btpi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btchia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btac, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btbang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnSoLayout.setVerticalGroup(
            pnSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btchia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttru, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btdaucham, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btans, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btbang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout CalculatorLayout = new javax.swing.GroupLayout(Calculator);
        Calculator.setLayout(CalculatorLayout);
        CalculatorLayout.setHorizontalGroup(
            CalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalculatorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnSo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnManhinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnPheptoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CalculatorLayout.setVerticalGroup(
            CalculatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalculatorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnManhinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPheptoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Calculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Calculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btansActionPerformed
        this.txtPheptinh.setText(String.valueOf(vungnho));
    }//GEN-LAST:event_btansActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText()+"1");
    }//GEN-LAST:event_num1ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText()+"2");
    }//GEN-LAST:event_num2ActionPerformed

    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText()+"3");
    }//GEN-LAST:event_num3ActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText()+"4");
    }//GEN-LAST:event_num4ActionPerformed

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText()+"5");
    }//GEN-LAST:event_num5ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText()+"6");
    }//GEN-LAST:event_num6ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText()+"7");
    }//GEN-LAST:event_num7ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText()+"8");
    }//GEN-LAST:event_num8ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText()+"9");
    }//GEN-LAST:event_num9ActionPerformed

    private void btgiaithuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btgiaithuaActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText()+"!");
    }//GEN-LAST:event_btgiaithuaActionPerformed
    
    //ham lay phep tinh o sau so
    private int up(int n, String str){
        for(int i = n-1; i >= 0; i--){  //lay ki tu dau sau so vd: !,^,...
            if( (int) str.charAt(i) > 57 || (int) str.charAt(i) < 48  && (int) str.charAt(i)!= 46)
                return i+1;
        }
        return 0;
    }
    
    // ham lay phep tinh o truoc so
    private int down(int n, String str){   
        for(int i = n+1; i < str.length(); i++){ //lay ki tu dau truoc so vd: √,cos,sin,...
            if( (int) str.charAt(i) > 57 || (int) str.charAt(i) < 48  && (int) str.charAt(i)!= 46)
                return i;
        }
        return str.length();
    }
    
     //tinh cac phep toan don
    private String ToanDon(String str){
        String ketqua = str;
        int n = str.length();
        for(int i = 0; i < str.length(); i++){
            if((int) str.charAt(i) > 57 || (int) str.charAt(i) < 48 && (int) str.charAt(i)!= 46){
            //JOptionPane.showMessageDialog(this,str.charAt(i));
                switch (str.charAt(i)){ // lay ki tu tai vi tri thu i trong chuoi
                    case '!': ketqua = str.substring(0,up(i,str));  // gan ket qua bang chuoi moi bat dau tu vi tri 0 den dau o phia sau so
                                //JOptionPane.showMessageDialog(this,Integer.parseInt(str.substring(up(i,str),i)));
                                ketqua += gt.GiaiThua(Double.parseDouble(str.substring(up(i,str),i)));
                                ketqua += str.substring(i+1, str.length()); 
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i = 0;
                                break;
                    case '√': ketqua = str.substring(0,i);
                                ketqua += gt.Canbac2(Integer.parseInt(str.substring(i+1,down(i,str))));
                                ketqua += str.substring(down(i,str), str.length());
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i = 0;
                                break;
                    case '∛': ketqua = str.substring(0,i);
                                ketqua += gt.Canbac3(Integer.parseInt(str.substring(i+1,down(i,str))));
                                ketqua += str.substring(down(i,str), str.length());
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i = 0;
                                break;
                    case '²': ketqua = str.substring(0,up(i,str));
                                //JOptionPane.showMessageDialog(this,ketqua);
                                ketqua += gt.Binhphuong(Double.parseDouble(str.substring(up(i,str),i)));
                                ketqua += str.substring(i+1, str.length());
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i = 0;
                                break;
                    case '³': ketqua = str.substring(0,up(i,str));
                                //JOptionPane.showMessageDialog(this,ketqua);
                                ketqua += gt.Lapphuong(Double.parseDouble(str.substring(up(i,str),i)));
                                ketqua += str.substring(i+1, str.length());
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i = 0;
                                break;
                    case '^': ketqua = str.substring(0,up(i,str));
                                ketqua += gt.Luythua(Double.parseDouble(str.substring(up(i,str),i)),(Double.parseDouble(str.substring(i+1,down(i,str)))));
                                //JOptionPane.showMessageDialog(this, down(i+1,str));
                                ketqua += str.substring(down(i,str), str.length());
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i = 0;
                                break;
                    case 'c': ketqua = str.substring(0,i);
                                ketqua += gt.COS(Integer.parseInt(str.substring(i+1,down(i,str))),radian);
                                ketqua += str.substring(down(i,str), str.length());
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i = 0;
                                break;
                    case 's': ketqua = str.substring(0,i);
                                ketqua += gt.SIN(Integer.parseInt(str.substring(i+1,down(i,str))),radian);
                                ketqua += str.substring(down(i,str), str.length());
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i = 0;
                                break;
                    case 't': ketqua = str.substring(0,i);
                                ketqua += gt.TAN(Integer.parseInt(str.substring(i+1,down(i,str))),radian);
                                ketqua += str.substring(down(i,str), str.length());
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i = 0;
                                break;
                    case 'n': ketqua = str.substring(0,i); // ln
                                ketqua += gt.ln(Integer.parseInt(str.substring(i+1,down(i,str))));
                                ketqua += str.substring(down(i,str), str.length());
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i = 0;
                                break;
                    case 'g': ketqua = str.substring(0,i);  // log co so 10
                                ketqua += gt.log(Integer.parseInt(str.substring(i+1,down(i,str))));
                                ketqua += str.substring(down(i,str), str.length());
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i = 0;
                                break;
                }
            }
        }
        return ketqua;
    }

    //lay so tu * or / ve phia truoc den khi gap dau nhan,chia 
    private int upNhan(int n, String str){
        for(int i = n-1; i >= 0; i--){      //chay tu dau nhan, chia den dau chuoi  
            if( (int) str.charAt(i) > 57 || (int) str.charAt(i) < 48  && (int) str.charAt(i)!= 46)
                if( str.charAt(i) == '-')
                    return i;   // lay luon dau tru vao trong phep tinh
                else
                    return i+1;     // bo qua cac dau khac dau tru 
        }
        return 0;
    }
    
    //lay so cac so tu dau nhan, chia tro ve sau den khi gap dau nhan e tiep
     private int downNhan(int n, String str){
        for(int i = n+1; i < str.length(); i++){    // chay tu dau nhan, chia ve cuoi chuoi
            if( (int) str.charAt(i) > 57 || (int) str.charAt(i) < 48  && (int) str.charAt(i)!= 46)
                if (str.charAt(i) == '-' && (str.charAt(i-1) == 'x' || str.charAt(i-1) == '/'))     //kiem tra xem dau tru trong chuoi phep tinh nhan, chia la phep tinh hay la dau am
                    continue;       //truoc dau tru co phep toan nhan hoac chia thi lay duoc dau tru, kiem tra neu la so thi bo qua, den khi gap dau nhan thi return i
                else
                    return i;
        }
        return str.length();
    }  

    private String NhanChia(String str){
        
        String ketqua = str;
        for(int i = 0; i < str.length(); i++){
            
            //JOptionPane.showMessageDialog(this,str.charAt(i));
            // kiem tra cac ki tu nhap vao va dau cham
            if((int) str.charAt(i) > 57 || (int) str.charAt(i) < 48 && (int) str.charAt(i)!= 46){
            //JOptionPane.showMessageDialog(this,str.charAt(i));
                switch (str.charAt(i)){
                    case 'x': ketqua = str.substring(0,upNhan(i,str));
                                //JOptionPane.showMessageDialog(this,Integer.parseInt(str.substring(up(i,str),i)));
                                // ket qua ban dau cong cho chuoi lay duoc phia truoc va saudau 'x'
                                ketqua += gt.Nhan(Double.parseDouble(str.substring(upNhan(i,str),i)),Double.parseDouble(str.substring(i+1,downNhan(i,str))));
                                ketqua += str.substring(downNhan(i,str), str.length()); // lay ket qua tren cong tiep cho phan con lai cua chuoi
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i = 0;
                                break;
                    case '/': ketqua = str.substring(0,upNhan(i,str));
                                //JOptionPane.showMessageDialog(this,Integer.parseInt(str.substring(up(i,str),i)));
                                ketqua += gt.Chia(Double.parseDouble(str.substring(upNhan(i,str),i)),Double.parseDouble(str.substring(i+1,downNhan(i,str))));
                                ketqua += str.substring(downNhan(i,str), str.length());
                                //JOptionPane.showMessageDialog(this,ketqua);
                                str = ketqua;
                                i=0;
                                break;
                }
            }
        }    
        return ketqua;
    }

    private String CongTru(String str){
        String dem = "";        //dem co bao nhieu phep toan +,- trong chuoi
        Double ketqua = 0.0;
        for(int i = 0; i < str.length();i++){       //lay chuoi tren man hinh
               //JOptionPane.showMessageDialog(this,str.charAt(i));
               // kiem tra cac so nhap vao va dau cham
                if((int) str.charAt(i) > 57 || (int) str.charAt(i) < 48 && (int) str.charAt(i)!= 46){  // dieu kien mang trong day so tu 0-9 trong bang ma ASCII
                    //JOptionPane.showMessageDialog(this,str.charAt(i));
                    dem += str.charAt(i);
                }
            }
            if(dem == ""){
                ketqua = Double.parseDouble(str);
            }
            for(int i = 0; i < dem.length(); i++){
                //JOptionPane.showMessageDialog(this,dem.length());
                int vtdau = str.indexOf(dem.charAt(i)); // tra ve vi tri cua phep toan trong chuoi
                String a;
                if(i == 0){
                    a = str.substring(0,vtdau); 
                }
                else
                {
                    a = String.valueOf(ketqua); // neu chi co moi a thi tra ve a la ket qua
                }
                str = str.substring(vtdau+1,str.length()); // lay chuoi phia sau dau + or - dau tien
                String b;
                if(i < dem.length()-1){
                    //lay phep tinh tu dau + or - dau tien
                    b = str.substring(0,str.indexOf(dem.charAt(i+1)));                   
                }
                else{
                    b = str.substring(0,str.length());
                }
                
                ketqua = 0.0;
                double soA,soB;
                //JOptionPane.showMessageDialog(this, a +" " + b);
                if(a.compareTo("") == 0)
                    soA = 0;
                else
                    soA = Double.parseDouble(a);

                    soB = Double.parseDouble(b);
                //JOptionPane.showMessageDialog(this,"so A" + soA +" So B" + soB);
                switch (dem.charAt(i)){
                    case '+':   ketqua = gt.Cong(soA, soB);
                                break;
                    case '-':   ketqua = gt.Tru(soA, soB);
                                break;
                }  
            }          
        return String.valueOf(ketqua);
    }
    
    // sap xep do uu tien cua phep toan
    private String TinhToan(String str){
        String ketqua = str;
        ketqua = ToanDon(ketqua);
        ketqua = NhanChia(ketqua);
        ketqua = CongTru(ketqua);
        return ketqua;
    }
    // xu ly dau ngoac
    private String TinhNgoac( String str){
        String ketqua = str;
        int bd = 0,kt = 0;
        // lay dau mo ngoac 
        for(int i = 0; i < str.length(); i++ ){
            if( str.charAt(i) == '(' ) bd = i;
        }
        // lay dau dong ngoac
        for( int j = bd + 1; j < str.length(); j++ ){
            if( str.charAt(j) == ')' ){ 
                kt = j;
                break;
            }
        }
        //JOptionPane.showMessageDialog(this, bd+" "+kt);
        ketqua = str.substring(bd+1,kt);
        //JOptionPane.showMessageDialog(this,bd+" "+kt + "=" + TinhToan(ketqua));
        ketqua = str.substring(0,bd) + TinhToan(ketqua) + str.substring(kt+1,str.length());
        return ketqua;
    }
    
    //tim trong chuoi xem con ngoac hay khong
    private int KiemTraNgoac(String str){
        if(str.contains("("))  return 1;
        else    return 0;
    }
    
    //tinh ngoac den khi khong con ngoac
    private String DauNgoac(String str){
        String ketqua = str;
        while(KiemTraNgoac(ketqua) == 1){
            ketqua = TinhNgoac(ketqua);
        }
        ketqua = TinhToan(ketqua);
        return ketqua;
    }
    
    // cac thuat toan don
    private String DoiChuoi(String str){
        String ketqua = str;
        for(int i = 0 ; i < str.length(); i++){
            //JOptionPane.showMessageDialog(this,str.charAt(i));
            // that toan cos
            if(str.charAt(i) == 'c'){
                //JOptionPane.showMessageDialog(this,i);
                // neu gap chuoi co 'cos' thi bo os lay 'c'
                ketqua = str.substring(0,i+1) + str.substring(i+3,str.length());
                //JOptionPane.showMessageDialog(this,ketqua);
                str = ketqua;
                
            }
            //thuat toan sin
            if(str.charAt(i) == 's'){
                //JOptionPane.showMessageDialog(this,i);
                ketqua = str.substring(0,i+1) + str.substring(i+3,str.length());
                //JOptionPane.showMessageDialog(this,ketqua);
                str = ketqua;
            }
            //thuat toan tan
            if(str.charAt(i) == 't'){
                //JOptionPane.showMessageDialog(this,i);
                ketqua = str.substring(0,i+1) + str.substring(i+3,str.length());
                //JOptionPane.showMessageDialog(this,ketqua);
                str = ketqua;   
            }
            
            if(str.charAt(i) == 'n'){    //loganebe
                //JOptionPane.showMessageDialog(this,i);
                ketqua = str.substring(0,i-1) + str.substring(i,str.length());
                //JOptionPane.showMessageDialog(this,ketqua);
                str = ketqua;   
            }
            if(str.charAt(i) == 'g'){    //logarit co so 10
                //JOptionPane.showMessageDialog(this,i);
                ketqua = str.substring(0,i-2) + str.substring(i,str.length());
                //JOptionPane.showMessageDialog(this,ketqua);
                str = ketqua;   
            }
        }
        return ketqua;
    }
    
    
    private void btbangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbangActionPerformed
        
        try{
            if (pheptinh == 0){     // cong, tru, nhan, chia chuoi cac so
                String manhinh = this.txtPheptinh.getText();
                manhinh = DoiChuoi(manhinh);
                //JOptionPane.showMessageDialog(this, manhinh);
                manhinh = DauNgoac(manhinh);
                vungnho = manhinh;
                this.txtKetqua.setText(manhinh);
                if(manhinh.charAt(manhinh.length()-1) == '0' && manhinh.charAt(manhinh.length()-2) == '.'){     // bo so 0 sau dau cham
                    this.txtKetqua.setText(manhinh.substring(0,manhinh.length()-2)); 
                }
                //this.txtKetqua.setText(manhinh);
            }
            else if (pheptinh == 1){        // giai phuong trinh bac 2
                solan ++;
                if (solan == 1){
                    a = Double.parseDouble(this.txtPheptinh.getText().substring(4,this.txtPheptinh.getText().length()));
                    this.txtKetqua.setText(a + "");
                    this.txtPheptinh.setText("b = ");
                    
                }
                else if (solan == 2){
                    
                    b = Double.parseDouble(this.txtPheptinh.getText().substring(4,this.txtPheptinh.getText().length()));
                    this.txtKetqua.setText(b + "");
                    
                    this.txtPheptinh.setText("c = ");
                }
                else if (solan == 3){
                    c = Double.parseDouble(this.txtPheptinh.getText().substring(4,this.txtPheptinh.getText().length()));
                    this.txtKetqua.setText(c + "");
                }
                else if (solan == 4){
                    this.txtKetqua.setText(gt.PTB2(a, b, c));
                }
                
            }
            else if (pheptinh == 2){        //giai phuong trinh bac 1 hai an
                solan ++;
                if (solan == 1){
                    a = Double.parseDouble(this.txtPheptinh.getText().substring(4,this.txtPheptinh.getText().length()));
                    this.txtKetqua.setText(a + "");
                    this.txtPheptinh.setText("b1 = ");
                    
                }
                else if (solan == 2){
                    
                    b = Double.parseDouble(this.txtPheptinh.getText().substring(4,this.txtPheptinh.getText().length()));
                    this.txtKetqua.setText(b + "");
                    
                    this.txtPheptinh.setText("c1 = ");
                }
                else if (solan == 3){
                    c = Double.parseDouble(this.txtPheptinh.getText().substring(4,this.txtPheptinh.getText().length()));
                    this.txtKetqua.setText(c + "");
                    
                    this.txtPheptinh.setText("a2 = ");
                }
                else if (solan == 4){
                    m = Double.parseDouble(this.txtPheptinh.getText().substring(4,this.txtPheptinh.getText().length()));
                    this.txtKetqua.setText(m + "");
                    
                    this.txtPheptinh.setText("b2 = ");
                }
                else if (solan == 5){
                    n = Double.parseDouble(this.txtPheptinh.getText().substring(4,this.txtPheptinh.getText().length()));
                    this.txtKetqua.setText(n + "");
                    
                    this.txtPheptinh.setText("c2 = ");
                }
                else if (solan == 6){
                    k = Double.parseDouble(this.txtPheptinh.getText().substring(4,this.txtPheptinh.getText().length()));
                    this.txtKetqua.setText(k + "");
                }
                else if (solan == 7){
                    this.txtKetqua.setText(gt.PTB1haian(a, b, c, m, n, k));
                }
            }
            else if (pheptinh == 3){        // so nhi phan
                String manhinh = this.txtPheptinh.getText();
                this.txtKetqua.setText(manhinh);
                if(this.txtKetqua.getText().charAt(this.txtKetqua.getText().length()-1) == '0' && this.txtKetqua.getText().charAt(this.txtKetqua.getText().length()-2) == '.'){
                    this.txtKetqua.setText(manhinh.substring(0,manhinh.length()-2)); 
                }
            }
            else if (pheptinh == 4){    //so 
                String manhinh = this.txtPheptinh.getText();
                this.txtKetqua.setText(manhinh);
                if(this.txtKetqua.getText().charAt(this.txtKetqua.getText().length()-1) == '0' && this.txtKetqua.getText().charAt(this.txtKetqua.getText().length()-2) == '.'){
                    this.txtKetqua.setText(manhinh.substring(0,manhinh.length()-2)); 
                }
            }
            
        }catch (Exception e){
            this.txtKetqua.setText("Syntax Error");// loi cu phap
        }
        
    }//GEN-LAST:event_btbangActionPerformed

    private void btdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteActionPerformed

        if(this.txtPheptinh.getText().compareTo("")!=0){
            this.txtPheptinh.setText(this.txtPheptinh.getText().substring(0,this.txtPheptinh.getText().length()-1).toString());
        }
    }//GEN-LAST:event_btdeleteActionPerformed

    private void btacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btacActionPerformed

        this.lbCoSo.setVisible(false);
        this.txtPheptinh.setText(null);
        this.txtKetqua.setText("");
        solan = 0;
        pheptinh = 0;
    }//GEN-LAST:event_btacActionPerformed

    private void btcongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcongActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + "+");
    }//GEN-LAST:event_btcongActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText()+"0");
    }//GEN-LAST:event_num0ActionPerformed

    private void btdauchamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdauchamActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + ".");   
    }//GEN-LAST:event_btdauchamActionPerformed

    private void bttruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttruActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + "-");
    }//GEN-LAST:event_bttruActionPerformed

    private void btpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpiActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + String.valueOf(Math.PI));
    }//GEN-LAST:event_btpiActionPerformed

    private void btdauamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdauamActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + "-");
    }//GEN-LAST:event_btdauamActionPerformed

    private void btphansoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btphansoActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + "1/");
    }//GEN-LAST:event_btphansoActionPerformed

    private void btbinhphuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbinhphuongActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + "²");
    }//GEN-LAST:event_btbinhphuongActionPerformed

    private void btcanbac2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcanbac2ActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + "√");
    }//GEN-LAST:event_btcanbac2ActionPerformed

    private void btcanbac3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcanbac3ActionPerformed
         this.txtPheptinh.setText(this.txtPheptinh.getText() + "∛");
    }//GEN-LAST:event_btcanbac3ActionPerformed

    private void btsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsinActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + "sin");
    }//GEN-LAST:event_btsinActionPerformed

    private void btcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcosActionPerformed
       this.txtPheptinh.setText(this.txtPheptinh.getText() + "cos");
    }//GEN-LAST:event_btcosActionPerformed

    private void bttanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttanActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + "tan");
    }//GEN-LAST:event_bttanActionPerformed

    private void rbtDegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtDegActionPerformed
        radian = 0;
    }//GEN-LAST:event_rbtDegActionPerformed

    private void rbtRadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtRadActionPerformed
        radian = 1;
    }//GEN-LAST:event_rbtRadActionPerformed

    private void btnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhanActionPerformed
            this.txtPheptinh.setText(this.txtPheptinh.getText() + "x");
    }//GEN-LAST:event_btnhanActionPerformed

    private void btchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btchiaActionPerformed
            this.txtPheptinh.setText(this.txtPheptinh.getText() + "/");
    }//GEN-LAST:event_btchiaActionPerformed

    private void btsomuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsomuActionPerformed
            this.txtPheptinh.setText(this.txtPheptinh.getText() + "^");
    }//GEN-LAST:event_btsomuActionPerformed

    private void btngoacTraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngoacTraiActionPerformed
            this.txtPheptinh.setText(this.txtPheptinh.getText() + "(");
    }//GEN-LAST:event_btngoacTraiActionPerformed

    private void btngoacPhaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngoacPhaiActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + ")");        
    }//GEN-LAST:event_btngoacPhaiActionPerformed

    private void btlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlnActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + "ln");
    }//GEN-LAST:event_btlnActionPerformed

    private void btlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlogActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + "log");
    }//GEN-LAST:event_btlogActionPerformed

    private void btBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBinActionPerformed
        
        try{
            this.lbCoSo.setVisible(true);
            this.lbCoSo.setText("Bin");
            if( this.txtKetqua.getText().compareTo("") != 0){
                this.txtKetqua.setText(""+this.gt.Bin(pheptinh, this.txtKetqua.getText()));
                this.pheptinh = 3;
            }
        } catch(Exception ex){
            this.txtKetqua.setText("Syntax Error");// loi cu phap
            
        }
        finally{
            this.pheptinh = 3;
        }
    }//GEN-LAST:event_btBinActionPerformed

    private void btHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHexActionPerformed
        try{
            
            this.lbCoSo.setVisible(true);
            this.lbCoSo.setText("Hex");
            if( this.txtKetqua.getText().compareTo("") != 0){
                this.txtKetqua.setText(this.gt.Hex(pheptinh, this.txtKetqua.getText()));
                this.pheptinh = 4;
            }
                

        }catch(Exception ex){
            this.txtKetqua.setText("Syntax Error");// loi cu phap
            
        }
        finally{
            this.pheptinh = 4;
        }
    }//GEN-LAST:event_btHexActionPerformed

    private void btPT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPT2ActionPerformed
        this.lbCoSo.setVisible(false);
        this.txtPheptinh.setText("a = ");
        if (pheptinh != 1){
            pheptinh = 1;
            solan = 0;
        }
        else {
            pheptinh = 0;
            this.txtPheptinh.setText("");
            this.txtKetqua.setText("");
        }
    }//GEN-LAST:event_btPT2ActionPerformed

    private void btPT2anActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPT2anActionPerformed
        this.lbCoSo.setVisible(false);
        this.txtPheptinh.setText("a1 = ");
        if (pheptinh != 2){
            pheptinh = 2;
            solan = 0;
        }
        else {
            pheptinh = 0;
            this.txtPheptinh.setText("");
            this.txtKetqua.setText("");
        }
    }//GEN-LAST:event_btPT2anActionPerformed

    private void btlapphuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlapphuongActionPerformed
        this.txtPheptinh.setText(this.txtPheptinh.getText() + "³");
    }//GEN-LAST:event_btlapphuongActionPerformed

    private void btDECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDECActionPerformed
    
        try{
            this.lbCoSo.setVisible(true);
            this.lbCoSo.setText("Dec");
            if( this.txtKetqua.getText().compareTo("") != 0){
                this.txtKetqua.setText(this.gt.Dec(pheptinh,this.txtKetqua.getText()));
                this.pheptinh = 0;
            }
        }catch (Exception ex){
            this.txtKetqua.setText("Syntax Error"); // loi cu phap
        }
    }//GEN-LAST:event_btDECActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Calculator;
    private javax.swing.JButton btBin;
    private javax.swing.JButton btDEC;
    private javax.swing.JButton btHex;
    private javax.swing.JButton btPT2;
    private javax.swing.JButton btPT2an;
    private javax.swing.JButton btac;
    private javax.swing.JButton btans;
    private javax.swing.JButton btbang;
    private javax.swing.JButton btbinhphuong;
    private javax.swing.JButton btcanbac2;
    private javax.swing.JButton btcanbac3;
    private javax.swing.JButton btchia;
    private javax.swing.JButton btcong;
    private javax.swing.JButton btcos;
    private javax.swing.JButton btdauam;
    private javax.swing.JButton btdaucham;
    private javax.swing.JButton btdelete;
    private javax.swing.JButton btgiaithua;
    private javax.swing.JButton btlapphuong;
    private javax.swing.JButton btln;
    private javax.swing.JButton btlog;
    private javax.swing.JButton btngoacPhai;
    private javax.swing.JButton btngoacTrai;
    private javax.swing.JButton btnhan;
    private javax.swing.JButton btphanso;
    private javax.swing.JButton btpi;
    private javax.swing.JButton btsin;
    private javax.swing.JButton btsomu;
    private javax.swing.JButton bttan;
    private javax.swing.JButton bttru;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton38;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCoSo;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JPanel pnManhinh;
    private javax.swing.JPanel pnPheptoan;
    private javax.swing.JPanel pnSo;
    private javax.swing.JRadioButton rbtDeg;
    private javax.swing.JRadioButton rbtRad;
    private javax.swing.JTextField txtKetqua;
    private javax.swing.JTextField txtPheptinh;
    // End of variables declaration//GEN-END:variables

}