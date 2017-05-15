
package co.edu.sena.adsi.jpa.sessions;

import co.edu.sena.adsi.jpa.entities.Rol;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ruberr
 */
@Stateless
public class RolFacade extends AbstractFacade<Rol> {

    @PersistenceContext(unitName = "co.edu.sena.adsi_Adsi1199561_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RolFacade() {
        super(Rol.class);
    }
    
}
