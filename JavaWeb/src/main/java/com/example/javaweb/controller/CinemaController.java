package com.example.javaweb.controller;

import com.example.javaweb.pojo.CinemaTable;
import com.example.javaweb.pojo.Result;
import com.example.javaweb.service.CinemaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/cinema")
public class CinemaController {
    @Autowired
    private CinemaService cinemaService;

    // 增加电影院
    @PostMapping("/add")
    public Result addCinema(@RequestParam String cinemaName,@RequestParam String cinemaIntroduce,@RequestParam String cinemaPlace,@RequestParam String phone){
        CinemaTable cinemaTable = new CinemaTable(1,cinemaName,cinemaIntroduce,cinemaPlace,phone);
        boolean add = cinemaService.addCinema(cinemaTable);
        return add ? Result.success("添加成功") : Result.error("添加失败");
    }
    // 删除电影院
    @PostMapping("/delete")
    public Result deleteCinema(@RequestParam int id){
        boolean delete = cinemaService.deleteCinema(id);
        return delete ? Result.success("删除成功") : Result.error("删除失败");
    }
    // 修改电影院
    @PostMapping("/update")
    public Result updateCinema(@RequestParam int id,
                               @RequestParam String cinemaName,
                               @RequestParam String cinemaIntroduce,
                               @RequestParam String cinemaPlace,
                               @RequestParam String phone){
        CinemaTable cinemaTable = cinemaTable(id,cinemaName, cinemaIntroduce, cinemaPlace, phone);
        boolean update = cinemaService.updateCinema(cinemaTable);
        return update ? Result.success("修改成功") : Result.error("修改失败");
    }
    // 查询所有电影院
    @PostMapping("/selectall")
    public List<CinemaTable> selectAllCinema(){
        return cinemaService.getAllCinema();
    }
    // 根据名称查询电影院
    @PostMapping("/selectCinemaByName")
    public Result selectCinemaByName(@RequestParam String cinemaName){
        List<CinemaTable> cinema = cinemaService.getCinemaByName(cinemaName);
        if (cinema != null && !cinema.isEmpty()) {
            return Result.success(cinema);
        } else {
            return Result.error("未找到电影院");
        }
    }
    // 静态工厂方法
    private static CinemaTable cinemaTable (Integer id,String cinemaName,String cinemaIntroduce,String cinemaPlace,String phone){
        CinemaTable cinemaTable = new CinemaTable();
        cinemaTable.setId(id);
        cinemaTable.setCinemaName(cinemaName);
        cinemaTable.setCinemaIntroduce(cinemaIntroduce);
        cinemaTable.setCinemaPlace(cinemaPlace);
        cinemaTable.setPhone(phone);
        return cinemaTable;
    }
}
