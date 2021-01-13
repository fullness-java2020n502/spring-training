package com.example.demo.controller;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class ValueForm implements Serializable {
	private Integer intValue;
	private String stringValue;
	private Date dateValue;
}
