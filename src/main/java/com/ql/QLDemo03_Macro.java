package com.ql;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.IExpressContext;

/**
 * 使用宏定义 macro:使用宏定义,就是简单的用一个变量替换一段文本，和传统的函数替换有所区别。
 *
 * @auther Stiles-JKY
 * @date 2020/8/31-20:18
 */
public class QLDemo03_Macro {

    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        runner.addMacro("findMax", "a>b?a:b");
        runner.addMacro("prints", "println(findMax)");
        IExpressContext<String, Object> context = new DefaultContext<>();
        context.put("a", 10);
        context.put("b", 39);
        runner.execute("prints", context, null, false, false);
    }
}
