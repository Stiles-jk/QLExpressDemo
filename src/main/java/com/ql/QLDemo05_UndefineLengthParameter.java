package com.ql;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.DynamicParamsUtil;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.IExpressContext;

/**
 * 实现不定长传参
 *
 * @auther Stiles-JKY
 * @date 2020/8/31-20:37
 */
public class QLDemo05_UndefineLengthParameter {

    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        IExpressContext<String, Object> context = new DefaultContext<>();
        //使用数组实现不定长传参
        runner.addFunctionOfServiceMethod(
                "getTemplate",
                new QLDemo05_UndefineLengthParameter(),
                "getTemplate", new Class[]{Object[].class},
                null);
        Object r = runner.execute("getTemplate([11,'22',33L,true])", context, null, false, false);
        System.out.println(r);
        //函数动态参数调用,实现不定长传参
        DynamicParamsUtil.supportDynamicParams = true;
        Object result = runner.execute("getTemplate(11,'22',33L,true)", context, null, false, false);
        System.out.println(result);

    }

    public Object getTemplate(Object... objs) {
        String result = "";
        for (Object obj : objs) {
            result = result + obj + ",";
        }
        return result;
    }
}
