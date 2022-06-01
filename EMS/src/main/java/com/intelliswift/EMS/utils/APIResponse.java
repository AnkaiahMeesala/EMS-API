package com.intelliswift.EMS.utils;

import com.intelliswift.EMS.DAOs.Employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class APIResponse {
	private String status;
	private Employee data;
	private String msg;
	
	public APIResponse(String status, String msg) {
		this.status = status;
		this.msg = msg;
	}
}
