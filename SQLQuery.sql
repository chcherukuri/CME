
 
 SELECT * FROM [dbo].[trade_prices]  
 
 SELECT * FROM [dbo].[trade_volumes]

 
 SELECT p.symbol,sum(trade_price*trade_volume)/SUM(trade_volume) AS VWAP
 FROM [dbo].[trade_prices] p JOIN [dbo].[trade_volumes] v 
 ON p.symbol= v.symbol AND p.trade_id = v.trade_id AND p.trade_date = v.trade_date
 WHERE p.trade_date = '2024-01-01'
 GROUP BY p.symbol;


