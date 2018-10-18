package com.test.sharding;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shardding/")
public class TestController {
	
	@Autowired
	private TCustMapper custMapper;
	
	@GetMapping("insert")
	public boolean insert(@RequestParam String name,@RequestParam String mobile,@RequestParam int gender) {
		TCust customer = new TCust(name, Long.valueOf(mobile),gender);
		int ret = custMapper.insert(customer);
		return ret >0 ?true:false;
	}
	
	@GetMapping("selectAll")
	public List<TCust> selectAll() { 
		return custMapper.selectAll();
	}
	
	@GetMapping("selectOne")
	public  List<TCust> selectOne() { 
		return custMapper.selectOne();
	}
	
	@GetMapping("update")
	public boolean update(@RequestParam String name,@RequestParam String mobile) {
		int ret = custMapper.updateNameByPhone(name, Long.valueOf(mobile));
		return ret >0 ?true:false;
	}
	
	@GetMapping("update1")
	public boolean update(@RequestParam String name,@RequestParam String mobile,@RequestParam int gender) {
		int ret = custMapper.updateNameByPhoneAndGender(name, Long.valueOf(mobile),gender);
		return ret >0 ?true:false;
	}
}
