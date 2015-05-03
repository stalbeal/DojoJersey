package ws;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pojo.Contact;


@Path("/contact")
public class ContactWS {
private List<Contact> misContactos;
public ContactWS() {
    super();
    this.misContactos=new ArrayList<Contact>();
    Contact nuevoContacto=new Contact("1","Jorge","5723438","jorge@gmail.com");
    
    Contact contacto2= new Contact("2", "Pedro", "5903033", "pedro@gmail.com");
    Contact contacto3= new Contact("3", "Carlos",  "4444445", "carlos@gmail.com");
    
    misContactos.add(nuevoContacto);
    misContactos.add(contacto2);
    misContactos.add(contacto3);
}
@GET
@Produces({MediaType.APPLICATION_JSON})
@Path("/contacts")
public List<Contact> getContacts(){
	return misContactos;
	
}

	
}
