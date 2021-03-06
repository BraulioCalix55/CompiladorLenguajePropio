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
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.Lexer;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.runtime.regexp.joni.Syntax;

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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Elige_archivo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Compilar))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Elige_archivo)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_Compilar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Elige_archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Elige_archivoActionPerformed
        Panel_codigo.setText("");
        Text_final.setText("");
        JFileChooser chooser = new JFileChooser("C:\\Users\\User\\Desktop\\CompiladorLenguajePropio\\Compilador_Propio\\Pruebas");
        chooser.showOpenDialog(this);
        String ruta = chooser.getSelectedFile().getAbsolutePath();
        archivo = new File(ruta);

        archivo = chooser.getSelectedFile();
        String texto = "", aux = "";
        if (archivo != null) {
            FileReader archivos = null;
            try {
                archivos = new FileReader(archivo);
            } catch (FileNotFoundException ex) {
            }
            BufferedReader lee = new BufferedReader(archivos);
            try {
                while ((aux = lee.readLine()) != null) {
                    texto += aux + "\n";
                }
                Panel_codigo.setText(texto);
                codigoabierto = true;
            } catch (IOException ex) {

            }
            try {
                lee.close();
            } catch (IOException ex) {

            }
        } else {
            JOptionPane.showMessageDialog(null, "" + "\nNo se ha encontrado el archivo", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Elige_archivoActionPerformed

    private void Btn_CompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CompilarActionPerformed
        Text_final.setText("");
        if (codigoabierto == true) {
            LexerCup lexer;
            parser p = null;

            try {
                lexer = new LexerCup((new FileReader(archivo)));
                p = new parser(lexer);
                p.parse();
                if (lexer.erroresLexicos.size() == 0) {
                    JOptionPane.showMessageDialog(this, "no se encontraron errores de caracteres especiales");
                    /*for (int i = 0; i < p.gramas.size(); i++) {
                        Text_final.append(p.gramas.get(i).toString() + "\n");
                    }*/

                    for (int i = 0; i < p.errores.size(); i++) {
                        Text_final.append(p.errores.get(i).toString() + "\n");
                        //System.out.println(p.errores.get(i));
                    }
                    ArrayList<Integer> numeros= new ArrayList();
                    
                } else {
                    JOptionPane.showMessageDialog(this, "se encontraron errores de caracteres especiales");
                    for (int i = 0; i < lexer.erroresLexicos.size(); i++) {
                        Text_final.append(lexer.erroresLexicos.get(i) + "\n");
                    }
                    for (int i = 0; i < p.errores.size(); i++) {
                        //System.out.println(p.errores.get(i));
                        Text_final.append(p.errores.get(i).toString() + "\n");
                    }
                }
                Text_final.append("\n");

                if (p.errores.isEmpty()) {
                    Text_final.setText("NO HAY ERRORES QUE MOSTRAR");
                    String formato = "edge [color=purple];" + hacerDFS(p.raiz);
                    p.raiz.exportarArbol(formato, "AST");
                    JOptionPane.showMessageDialog(this, "Árbol generado de forma satisfactoria");
                    int salida = JOptionPane.showConfirmDialog(this, "desea mostrar las gramaticas encontradas? ");
                    if (salida == 0) {
                        Text_final.append("\n");
                        for (int i = 0; i < p.gramas.size(); i++) {
                            Text_final.append(p.gramas.get(i).toString() + "\n");
                        }
                    }
                    //System.out.println(p.maximo());
                    
                } else {
                    JOptionPane.showMessageDialog(this, "No se puede generar el arbol si el programa tiene errores");
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                System.out.println("entro a la exception");
                Symbol sym = p.getS();
                System.out.println("error en columna " + (sym.right) + " fila: " + (sym.left) + ", texto: " + sym.toString());
            }
        } else {
            JOptionPane.showMessageDialog(this, "no se ha abierto ningun archivo valido");
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

    public String hacerDFS(Nodo node) {
        ArrayList<String> recorrido = new ArrayList<>();
        DFS(node, recorrido);
        DFSAristas(node, node.getIdNodo(), recorrido);
        String formato = "";
        for (int i = 0; i < recorrido.size(); i++) {
            formato += recorrido.get(i);
        }
        return formato;
    }

    public void DFS(Nodo node, ArrayList<String> recorrido) {
        if (!node.getEtiqueta().equals("VACIO")) {
            //System.out.println(node.toString());
            recorrido.add(node.toString());
        }
        for (int i = 0; i < node.getHijos().size(); i++) {
            DFS(node.getHijos().get(i), recorrido);
        }
    }

    public void DFSAristas(Nodo node, int padre, ArrayList<String> recorrido) {
        if (node.getIdNodo() != padre) {
            if (!node.getEtiqueta().equals("VACIO")) {
                recorrido.add(padre + "->" + node.getIdNodo() + ";");
            }
        }
        for (int i = 0; i < node.getHijos().size(); i++) {
            DFSAristas(node.getHijos().get(i), node.getIdNodo(), recorrido);
        }
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
    boolean arbol = false;
}


/*comandos para ejectutar
    jflex LexerCup.flex
    java -jar java-cup-11a.jar Sintax.cup

*/
