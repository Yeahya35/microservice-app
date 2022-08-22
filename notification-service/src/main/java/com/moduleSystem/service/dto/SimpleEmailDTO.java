package com.moduleSystem.service.dto;

import lombok.Data;

@Data
public class SimpleEmailDTO {

    private String sendTo;
    private String body;
    private String subject;

}
