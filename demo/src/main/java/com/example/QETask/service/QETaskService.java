package com.example.QETask.service;

import com.example.QETask.model.ResponseObject;
import org.springframework.stereotype.Service;

@Service
public class QETaskService {

    public ResponseObject createResponse(String name) {
        ResponseObject response = new ResponseObject();
        response.setMessage("Данные успешно получены!");
        response.setIncomingName(name);
        return response;
    }
}