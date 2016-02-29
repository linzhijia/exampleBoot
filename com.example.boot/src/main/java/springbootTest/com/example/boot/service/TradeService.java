package springbootTest.com.example.boot.service;

import java.util.List;

import springbootTest.com.example.boot.domain.TradeInfo;

public interface TradeService {
	
	
	/**
	 * 保存交易信息
	 * @param tradeInfo
	 * @param customerId
	 * @return
	 */
	public boolean addTrade(TradeInfo tradeInfo);
	/**
	 * 查询交易信息by state
	 * @return
	 */
	public Iterable<TradeInfo> findByTradeStateAllIgnoringCase(Integer State);
	
	/**
	 * 查询交易信息list
	 * @return
	 */
	public Iterable<TradeInfo> getTradeList( );
	
}
