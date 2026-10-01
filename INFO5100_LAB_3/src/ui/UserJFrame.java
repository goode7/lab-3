package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.User;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class UserJFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(UserJFrame.class.getName());
   
    public UserJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Age = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        FirstName = new javax.swing.JTextField();
        ageSpinner = new javax.swing.JSpinner();
        Name = new javax.swing.JLabel();
        College = new javax.swing.JLabel();
        PhoneNumber = new javax.swing.JLabel();
        textPhoneNumber = new javax.swing.JFormattedTextField();
        continent = new javax.swing.JLabel();
        ContinentComboBox = new javax.swing.JComboBox<>();
        experience = new javax.swing.JLabel();
        Photo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hobby = new javax.swing.JTextArea();
        Photo1 = new javax.swing.JTextField();
        UploadPhoto = new javax.swing.JButton();
        photoUpload = new javax.swing.JLabel();
        LastName = new javax.swing.JTextField();
        lastname = new javax.swing.JLabel();
        Gendercombobox = new javax.swing.JComboBox<>();
        Email1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Age.setText("Age:");

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        ageSpinner.setModel(new javax.swing.SpinnerNumberModel());

        Name.setText("First Name:");

        College.setText("Gender");

        PhoneNumber.setText("Phone:");

        try {
            textPhoneNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        textPhoneNumber.setToolTipText("123-456-7890");
        textPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPhoneNumberActionPerformed(evt);
            }
        });

        continent.setText("Continent:");

        ContinentComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Africa", "Antarctica", "Asia", "Europe", "North America", "South America", "Australia" }));

        experience.setText("Experience:");

        Photo.setText("Photo:");

        Hobby.setColumns(20);
        Hobby.setRows(5);
        jScrollPane1.setViewportView(Hobby);

        Photo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Photo1ActionPerformed(evt);
            }
        });

        UploadPhoto.setText("Upload Photo");
        UploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadPhotoActionPerformed(evt);
            }
        });

        lastname.setText("Last Name:");

        Gendercombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "male", "female" }));

        jLabel1.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Photo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(photoUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(UploadPhoto))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lastname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(FirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(LastName, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(258, 258, 258))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(continent)
                                .addGap(18, 18, 18)
                                .addComponent(ContinentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(College)
                                    .addComponent(PhoneNumber)
                                    .addComponent(experience))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(textPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Gendercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Photo1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Age)
                            .addComponent(Name)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ageSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(Email1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(Submit)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Age)
                    .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(College)
                    .addComponent(Gendercombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ContinentComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(continent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(experience)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Photo)
                        .addComponent(UploadPhoto))
                    .addComponent(Photo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(photoUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Submit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
String firstName=FirstName.getText();
String lastName=LastName.getText();
int Age=(int) ageSpinner.getValue();
String Email=Email1.getText();
String Gender=(String) Gendercombobox.getSelectedItem();
String Phone=textPhoneNumber.getText();
String Continent=(String) ContinentComboBox.getSelectedItem();
String Experience=Hobby.getText();
String Photo=Photo1.getText();

String errorTitle = "Ooops";

 // Validate first name
        if (firstName == null || firstName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid First Name Provided", errorTitle, ERROR_MESSAGE);
            return;
        }

        // Validate last name
        if (lastName == null || lastName.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid Last Name Provided", errorTitle, ERROR_MESSAGE);
            return;
        }

        // Validate phone
        if (!Phone.matches("\\d{3}-\\d{3}-\\d{4}")) {
            JOptionPane.showMessageDialog(this, "Invalid Phone Number", errorTitle, ERROR_MESSAGE);
            return;
        }
        
        if (!Email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
        JOptionPane.showMessageDialog(this, "Invalid email format!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        

User u1 =new User(firstName,lastName,Gender,Age,Phone,Email,Continent,Experience,Photo);

u1.setFirstName(firstName);
u1.setLastName(lastName);
u1.setGender(Gender);
u1.setAge(Age);
u1.setPhone(Phone);
u1.setContinent(Continent);
u1.setPhone(Photo);
u1.setHobbies(Experience);
u1.setEmail(Email);

String message= "FirstName: " + firstName
       +"\n LastName:"+lastName
        +"\n Age:"+Age
        +"\n Gender"+Gender
        +"\n Phone"+Phone
        + "\n Email: " + Email
        +"\n Continent"+Continent
        +"\n Hobbies"+Experience;

ImageIcon photoIcon = null;
        if (Photo != null && !Photo.trim().isEmpty()) {
            ImageIcon rawIcon = new ImageIcon(Photo);
            Image scaled = rawIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
            photoIcon = new ImageIcon(scaled);
        }

JOptionPane.showMessageDialog(
            this,
            message,
            "Success",
            JOptionPane.INFORMATION_MESSAGE,
            photoIcon
        );


    }//GEN-LAST:event_SubmitActionPerformed

    private void textPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPhoneNumberActionPerformed

    }//GEN-LAST:event_textPhoneNumberActionPerformed

    private void Photo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Photo1ActionPerformed
   
    }//GEN-LAST:event_Photo1ActionPerformed

    private void UploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadPhotoActionPerformed
                                            

        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            Photo1.setText(selectedFile.getAbsolutePath());

            // Load and scale image to fit label
            ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
            Image scaledImage = icon.getImage().getScaledInstance(photoUpload.getWidth(), photoUpload.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(scaledImage);

            photoUpload.setIcon(icon);
            photoUpload.setText(""); // remove placeholder text
        }
    }//GEN-LAST:event_UploadPhotoActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new UserJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Age;
    private javax.swing.JLabel College;
    private javax.swing.JComboBox<String> ContinentComboBox;
    private javax.swing.JFormattedTextField Email1;
    private javax.swing.JTextField FirstName;
    private javax.swing.JComboBox<String> Gendercombobox;
    private javax.swing.JTextArea Hobby;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel PhoneNumber;
    private javax.swing.JLabel Photo;
    private javax.swing.JTextField Photo1;
    private javax.swing.JButton Submit;
    private javax.swing.JButton UploadPhoto;
    private javax.swing.JSpinner ageSpinner;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel continent;
    private javax.swing.JLabel experience;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastname;
    private javax.swing.JLabel photoUpload;
    private javax.swing.JFormattedTextField textPhoneNumber;
    // End of variables declaration//GEN-END:variables

}