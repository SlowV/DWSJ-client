/**
 * ImageService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.assignment.dwsjclient.service.image;

import t1708e.assignment.dwsjclient.entity.*;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface ImageService extends java.rmi.Remote {
    public Image createImage(Image image) throws java.rmi.RemoteException;
    public Image updateImage(Image image) throws java.rmi.RemoteException;
    public List<Image> getListImage() throws java.rmi.RemoteException;
    public boolean deleteImage() throws java.rmi.RemoteException;
    public List<Image> getImagesByPlace(Place place) throws java.rmi.RemoteException;
}
