package com.mycompany.lab_ollama_algot2;

import java.awt.event.KeyAdapter;
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
    public static String[] chatActual = new String[30];

    GUI2 historial = new GUI2();

    private static final String DB_URL = "jdbc:sqlite:chatbot.db";

    public GUI() {
        initComponents();
        jScrollPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jScrollPane1KeyPressed(evt);
            }
        });
        prompt.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    prompt();  // Vaciar el JTextField solo si se presiona Enter
                }
            }
        });
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

        jScrollPane1 = new javax.swing.JScrollPane();
        prompt = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        chats = new javax.swing.JList<>();
        terminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnborrar = new javax.swing.JButton();
        btn_prompt = new javax.swing.JButton();
        btnhistorial = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ollama IA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
        terminar.setText("Save");
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

        jPanel1.setForeground(new java.awt.Color(82, 105, 203));
        jPanel1.setToolTipText("");

        btnborrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/data-cleaning.png"))); // NOI18N
        btnborrar.setText("Clean");
        btnborrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnborrarMouseClicked(evt);
            }
        });
        btnborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnborrarActionPerformed(evt);
            }
        });

        btn_prompt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/send-message.png"))); // NOI18N
        btn_prompt.setText("Send");
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

        btnhistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat.png"))); // NOI18N
        btnhistorial.setText("History");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnborrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_prompt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnhistorial))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnhistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnborrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_prompt)
                .addContainerGap())
        );

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recycle-bin.png"))); // NOI18N
        btneliminar.setText("Delete");
        btneliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneliminarMouseClicked(evt);
            }
        });
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jLabel3.setText("Ollama Chatbot");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(terminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btneliminar)
                        .addGap(248, 248, 248)
                        .addComponent(jLabel3)
                        .addGap(0, 262, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jScrollPane4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(terminar))))))
                .addContainerGap())
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

        //Chismoso por aqui
        int index = chats.getSelectedIndex();
        if (index != -1) {
            output.setText("");
            historial.setChatActual(index);

            StringBuilder conversation = new StringBuilder();
            for (String mensaje : historial.chatActual) {
                if (mensaje != null) {
                    conversation.append(mensaje).append("\n");
                }
            }
            output.setText(conversation.toString());
        }
    }//GEN-LAST:event_chatsMouseClicked

    private void terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarActionPerformed

    }//GEN-LAST:event_terminarActionPerformed

    private void btn_promptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_promptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_promptActionPerformed

    private void terminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_terminarMouseClicked

        int i = 0;
        while (i < chats2.length && chats2[i] != null) {
            i++;
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
                // Shift + Enter: Inserta un salto de línea en el prompt
                prompt.setText(prompt.getText() + "\n");
            } else {
                // Enter: Envía el prompt
                evt.consume(); // Previene el salto de línea
                prompt();
            }
        }

    }//GEN-LAST:event_jScrollPane1KeyPressed

    private void btnhistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhistorialMouseClicked
        historial.setVisible(true);
        chats.setListData(chats2);
    }//GEN-LAST:event_btnhistorialMouseClicked

    private void btnhistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhistorialActionPerformed

    }//GEN-LAST:event_btnhistorialActionPerformed

    private void btnborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnborrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnborrarActionPerformed

    private void btnborrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnborrarMouseClicked
        output.setText("");
    }//GEN-LAST:event_btnborrarMouseClicked

    private void btneliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneliminarMouseClicked
        int index = chats.getSelectedIndex();

        if (index != -1 && chats2[index] != null) {

            for (int i = index; i < chats2.length - 1; i++) {
                chats2[i] = chats2[i + 1];
            }
            chats2[chats2.length - 1] = null;

            chats.setListData(chats2);
            JOptionPane.showMessageDialog(null, "Chat eliminado exitosamente.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un chat válido para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btneliminarMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

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
    private javax.swing.JButton btnborrar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnhistorial;
    public javax.swing.JList<String> chats;
    private javax.swing.JLabel jLabel3;
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
                    "{\"model\": \"%s\", \"prompt\": \"Por favor, responde siempre en español. %s\", \"stream\": false}",
                    nombremodelo, promptText);

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
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
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
                return "Error 400: Solicitud incorrecta. No terminar Prompt con tecla (Enter).";
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

    public String[] getChats2() {
        return chats2.clone();
    }

    public String[][] getDatos() {
        String[][] datosCopy = new String[datos.length][];
        for (int i = 0; i < datos.length; i++) {
            datosCopy[i] = datos[i].clone();
        }
        return datosCopy;
    }

    private String getConversation(String chatName) {
        int index = findChatIndexByName(chatName);
        if (index != -1) {
            historial.setChatActual(index);

            StringBuilder conversation = new StringBuilder();
            for (String mensaje : historial.chatActual) {
                if (mensaje != null) {
                    conversation.append(mensaje).append("\n");
                }
            }
            return conversation.toString();
        }
        return "Conversación no encontrada.";
    }

    private int findChatIndexByName(String chatName) {
        String[] chatNames = historial.getNameshistorial();
        for (int i = 0; i < chatNames.length; i++) {
            if (chatName.equals(chatNames[i])) {
                return i;
            }
        }
        return -1;
    }
}
