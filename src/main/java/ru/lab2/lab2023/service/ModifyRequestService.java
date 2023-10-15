package ru.lab2.lab2023.service;

import org.springframework.stereotype.Service;
import ru.lab2.lab2023.model.Request;

@Service
public interface ModifyRequestService {

    void modify(Request request);
}
