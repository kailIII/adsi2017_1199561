package co.edu.sena.adsi.rest.utils;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

/**
 *
 * @author ruber19
 */
public class SendEmail {
    //Configuración de Enviar Email

    String hostName = "smtp.gmail.com";
    int puerto = 465;
    String email = "ruber19@gmail.com";
    String password = "1234";
    Boolean isSSL = true;
    Boolean isAuthentication = true;

    public void emailRegistroUsuario() {

        try {
            HtmlEmail emailConfig = new HtmlEmail();

            emailConfig.setHostName(hostName);
            emailConfig.setSmtpPort(puerto);
            emailConfig.setAuthenticator(
                    new DefaultAuthenticator(email, password));
            if (isAuthentication) {
                emailConfig.setAuthentication(email, password);
            }
            emailConfig.setSSLOnConnect(isSSL);
            emailConfig.setFrom(email);
            emailConfig.setCharset("UTF-8");
            emailConfig.setSubject("Bienvenidos al ADSI");

            //Cuerpo del Email
            StringBuilder sb = new StringBuilder();
            sb.append("Hola");

            emailConfig.setHtmlMsg(sb.toString());
            emailConfig.addTo(email);
            emailConfig.send();

        } catch (EmailException e) {
            System.out.println("ERROR AL ENVIAR EMAIL");
        }

    }
}
