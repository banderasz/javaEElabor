package service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import dal.ClientFacade;
import entity.Account;
import entity.Client;

/**
 * Session Bean implementation class BankBean
 */
@Stateless
public class BankBean implements BankBeanLocal {
	
	@EJB
	ClientFacade clientFacade;

    /**
     * Default constructor. 
     */
    public BankBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public void createClient(Client client){
    	clientFacade.create(client);
    	
    }
    
    @Override
	public void createAccountForClient(Account account,int clientId) throws BankException{
    	
    }
    
    @Override
	public void transfer(int fromId, int toId, double amount) throws BankException{
    	
    }

}
