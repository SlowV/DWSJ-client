/**
 * ImageService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.assignment.dwsjclient.service.image;

public interface ImageService extends java.rmi.Remote {
    public t1708e.assignment.dwsjclient.service.image.Image createImage(t1708e.assignment.dwsjclient.service.image.Image arg0) throws java.rmi.RemoteException;
    public boolean deleteImage() throws java.rmi.RemoteException;
    public t1708e.assignment.dwsjclient.service.image.Image updateImage(t1708e.assignment.dwsjclient.service.image.Image arg0) throws java.rmi.RemoteException;
    public t1708e.assignment.dwsjclient.service.image.Image[] getListImage() throws java.rmi.RemoteException;
}
