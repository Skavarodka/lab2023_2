package ru.lab2.lab2023.service;

import org.springframework.stereotype.Service;
import ru.lab2.lab2023.model.Positions;


@Service
public interface AnnualBonusService {
    double calculate (Positions positions, double salary, double bonus, int workDays);
    double calculateQuarter (Positions positions, double salary, double bonus, int workDays);
}