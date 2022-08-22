package com.kafein.intern.warehouse.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ReportDTO {

    private int id;

    private Date date;

    private int numberOfProducts;

    private int totalProfit;

    private int numberOfEmployees;

    private int warehouseId;

    private int numberOfBought;

    private int numberOfSold;

    private int expenditure;

    private int income;
}
