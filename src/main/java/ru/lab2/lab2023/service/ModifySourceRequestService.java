package ru.lab2.lab2023.service;

import org.springframework.stereotype.Service;
import ru.lab2.lab2023.model.Request;
@Service
public class ModifySourceRequestService implements ModifyRequestService{

    @Override
    public void modify(Request request) {
        request.setSource("New source");
    }
}
