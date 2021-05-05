package adapters;
import java.rmi.RemoteException;
import java.time.ZoneId;
import entities.Customer;
import interfaces.PersonService;
import interfaces.Result;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements PersonService {

	KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
	boolean result = true;
	
	try {
		result = kpsPublicSoapProxy.TCKimlikNoDogrula(
				Long.parseLong(customer.getIdentityNumber()),
				customer.getFirstName().toUpperCase(),
				customer.getLastName().toUpperCase(), 
				customer.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
				);
	} catch (RemoteException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	if(result) {
		return new homework2.utils.Result(true);
	}else {
		return new homework2.utils.Result(false, "kimlik doðrulama baþarýsýz.");
	}
		
}

}
