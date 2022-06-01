package com.intelliswift.EMS.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
	private String first_name;
    private String last_name;
    private String user_name;
    private String email;
    private String password;
}
