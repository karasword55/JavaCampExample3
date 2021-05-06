import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;
import Mernis.TSWKPSPublicSoap;

public class Main {
    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerManager=new NeroCustomerManager();
        Customer customer=new Customer();
        customer.setId(2);
        customer.setDogumYili(2002);
        customer.setfName("Mert");
        customer.setlName("Oğuzhan");
        customer.setTc(123456);
        customerManager.save(customer);

    }
}
