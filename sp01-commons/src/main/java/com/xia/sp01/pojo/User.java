package com.xia.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//用户
public class User {
	private Integer id;
	private String username;
	private String password;
}
