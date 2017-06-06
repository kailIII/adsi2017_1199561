
package co.edu.sena.adsi.jpa.sessions;

import co.edu.sena.adsi.jpa.entities.EmailApp;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ruber19
 */
@Stateless
public class EmailAppFacade extends AbstractFacade<EmailApp> {

    @PersistenceContext(unitName = "co.edu.sena.adsi_Adsi1199561_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmailAppFacade() {
        super(EmailApp.class);
    }
    
}
