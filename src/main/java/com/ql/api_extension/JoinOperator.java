package com.ql.api_extension;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.Operator;


/**
 * 运算符扩展，用于根据业务需求定制新的运算符
 *
 * @auther Stiles-JKY
 * @date 2020/8/31-21:11
 */
public class JoinOperator extends Operator {

    //扩展一个新的运行符，用于将传入的参数都存放到指定的list中
    @Override
    public Object executeInner(Object[] list) throws Exception {
        java.util.List result = new java.util.ArrayList();
        Object opData1 = list[0];
        if (opData1 instanceof java.util.List) {
            result.addAll((java.util.List) opData1);
        } else {
            result.add(opData1);
        }
        for (int i = 0; i < list.length; i++) {
            result.add(list[i]);
        }
        return result;
    }
}

class AddOperator {
    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        runner.addOperator("join",new JoinOperator());
        Object result = runner.execute("1 join 2 join 3", context, null, false, false);
        System.out.println(result);
    }
}
