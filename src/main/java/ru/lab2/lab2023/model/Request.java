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
    private String uid;
    @NotBlank
    @Max(32)
    private String operationUid;
    private String systemName;
    @NotBlank
    private String systemTime;
    private String source;
    @NotNull
    @Min(1)
    @Max(10000)
    private int communicationId;
    private int templateId;
    private int productCode;
    private int smsCode;

}
