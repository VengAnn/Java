
package BTL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Fram1 extends javax.swing.JFrame {
    
    HoaDonDoiTuong hddt = new HoaDonDoiTuong();
    //set date type
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Fram1() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void setModel(HoaDon hd)
    {
        labelMaHoaDon.setText(hd.getMaHoadon());
        txt_MaHD.setText(hd.getMaHoadon());
        txt_TenKhach.setText(hd.getTenkhach());
        txt_TenHang.setText(hd.getTenHang());
        txt_NgayLap.setText(hd.getNgayLap().format(formatter));
        txt_DiaChi.setText(hd.getDiachi());
        txt_Don_gia.setText(hd.getDonGia()+"");
        lbelTenKhach.setText(hd.getTenkhach());
        txt_So_Luong.setText(hd.getSoLuong()+"");
        txt_Don_vi_Tinh.setText(hd.getDonviTinh());
        HD2 hd2 =new HD2();
        hd2.labelMaHoaDon2.setText(hd.getMaHoadon());
        hd2.lbelTenKhach2.setText(hd.getTenkhach());
        txt_Thanh_tien.setText(hd.getDonGia()*hd.getSoLuong()+"");
        
    }
    
    public HoaDon getModel()
    {
        HoaDon hd = new HoaDon();
        hd.setMaHoadon(txt_MaHD.getText().trim());
        hd.setTenHang(txt_TenHang.getText().trim());
        hd.setTenkhach(txt_TenKhach.getText().trim());
        hd.setDonviTinh(txt_Don_vi_Tinh.getText().trim());
        hd.setDiachi(txt_DiaChi.getText().trim());
        hd.setNgayLap(LocalDate.parse(txt_NgayLap.getText().trim(),formatter));
        hd.setSoLuong(Integer.parseInt(txt_So_Luong.getText().trim()));
        hd.setDonGia(Double.parseDouble(txt_Don_gia.getText().trim()));
        //hd.setThanhTien(Double.parseDouble(txt_Thanh_tien.getText().trim));
        return hd;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_TenHang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_So_Luong = new javax.swing.JTextField();
        txt_TenKhach = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_MaHD = new javax.swing.JTextField();
        txt_DiaChi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Don_gia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Add = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_NgayLap = new javax.swing.JTextField();
        txt_Don_vi_Tinh = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnTongTienThang2 = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TbHoadon = new javax.swing.JTable();
        txt_Thanh_tien = new javax.swing.JTextField();
        txt_Tong_tien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbelTenKhach = new javax.swing.JLabel();
        labelMaHoaDon = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSapXepthang1den3 = new javax.swing.JButton();
        btnThuNhapCaoNhat2020 = new javax.swing.JButton();
        btnGiaTriLonNhatNgay5Thang4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Welcome to Hoa Don Design By Veng Ann");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(352, 352, 352)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Ma Hoa Don:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Ten Khach :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ten Hang:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Don vi tinh:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("So Luong:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Don Gia:");

        btn_Add.setBackground(new java.awt.Color(204, 255, 204));
        btn_Add.setText("Add");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Ngay Lap:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Dia Chi:");

        btnTongTienThang2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTongTienThang2.setText("Tong Tien Tat ca Hoa don thang 2");
        btnTongTienThang2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTongTienThang2ActionPerformed(evt);
            }
        });

        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        TbHoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "TenHang", "DiaChi", "NgayLap", "DonviTinh", "SoLuong", "Dongia", "ThanhTien"
            }
        ));
        TbHoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TbHoadonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TbHoadon);

        txt_Thanh_tien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Tong Tien :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Thanh Tien:");

        lbelTenKhach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbelTenKhach.setText(".........................");

        labelMaHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelMaHoaDon.setText(".................");

        jLabel13.setText("MAHoaDon:");

        jLabel12.setText("TenKhach:");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnTimKiem.setText("TimKiem By MaHD");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnSapXepthang1den3.setText("Sap Xep theo thu tu giam dan thang1den3");
        btnSapXepthang1den3.setMaximumSize(new java.awt.Dimension(246, 27));
        btnSapXepthang1den3.setMinimumSize(new java.awt.Dimension(246, 27));
        btnSapXepthang1den3.setPreferredSize(new java.awt.Dimension(246, 27));
        btnSapXepthang1den3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepthang1den3ActionPerformed(evt);
            }
        });

        btnThuNhapCaoNhat2020.setText("Nam 2020 Thu Nhap Cao Nhat");
        btnThuNhapCaoNhat2020.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuNhapCaoNhat2020ActionPerformed(evt);
            }
        });

        btnGiaTriLonNhatNgay5Thang4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGiaTriLonNhatNgay5Thang4.setText("HD Gai tri lon nhat 5/04/2023");
        btnGiaTriLonNhatNgay5Thang4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGiaTriLonNhatNgay5Thang4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_MaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_TenKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_NgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txt_So_Luong, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbelTenKhach, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Don_vi_Tinh)
                            .addComponent(txt_Don_gia, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_TenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(19, 19, 19))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(303, 303, 303))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_Tong_tien, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                                        .addComponent(txt_Thanh_tien)))
                                .addComponent(btnThuNhapCaoNhat2020, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnTongTienThang2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGiaTriLonNhatNgay5Thang4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSapXepthang1den3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_MaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txt_TenHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete)
                    .addComponent(btn_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_TenKhach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txt_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(btnExit)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_So_Luong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Don_vi_Tinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel7)
                    .addComponent(txt_Don_gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbelTenKhach)
                    .addComponent(jLabel12)
                    .addComponent(labelMaHoaDon)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_Thanh_tien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Tong_tien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(32, 32, 32)
                        .addComponent(btnTongTienThang2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSapXepthang1den3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThuNhapCaoNhat2020, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGiaTriLonNhatNgay5Thang4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public boolean  checkValue()
    {
        if(txt_MaHD.getText().isEmpty() || txt_TenHang.getText().isEmpty()
           || txt_TenKhach.getText().isEmpty() || txt_DiaChi.getText().isEmpty()
           || txt_Don_vi_Tinh.getText().isEmpty() || txt_So_Luong.getText().isEmpty()
           || txt_NgayLap.getText().isEmpty() )
        {
            return false;
        }
        return true;
    }
    
    public void ShowDataTable()
    {   //Mothod show to Table
        // Add the data to the table
        DefaultTableModel table = (DefaultTableModel) TbHoadon.getModel();
        table.setRowCount(0); //clear table
        
        for(HoaDon hd : hddt.getAll()){
            Object rowData[] = new Object[8];
            rowData[0] = table.getRowCount()+1; //STT        // model.getRowCount() + 1, // STT
            rowData[1] = hd.getTenHang();
            rowData[2] = hd.getDiachi();
            rowData[3] = formatter.format(hd.getNgayLap());
            rowData[4] = hd.getDonviTinh();
            rowData[5] = hd.getSoLuong(); 
            rowData[6] = hd.getDonGia();   
            rowData[7] = hd.getSoLuong() * hd.getDonGia(); // Thanh Tien   
                      
            /*HoaDonDoiTuong hddt = new HoaDonDoiTuong();
            for(HoaDon hd : hddt.getAll())
            {
                Object row[] = new Object[7];
                row[0] = model.getRowCount()+1;
                row[1] = hd.getTenHang();
                row[2] = hd.getDiachi();
                row[3] = hd.getNgayLap();
                row[4] = hd.getDonviTinh();
                row[5] = hd.getSoLuong();
                row[6] = hd.getDonGia();
                row[7] = hd.getSoLuong() * hd.getDonGia(); // Thanh Tien
            }*/
            double ThanhTien = hd.getDonGia()*hd.getSoLuong();
            txt_Thanh_tien.setText(String.valueOf(ThanhTien));
            lbelTenKhach.setText(hd.getTenkhach());
            labelMaHoaDon.setText(hd.getMaHoadon());
            table.addRow(rowData);
        }
        // Calculate the total and update the total field
        double total = 0;
        //int lastRowIndex = TbHoadon.getRowCount() - 1; //khong dung toi muuon
        for (int row = 0; row < table.getRowCount(); row++) 
        {
            total += (double) table.getValueAt(row, 7);
        }
        //TbHoadon.setValueAt(total, lastRowIndex, 7); //dang khong dung toi muon lam
        txt_Tong_tien.setText(String.valueOf(total));
        
        // Clear the input fields
        txt_MaHD.setText("");
        txt_TenHang.setText("");
        txt_TenKhach.setText("");
        txt_DiaChi.setText("");
        txt_Don_vi_Tinh.setText("");
        txt_So_Luong.setText("");
        //txt_NgayLap.setText("");
        txt_Don_gia.setText("");
        
    }
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        
        if(!checkValue())
        {
            JOptionPane.showMessageDialog(this,"Ban chua nhap thong tin");
        }
        else
        {
            try {
                   //HoaDonDoiTuong hddt = new HoaDonDoiTuong();
                   HoaDon hd = getModel();
                   System.out.println("=>"+hd.toString());
                    if(btn_Add.getText().equals("Add"))
                    {
                        if(hddt.add(hd)>0)
                        {
                            ShowDataTable();
                        }
                    }
                    else 
                    {
                          if(hddt.edit(hd)>0)
                          {
                               ShowDataTable(); 
                          }
                    }
                          
            } catch (Exception e) {
                System.out.print("erorr"+e.toString());
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AddActionPerformed
        
    //static int position =0;
    private void TbHoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbHoadonMouseClicked
        int rowID = TbHoadon.rowAtPoint(evt.getPoint());
        HoaDon hd = hddt.getHoaDonAtPointtt(rowID);
        if(hd==null)
        {
            return;
        }
        
        setModel(hd);
        btn_Add.setText("Sua");
    
    }//GEN-LAST:event_TbHoadonMouseClicked
    
    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        if(txt_MaHD.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Ban chua nhap MA HOA DON !!");
        }else
        {
            if(hddt.delele(txt_MaHD.getText().trim())>0)
            {
                //for(HoaDon hd : hddt.getAll()) //cai hddt lay tu ArrayList getAll return hd cua class Hoadon;
                ShowDataTable();
            }else {
                JOptionPane.showMessageDialog(this, "Khong tim thay Ma HOa Don");
            }
                
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_DeleteActionPerformed
    private void clear()
    {
        txt_MaHD.setText("");
        txt_TenHang.setText("");
        txt_TenKhach.setText("");
        txt_NgayLap.setText("");
        txt_So_Luong.setText("");
        txt_Don_vi_Tinh.setText("");
        txt_DiaChi.setText("");
        txt_Don_gia.setText("");
        btn_Add.setText("Add");
    }
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if(txt_MaHD.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Ban chua nhap Ma Hoa Don de tim kiem");
        }else
        {
            HoaDon hd = hddt.findByID(txt_MaHD.getText().trim());
            if(hd !=null)
            {
                setModel(hd);
            }else
            {
                JOptionPane.showMessageDialog(this, "Khong Tim thay Ma Nay khong co roi!!");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    
    private void btnTongTienThang2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTongTienThang2ActionPerformed
    
    //go to form2 =>> HD2
    HD2 hd2 = new HD2();
    //Get the table model of TbHoadon
    TableModel table1 = TbHoadon.getModel();
    DefaultTableModel table2 = (DefaultTableModel)hd2.TbHoadon2.getModel();
    
    // Tạo biến để tính tổng tiền
    double TongTien2 = 0.0;
    //Copy all rows from table1 to table2
    for (int i = 0; i < table1.getRowCount(); i++) {
        // Get the date value from table1
        String dateString = (String) table1.getValueAt(i, 3);
        LocalDate date = LocalDate.parse(dateString, formatter); // formatter(dd/MM/YYYY); 
        Object[] row = new Object[table1.getColumnCount()]; //select all columns in table1

        // Check if the month is February (month value is 2)
        if (date.getMonthValue() == 2) 
        {
        // Add the row to table2
            for (int j = 0; j < table1.getColumnCount(); j++) 
            {
            row[j] = table1.getValueAt(i, j);
            }
            table2.addRow(row);
        
            // Tính tổng tiền của hàng tháng 2 và cộng vào biến TongTien2
            double ThanhTien2 = Double.parseDouble(table1.getValueAt(i, 7).toString());
            TongTien2 += ThanhTien2;
            
        }
    }
        hd2.setVisible(true);
        hd2.txt_Tong2.setText(String.valueOf(TongTien2));
        System.out.println("Tổng tiền tháng 2: " + TongTien2);
        
        
        //Dung ham AddlistSelectionListener; //when select show data to what you want to show   
    hd2.TbHoadon2.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
    public void valueChanged(ListSelectionEvent event) {
        // Kiểm tra xem đã chọn hàng và không phải đang xử lý sự kiện chọn
        if (event.getValueIsAdjusting() || hd2.TbHoadon2.getSelectedRow() == -1) {
            return;
        }
        
        int selectedRow = hd2.TbHoadon2.getSelectedRow();
        int modelRow = hd2.TbHoadon2.convertRowIndexToModel(selectedRow);
        HoaDon hd = hddt.GETgetHoaDonAtPointtt(modelRow, hd2.TbHoadon2);
        hd2.labelMaHoaDon2.setText(hd.getMaHoadon());
        hd2.lbelTenKhach2.setText(hd.getTenkhach());

        setModel(hd);
    }
});

        
    }//GEN-LAST:event_btnTongTienThang2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
    // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnSapXepthang1den3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepthang1den3ActionPerformed
        
        HD3 hd3 = new HD3();
        TableModel table1 = TbHoadon.getModel();
        DefaultTableModel table3 = (DefaultTableModel)hd3.TbHoadon3.getModel();
        
        for(int i=0; i<table1.getRowCount() ; i++)
        {
            String dateString =(String)table1.getValueAt(i, 3);
            LocalDate date = LocalDate.parse(dateString,formatter);
            Object row[] = new Object[table1.getColumnCount()];
            //Add the row to table2
            if(date.getMonthValue()>=1 && date.getMonthValue()<=3)
            {
                for(int j=0; j<table1.getColumnCount(); j++)
                {
                    row[j] = table1.getValueAt(i, j);
                }
                table3.addRow(row);
            }

        }
        
        
        // sap xep table3 thu tu giam dan theo ten hang
        Comparator<Object[]> comparator = new Comparator<Object[]>()
        {
            public int compare(Object[] row1, Object[] row2)
            {
                String tenHang1 = (String) row1[1];
                String tenHang2 = (String) row2[1];
                return tenHang2.compareToIgnoreCase(tenHang1);
            }
        };
        //set new List of Object to load data in table3;
        List<Object[]> rows = new ArrayList<>();
        for(int i=0; i<table3.getRowCount(); i++)
        {
            Object row[] = new Object[table3.getColumnCount()];
            for(int j=0; j<table3.getColumnCount(); j++)
            {
                row[j] = table3.getValueAt(i, j);
            }
            rows.add(row);
        }
        
        Collections.sort(rows, comparator);
        table3.setRowCount(0); //set table row to zero
        
        for(Object[] row : rows)
        {
            table3.addRow(row);
        }
        hd3.setVisible(true);
        
        //Select on Table3 in HD3
        hd3.TbHoadon3.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
          public void valueChanged(ListSelectionEvent event)
          {
              //kiem tra 
              if(event.getValueIsAdjusting() || hd3.TbHoadon3.getSelectedRow() == -1)
              {
                  return;
              }
            int selectedRow = hd3.TbHoadon3.getSelectedRow();
            int modelRow = hd3.TbHoadon3.convertRowIndexToModel(selectedRow);
            HoaDon hd = hddt.GETgetHoaDonAtPointtt(modelRow, hd3.TbHoadon3);
            hd3.labelMaHoaDon3.setText(hd.getMaHoadon());
            hd3.lbelTenKhach3.setText(hd.getTenkhach());

          }
        });
         
    }//GEN-LAST:event_btnSapXepthang1den3ActionPerformed

    private void btnThuNhapCaoNhat2020ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuNhapCaoNhat2020ActionPerformed

        HD4 hd4 = new HD4();
        TableModel table1 = (DefaultTableModel)TbHoadon.getModel();
        DefaultTableModel table4 = (DefaultTableModel)hd4.TbHoadon4.getModel();
        double MaxIncome=0.0;

        List<Object[]> maxIncomeRows = new ArrayList<>();
        for (int i = 0; i < table1.getRowCount(); i++) {
            // Get the date value from table1
            String dateString = (String) table1.getValueAt(i, 3);
            LocalDate date = LocalDate.parse(dateString, formatter);
            Object[] row = new Object[table1.getColumnCount()];

            // Check if the year is 2020
            if (date.getYear() == 2020) {
                double income = Double.parseDouble(table1.getValueAt(i, 7).toString());

                // Compare and update the maximum income
                if (income >= MaxIncome) {
                    if (income > MaxIncome) {
                        MaxIncome = income;
                        maxIncomeRows.clear();
                    }
                    for (int j = 0; j < table1.getColumnCount(); j++) {
                        row[j] = table1.getValueAt(i, j);
                    }
                    maxIncomeRows.add(row);
                }
            }
        }

        // Add all rows with maximum income to table4
        for (Object[] row : maxIncomeRows) {
            table4.addRow(row);
        }

        hd4.setVisible(true);
        
        //select on table show name and ID on lable
        hd4.TbHoadon4.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event)
            {
                if(event.getValueIsAdjusting() || hd4.TbHoadon4.getSelectedRow()==-1)
                {
                    return;
                }
                int selectedRow = hd4.TbHoadon4.getSelectedRow();
                int modelRow = hd4.TbHoadon4.convertRowIndexToModel(selectedRow);
                HoaDon hd = hddt.GETgetHoaDonAtPointtt(modelRow, hd4.TbHoadon4);
                hd4.labelMaHoaDon4.setText(hd.getMaHoadon());
                hd4.lbelTenKhach4.setText(hd.getTenkhach());

            }
        });
    }//GEN-LAST:event_btnThuNhapCaoNhat2020ActionPerformed

    private void btnGiaTriLonNhatNgay5Thang4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGiaTriLonNhatNgay5Thang4ActionPerformed
    
        HD5 hd5 = new HD5();
        TableModel table1 = (DefaultTableModel)TbHoadon.getModel();
        DefaultTableModel table5 = (DefaultTableModel)hd5.TbHoadon5.getModel();
        
        double Max =0.0;
        List<Object[]> maxInComeRows = new ArrayList<>();
        for(int i=0; i<table1.getRowCount(); i++)
        {
            String datestr = (String)table1.getValueAt(i, 3);
            LocalDate date = LocalDate.parse(datestr,formatter);//formatter la(dd/MM/YYYY);
            Object[] row = new Object[table1.getColumnCount()];
            if (date.getDayOfMonth() ==5 && date.getMonthValue()==4 && date.getYear()==2023) 
            {
                double TongtienIncome = Double.parseDouble(table1.getValueAt(i, 7).toString());
                //
                if(TongtienIncome >= Max)
                {
                    if(TongtienIncome > Max)
                    {
                        Max = TongtienIncome;
                        maxInComeRows.clear();
                    }
                    for(int j =0; j<table1.getColumnCount(); j++)
                    {
                        row[j] = table1.getValueAt(i, j);
                    }
                    maxInComeRows.add(row);
                }
            }
        }
        
        for(Object[] ob : maxInComeRows)
        {
            table5.addRow(ob);
        }
        hd5.setVisible(true);
        
        hd5.TbHoadon5.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event)
            {
                if(event.getValueIsAdjusting() || hd5.TbHoadon5.getSelectedRow()==-1)
                {
                    return;
                }
                int slectedRow = hd5.TbHoadon5.getSelectedRow();
                int modelRow = hd5.TbHoadon5.convertRowIndexToModel(slectedRow);
                HoaDon hd = hddt.GETgetHoaDonAtPointtt(modelRow, hd5.TbHoadon5);
                hd5.labelMaHoaDon5.setText(hd.getMaHoadon());
                hd5.lbelTenKhach5.setText(hd.getTenkhach());
            }
            
            
        });
        
    // TODO add your handling code here:
    }//GEN-LAST:event_btnGiaTriLonNhatNgay5Thang4ActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fram1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fram1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TbHoadon;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGiaTriLonNhatNgay5Thang4;
    private javax.swing.JButton btnSapXepthang1den3;
    private javax.swing.JButton btnThuNhapCaoNhat2020;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnTongTienThang2;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelMaHoaDon;
    private javax.swing.JLabel lbelTenKhach;
    private javax.swing.JTextField txt_DiaChi;
    private javax.swing.JTextField txt_Don_gia;
    private javax.swing.JTextField txt_Don_vi_Tinh;
    private javax.swing.JTextField txt_MaHD;
    private javax.swing.JTextField txt_NgayLap;
    private javax.swing.JTextField txt_So_Luong;
    private javax.swing.JTextField txt_TenHang;
    private javax.swing.JTextField txt_TenKhach;
    private javax.swing.JTextField txt_Thanh_tien;
    private javax.swing.JTextField txt_Tong_tien;
    // End of variables declaration//GEN-END:variables
}
