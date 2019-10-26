/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.assignment.dwsjclient.service.user;

import t1708e.assignment.dwsjclient.entity.User;

import javax.jws.WebService;

@WebService
public interface UserService extends java.rmi.Remote {
    public User register(User arg0) throws java.rmi.RemoteException;
    public User findByUsername(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean deleteUser() throws java.rmi.RemoteException;
    public User[] getListUser() throws java.rmi.RemoteException;
    public User updateUser(User arg0) throws java.rmi.RemoteException;
}
