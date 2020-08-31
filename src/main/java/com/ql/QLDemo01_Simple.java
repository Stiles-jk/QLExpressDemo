package com.ql;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

/**
 * 一个简单的QLExpressDemo
 *
 * @auther Stiles-JKY
 * @date 2020/8/31-19:29
 */
public class QLDemo01_Simple {

    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        String express = "sum=a+b+c";
        DefaultContext<String, Object> context = new DefaultContext<>();
        context.put("a", 10);
        context.put("b", 11);
        context.put("c", 12);
        //执行表达式
        Object result = runner.execute(express, context, null, false, false);
        System.out.println(result);
    }
}
