package com.javakaruna.ws;

import com.javakaruna.ws.employees.GetEmployeeRequest;
import com.javakaruna.ws.employees.GetEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class SoapClinet {

    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public GetEmployeeResponse getEmployee() {
        GetEmployeeRequest request=new GetEmployeeRequest();
        template = new WebServiceTemplate(marshaller);

        GetEmployeeResponse employee = (GetEmployeeResponse) template.marshalSendAndReceive("http://localhost:8080/ws/employees",
               request );
        return employee;
    }

}