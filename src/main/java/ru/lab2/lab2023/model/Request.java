package ru.lab2.lab2023.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

    @NotBlank
    private String uid; // Уникальный идентификатор сообщения
    @NotBlank
    @Max(32)
    private String operationUid; // Уникальный идентификатор операции
    private Systems systemName; // Имя системы
    @NotBlank
    private String systemTime; // Время создания сообщения
    private String source; // Наименование ресурса
    private Positions position; // Должность
    private Double salary; // Зарплата
    private Double bonus; // Коэффициент
    private int workDays; // Рабочие дни
    @NotNull
    @Min(1)
    @Max(10000)
    private int communicationId; // Уникальный идентификатор коммуникации
    private int templateId; // Уникальный идентификатор шаблона
    private int productCode; // Код продукта
    private int smsCode; // Смс код

    @Override
    public String toString() {

        return "{"+"uid='"+operationUid+'\''+
                ", systemName='"+systemName+'\''+
                ", systemTime='"+systemTime+'\''+
                ", source='"+source+'\''+
                ", communicationId="+communicationId+", templateId=" + templateId+
                ", productCode="+productCode+
                ", smsCode=" +smsCode+
                '}';


    }
}
