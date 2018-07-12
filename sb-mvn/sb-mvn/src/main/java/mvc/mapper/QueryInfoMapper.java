package mvc.mapper;


import java.util.List;
import java.util.Map;

public interface QueryInfoMapper {

	List<Map<String, Object>> queryInfo(Map<String, Object> params);
	
	Map<String,Object> queryInfoById(String usecu_id);

	List<Map<String, Object>> queryInfoByTableName(Map<String, Object> params);

	Object queryInfoByCorp(String corp);

}