package com.cn.opencodez.fekir.utils;

import com.cn.opencodez.fekir.Constant;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * utils
  * @{author} liuyusheng
  * @{date} 2018/5/24 21:07
  * @{param}
  * @{returnType}
 */
@Component
public class GameUtil {

    /**
     * determine if the number is the multiple of three
      * @{author} liuyusheng
      * @{date} 2018/5/24 21:08
      * @{param} [num]
      * @{returnType} boolean
     */
    public boolean isMultiThree(Integer num) {
        return (num % 3)==0?true:false;
    }

    /**
     * determine if the number is the multiple of five
      * @{author} liuyusheng
      * @{date} 2018/5/24 21:11
      * @{param} [num]
      * @{returnType} boolean
     */
    public boolean isMultiFive(Integer num) {
        return (num % 5)==0?true:false;
    }

    /**
     * determine if the num is multiple of three and five
      * @{author} liuyusheng
      * @{date} 2018/5/24 21:13
      * @{param} [num]
      * @{returnType} java.lang.String
     */
    public boolean isMultiThreeAndFive(Integer num) {
        return isMultiThree(num) && isMultiFive(num)?true:false;
    }

    /**
     * determine if the num has a 3
      * @{author} liuyusheng
      * @{date} 2018/5/24 22:03
      * @{param} [num]
      * @{returnType} boolean
     */
    public boolean hasThree(Integer num) {
        return num.toString().contains(Constant.three)?true:false;
    }

    /**
     * determine if the num has a 5
      * @{author} liuyusheng
      * @{date} 2018/5/24 22:07
      * @{param} [num]
      * @{returnType} boolean
     */
    public boolean hasFive(Integer num) {
        return num.toString().contains(Constant.five)?true:false;
    }
}
