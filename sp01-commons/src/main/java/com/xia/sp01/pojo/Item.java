package com.xia.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//商品
public class Item {
	private Integer id;
	private String name;
	private Integer number;
}
