package dal;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Client;

@Stateless
public class ClientFacade extends AbstractFacade<Client> {

	public ClientFacade() {
		super(Client.class);
	}
	
	@PersistenceContext
	EntityManager em;

	@Override
	protected EntityManager em() {
		return em;
	}

}
