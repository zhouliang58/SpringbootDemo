package com.zl;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zhouliang on 2017-09-26.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {

    //通过年龄查询
    public List<Girl> findByAge(Integer age);
}
