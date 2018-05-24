package com.cn.opencodez.fekir.service.impl;

import com.cn.opencodez.fekir.services.GamePrinciple;
import com.cn.opencodez.fekir.utils.GameUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * generate buzz if it is divisible by 5, or has a 5 in it
  * @{author} liuyusheng
  * @{date} 2018/5/24 22:14
  * @{param}
  * @{returnType}
 */
@Component
public class BuzzFiveGamePrinciple implements GamePrinciple{

    private  static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzGamePrinciple.class);

    @Autowired
    GameUtil gameUtil;

    @Override
    public void generateCroak(Integer num) {
        if(gameUtil.isMultiFive(num) ||
                gameUtil.hasFive(num)) {
            LOGGER.info("I am gonna to say, {}", "buzz");
            return;
        }

        LOGGER.info("I am gonna to say, {}", num);
    }
}
