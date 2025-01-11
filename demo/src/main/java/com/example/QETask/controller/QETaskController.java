package com.example.QETask.controller;

import com.example.QETask.model.RequestObject;
import com.example.QETask.model.ResponseObject;
import com.example.QETask.service.QETaskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class QETaskController {

    private final QETaskService qeTaskService;

    @PostMapping("/submit")
    public ResponseObject submit(@RequestBody RequestObject request) {
        log.info("Получен запрос с именем: '{}' и возрастом: {} лет", request.getName(), request.getAge());

        ResponseObject response;
        try {
            response = qeTaskService.createResponse(request.getName());
            log.info("Отправка ответа: {}", response);
        } catch (Exception exception) {
            log.error("Ошибка при обработке запроса: {}", exception.getMessage(), exception);
            throw exception;
        }

        return response;
    }
}