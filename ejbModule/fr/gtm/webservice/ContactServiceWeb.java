package fr.gtm.webservice;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebService;

import fr.gtm.entities.Contact;
import fr.gtm.service.ContactService;

/**
 * Session Bean implementation class Contactws
 */
@Stateless
@LocalBean
@WebService
public class ContactServiceWeb {
	
	@EJB ContactService service ;
	
	public ContactServiceWeb () {
		
	}
	
	public Contact findContactById(Long idContact) {
		
		return service.findContactById(idContact);
		
				
	}
	
	public void saveContact(Contact contact) {
		service.saveContact(contact);
	}
	
	public void updateContact(Contact contact) {
		service.updateContact(contact);
		
	}
	public Contact removeContact (Long idContact) {
		return service.removeContact(idContact);
		
	}
	
}
