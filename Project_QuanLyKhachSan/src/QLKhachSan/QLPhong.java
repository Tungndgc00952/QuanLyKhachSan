package QLKhachSan;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLPhong extends javax.swing.JFrame {

    public QLPhong() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ItnPhong = new javax.swing.JInternalFrame();
        pnlAddandUpdate = new javax.swing.JPanel();
        lblAddandUpdate = new javax.swing.JLabel();
        lblMaPhong = new javax.swing.JLabel();
        lblLoaiPhong = new javax.swing.JLabel();
        lblCoPhong = new javax.swing.JLabel();
        lblGiaPhong = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        txtMaPhong = new javax.swing.JTextField();
        cbbLoaiPhong = new javax.swing.JComboBox();
        cbbCoPhong = new javax.swing.JComboBox();
        txtGiaPhong = new javax.swing.JTextField();
        txtTrangThai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListRoom = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnAdd = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        ItnNhanVien = new javax.swing.JInternalFrame();
        pnlQLStaff = new javax.swing.JPanel();
        lblTen = new javax.swing.JLabel();
        lblTuoi = new javax.swing.JLabel();
        lblDienThoai = new javax.swing.JLabel();
        lblDiachiEmail = new javax.swing.JLabel();
        lblChuyenNganh = new javax.swing.JLabel();
        lblLuong = new javax.swing.JLabel();
        lblNgaynhanlam = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        txtphoneNumber = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        rdbgmail = new javax.swing.JRadioButton();
        rdbfpt = new javax.swing.JRadioButton();
        cbbChuyenNganh = new javax.swing.JComboBox();
        txtLuong = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblQLStaff = new javax.swing.JTable();
        btnAddStaff = new javax.swing.JButton();
        btnResetStaff = new javax.swing.JButton();
        btnDeleteStaff = new javax.swing.JButton();
        btnUpdateStaff = new javax.swing.JButton();
        txtSearchStaff = new javax.swing.JTextField();
        btnSearchStaff = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnPhong = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        MainFrame = new javax.swing.JDesktopPane();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        ItnPhong.setClosable(true);
        ItnPhong.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ItnPhong.setTitle("                                                                Room Manager "); // NOI18N
        ItnPhong.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1378212624_secure-server-px-png.png"))); // NOI18N
        ItnPhong.setVisible(true);
        ItnPhong.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItnPhongAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        pnlAddandUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblAddandUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddandUpdate.setText("ADD / UPDATE");
        lblAddandUpdate.setPreferredSize(new java.awt.Dimension(150, 17));

        lblMaPhong.setText("Mã Phòng:");
        lblMaPhong.setPreferredSize(new java.awt.Dimension(80, 20));

        lblLoaiPhong.setText("Loại Phòng");
        lblLoaiPhong.setPreferredSize(new java.awt.Dimension(80, 20));

        lblCoPhong.setText("Cỡ Phòng");
        lblCoPhong.setPreferredSize(new java.awt.Dimension(80, 20));

        lblGiaPhong.setText("Giá Phòng:");
        lblGiaPhong.setPreferredSize(new java.awt.Dimension(80, 20));

        lblTrangThai.setText("Trạng Thái:");
        lblTrangThai.setPreferredSize(new java.awt.Dimension(80, 20));

        cbbLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "VIP", "Thường" }));

        cbbCoPhong.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Đơn", "Đôi" }));

        javax.swing.GroupLayout pnlAddandUpdateLayout = new javax.swing.GroupLayout(pnlAddandUpdate);
        pnlAddandUpdate.setLayout(pnlAddandUpdateLayout);
        pnlAddandUpdateLayout.setHorizontalGroup(
            pnlAddandUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddandUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAddandUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddandUpdateLayout.createSequentialGroup()
                        .addGroup(pnlAddandUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAddandUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaPhong)
                            .addComponent(cbbLoaiPhong, 0, 151, Short.MAX_VALUE)
                            .addComponent(cbbCoPhong, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtGiaPhong)))
                    .addGroup(pnlAddandUpdateLayout.createSequentialGroup()
                        .addComponent(lblAddandUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlAddandUpdateLayout.createSequentialGroup()
                        .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTrangThai)))
                .addContainerGap())
        );
        pnlAddandUpdateLayout.setVerticalGroup(
            pnlAddandUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddandUpdateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddandUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAddandUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(pnlAddandUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(pnlAddandUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbCoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pnlAddandUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGiaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pnlAddandUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        tblListRoom.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblListRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Phòng", "Loại Phòng", "Cỡ Phòng", "Giá Phòng", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblListRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListRoomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListRoom);

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1378213186_camera_test.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1378213213_POWER - RESTART.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1378213236_-trash.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1378213486_application-x-sqlite2.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ItnPhongLayout = new javax.swing.GroupLayout(ItnPhong.getContentPane());
        ItnPhong.getContentPane().setLayout(ItnPhongLayout);
        ItnPhongLayout.setHorizontalGroup(
            ItnPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(ItnPhongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItnPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ItnPhongLayout.createSequentialGroup()
                        .addComponent(pnlAddandUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE))
                    .addGroup(ItnPhongLayout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)))
                .addContainerGap())
        );
        ItnPhongLayout.setVerticalGroup(
            ItnPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItnPhongLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItnPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlAddandUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ItnPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        ItnNhanVien.setClosable(true);
        ItnNhanVien.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ItnNhanVien.setTitle(" Quan Ly Nhan Vien");
        ItnNhanVien.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1378212661_Admin.png"))); // NOI18N
        ItnNhanVien.setVisible(true);
        ItnNhanVien.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ItnNhanVienAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        pnlQLStaff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblTen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTen.setText("Tên:");

        lblTuoi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTuoi.setText("Tuổi:");

        lblDienThoai.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDienThoai.setText("Số điện thoại:");

        lblDiachiEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDiachiEmail.setText("Địa chỉ mail:");

        lblChuyenNganh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblChuyenNganh.setText("Chuyên ngành:");

        lblLuong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLuong.setText("Lương:");

        lblNgaynhanlam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNgaynhanlam.setText("Ngày nhận làm:");

        buttonGroup1.add(rdbgmail);
        rdbgmail.setText("gmail.com");

        buttonGroup1.add(rdbfpt);
        rdbfpt.setText("fpt.edu.vn");

        cbbChuyenNganh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quản Lý", "Tiếp Tân" }));

        lblDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblDate.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblDateAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout pnlQLStaffLayout = new javax.swing.GroupLayout(pnlQLStaff);
        pnlQLStaff.setLayout(pnlQLStaffLayout);
        pnlQLStaffLayout.setHorizontalGroup(
            pnlQLStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQLStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQLStaffLayout.createSequentialGroup()
                        .addGroup(pnlQLStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLuong)
                            .addComponent(cbbChuyenNganh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlQLStaffLayout.createSequentialGroup()
                                .addComponent(rdbgmail, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(rdbfpt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtphoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlQLStaffLayout.createSequentialGroup()
                                .addGroup(pnlQLStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTuoi)
                                    .addComponent(lblTen)
                                    .addComponent(lblDiachiEmail)
                                    .addComponent(lblChuyenNganh)
                                    .addComponent(lblNgaynhanlam))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnlQLStaffLayout.createSequentialGroup()
                        .addGroup(pnlQLStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLuong)
                            .addComponent(lblDienThoai))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlQLStaffLayout.setVerticalGroup(
            pnlQLStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLStaffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTuoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(lblDienThoai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtphoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDiachiEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlQLStaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbgmail)
                    .addComponent(rdbfpt))
                .addGap(18, 18, 18)
                .addComponent(lblChuyenNganh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLuong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNgaynhanlam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblQLStaff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tblQLStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Họ Tên", "Tuổi", "Số điện thoại", "Địa chỉ", "Chuyên ngành", "Lương", "Ngày nhận làm"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblQLStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQLStaffMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblQLStaff);

        btnAddStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1378213186_camera_test.png"))); // NOI18N
        btnAddStaff.setText("Add");
        btnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffActionPerformed(evt);
            }
        });

        btnResetStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1378213213_POWER - RESTART.png"))); // NOI18N
        btnResetStaff.setText("Reset");
        btnResetStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetStaffActionPerformed(evt);
            }
        });

        btnDeleteStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1378213236_-trash.png"))); // NOI18N
        btnDeleteStaff.setText("Delete");
        btnDeleteStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteStaffActionPerformed(evt);
            }
        });

        btnUpdateStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1378213486_application-x-sqlite2.png"))); // NOI18N
        btnUpdateStaff.setText("Update");
        btnUpdateStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStaffActionPerformed(evt);
            }
        });

        txtSearchStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtSearchStaff.setPreferredSize(new java.awt.Dimension(59, 35));

        btnSearchStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1378213072_Search_3D.png"))); // NOI18N
        btnSearchStaff.setText("Search");
        btnSearchStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStaffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ItnNhanVienLayout = new javax.swing.GroupLayout(ItnNhanVien.getContentPane());
        ItnNhanVien.getContentPane().setLayout(ItnNhanVienLayout);
        ItnNhanVienLayout.setHorizontalGroup(
            ItnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ItnNhanVienLayout.createSequentialGroup()
                        .addComponent(pnlQLStaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(ItnNhanVienLayout.createSequentialGroup()
                        .addComponent(btnAddStaff)
                        .addGap(18, 18, 18)
                        .addComponent(btnResetStaff)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteStaff)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateStaff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addComponent(txtSearchStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearchStaff)))
                .addContainerGap())
        );
        ItnNhanVienLayout.setVerticalGroup(
            ItnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ItnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlQLStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(ItnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnResetStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ItnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDeleteStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdateStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ItnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearchStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 90));
        jPanel1.setPreferredSize(new java.awt.Dimension(963, 90));

        btnPhong.setText("Phòng");
        btnPhong.setMaximumSize(new java.awt.Dimension(107, 75));
        btnPhong.setMinimumSize(new java.awt.Dimension(107, 75));
        btnPhong.setPreferredSize(new java.awt.Dimension(80, 75));
        btnPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhongActionPerformed(evt);
            }
        });

        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/staff.png"))); // NOI18N
        btnNhanVien.setPreferredSize(new java.awt.Dimension(80, 75));
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        MainFrame.setBackground(new java.awt.Color(240, 240, 240));
        MainFrame.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout MainFrameLayout = new javax.swing.GroupLayout(MainFrame);
        MainFrame.setLayout(MainFrameLayout);
        MainFrameLayout.setHorizontalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 959, Short.MAX_VALUE)
        );
        MainFrameLayout.setVerticalGroup(
            MainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        MenuBar.setPreferredSize(new java.awt.Dimension(60, 21));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Config connection");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Exit");
        jMenu1.add(jMenuItem2);

        MenuBar.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem3.setText("Help");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Database SQL Query Demo");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("About");
        jMenu2.add(jMenuItem5);

        MenuBar.add(jMenu2);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainFrame)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainFrame))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                        //*********************** QUẢN LÝ Phòng ***************************

    public void ReadQLPhong(String Query, String Param) {
        try {
            Connection con = DBConnection.getConnection();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            PreparedStatement ps = con.prepareStatement(Query);
            if (!Param.equals("")) {
                ps.setString(1, Param);
            }
            ResultSet rs = ps.executeQuery();
            DefaultTableModel dfm = (DefaultTableModel) tblListRoom.getModel();
            dfm.setRowCount(0);
            while (rs.next()) {
                String MaPhong = rs.getString(1);
                String LoaiPhong = rs.getString(2);
                String CoPhong = rs.getString(3);
                int Price = rs.getInt(4);
                String TrangThai = rs.getString(5);
                Vector row = new Vector();
                row.add(MaPhong);
                row.add(LoaiPhong);
                row.add(CoPhong);
                row.add(Price);
                row.add(TrangThai);
                dfm.addRow(row);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLPhong.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QLPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void btnPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhongActionPerformed
        ItnPhong.setSize(963, 604);
        MainFrame.add(ItnPhong);
        try {
            ItnPhong.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(QLPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
        ItnPhong.toFront();
    }//GEN-LAST:event_btnPhongActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtMaPhong.getText().equals("") || txtGiaPhong.getText().equals("") || txtTrangThai.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Khong duoc de trong!!!");
        } else {
            try {
                Connection con = DBConnection.getConnection();
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                int Price = Integer.parseInt(txtGiaPhong.getText());
                String MaPhong = txtMaPhong.getText();
                String LoaiPhong = (String) cbbLoaiPhong.getSelectedItem();
                String CoPhong = (String) cbbCoPhong.getSelectedItem();
                String TrangThai = txtTrangThai.getText();
                PreparedStatement ps = con.prepareStatement("Insert into listRoom values (?,?,?,?,?)");
                ps.setString(1, MaPhong);
                ps.setString(2, LoaiPhong);
                ps.setString(3, CoPhong);
                ps.setInt(4, Price);
                ps.setString(5, TrangThai);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Added!!!");
                ps.close();
                con.close();
            } catch (ClassNotFoundException ex) {
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Phong nay da ton tai!!");
            }
        }
        ReadQLPhong("Select * from listRoom", "");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMaPhong.setText("");
        cbbLoaiPhong.setSelectedIndex(0);
        cbbCoPhong.setSelectedIndex(0);
        txtGiaPhong.setText("");
        txtTrangThai.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtMaPhong.getText().equals("") || txtGiaPhong.getText().equals("") || txtTrangThai.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "khong co du lieu de xoa!!!");
        } else {
            String MaPhong = txtMaPhong.getText();
            try {
                Connection con = DBConnection.getConnection();
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                PreparedStatement ps = con.prepareStatement("delete from listRoom where codeRoom = '" + MaPhong + "'  ");
                JOptionPane.showMessageDialog(null, "Deleted!!!");
                ps.executeUpdate();
                ps.close();
                con.close();
            } catch (ClassNotFoundException ex) {
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error!!");
            }
        }
        ReadQLPhong("Select * from listRoom", "");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            Connection con = DBConnection.getConnection();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String MaPhong = txtMaPhong.getText();
            String LoaiPhong = (String) cbbLoaiPhong.getSelectedItem();
            String CoPhong = (String) cbbCoPhong.getSelectedItem();
            int Price = Integer.parseInt(txtGiaPhong.getText());
            String TrangThai = txtTrangThai.getText();

            PreparedStatement ps = con.prepareStatement("UPDATE listRoom SET kindOfRoom = '" + LoaiPhong + "', sizeRoom = '" + CoPhong + "', Price = '" + Price + "', Status = '" + TrangThai + "' WHERE codeRoom = '" + MaPhong + "' ");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated!!!");
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        ReadQLPhong("Select * from listRoom", "");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String Search = txtSearch.getText();
        ReadQLPhong("select * from listRoom where codeRoom like ?", "%" + Search + "%");
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblListRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListRoomMouseClicked
        int row = tblListRoom.getSelectedRow();
        String MaPhong = tblListRoom.getValueAt(row, 0).toString();
        String LoaiPhong = tblListRoom.getValueAt(row, 1).toString();
        String CoPhong = tblListRoom.getValueAt(row, 2).toString();
        int Price = Integer.parseInt(tblListRoom.getValueAt(row, 3).toString());
        String TrangThai = tblListRoom.getValueAt(row, 4).toString();
        txtMaPhong.setText(MaPhong);
        cbbLoaiPhong.setSelectedItem(LoaiPhong);
        cbbCoPhong.setSelectedItem(CoPhong);
        txtGiaPhong.setText(Price + "");
        txtTrangThai.setText(TrangThai);
    }//GEN-LAST:event_tblListRoomMouseClicked

    private void ItnPhongAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ItnPhongAncestorAdded
        ReadQLPhong("Select * from listRoom", "");
    }//GEN-LAST:event_ItnPhongAncestorAdded
                        // *****************QUẢN  LÝ NHÂN VIÊN*********************

    public void ReadQLNhanVien(String Query, String Param) {
        try {
            Connection con = DBConnection.getConnection();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            PreparedStatement ps = con.prepareStatement(Query);
            if (!Param.equals("")) {
                ps.setString(1, Param);
            }
            ResultSet rs = ps.executeQuery();
            DefaultTableModel dfm = (DefaultTableModel) tblQLStaff.getModel();
            dfm.setRowCount(0);
            while (rs.next()) {
                String Name = rs.getString(1);
                int Age = rs.getInt(2);
                int phoneNumber = rs.getInt(3);
                String Address = rs.getString(4);
                String Specialized = rs.getString(5);
                int Salary = rs.getInt(6);
                String Date = rs.getString(7);
                Vector row = new Vector();
                row.add(Name);
                row.add(Age);
                row.add(phoneNumber);
                row.add(Address);
                row.add(Specialized);
                row.add(Salary);
                row.add(Date);
                dfm.addRow(row);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QLPhong.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QLPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        ItnNhanVien.setSize(963, 604);
        MainFrame.add(ItnNhanVien);
        try {
            ItnNhanVien.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(QLPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
        ItnNhanVien.toFront();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void lblDateAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblDateAncestorAdded
        SimpleDateFormat sdfDate = new SimpleDateFormat("dd-MM-yyyy");
        Date now = new Date();
        String Date = sdfDate.format(now);
        lblDate.setText(Date);
    }//GEN-LAST:event_lblDateAncestorAdded

    private void btnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStaffActionPerformed
        String Name = txtTen.getText();
        int Age = Integer.parseInt(txtTuoi.getText());
        int Phone = Integer.parseInt(txtphoneNumber.getText());
        String Email = txtEmailAddress.getText();
        String Specialized = (String) cbbChuyenNganh.getSelectedItem();
        int Salary = Integer.parseInt(txtLuong.getText());
        String Date = lblDate.getText();
        try {
            Connection con = DBConnection.getConnection();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            PreparedStatement ps = con.prepareStatement("insert into informationStaff values (?,?,?,?,?,?,?)");
            ps.setString(1, Name);
            ps.setInt(2, Age);
            ps.setInt(3, Phone);
            if (rdbgmail.isSelected()) {
                ps.setString(4, Email + "@gmail.com");
            } else if (rdbfpt.isSelected()) {
                ps.setString(4, Email + "@fpt.edu.vn");
            } else {
                JOptionPane.showMessageDialog(null, "Bạn hãy chọn 1 trong 2 mail ở dưới");
            }
            ps.setString(5, Specialized);
            ps.setInt(6, Salary);
            ps.setString(7, Date);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Added!!!");
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
        }
        ReadQLNhanVien("Select * from informationStaff", "");
    }//GEN-LAST:event_btnAddStaffActionPerformed

    private void btnResetStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetStaffActionPerformed
        txtTen.setText("");
        txtTuoi.setText("");
        txtphoneNumber.setText("");
        txtEmailAddress.setText("");
        rdbgmail.setSelected(true);
        rdbfpt.setSelected(false);
        cbbChuyenNganh.setSelectedIndex(0);
        txtLuong.setText("");
    }//GEN-LAST:event_btnResetStaffActionPerformed

    private void btnDeleteStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteStaffActionPerformed
        if (txtTen.getText().equals("") || txtTuoi.getText().equals("") || txtphoneNumber.getText().equals("") || txtEmailAddress.getText().equals("") || txtLuong.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "khong co du lieu de xoa!!!");
        } else {
            String Name = txtTen.getText();
            try {
                Connection con = DBConnection.getConnection();
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                PreparedStatement ps = con.prepareStatement("delete from informationStaff where Name = '" + Name + "'  ");
                JOptionPane.showMessageDialog(null, "Deleted!!!");
                ps.executeUpdate();
                ps.close();
                con.close();
            } catch (ClassNotFoundException ex) {
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error!!");
            }
        }
        ReadQLNhanVien("Select * from informationStaff", "");
    }//GEN-LAST:event_btnDeleteStaffActionPerformed

    private void btnUpdateStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStaffActionPerformed
        try {
            Connection con = DBConnection.getConnection();
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String Name = txtTen.getText();
            int Age = Integer.parseInt(txtTuoi.getText());
            int Phone = Integer.parseInt(txtphoneNumber.getText());
            String Email = txtEmailAddress.getText();
            String Specialized = (String) cbbChuyenNganh.getSelectedItem();
            int Salary = Integer.parseInt(txtLuong.getText());
            String Date = lblDate.getText();

            PreparedStatement ps = con.prepareStatement("UPDATE informationStaff SET Age = '" + Age + "', phoneNumber = '" + Phone + "', Address = '" + Email + "', Specialized = '" + Specialized + "', Salary = '"+ Salary +"', ngayNhan = '"+ Date +"' WHERE Name = '" + Name + "' ");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Updated!!!");
            ps.close();
            con.close();
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error!!");
        }
        ReadQLNhanVien("Select * from informationStaff", "");
    }//GEN-LAST:event_btnUpdateStaffActionPerformed

    private void btnSearchStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStaffActionPerformed
        String Search = txtSearchStaff.getText();
        ReadQLNhanVien("select * from informationStaff where Name like ?", "%" + Search + "%");
    }//GEN-LAST:event_btnSearchStaffActionPerformed

    private void tblQLStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQLStaffMouseClicked
        int row = tblQLStaff.getSelectedRow();
        String Name = tblQLStaff.getValueAt(row, 0).toString();
        int Age = Integer.parseInt(tblQLStaff.getValueAt(row, 1).toString());
        int Phone = Integer.parseInt(tblQLStaff.getValueAt(row, 2).toString());
        String Email = tblQLStaff.getValueAt(row, 3).toString();
        String Specialized = tblQLStaff.getValueAt(row, 4).toString();
        int Salary = Integer.parseInt(tblQLStaff.getValueAt(row, 5).toString());
        String Date = tblQLStaff.getValueAt(row, 6).toString();
        txtTen.setText(Name);
        txtTuoi.setText(Age + "");
        txtphoneNumber.setText(Phone + "");
        txtEmailAddress.setText(Email);
        cbbChuyenNganh.setSelectedItem(Specialized);
        txtLuong.setText(Salary + "");
        lblDate.setText(Date);
    }//GEN-LAST:event_tblQLStaffMouseClicked

    private void ItnNhanVienAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ItnNhanVienAncestorAdded
        ReadQLNhanVien("Select * from informationStaff", "");
    }//GEN-LAST:event_ItnNhanVienAncestorAdded

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame ItnNhanVien;
    private javax.swing.JInternalFrame ItnPhong;
    private javax.swing.JDesktopPane MainFrame;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddStaff;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteStaff;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnPhong;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResetStaff;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchStaff;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateStaff;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbbChuyenNganh;
    private javax.swing.JComboBox cbbCoPhong;
    private javax.swing.JComboBox cbbLoaiPhong;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddandUpdate;
    private javax.swing.JLabel lblChuyenNganh;
    private javax.swing.JLabel lblCoPhong;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDiachiEmail;
    private javax.swing.JLabel lblDienThoai;
    private javax.swing.JLabel lblGiaPhong;
    private javax.swing.JLabel lblLoaiPhong;
    private javax.swing.JLabel lblLuong;
    private javax.swing.JLabel lblMaPhong;
    private javax.swing.JLabel lblNgaynhanlam;
    private javax.swing.JLabel lblTen;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblTuoi;
    private javax.swing.JPanel pnlAddandUpdate;
    private javax.swing.JPanel pnlQLStaff;
    private javax.swing.JRadioButton rdbfpt;
    private javax.swing.JRadioButton rdbgmail;
    private javax.swing.JTable tblListRoom;
    private javax.swing.JTable tblQLStaff;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtGiaPhong;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchStaff;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTrangThai;
    private javax.swing.JTextField txtTuoi;
    private javax.swing.JTextField txtphoneNumber;
    // End of variables declaration//GEN-END:variables
}
