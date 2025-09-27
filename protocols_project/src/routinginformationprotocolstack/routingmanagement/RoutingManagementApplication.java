package routinginformationprotocolstack.routingmanagement;

import interfaces.unicastinterfaces.UnicastServiceInterface;
import interfaces.routingprotocolinterfaces.RoutingProtocolManagementInterface;

public class RoutingManagementApplication implements UnicastServiceInterface, RoutingProtocolManagementInterface {

    @Override
    public boolean UPDataReq(short destinationEntity, String message) {
        return false;
    }

    @Override
    public boolean getDistanceTable(short nodeIdentifier) {
        return false;
    }

    @Override
    public boolean getLinkCost(short nodeIdentifierA, short nodeIdentifierB) {
        return false;
    }

    @Override
    public boolean setLinkCost(short nodeIdentifierA, short nodeIdentifierB, int linkValue) {
        return false;
    }
}
