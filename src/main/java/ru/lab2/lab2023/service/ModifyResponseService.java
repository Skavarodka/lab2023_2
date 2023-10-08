package ru.lab2.lab2023.service;

import org.springframework.stereotype.Service;
import ru.lab2.lab2023.model.Response;

@Service
public interface ModifyResponseService {

    Response modify(Response response);
}
