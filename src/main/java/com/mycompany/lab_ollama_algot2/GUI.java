package com.mycompany.lab_ollama_algot2;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class GUI extends javax.swing.JFrame {

    String nombremodelo = "gemma2:2b";
    String chats2[] = new String[1000];
    String datos[][] = new String[1000][2];
    GUI2 historial = new GUI2();

    private static final String DB_URL = "jdbc:sqlite:chatbot.db";

    public GUI() {
        initComponents();

    }

    private void prompt() {
        String texto = prompt.getText() + "\n";
        if (!texto.trim().isEmpty()) {
            output.append("Usuario: " + texto + "\n");
            // Agrega el texto del usuario

            String entrada = prompt.getText();
            String milagro = (ollama(nombremodelo, entrada) + "\n");

            output.append(" Respuesta: " + milagro + "\n");
            prompt.setText("");

            //historial.add(new String[]{entrada, milagro});
        }
    }

    public void rescatavectorinador(String v[]) {
        String v2[] = new String[v.length];

        // dokckpedkpokefpovoj fiovjiojio
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_prompt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        prompt = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        chats = new javax.swing.JList<>();
        terminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnhistorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ollama IA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ollama Chatbot");

        btn_prompt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/send-message.png"))); // NOI18N
        btn_prompt.setText("Enviar");
        btn_prompt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_promptMouseClicked(evt);
            }
        });
        btn_prompt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_promptActionPerformed(evt);
            }
        });

        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jScrollPane1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(prompt);

        output.setEditable(false);
        output.setColumns(20);
        output.setLineWrap(true);
        output.setRows(5);
        output.setWrapStyleWord(true);
        jScrollPane4.setViewportView(output);

        chats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(chats);

        terminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        terminar.setText("Guardar chat");
        terminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                terminarMouseClicked(evt);
            }
        });
        terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Britannic Bold", 3, 15)); // NOI18N
        jLabel4.setText("Historial");

        jPanel1.setForeground(new java.awt.Color(82, 105, 203));
        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/history.png"))); // NOI18N

        btnhistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat.png"))); // NOI18N
        btnhistorial.setText("Historial");
        btnhistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhistorialMouseClicked(evt);
            }
        });
        btnhistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(243, 243, 243))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnhistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(terminar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_prompt, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_prompt)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(terminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnhistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 65, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_promptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_promptMouseClicked
        prompt();

        /*for (String[] intercambio : historial) {
            System.out.println("Pregunta: " + intercambio[0] + "\n"+ intercambio[1]);
        }*/

    }//GEN-LAST:event_btn_promptMouseClicked

    private void chatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatsMouseClicked


    }//GEN-LAST:event_chatsMouseClicked

    private void terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terminarActionPerformed

    private void btn_promptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_promptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_promptActionPerformed

    private void terminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terminarMouseClicked
String churro = output.getText();
int i = 0;
while (i < chats2.length && chats2[i] != null) {
    i++;
}
if (i < chats2.length) {
    chats2[i] = churro;
}

String name = JOptionPane.showInputDialog(null, "Ingrese nombre del nuevo chat", "Guardar chat", JOptionPane.INFORMATION_MESSAGE);
if (name == null || name.trim().isEmpty()) {
    JOptionPane.showMessageDialog(null, "No se ingresó un nombre válido para el chat.", "Error", JOptionPane.WARNING_MESSAGE);
    return;
}

boolean guardado = false;

for (i = 0; i < chats2.length; i++) {
    if (chats2[i] == null) {
        chats2[i] = name;
        guardado = true;
        break;
    }
}

for (i = 0; i < datos.length; i++) {
    if (datos[i][0] == null) {
        datos[i][0] = name;
        break;
    }
}

if (guardado) {
    chats.setListData(chats2);
} else {
    JOptionPane.showMessageDialog(null, "No creado, ingrese nombre del chat (1 palabra)", "Información", JOptionPane.WARNING_MESSAGE);
}

    }//GEN-LAST:event_terminarMouseClicked

    private void jScrollPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jScrollPane1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (evt.isShiftDown()) {
                // Shift + Enter: Inserta un salto de línea
                output.append("\n");
            } else {
                // Enter: Envía el prompt
                evt.consume(); // Previene el salto de línea
                prompt();
            }
        }
    }//GEN-LAST:event_jScrollPane1KeyPressed

    private void btnhistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhistorialMouseClicked
        historial.setVisible(true);


    }//GEN-LAST:event_btnhistorialMouseClicked

    private void btnhistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhistorialActionPerformed
        this.dispose();
        historial.setVisible(true);
    }//GEN-LAST:event_btnhistorialActionPerformed

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
    private javax.swing.JButton btn_prompt;
    private javax.swing.JButton btnhistorial;
    private javax.swing.JList<String> chats;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea output;
    private javax.swing.JTextPane prompt;
    private javax.swing.JButton terminar;
    // End of variables declaration//GEN-END:variables
public static String ollama(String nombremodelo, String promptText) {
        try {
            URL url = new URL("http://localhost:11434/api/generate");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json; utf-8");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);

            String jsonInputString = String.format(
                    "{\"model\": \"%s\", \"prompt\": \"Por favor, responde siempre en español. %s\", \"stream\": false}", nombremodelo, promptText
            );

            // Enviar la solicitud
            try ( OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Obtener el código de respuesta
            int code = conn.getResponseCode();
            String errorMessage = errorHandler(code);
            if (errorMessage != null) {
                return errorMessage;
            } else {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    response.append(line);
                }
                in.close();

                // Extraer el contenido de la respuesta JSON
                JSONObject jsonResponse = new JSONObject(response.toString());
                String responseText = jsonResponse.getString("response");

                // Devolver la respuesta
                return responseText;
            }

        } catch (MalformedURLException e) {
            return "La URL es inválida: " + e.getMessage();
        } catch (IOException e) {
            return "Error de conexión: " + e.getMessage();
        }
    }

    private static String errorHandler(int code) {
        switch (code) {
            case 400:
                return "Error 400: Solicitud incorrecta. Verifica los datos enviados.";
            case 401:
                return "Error 401: No autorizado. Verifica tus credenciales de autenticación.";
            case 403:
                return "Error 403: Prohibido. No tienes permiso para acceder a este recurso.";
            case 404:
                return "Error 404: El recurso solicitado no fue encontrado. Verifica el endpoint y el servidor.";
            case 500:
                return "Error 500: Error interno del servidor. Intenta nuevamente más tarde.";
            case 503:
                return "Error 503: Servicio no disponible. El servidor podría estar en mantenimiento.";
            // Añade más casos según sea necesario
            default:
                return null; // No hay error conocido, la solicitud fue exitosa
        }
    }

}
