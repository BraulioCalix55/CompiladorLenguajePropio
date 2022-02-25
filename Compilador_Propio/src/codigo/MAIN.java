/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Braulio
 */
public class MAIN extends javax.swing.JFrame {

    /**
     * Creates new form MAIN
     */
    public MAIN() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Elige_archivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Panel_codigo = new javax.swing.JTextArea();
        Btn_Compilar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Text_final = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Elige_archivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Elige_archivo.setText("Cargar código");
        Elige_archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Elige_archivoActionPerformed(evt);
            }
        });

        Panel_codigo.setColumns(20);
        Panel_codigo.setRows(5);
        jScrollPane1.setViewportView(Panel_codigo);

        Btn_Compilar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Btn_Compilar.setText("Compilar Código");
        Btn_Compilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CompilarActionPerformed(evt);
            }
        });

        Text_final.setColumns(20);
        Text_final.setRows(5);
        jScrollPane2.setViewportView(Text_final);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        jLabel1.setText("BRA-VA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Elige_archivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_Compilar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Elige_archivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btn_Compilar)
                        .addGap(79, 79, 79))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Elige_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Elige_archivoActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        String ruta = chooser.getSelectedFile().getAbsolutePath();
        File archivo = new File(ruta);
        archivo = chooser.getSelectedFile();
        String aux = "";
        String texto = "";
        if (archivo != null) {
            FileReader archivos = null;
            try {
                archivos = new FileReader(archivo);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

            BufferedReader lee = new BufferedReader(archivos);
            try {
                while ((aux = lee.readLine()) != null) {
                    texto += aux + "\n";
                }
                Panel_codigo.setText(texto);
                codigoabierto=true;
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                lee.close();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            //JOptionPane.showMessageDialog(null,""+"\nNo se ha encontrado el archivo", "Advertencia",JOptionPane.WARNING_MESSAGE);
        }

        /*try {
            Reader lector = new BufferedReader(new FileReader(cadena));
            Lexer lexer = new Lexer(lector);
            String resultado="";
            while (true) {                
                Tokens tokens= lexer.yylex();
                if (tokens==null) {
                    
                    return;

                }
                switch(tokens){
                case ERROR:
                    resultado+="simbolo no encontrado\n";
                    break;
                case ID:
                    resultado+=tokens.name();
                    break;
                case IF:
                    System.out.println("if");
                    resultado+="if";
                    break;
                    default:
                        break;
                }
                Text_final.setText(resultado);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
        }*/

    }//GEN-LAST:event_Elige_archivoActionPerformed

    private void Btn_CompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CompilarActionPerformed
        if (codigoabierto==true) {
            try {
                Reader lector = new BufferedReader(new FileReader(archivo));
                Lexer lexer = new Lexer(lector);
                String resultado = "";
                while (true) {
                    Tokens tokens = lexer.yylex();
                    if (tokens == null) {

                        return;

                    }
                    switch (tokens) {
                        case ERROR:
                            resultado += "ERROR, SE INGRESÓ UN CARACTER NO ESPERADO: \n";;
                            break;
                        case AND:
                            resultado += "TOKEN_AND\n";
                            break;
                        case ASIGNACCION:
                            resultado += "TOKEN_ASIGNACION\n";
                            break;
                        case IMPRIMIR:
                            resultado += "TOKEN_IMPRIMIR\n";
                            break;
                        case DIGITO:
                            resultado += "TOKEN_DIGITO\n";
                            break;
                        case IF:
                            resultado += "TOKEN_IF\n";
                            break;
                        case CASE:
                            resultado += "TOKEN_CASE\n";
                            break;
                        case MAIN:
                            //resultado+=lexer.lexeme+"\n";
                            resultado += "TOKEN_MAIN\n";
                            break;
                        case BOOLEAN:
                            resultado += "TOKEN_BOOLEAN\n";
                            break;
                        case CHAR:
                            resultado += "TOKEN_CHAR\n";
                            break;
                        case COMILLA:
                            resultado += "TOKEN_COMILLA\n";
                            break;
                        case OPMULTI:
                            resultado += "TOKEN_OPMULTI\n";
                            break;
                        case PUNTOCOMA:
                            resultado += "TOKEN_PUNTOCOMA\n";
                            break;
                        case DEFINIR:
                            resultado += "TOKEN_DEFINIR\n";
                            break;
                        case ENDCASE:
                            resultado += "TOKEN_ENDCASE\n";
                            break;
                        case ELSE:
                            resultado += "TOKEN_ELSE\n";
                            break;
                        case THEN:
                            resultado += "TOKEN_THEN\n";
                            break;
                        case PARENTESISI:
                            resultado += "TOKEN_PARENTESISI\n";
                            break;
                        case SWITCH:
                            resultado += "TOKEN_SWITCH\n";
                            break;
                        case OR:
                            resultado += "TOKEN_OR\n";
                            break;
                        case DIGITOFLOAT:
                            resultado += "TOKEN_DIGITOFLOAT\n";
                            break;
                        case WHILE:
                            resultado += "TOKEN_WHILE\n";
                            break;
                        case PARENTESISD:
                            resultado += "TOKEN_PARENTESISD\n";
                            break;
                        case INT:
                            resultado += "TOKEN_INT\n";
                            break;
                        case SALTOLINEA:
                            resultado += "TOKEN_SALTOLINEA \n";
                            break;
                        case FOR:
                            resultado += "TOKEN_FOR \n";
                            break;
                        case OPADICION:
                            resultado += "TOKEN_OPADICION \n";
                            break;
                        case OPREL:
                            resultado += "TOKEN_OPREL\n";
                            break;
                        case LLAVEDER:
                            resultado += "TOKEN_LLAVEDER\n";
                            break;
                        case LLAVEIZ:
                            resultado += "TOKEN_LLAVEIZ\n";
                            break;
                        case IGUAL:
                            resultado += "TOKEN_IGUAL\n";
                            break;
                        case Reservadas:
                            resultado += "TOKEN_Reservadas\n";
                            break;
                        case ID:
                            resultado += "TOKEN_ID\n";
                            break;
                        case COMPARACION:
                            resultado += "TOKEN_COMPARACION\n";
                            break;
                        case COMENTARIOA:
                            resultado += "TOKEN_COMENTARIO_APERTURA\n";
                            break;
                        
                        case COMENTARIOC:
                            resultado += "TOKEN_COMENTARIO_CERRADURA\n";
                            break;
                        case COMENTARIOSI:
                            resultado+="TOKEN_COMENTARIO_SIMPLE\n ";
                        default:
                            resultado += "ERROR, SE INGRESÓ UN CARACTER NO ESPERADO: "+lexer.yytext() + "\n";
                            break;
                    }
                    Text_final.setText(resultado);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"no se ha abierto ningun archivo valido");
        }
    }//GEN-LAST:event_Btn_CompilarActionPerformed

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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Compilar;
    private javax.swing.JButton Elige_archivo;
    private javax.swing.JTextArea Panel_codigo;
    private javax.swing.JTextArea Text_final;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
    boolean codigoabierto = false;
    File archivo = new File("C:\\Users\\User\\Desktop\\CompiladorLenguajePropio\\Compilador_Propio\\Prueba1.txt");
}
