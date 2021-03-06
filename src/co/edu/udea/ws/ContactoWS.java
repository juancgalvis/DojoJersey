package co.edu.udea.ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.udea.pojos.Contacto;


@Path("/aqui")
public class ContactoWS {
	private List<Contacto> misContactos;
	
	public ContactoWS() {
        super();
        this.misContactos=new ArrayList<Contacto>();
        Contacto nuevoContacto=new Contacto(1,"Jorge","Cazorla","5723438","jorge@gmail.com");        
        Contacto contacto2= new Contacto(2, "Pedro", "Perez", "5903033", "pedro@gmail.com");
        Contacto contacto3= new Contacto(3, "Carlos", "Figueroa", "4444445", "carlos@gmail.com");
        
        misContactos.add(nuevoContacto);
        misContactos.add(contacto2);
        misContactos.add(contacto3);
    }
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contacto> obtenerTodosLosContactos() {
		return misContactos;
	}

}
