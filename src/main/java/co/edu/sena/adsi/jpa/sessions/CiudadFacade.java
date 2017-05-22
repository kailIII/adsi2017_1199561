package co.edu.sena.adsi.jpa.sessions;

import co.edu.sena.adsi.jpa.entities.Ciudad;
import co.edu.sena.adsi.jpa.entities.Ciudad_;
import co.edu.sena.adsi.jpa.entities.Departamento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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

    public List<Ciudad> findAutocomplete(String nombre,
            Integer idDepartamento) {

        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Ciudad> cq = cb.createQuery(Ciudad.class);
        Root<Ciudad> ciudad = cq.from(Ciudad.class);

        Predicate data = cb.conjunction();

        if (nombre != null) {
            data = cb.and(data, cb.like(
                    ciudad.get(Ciudad_.nombre), "%" + nombre + "%"));
        }

        if (idDepartamento != null) {
            data = cb.and(data, cb.equal(
                    ciudad.get(Ciudad_.departamento), new Departamento(idDepartamento)));
        }

        cq.where(data);
        TypedQuery<Ciudad> q = getEntityManager()
                .createQuery(cq);
        try {
            return q.getResultList();
        } catch (Exception e) {
            return null;
        }
    }
  
}
