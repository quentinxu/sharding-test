package com.test.sharding;


import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCustMapper {
	
   /**
    *
    * @mbggenerated 2018-09-06
    */
   int insert(TCust record);

   /**
    *
    * @mbggenerated 2018-09-06
    */
   TCust selectByPrimaryKey(int id);
   
   List<TCust> selectOne();

   /**
    *
    * @mbggenerated 2018-09-06
    */
   List<TCust> selectAll();
   
   int updateNameByPhone(@Param("custName") String custName,@Param("custMobile") Long custMobile);
   
   int updateNameByPhoneAndGender(@Param("custName") String custName,@Param("custMobile") Long custMobile,@Param("gender") int gender);
   
}