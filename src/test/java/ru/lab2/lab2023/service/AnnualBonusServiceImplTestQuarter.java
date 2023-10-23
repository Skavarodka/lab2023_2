package ru.lab2.lab2023.service;

import org.junit.jupiter.api.Test;
import ru.lab2.lab2023.model.Positions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class AnnualBonusServiceImplTestQuarter {

    @Test
    void calculateQuarter() {

        // given
        Positions position = Positions.TL;
        double bonus = 2.0;
        int workDays = 243;
        double salary = 100000.00;

        // when
        double result = new AnnualBonusServiceImpl().calculateQuarter(position, salary, bonus, workDays);

        // then
        double expected = 196872.4279835391;
        assertThat(result).isEqualTo(expected);
    }
}