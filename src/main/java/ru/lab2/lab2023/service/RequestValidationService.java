package ru.lab2.lab2023.service;


import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.lab2.lab2023.exception.CustomException;
import ru.lab2.lab2023.exception.ValidationFailedException;

@Service
public class RequestValidationService implements ValidationService{

    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException, CustomException {

        if (bindingResult.hasErrors()) {

            throw new ValidationFailedException(bindingResult.getFieldError().toString());
        } else if (bindingResult.getFieldValue("uid").equals("123")) {

            throw new CustomException("bindingResult.getFieldError().toString()");
        }
    }
}
