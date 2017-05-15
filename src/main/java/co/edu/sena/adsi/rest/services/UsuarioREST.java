package co.edu.sena.adsi.rest.services;

import co.edu.sena.adsi.jpa.entities.Usuario;
import co.edu.sena.adsi.jpa.sessions.UsuarioFacade;
import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author ruberr
 */
@Path("usuarios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UsuarioREST {
    
    @EJB
    private UsuarioFacade usuarioEJB;
    
    /**
     * Obtiene todos los usuarioes
     * @return lista de usuarios
     */
    @GET
    @RolesAllowed({"ADMIN"})
    public List<Usuario> findAll(){
        return usuarioEJB.findAll();
    }
    
    /**
     * Busca usuario por su id
     * @param id
     * @return usuario
     */
    @GET
    @Path("{id}")
    public Usuario findById(@PathParam("id") Integer id){
        return usuarioEJB.find(id);
    }
    
    /**
     * Crear un usuario
     * @param usuario 
     */
    @POST
    public void create(Usuario usuario){
        usuarioEJB.create(usuario);
    }
    
    /**
     * Edita un usuario
     * @param id
     * @param usuario 
     */
    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Usuario usuario){
        usuarioEJB.edit(usuario);
    }
}
