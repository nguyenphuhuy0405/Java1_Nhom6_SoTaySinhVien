/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MyPC
 */
public class QuanLyQuaTrinhHoc extends javax.swing.JFrame {
     int dongChon = -1;
    DBEngine db = new DBEngine();
    ArrayList<KetQua> dskq = new ArrayList<>();
    KetQua kq = new KetQua();
    String tenFile = "KetQua.txt";

    /**
     * Creates new form QuanLyQuaTrinhHoc
     */
    public QuanLyQuaTrinhHoc() {
        initComponents();
        fakeData();
        loadTable(dskq);
    }
    
    public void fakeData(){
        KetQua kq1 = new KetQua(8.0, 8.0, 8.0, "Gioi","MH1","Lập trình Java");
        dskq.add(kq1);
        KetQua kq2 = new KetQua(7.0, 7.0, 7.0, "Kha","MH2","Java nâng cao");
        dskq.add(kq2);
        KetQua kq3 = new KetQua(8.5, 8.5, 8.5, "Gioi","MH3","Thiết kế Web");
        dskq.add(kq3);
        KetQua kq4 = new KetQua(5.0, 5.0, 4.0, "Yeu","MH4","Lập trình hướng đối tượng");
        dskq.add(kq4);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnQuaylai = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdMH = new javax.swing.JTextField();
        txtTenMH = new javax.swing.JTextField();
        txtTX1 = new javax.swing.JTextField();
        txtTX2 = new javax.swing.JTextField();
        txtDiemThi = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        BtnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        BtnDocfile = new javax.swing.JButton();
        BtnGhifile = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKetQua = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lý Quá Trình Học");

        BtnQuaylai.setBackground(new java.awt.Color(51, 153, 255));
        BtnQuaylai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnQuaylai.setForeground(new java.awt.Color(255, 255, 255));
        BtnQuaylai.setText("< Quay lại");
        BtnQuaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnQuaylaiActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(51, 153, 255));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnQuaylai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnQuaylai)
                    .addComponent(btnReset))
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(35, 295));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã môn học:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tên môn học:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TX1:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TX2:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Điểm thi:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdMH))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenMH)
                            .addComponent(txtTX1)
                            .addComponent(txtTX2)
                            .addComponent(txtDiemThi))))
                .addGap(6, 6, 6))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTX1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTX2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        btnSua.setBackground(new java.awt.Color(51, 153, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        BtnXoa.setBackground(new java.awt.Color(51, 153, 255));
        BtnXoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnXoa.setForeground(new java.awt.Color(255, 255, 255));
        BtnXoa.setText("Xóa");
        BtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnXoaActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(51, 153, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTim.setBackground(new java.awt.Color(51, 153, 255));
        btnTim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTim.setForeground(new java.awt.Color(255, 255, 255));
        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        BtnDocfile.setBackground(new java.awt.Color(51, 153, 255));
        BtnDocfile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnDocfile.setForeground(new java.awt.Color(255, 255, 255));
        BtnDocfile.setText("Đọc file");
        BtnDocfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDocfileActionPerformed(evt);
            }
        });

        BtnGhifile.setBackground(new java.awt.Color(51, 153, 255));
        BtnGhifile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnGhifile.setForeground(new java.awt.Color(255, 255, 255));
        BtnGhifile.setText("Ghi file");
        BtnGhifile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGhifileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BtnDocfile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnGhifile, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(BtnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTim)
                    .addComponent(BtnXoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnDocfile)
                    .addComponent(BtnGhifile)))
        );

        tableKetQua.setBackground(new java.awt.Color(153, 204, 255));
        tableKetQua.setForeground(new java.awt.Color(102, 102, 255));
        tableKetQua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableKetQua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKetQuaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKetQua);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnQuaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnQuaylaiActionPerformed
         MenuAdmin m = new MenuAdmin();
        m.show();
        this.hide();
    }//GEN-LAST:event_BtnQuaylaiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try{
          int dem =0;
        KetQua kq = new KetQua();
        kq.setMaMH(getTxtIdMh());
        kq.setTenMH(getTxtTenMh());
        kq.setTx1(getTxtTX1());
        kq.setTx2(getTxtTX2());
        kq.setDiemThi(getTxtDiemThi());
        kq.setKetQua(kq.tinhKetQua());
        kq.tinhKetQua();
        for(KetQua i: dskq){
          if(kq.getTenMH().equals(i.getTenMH())|| kq.getMaMH().equals(i.getMaMH())){
             dem++; 
          }  
        }
        if(dem ==0){
            Clear();
            dskq.add(kq);
            loadTable(dskq);
        }else{
            throw new Exception("Tên môn học hoặc mã môn học đã tồn tại");
        }
        } catch (Exception e){
            JOptionPane.showConfirmDialog(this, e.toString(),"Thông báo",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        dongChon = tableKetQua.getSelectedRow();
        try {
            if(dongChon != -1){
                kq = dskq.get(dongChon);
                kq.setTx1(getTxtTX1());
                kq.setTx2(getTxtTX2());
                kq.setDiemThi(getTxtDiemThi());
                Clear();
                JOptionPane.showConfirmDialog(this,"Sửa thành công","Thông báo",JOptionPane.CLOSED_OPTION);
                loadTable(dskq);
            }else{
                throw new Exception("Vui lòng chọn dòng");
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.toString(),"Thông báo",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void BtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnXoaActionPerformed
        dongChon = tableKetQua.getSelectedRow();
        try {
            if(dongChon != -1){
                int confirm = JOptionPane.showConfirmDialog(this,"Bạn chắc chắc muốn xoá ?","Xác nhận",JOptionPane.YES_NO_OPTION);
                if(confirm == JOptionPane.YES_OPTION){
                    kq = dskq.get(dongChon);
                    dskq.remove(dongChon);
                    Clear();
                    loadTable(dskq);
                }
            }else{
                throw new Exception("Vui lòng chọn dòng");
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.toString(),"Thông báo",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_BtnXoaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        try {
            int dem = 0;
            KetQua kq = new KetQua();
            kq.setMaMH(getTxtIdMh());
            kq.setTenMH(getTxtTenMh());
            for(KetQua i:dskq){
                if(kq.getTenMH().equals(i.getTenMH()) || kq.getMaMH().equals(i.getMaMH())){
                    Clear();
                    kq.setMaMH(i.getMaMH());
                    kq.setTenMH(i.getTenMH());
                    kq.setTx1(i.getTx1());
                    kq.setTx2(i.getTx2());
                    kq.setDiemThi(i.getDiemThi());
                    dskq = new ArrayList<>();
                    dskq.add(i);
                    Clear();
                    tableKetQua.setModel(new TBKetQua(dskq));
                    dem++;
                }
            }
            if(dem==0) {
                throw new Exception("Không tìm thấy mã mh hoặc tên môn học");
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.toString(),"Thông báo",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        dskq = new ArrayList<>();
        Clear();
        fakeData();
        loadTable(dskq);
    }//GEN-LAST:event_btnResetActionPerformed

    private void BtnDocfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDocfileActionPerformed
        // TODO add your handling code here:
        dskq = new ArrayList<>();
        try {
            dskq = (ArrayList<KetQua>) db.docFile(tenFile);
            JOptionPane.showConfirmDialog(this,"Đọc file thành công","Thông báo",JOptionPane.CLOSED_OPTION);
        } catch (Exception e) {
            System.out.println("Có lỗi: " + e.toString());
        } 
        loadTable(dskq);
    }//GEN-LAST:event_BtnDocfileActionPerformed

    private void BtnGhifileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGhifileActionPerformed
        // TODO add your handling code here:
        try {
            db.luuFile(tenFile, dskq);
            JOptionPane.showConfirmDialog(this,"Ghi file thành công","Thông báo",JOptionPane.CLOSED_OPTION);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_BtnGhifileActionPerformed

    private void tableKetQuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKetQuaMouseClicked
        dongChon = tableKetQua.getSelectedRow();
        if(dongChon != -1){
            kq = dskq.get(dongChon);
            txtIdMH.setText(kq.getMaMH());
            txtTenMH.setText(kq.getTenMH());
            txtTX1.setText(String.valueOf(kq.getTx1()));
            txtTX2.setText(String.valueOf(kq.getTx2()));
            txtDiemThi.setText(String.valueOf(kq.getDiemThi()));
        }
    }//GEN-LAST:event_tableKetQuaMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public void loadTable(ArrayList<KetQua> dskq ){
        tableKetQua.setModel(new TBKetQua(dskq));
    }
    
    public void Clear(){
        txtIdMH.setText("");
        txtTenMH.setText("");
        txtTX1.setText("");
        txtTX2.setText("");
        txtTenMH.setText("");
        txtDiemThi.setText("");
    }
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(QuanLyQuaTrinhHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyQuaTrinhHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyQuaTrinhHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyQuaTrinhHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyQuaTrinhHoc().setVisible(true);
            }
        });
    }
    
    public String getTxtIdMh() throws Exception{
        if(txtIdMH.getText().trim().equals(""))
            throw new Exception("Mã môn học không được để trống");
        return txtIdMH.getText().trim();
    }
    public String getTxtTenMh() throws Exception{
        if(txtTenMH.getText().trim().equals(""))
            throw new Exception("Tên môn học không được để trống");
        return txtTenMH.getText().trim();
    }
    public double getTxtTX1() throws Exception{
        if(txtTX1.getText().trim().equals(""))
            throw new Exception("Thường xuyên 1 không được để trống");
        return Double.parseDouble(txtTX1.getText().trim());
    }
    public double getTxtTX2() throws Exception{
        if(txtTX2.getText().trim().equals(""))
            throw new Exception("Thường xuyên 2 không được để trống");
        return Double.parseDouble(txtTX2.getText().trim());
    }
    public double getTxtDiemThi() throws Exception{
        if(txtDiemThi.getText().trim().equals(""))
            throw new Exception("Điểm thi không được để trống");
        return Double.parseDouble(txtDiemThi.getText().trim());
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDocfile;
    private javax.swing.JButton BtnGhifile;
    private javax.swing.JButton BtnQuaylai;
    private javax.swing.JButton BtnXoa;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableKetQua;
    private javax.swing.JTextField txtDiemThi;
    private javax.swing.JTextField txtIdMH;
    private javax.swing.JTextField txtTX1;
    private javax.swing.JTextField txtTX2;
    private javax.swing.JTextField txtTenMH;
    // End of variables declaration//GEN-END:variables
}