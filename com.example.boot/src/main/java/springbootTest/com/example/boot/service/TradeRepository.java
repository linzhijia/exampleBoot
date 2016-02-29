package springbootTest.com.example.boot.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import springbootTest.com.example.boot.domain.TradeInfo;

public interface TradeRepository extends CrudRepository<TradeInfo, Long> {
	Iterable<TradeInfo> findByTradeStateAllIgnoringCase(Integer tradeState);
}
