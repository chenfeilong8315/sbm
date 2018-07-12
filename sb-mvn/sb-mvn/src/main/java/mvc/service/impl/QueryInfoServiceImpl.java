package mvc.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mvc.mapper.QueryInfoMapper;
import mvc.service.IQueryInfoService;

@Service("queryInfoService")
public class QueryInfoServiceImpl implements IQueryInfoService {
	Logger log = Logger.getLogger(QueryInfoServiceImpl.class);
	@Autowired
	private QueryInfoMapper queryInfoMapper;
	@Override
	public List<Map<String, Object>> queryInfo(Map<String, Object> params) {
		return queryInfoMapper.queryInfo(params);
	}
	@Override
	public Map<String, Object> queryInfoById(String usecu_id) {

		return queryInfoMapper.queryInfoById(usecu_id);
	}
	public List<Map<String, Object>> queryInfoByTableName(Map<String, Object> params) {
		return queryInfoMapper.queryInfoByTableName(params);
	}
	public Object queryInfoByCorp(String corp) {
		return queryInfoMapper.queryInfoByCorp(corp);
	}

	
}
