package routinginformationprotocolstack.routingmanagement;
import interfaces.unicastinterfaces.UnicastServiceInterface;

public class UnicastProtocol implements UnicastServiceInterface {

    @Override
    public boolean UPDataReq(short destinationEntity, String message) {
        return false;
    }
}
