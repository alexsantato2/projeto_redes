package routinginformationprotocolstack.routingmanagement;

import interfaces.routingprotocolinterfaces.RoutingProtocolManagementServiceUserInterface;

public class RoutingInformationProtocol implements RoutingProtocolManagementServiceUserInterface {

    @Override
    public void distanceTableIndication(short nodeIdentifier, int[][] distanceTable) {

    }

    @Override
    public void linkCostIndication(short nodeIdentifierA, short nodeIdentifierB, int linkValue) {

    }
}
