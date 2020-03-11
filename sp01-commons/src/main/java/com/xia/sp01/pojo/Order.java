package com.xia.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
//订单
public class Order {
	private String id;
	private User user;
	private List<Item> items;
}
