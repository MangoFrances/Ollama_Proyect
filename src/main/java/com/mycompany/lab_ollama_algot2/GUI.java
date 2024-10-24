package com.mycompany.lab_ollama_algot2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.json.JSONObject;

public class GUI extends javax.swing.JFrame {

    String nombremodelo = "gemma2:2b";
    String chats2[] = new String[1000];
    String datos[][] = new String[1000][2];
    
     private static final String DB_URL = "jdbc:sqlite:chatbot.db";
      
    public GUI() {
        initComponents();
        //setIconImage(new ImageIcon(getClass().getResource("/ai.png")).getImage());
    }
    public void rescatavectorinador (String v[]){
       String v2[]= new String [v.length]; 
       
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("The Chat");

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

        terminar.setText("End");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(terminar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btn_prompt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(terminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_prompt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_promptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_promptMouseClicked
        String texto = prompt.getText() + "\n";
        if (!texto.trim().isEmpty()) {
            output.append("Usuario: " + texto + "\n");
            // Agrega el texto del usuario

            String entrada = prompt.getText();
            String milagro = (ollama(nombremodelo, entrada) + "\n");

            System.out.println(milagro);
            output.append(" Respuesta: " + milagro + "\n");
            prompt.setText("");

            //historial.add(new String[]{entrada, milagro});
        }

        /*for (String[] intercambio : historial) {
            System.out.println("Pregunta: " + intercambio[0] + "\n"+ intercambio[1]);
        }*/
        
       int hola=24;
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
        int i=0;
          chats2[i]=churro; 
            i++;
        
        String name = JOptionPane.showInputDialog("Ingese nombre del nuevo chat");
        boolean vacio = false;
        boolean vacio2 = false;
        int index;
        for ( i = 0; i < 1000; i++) {
            if (chats2[i] == null) {
                chats2[i] = name;
                vacio = true;
                index = 1;
                break;
            }
            if(datos[i][0] == null){
                datos[i][0] = name;
                vacio2 = true;
                break;
            }
        }
        if (vacio) {
            chats.setListData(chats2);
        } else {
            JOptionPane.showMessageDialog(null, "No creado, ingrese nombre del chat (1 palabra)", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
     
        
        
        
        
        
        
        
    }//GEN-LAST:event_terminarMouseClicked

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
    private javax.swing.JList<String> chats;
    private javax.swing.JLabel jLabel1;
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
            if (code == 404) {
                return "Error 404: El recurso solicitado no fue encontrado. Verifica el endpoint y el servidor.";
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


}
