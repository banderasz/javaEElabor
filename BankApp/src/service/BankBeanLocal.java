package service;

import javax.ejb.Local;

import entity.Account;
import entity.Client;

@Local
public interface BankBeanLocal {

	public abstract void transfer(int fromId, int toId, double amount)
			throws BankException;

	public abstract void createAccountForClient(Account account, int clientId)
			throws BankException;

	public abstract void createClient(Client client);

}
