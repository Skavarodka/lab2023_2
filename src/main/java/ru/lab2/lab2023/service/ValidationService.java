package ru.lab2.lab2023.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.lab2.lab2023.exception.CustomException;

@Service
public interface ValidationService {

    void isValid(BindingResult bindingResult) throws ru.lab2.lab2023.exception.ValidationFailedException, CustomException;
}
