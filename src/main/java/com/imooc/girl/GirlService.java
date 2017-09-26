package com.imooc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhouliang on 2017-09-26.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setAge(20);
        girlA.setCupSize("G");
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setAge(21);
        girlB.setCupSize("HHHH");

        girlRepository.save(girlB);
    }
}
