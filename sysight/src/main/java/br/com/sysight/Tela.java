/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysight;

import com.github.britooo.looca.api.core.Looca;
import java.awt.Color;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import org.json.JSONObject;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author rafae
 */
public class Tela extends javax.swing.JFrame {
    ImageIcon imageLogo = new ImageIcon("1.png");
    
    
    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        img.setIcon(imageLogo);
        login.setText("");
        senha.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        msgErro = new javax.swing.JLabel();
        msgError = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        img = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        jPasswordField1.setText("jPasswordField1");

        jPasswordField2.setText("jPasswordField2");

        jPasswordField3.setText("jPasswordField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(12, 6, 44));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, null, null, new java.awt.Color(27, 136, 191)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuário");
        jLabel1.setMaximumSize(new java.awt.Dimension(36, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(36, 14));
        jLabel1.setName(""); // NOI18N

        login.setText("Sysight@sysight.com.br");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(83, 77, 115));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");
        jLabel2.setName(""); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(83, 77, 115));

        jButton1.setBackground(new java.awt.Color(27, 133, 183));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        msgErro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        msgErro.setForeground(new java.awt.Color(250, 49, 49));

        msgError.setBackground(new java.awt.Color(255, 79, 79));
        msgError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        msgError.setForeground(new java.awt.Color(255, 79, 79));

        senha.setText("jPasswordField5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(msgError, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(msgErro)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(msgErro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgError))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        img.setIcon(new javax.swing.ImageIcon("C:\\Users\\renpa\\OneDrive\\Área de Trabalho\\SYSIGHT\\sysight\\1.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Conexao con = new Conexao();
        JdbcTemplate config = new JdbcTemplate(con.getDatasource());
        List listaUsuario = config.queryForList("select login, senha from usuario;");
        System.out.println(listaUsuario);
        
        for(Object lista : listaUsuario){
          if(lista.toString().contains(login.getText()) && lista.toString().contains(senha.getText())){
              logRecursos.fine(String.format("Login valido: %s", login.getText()));
              try {
                  TelaConfiguracaoUsuario tela1 = new TelaConfiguracaoUsuario();
                  tela1.setVisible(true);
                  this.setVisible(false);
              } catch (UnknownHostException ex) {
                  Logger.getLogger(Tela.class.getName()).log(Level.SEVERE, null, ex);
              }
         }else {
         logRecursos.warning(String.format("Login invalido: %s", login.getText()));
         msgError.setText("O Usuário ou/e senha está incorreto, tente novamente");
          }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    private final static Logger logRecursos = Logger.getLogger("NOME TESTE DE LOG");
    
    public static void configuracaoLog(){
        /*
        Esse reset é para se livrar de quaisquer manipuladores de rotas de loger,
        ou seja, há formas de você setar niveis de log, manipular logs sem de fato
        fazer uso de um manipulador, de um Handler e o reset no gerenciador de logs
        elimina essas possibilidades
        */
        LogManager.getLogManager().reset(); 
        logRecursos.setLevel(Level.ALL); //TUDO será passado. Dá pra mudar pra OFF e aí nada passa, é tipo botão global
        
        /*
        O recurso Log por si só não faz nada, é necessário ter um manipulador para
        que você decida o que fazer com seu log, então o seu manipulador é o recurso
        HANDLER. Tem o manipulador do console, ConsoleHandler e tem o manipulador do
        arquivo log, o seu file, que é o FileHandler
        */
        ConsoleHandler consoleLog = new ConsoleHandler();
        consoleLog.setLevel(Level.SEVERE); //nível das informações de log que serão mostradas no CONSOLE
        logRecursos.addHandler(consoleLog); //coloca o manipulador de nivel de log dentro do objeto logRecursos 
        
        
        /*
          Se a crição do arquivo log falhar, o programa Java não pode parar então
          é necessário criar um IO EXCEPTION, para isso será utilizado O TRY CATCH
        */
        try {
           //instancia um objeto do tipo FileHandler, o TRUE faz com que os Logs não sejam sobrescritos, mas adicionados
           FileHandler logFile = new FileHandler("Log de Eventos", true); //arquivo log terá o nome de "Log de Eventos". TRUE Vai atualizando o mesmo arquivo. FALSE cria novos arquivos
           logFile.setFormatter(new SimpleFormatter());//estilo de formatação do Log, estilo simplicaficado
           logFile.setLevel(Level.SEVERE); //tudo A PARTIR DO NIVEL FINE será colocado no ARQUIVO de Log
           logFile.setLevel(Level.WARNING);
           logFile.setLevel(Level.INFO);
           logFile.setLevel(Level.FINE);
           logRecursos.addHandler(logFile);//adiciona um gerenciador de arquivo log ao objeto logRecursos
           
           /*FileHandler logErro = new FileHandler("Log de Falha", false);
           logErro.setFormatter(new SimpleFormatter());
           logErro.setLevel(Level.SEVERE);
           logRecursos.addHandler(logErro);*/
           
        } catch (Exception eventoDeExcessao) {
           logRecursos.log(Level.SEVERE, "Gerador de arquivo Log não está funcionando", eventoDeExcessao);
        }
        
        /*
        ConsoleHandler e o FileHandler cada um possui um nivel de corte do que eles estão "logando"
        Neste caso eu coloquei o ConsoleHandler para mostrar informações de nível SEVERE e o FileHandler
        para mostrar informações a partir do nível FINE
        
        ConsoleHandler: controla tudo o que será printado no console. Levar em consideração a Regra de Negócio,
                        você quer que o usuário veja em sua tela TODAS as informações de um log, ou apenas
                        aquilo que é crítico? 
        FileHandler: controla o que será posto em arquivo
        */
        
        /*
        NÍVEIS DE LOG:
        
        SEVERE
        WARNING
        INFO
        CONFIG
        FINE
        FINER
        FINEST
        
        Você que define qual será o nível de log onde você vai por as informações,
        os níveis em si estão vazios, não há código dentro deles, são apenas uma definição.
        Dê um CTRL Clique em cima de um deles para conferir
        */
    }
    
    public static void espacoBranco(){
        System.out.println("");
    }
    
    public static void main(String args[]) throws UnknownHostException, IOException, InterruptedException, ParseException {
        Tela.configuracaoLog();
        
//        ConexaoMySql con2 = new ConexaoMySql();
        Conexao con = new Conexao();
        
        JdbcTemplate config = new JdbcTemplate(con.getDatasource());
//        JdbcTemplate config2 = new JdbcTemplate(con2.getDatasource());

        Recurso recurso = new Recurso();
        
        JSONObject json = new JSONObject();
        
    
        
        /*json.put("text", "Olá! Aqui é a Sys! A bot da Sysight! Estou aqui para "
               + "mostrar algumas informações sobre seu sistema. Vamos lá:\n" 
               + recurso.toString());  */
        
        
        LocalDateTime now = LocalDateTime.now();
        logRecursos.info("MENSAGEM SLACK ENVIADA ÀS " + now + json.toString());

        if (recurso.getConsumoRam() > 10) {
            json.put("text", String.format("Olá, aqui é a Sys! A bot da Sysight! Segue informações da sua máquina: %.2f", recurso.getConsumoRam()));
            Slack.enviarMensagem(json);
            logRecursos.severe(String.format("CONSUMO DE MEMORIA RAM EM NIVEL ALARMANTE: %.2f%%", recurso.getConsumoRam()));;             
        }else if (recurso.getConsumoRam() >= 90 && recurso.getConsumoRam() <= 95) {
            logRecursos.warning(String.format("Consumo de memoria RAM requer atenção: %.2f%%", recurso.getConsumoRam()));
        }else {
            logRecursos.info(String.format("Consumo de memoria RAM em niveis normais: %.2f%%", recurso.getConsumoRam()));
        }
        if (recurso.getConsumoCPU() > 10) {
            json.put("text", String.format("Olá, aqui é a Sys! A bot da Sysight! Segue informações da sua máquina: %.2f", recurso.getConsumoCPU()));
            Slack.enviarMensagem(json);
            logRecursos.severe(String.format("CONSUMO DE CPU EM NIVEL ALARMANTE : %.2f%%", recurso.getConsumoCPU()));;             
        }else if (recurso.getConsumoCPU() >= 90 && recurso.getConsumoCPU() <= 95) {
            logRecursos.warning(String.format("Consumo de CPU requer atenção: %.2f%%", recurso.getConsumoCPU()));
        }else {
            logRecursos.info(String.format("Consumo de CPU em niveis normais: %.2f%%", recurso.getConsumoCPU()));
        }
        if (recurso.getConsumoDisco() > 10) {
            json.put("text", String.format("Olá, aqui é a Sys! A bot da Sysight! Segue informações da sua máquina: %.2f", recurso.getConsumoDisco()));
            Slack.enviarMensagem(json);
            logRecursos.severe(String.format("CONSUMO DE DISCO EM NIVEL ALARMANTE : %.2f%%", recurso.getConsumoDisco()));;             
        }else if (recurso.getConsumoDisco() >= 85 && recurso.getConsumoDisco() <= 95) {
            logRecursos.warning(String.format("Consumo de DISCO requer atenção: %.2f%%", recurso.getConsumoDisco()));
        }else {
            logRecursos.info(String.format("Consumo de DISCO em niveis normais: %.2f%%", recurso.getConsumoDisco()));
        }
        

        // Parametros para o primeiro insert
        
       
        //config2.update(insertStatement, 5, consumoRam, consumoCpu, consumoDisco, momento);              

        // Para buscar informações devemos utilizar o comando queryForList ou query,
        // exemplo de uso do queryForList
        
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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
                
            }
        });
        
        TelaRecursos tela = new TelaRecursos();
        tela.rodarApp();
        
        
        
          
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField login;
    private javax.swing.JLabel msgErro;
    private javax.swing.JLabel msgError;
    private javax.swing.JPasswordField senha;
    // End of variables declaration//GEN-END:variables
}