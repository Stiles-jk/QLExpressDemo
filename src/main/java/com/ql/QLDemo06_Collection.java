package com.ql;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.IExpressContext;

/**
 * 集合的快速写法
 *
 * @auther Stiles-JKY
 * @date 2020/8/31-20:48
 */
public class QLDemo06_Collection {

    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        //map的正常写法
        String expr_normalMap = "simpleMap=new HashMap();simpleMap.put(1,1);simpleMap.put(2,1);simpleMap.put(3,1);" +
                "return simpleMap.get(1)+simpleMap.get(2)+simpleMap.get(3);";
        //快捷写法
        String expr_map = "simpleMap=NewMap(1:1,2:2,3:3);return simpleMap.get(1)+simpleMap.get(2)+simpleMap.get(3);";
        IExpressContext<String, Object> context = new DefaultContext<>();
        Object sum_Map = runner.execute(expr_normalMap, context, null, false, false);
        System.out.println(sum_Map);
        //list的快捷写法
        String expr_list = "simpleList=NewList(1,2,3);return simpleList.get(0)+simpleList.get(1)+simpleList.get(2);";
        Object sum_List = runner.execute(expr_list, context, null, false, false);
        System.out.println(sum_List);
        //array快捷写法
        String expr_array = "simpleArray=[1,2,3];sum=0;for(i=0;i<simpleArray.length;i++){sum=sum+simpleArray[i];} return sum;";
        Object sum_array = runner.execute(expr_array, context, null, false, false);
        System.out.println(sum_array);
    }
}
