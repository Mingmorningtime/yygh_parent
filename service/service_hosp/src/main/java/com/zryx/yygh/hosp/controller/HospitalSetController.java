package com.zryx.yygh.hosp.controller;

import com.zryx.yygh.common.result.Result;
import com.zryx.yygh.hosp.service.HospitalSetService;
import com.zryx.yygh.model.hosp.HospitalSet;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/hosp/hospitaSet")
public class HospitalSetController {

    @Autowired
    private HospitalSetService hospitalSet;


    @ApiOperation("查询医院所有设置信息")
    @GetMapping("findAll")
    public Result findAllHospitalSet(){
        List<HospitalSet> list = hospitalSet.list();
        return Result.ok(list);
    }
 /**
  * @title
  * @description
  * @author 李昌达
  * @updateTime 2022/4/15 0015 17:45
  * @throws
  */
    //逻辑删除医院设置
    @ApiOperation("逻辑删除医院设置")
    @DeleteMapping("{id}")
    public Result removeHospitalSet(@PathVariable Long id){
        boolean flag = hospitalSet.removeById(id);
       if(flag){
           return Result.ok();
       }else {
           return Result.fail();
       }

    }

}
