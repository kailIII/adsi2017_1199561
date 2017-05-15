
package co.edu.sena.adsi.jpa.sessions;

import co.edu.sena.adsi.jpa.entities.Ciudad;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ruberr
 */
@Stateless
public class CiudadFacade extends AbstractFacade<Ciudad> {

    @PersistenceContext(unitName = "co.edu.sena.adsi_Adsi1199561_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CiudadFacade() {
        super(Ciudad.class);
    }
    
}
