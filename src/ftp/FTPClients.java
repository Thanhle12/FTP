package ftp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

/**
 *
 * @author Thanhle
 */

public class FTPClients extends javax.swing.JFrame {
    private FTPClient ftpClient = new FTPClient();
    
    // <editor-fold defaultstate="collapsed" desc="Giao diện GUI">
    public FTPClients() {
         initComponents();
         btnUpload.setEnabled(false);
         btnDownload.setEnabled(false);
         btnLogout.setEnabled(false);
         btnDisconnect.setEnabled(false);
         btnChooseFile.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jFrame1 = new javax.swing.JFrame();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jFrame2 = new javax.swing.JFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        btnConnect = new javax.swing.JButton();
        btnDisconnect = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtHostname = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtFilePath = new javax.swing.JTextField();
        btnChooseFile = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();
        btnDownload = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FTP CLIENT");
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 51, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FTP Client");

        btnConnect.setBackground(new java.awt.Color(0, 0, 255));
        btnConnect.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConnect.setText("Kết nối");
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        btnDisconnect.setBackground(new java.awt.Color(255, 51, 51));
        btnDisconnect.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDisconnect.setText("Ngắt kết nối");
        btnDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisconnectActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(0, 204, 0));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Hostname");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Username");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Port");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Password");

        txtHostname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtHostname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPort.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPort.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Đường Dẫn");

        txtFilePath.setEditable(false);
        txtFilePath.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFilePath.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnChooseFile.setBackground(new java.awt.Color(255, 102, 0));
        btnChooseFile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChooseFile.setText("Chọn tệp tin");
        btnChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileActionPerformed(evt);
            }
        });

        btnUpload.setBackground(new java.awt.Color(0, 153, 255));
        btnUpload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpload.setText("Tải lên");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnDownload.setBackground(new java.awt.Color(0, 102, 255));
        btnDownload.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDownload.setText("Tải xuống");
        btnDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDisconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPort, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                                    .addComponent(txtHostname)
                                    .addComponent(txtPassword))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 62, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtHostname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Button kết nối">
    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
         // TODO add your handling code here:
         try {
             String hostname = txtHostname.getText();
             int port = Integer.parseInt(txtPort.getText());
             String username = txtUsername.getText();
             String password = txtPassword.getText();
             ftpClient.connect(hostname, port);
             boolean loggedIn = ftpClient.login(username, password);
             if (loggedIn) {
                  int replyCode = ftpClient.getReplyCode();
                  if (!FTPReply.isPositiveCompletion(replyCode)) {
                     JOptionPane.showMessageDialog(this, "Không thể kết nối tới server! Lỗi: " + ftpClient.getReplyString());
                     return;
                  }
                  ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
                  ftpClient.enterLocalPassiveMode();
                  JOptionPane.showMessageDialog(this, "Kết nối thành công!");
	btnConnect.setEnabled(false);
	btnUpload.setEnabled(true);
	btnDownload.setEnabled(true);
	btnLogout.setEnabled(true);
	btnDisconnect.setEnabled(true);
	btnChooseFile.setEnabled(true);
             } else {
	btnConnect.setEnabled(true);
	btnUpload.setEnabled(false);
	btnDownload.setEnabled(false);
	btnLogout.setEnabled(false);
	btnDisconnect.setEnabled(false);
	btnChooseFile.setEnabled(false);
                  JOptionPane.showMessageDialog(this, "Kết nối thất bại!");
             }
         } catch (IOException e) {
             e.printStackTrace();
             btnConnect.setEnabled(true);
             btnUpload.setEnabled(false);
             btnDownload.setEnabled(false);
             btnLogout.setEnabled(false);
             btnDisconnect.setEnabled(false);
             btnChooseFile.setEnabled(false);
         }
    }//GEN-LAST:event_btnConnectActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Button ngắt kết nối">
    private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectActionPerformed
         // TODO add your handling code here:
         if (ftpClient.isConnected()) {
             try {
                  ftpClient.disconnect();
                  JOptionPane.showMessageDialog(this, "Ngắt kết nối thành công!");
	// Đặt lại trạng thái của các nút
                  btnConnect.setEnabled(true);
                  btnUpload.setEnabled(false);
                  btnDownload.setEnabled(false);
                  btnLogout.setEnabled(false);
                  btnDisconnect.setEnabled(false);
                  btnChooseFile.setEnabled(false);
             } catch (IOException e) {
                 e.printStackTrace();
             }
         }
    }//GEN-LAST:event_btnDisconnectActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Button đăng xuất">
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
         // TODO add your handling code here:
         try {
              // Kiểm tra xem ftpClient có đang kết nối không trước khi đăng xuất
              if (ftpClient.isConnected()) {
                  ftpClient.logout();
                  ftpClient.disconnect();
	JOptionPane.showMessageDialog(this, "Đăng xuất và ngắt kết nối tới server thành công!");
	
	// Xóa nội dung trong các trường thông tin
                  txtHostname.setText("");
                  txtUsername.setText("");
                  txtPort.setText("");
                  txtPassword.setText("");
                  txtFilePath.setText("");
		  
	// Đặt lại trạng thái của các nút
                  btnConnect.setEnabled(true);
                  btnUpload.setEnabled(false);
                  btnDownload.setEnabled(false);
                  btnLogout.setEnabled(false);
                  btnDisconnect.setEnabled(false);
                  btnChooseFile.setEnabled(false);
              } else {
	JOptionPane.showMessageDialog(this, "FTP không kết nối!");
              }
         } catch (IOException ex) {
              ex.printStackTrace();
         }
    }//GEN-LAST:event_btnLogoutActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Button chọn tệp tin">
    private void btnChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileActionPerformed
         // TODO add your handling code here:
         // Tạo một JFileChooser để người dùng chọn tệp tin
         JFileChooser fileChooser = new JFileChooser();
         int option = fileChooser.showOpenDialog(this);
         // Nếu người dùng chọn "Open", lấy đường dẫn của tệp tin đã chọn
         if (option == JFileChooser.APPROVE_OPTION) {
              File selectedFile = fileChooser.getSelectedFile();
              // Lấy đường dẫn tuyệt đối của tệp tin và thay dấu "\" bằng "/"
              String filePath = selectedFile.getAbsolutePath().replace("\\", "/");
              // Cập nhật txtFilePath với đường dẫn của tệp tin đã chọn
              txtFilePath.setText(filePath);
         }
    }//GEN-LAST:event_btnChooseFileActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Button tải lên">
    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
         // TODO add your handling code here:
         String filePath = txtFilePath.getText();
         File file = new File(filePath);
         if (!file.exists() || file.length() == 0) {
              JOptionPane.showMessageDialog(this, "Tệp tin không tồn tại hoặc trống!");
              return;
         }
         try {
              // Lấy danh sách các thư mục hiện có trên FTP server
              FTPFile[] directories = ftpClient.listDirectories();
             // Kiểm tra xem có thư mục nào tồn tại không
             if (directories.length == 0) {
                  JOptionPane.showMessageDialog(this, "Không tìm thấy thư mục nào trên server!");
                  return;
             }
             // Tạo một mảng các tên thư mục để hiển thị cho người dùng
             String[] directoryNames = new String[directories.length];
             for (int i = 0; i < directories.length; i++) {
                  directoryNames[i] = directories[i].getName();
             }
             // Hiển thị một hộp thoại cho phép người dùng chọn thư mục để upload file
             String selectedDirectory = (String) JOptionPane.showInputDialog(this,"Chọn thư mục để tải tệp tin lên", "Chọn Thư Mục", JOptionPane.QUESTION_MESSAGE, null, directoryNames, directoryNames[0]);
             // Kiểm tra nếu người dùng đã chọn một thư mục
             if (selectedDirectory == null) {
                  JOptionPane.showMessageDialog(this, "Bạn chưa chọn thư mục nào!");
                  return;
             }
             try (FileInputStream inputStream = new FileInputStream(file)) {
                  // Upload file vào thư mục đã chọn
                  boolean done = ftpClient.storeFile("/" + selectedDirectory + "/" + file.getName(), inputStream);
                  if (done) {
                       JOptionPane.showMessageDialog(this, "Tải tệp tin lên thành công vào thư mục: " + selectedDirectory);
                  } else {
                      JOptionPane.showMessageDialog(this, "Tải tệp tin lên thất bại! Lỗi: " + ftpClient.getReplyString());
                  }
             }
         } catch (IOException e) {
              e.printStackTrace();
         }
    }//GEN-LAST:event_btnUploadActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Button tải xuống">
    private void btnDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownloadActionPerformed
         // TODO add your handling code here:
         String filePath = txtFilePath.getText();
         JFileChooser fileChooser = new JFileChooser();
         fileChooser.setSelectedFile(new File(filePath));
         int option = fileChooser.showSaveDialog(this);
         if (option == JFileChooser.APPROVE_OPTION) {
             File selectedFile = fileChooser.getSelectedFile();
             try {
                  // Lấy danh sách các thư mục trên FTP server
                  FTPFile[] directories = ftpClient.listDirectories();
                  // Kiểm tra xem có thư mục nào tồn tại không
                  if (directories.length == 0) {
                       JOptionPane.showMessageDialog(this, "Không tìm thấy thư mục nào trên server!");
                       return;
                  }
                  // Tạo một mảng các tên thư mục để hiển thị cho người dùng
                  String[] directoryNames = new String[directories.length];
                  for (int i = 0; i < directories.length; i++) {
                       directoryNames[i] = directories[i].getName();
                  }
                  // Hiển thị một hộp thoại cho phép người dùng chọn thư mục để tải file từ đó
                  String selectedDirectory = (String) JOptionPane.showInputDialog(this,"Chọn thư mục để tải tệp tin xuống", "Chọn Thư Mục", JOptionPane.QUESTION_MESSAGE, null, directoryNames, directoryNames[0]);
                  // Kiểm tra nếu người dùng đã chọn một thư mục
                  if (selectedDirectory == null) {
                      JOptionPane.showMessageDialog(this, "Bạn chưa chọn thư mục nào!");
                      return;
                  }
                  // Tải file từ thư mục đã chọn
                  try (FileOutputStream outputStream = new FileOutputStream(selectedFile)) {
                      boolean success = ftpClient.retrieveFile("/" + selectedDirectory + "/" + new File(filePath).getName(), outputStream);
                      if (success) {
                           // Lấy vị trí lưu file và thời gian hiện tại
                           String fileLocation = selectedFile.getAbsolutePath();
                           String timeStamp = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a", Locale.ENGLISH).format(new Date());
                           // Hiển thị thông báo với vị trí lưu và thời gian tải xuống
                           JOptionPane.showMessageDialog(this, "Tải xuống thành công! Tệp tin được lưu tại: " + fileLocation + "\nThời gian: " + timeStamp);
                      } else {
                           JOptionPane.showMessageDialog(this, "Tải xuống thất bại! Lỗi: " + ftpClient.getReplyString());
                      }
                  }
             } catch (IOException e) {
                  e.printStackTrace();
             }
         }
    }//GEN-LAST:event_btnDownloadActionPerformed
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Hàm Main">
    public static void main(String args[]) {
         try {
              UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
         } catch (Exception e) {
              e.printStackTrace();
         }
         java.awt.EventQueue.invokeLater(new Runnable() {
              public void run() {
                  new FTPClients().setVisible(true);
              }
         });
    }
    // </editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseFile;
    private javax.swing.JButton btnConnect;
    private javax.swing.JButton btnDisconnect;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpload;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField txtFilePath;
    private javax.swing.JTextField txtHostname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}