/**
 * RatingService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.assignment.dwsjclient.service.rating;

import t1708e.assignment.dwsjclient.entity.Rating;
import t1708e.assignment.dwsjclient.entity.User;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface RatingService extends java.rmi.Remote {
    @WebMethod
    public Rating createRating(Rating rating, Object obj, String type, User user) throws java.rmi.RemoteException;
    @WebMethod
    public Rating findByPlaceOrImage(Object o, String type) throws java.rmi.RemoteException;
}
