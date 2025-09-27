package routinginformationprotocolstack.node;

import interfaces.unicastinterfaces.UnicastServiceInterface;

public class UnicastProtocol implements UnicastServiceInterface {
    public boolean UPDataReq (short destinationEntity, String message) {
        return false;
    }
}
