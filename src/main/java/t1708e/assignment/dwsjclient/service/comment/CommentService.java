/**
 * CommentService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package t1708e.assignment.dwsjclient.service.comment;

import t1708e.assignment.dwsjclient.entity.Comment;
import t1708e.assignment.dwsjclient.entity.User;

import java.util.List;

public interface CommentService extends java.rmi.Remote {
    public Comment createComment(Comment comment, Object obj, String type, User user) throws java.rmi.RemoteException;
    public List<Comment> getCommentByPlaceOrImage(String type, Object obj) throws java.rmi.RemoteException;
}
