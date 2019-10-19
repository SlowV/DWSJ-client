/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.assignment.dwsjclient.service.user;

public interface UserService extends java.rmi.Remote {
    public t1708e.assignment.dwsjclient.service.user.User register(t1708e.assignment.dwsjclient.service.user.User arg0) throws java.rmi.RemoteException;
    public t1708e.assignment.dwsjclient.service.user.User login(t1708e.assignment.dwsjclient.service.user.User arg0) throws java.rmi.RemoteException;
    public t1708e.assignment.dwsjclient.service.user.User updateUser(t1708e.assignment.dwsjclient.service.user.User arg0) throws java.rmi.RemoteException;
    public boolean deleteUser() throws java.rmi.RemoteException;
    public t1708e.assignment.dwsjclient.service.user.User findByUsername(java.lang.String arg0) throws java.rmi.RemoteException;
    public t1708e.assignment.dwsjclient.service.user.User[] getListUser() throws java.rmi.RemoteException;
}
