package com.cn.opencodez.fekir.service.impl;

import com.cn.opencodez.fekir.services.GamePrinciple;
import com.cn.opencodez.fekir.utils.GameUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * generate fizz if multiple of 3, buzz if multiple of 5, fizzbuzz if multiple of both 3 and 5
  * @{author} liuyusheng
  * @{date} 2018/5/24 22:00
  * @{param}
  * @{returnType}
 */
@Component
public class FizzBuzzGamePrinciple implements GamePrinciple {

    private  static final Logger LOGGER = LoggerFactory.getLogger(FizzBuzzGamePrinciple.class);

    @Autowired
    GameUtil gameUtil;

    @Override
    public void generateCroak(Integer num) {

        if(gameUtil.isMultiThreeAndFive(num)) {
            LOGGER.info("I am gonna to say, {}", "FizzBuzz");
            return;
        }

        if(gameUtil.isMultiThree(num)) {
            LOGGER.info("I am gonna to say, {}", "Fizz");
            return;
        }

        if(gameUtil.isMultiFive(num)) {
            LOGGER.info("I am gonna to say, {}", "Buzz");
            return;
        }

        LOGGER.info("I am gonna to say, {}", num);
    }
}
