package com.ql;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

import java.lang.reflect.Method;
import java.util.LinkedHashSet;

/**
 * 使用QL脚本绑定当前java中的方法
 *
 * @auther Stiles-JKY
 * @date 2020/8/31-19:35
 */
public class QLDemo02_BindingJava {

    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        runner.addFunctionOfClassMethod("findMax", Methods.class.getName(), "findMax", new String[]{"int", "int"}, null);
        runner.addFunctionOfClassMethod("toUpper", Methods.class.getName(), "toUpper", new String[]{"String"}, null);
        runner.addFunctionOfServiceMethod("isContains", new Methods(), "isContains", new Class[]{String.class, String.class}, null);
        DefaultContext<String, Object> context = new DefaultContext<>();
        String expr1 = "findMax(4,5)";
        Object result = runner.execute(expr1, context, null, false, false);
        System.out.println(result);

        String expr2 = "toUpper(\"jky\")";
        Object upStr = runner.execute(expr2, context, null, false, false);
        System.out.println(upStr);

        String expr3 = "isContains(\"abcdefg\",\"abc\")";
        Object contains = runner.execute(expr3, context, null, false, false);
        System.out.println(contains);
    }
}
