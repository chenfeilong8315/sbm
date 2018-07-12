package mvc.service;

import java.util.List;
import java.util.Map;

public interface IQueryInfoService {
	public List<Map<String, Object>> queryInfo(Map<String, Object> params);
	
	public Map<String, Object> queryInfoById(String usecu_id);
}
