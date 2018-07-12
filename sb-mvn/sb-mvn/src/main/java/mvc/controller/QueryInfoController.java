package mvc.controller;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mvc.common.IgnorevSecurity;
import mvc.common.Response;
import mvc.entity.Mt564AllEntity;
import mvc.service.impl.QueryInfoServiceImpl;



@RestController
@RequestMapping("/api/v1")
public class QueryInfoController {
	Logger log = Logger.getLogger(QueryInfoController.class);
	
	@Autowired
	private QueryInfoServiceImpl queryInfoService; 
	/**
	 * 
	 * @param startNo  起始条数的编号
	 * @param pageSize 页面展现信息条数
	 * @return
	 */
	@IgnorevSecurity
	@RequestMapping(method=RequestMethod.GET,value="/mt564s/{pageNo}/{pageSize}")
	public Response queryAll(@PathVariable Integer pageNo,@PathVariable Integer pageSize, String corp,String tab) {
		
		Map<String, Object> params = new HashMap<String,Object>();
		params.put("startNo", pageNo == null?1:(pageNo-1)*pageSize);
		params.put("pageSize", pageSize == null?100:pageSize);
		params.put("tab", tab==null?null:tab.split("_"));
		params.put("corp", corp == null?null:corp);
//		List<Map<String, Object>> obj =  queryInfoService.queryInfo(params);
		List<Map<String, Object>> obj =  queryInfoService.queryInfoByTableName(params);
		List<Mt564AllEntity> data = Mt564AllEntity.getMt564Model(obj);
		return new Response().success(data);
	}
	/**
	 * 
	 * @param corp
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,value="/mt564s")
	public Response queryAllCount(String corp) {
		return new Response().success( queryInfoService.queryInfoByCorp(corp==null?null:corp));
	}
	/**
	 * 
	 * @param usecu_id
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,value="/mt564s/{usecu_id}")
	public Response queryAllById(@PathVariable String usecu_id) {
		return new Response().success( queryInfoService.queryInfoById(usecu_id));
	}
	
	
	
}
