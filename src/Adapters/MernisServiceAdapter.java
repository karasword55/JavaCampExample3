package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import Mernis.TSWKPSPublicSoap;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) throws Exception {
        TSWKPSPublicSoap client=new TSWKPSPublicSoap();
        return client.TCKimlikNoDogrula(customer.getTc(),customer.getfName().toUpperCase(),customer.getlName().toUpperCase(),customer.getDogumYili());
    }
}
