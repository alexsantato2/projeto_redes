package RoutingInformationProtocolStack.Node;

import interfaces.unicastinterfaces.UnicastServiceInterface;

public class UnicastProtocol implements UnicastServiceInterface {
    public boolean UPDataReq (short destinationEntity, String message) {
        return false;
    }
}
