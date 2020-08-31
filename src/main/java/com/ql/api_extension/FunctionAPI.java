package com.ql.api_extension;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.IExpressContext;
import com.ql.util.express.instruction.op.OperatorBase;

/**
 * @auther Stiles-JKY
 * @date 2020/8/31-21:30
 */
public class FunctionAPI {

    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        String expr = "function findMax(int a,int b){return a>b?a:b;};";
        IExpressContext<String,Object> context = new DefaultContext<>();
        runner.execute(expr,context,null,false,false);
        OperatorBase findMax = runner.getFunciton("findMax");
        System.out.println(findMax);

    }

}
