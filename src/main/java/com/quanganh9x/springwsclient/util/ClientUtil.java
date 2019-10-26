package com.quanganh9x.springwsclient.util;

import com.quanganh9x.springwsclient.endpoint.place.ListPlace;
import com.quanganh9x.springwsclient.endpoint.place.Xmlplace;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import javax.xml.namespace.QName;
import java.net.URL;
import java.util.List;

public class ClientUtil {
    public static Object connect(String dest, Object params, Class ret) {
        try {
            String endpoint = "http://34.83.241.129:8080/ws";
            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new URL(endpoint));
            call.setOperationName(new QName("http://quanganh9x.com/soap", dest));
            call.setReturnClass(ret);
            Object result = call.invoke(new Object[]{params});
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        List<Xmlplace> test = (List) connect("listPlace", new ListPlace(), Xmlplace.class);
        if (test.size() != 0) {
            System.out.println(test.get(0).getName());
            System.out.println(test.get(0).getDescription());
        }
    }
}
