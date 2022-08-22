package com.kafein.intern.warehouse.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SimpleEmailDTO {

    private String sendTo;
    private String body;
    private String subject;

}
