
package co.edu.sena.adsi.jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ruber19
 */
@Entity
@Table(name = "email_app")
@XmlRootElement
public class EmailApp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "email_app")
    private String emailApp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "password_email_app")
    private String passwordEmailApp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "descripcion_email_app")
    private String descripcionEmailApp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "hostname_email_app")
    private String hostnameEmailApp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "smtp_port")
    private int smtpPort;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_autentication")
    private boolean isAutentication;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_ssl")
    private boolean isSsl;

    public EmailApp() {
    }

    public EmailApp(String id) {
        this.id = id;
    }

    public EmailApp(String id, String emailApp, String passwordEmailApp, String descripcionEmailApp, String hostnameEmailApp, boolean estado, int smtpPort, boolean isAutentication, boolean isSsl) {
        this.id = id;
        this.emailApp = emailApp;
        this.passwordEmailApp = passwordEmailApp;
        this.descripcionEmailApp = descripcionEmailApp;
        this.hostnameEmailApp = hostnameEmailApp;
        this.estado = estado;
        this.smtpPort = smtpPort;
        this.isAutentication = isAutentication;
        this.isSsl = isSsl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailApp() {
        return emailApp;
    }

    public void setEmailApp(String emailApp) {
        this.emailApp = emailApp;
    }

    public String getPasswordEmailApp() {
        return passwordEmailApp;
    }

    public void setPasswordEmailApp(String passwordEmailApp) {
        this.passwordEmailApp = passwordEmailApp;
    }

    public String getDescripcionEmailApp() {
        return descripcionEmailApp;
    }

    public void setDescripcionEmailApp(String descripcionEmailApp) {
        this.descripcionEmailApp = descripcionEmailApp;
    }

    public String getHostnameEmailApp() {
        return hostnameEmailApp;
    }

    public void setHostnameEmailApp(String hostnameEmailApp) {
        this.hostnameEmailApp = hostnameEmailApp;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getSmtpPort() {
        return smtpPort;
    }

    public void setSmtpPort(int smtpPort) {
        this.smtpPort = smtpPort;
    }

    public boolean getIsAutentication() {
        return isAutentication;
    }

    public void setIsAutentication(boolean isAutentication) {
        this.isAutentication = isAutentication;
    }

    public boolean getIsSsl() {
        return isSsl;
    }

    public void setIsSsl(boolean isSsl) {
        this.isSsl = isSsl;
    }

    @Override
    public String toString() {
        return "co.edu.sena.adsi.jpa.entities.EmailApp[ id=" + id + " ]";
    }
    
}
