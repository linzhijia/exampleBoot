Application.java为启动springboot自带tomcat服务器入口

springbootTest.com.example.boot.AddTradeTestMain.java为 增加‘张三’86.5元 交易记录 测试例子
springbootTest.com.example.boot.GetTradeByStateTestMain 为查询交易记录 
查询可以在浏览器中访问如下不同的url地址，最后一个数据选择对应状态

/**
		 * PAYING_STATE(1,"支付中"),
	UNPAY_STATE(0,"待付款"),
	PAID_STATE(2,"支付完成"),
	UNEXCEPTION_STATE(3,"其他异常状态"),
	ALL_STATE(-1,"全部状态");
		 */
		/**
		 * 验证查询接口按全部状态查询共5条交易，只查询成功的交易是3条，只查询失败的交易是2条。
		 * -1 http://localhost:8080/trade/queryTradeByState/-1
		 * 2 http://localhost:8080/trade/queryTradeByState/2
		 * 3 http://localhost:8080/trade/queryTradeByState/3
		 */




