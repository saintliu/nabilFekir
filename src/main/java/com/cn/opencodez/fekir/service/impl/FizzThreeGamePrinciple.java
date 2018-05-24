package com.cn.opencodez.fekir.service.impl;

import com.cn.opencodez.fekir.services.GamePrinciple;
import com.cn.opencodez.fekir.utils.GameUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * generate fizz if num is 3 or has 3 in it
  * @{author} liuyusheng
  * @{date} 2018/5/24 22:00
  * @{param}
  * @{returnType}
 */
@Component
public class FizzThreeGamePrinciple implements GamePrinciple{

    private  static final Logger LOGGER = LoggerFactory.getLogger(FizzThreeGamePrinciple.class);

    @Autowired
    GameUtil gameUtil;

    @Override
    public void generateCroak(Integer num) {
        if(gameUtil.isMultiThree(num) ||
                gameUtil.hasThree(num)) {
            LOGGER.info("I am gonna to say, {}", "fizz");
            return;
        }
        LOGGER.info("I am gonna to say, {}", num);
    }
}
