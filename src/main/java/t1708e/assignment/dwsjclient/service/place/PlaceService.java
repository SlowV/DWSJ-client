/**
 * PlaceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.assignment.dwsjclient.service.place;

public interface PlaceService extends java.rmi.Remote {
    public t1708e.assignment.dwsjclient.service.place.Place createPlace(t1708e.assignment.dwsjclient.service.place.Place arg0) throws java.rmi.RemoteException;
    public t1708e.assignment.dwsjclient.service.place.Place[] getListPlace() throws java.rmi.RemoteException;
    public t1708e.assignment.dwsjclient.service.place.Place updatePlace(t1708e.assignment.dwsjclient.service.place.Place arg0) throws java.rmi.RemoteException;
    public boolean deletePlace() throws java.rmi.RemoteException;
}
