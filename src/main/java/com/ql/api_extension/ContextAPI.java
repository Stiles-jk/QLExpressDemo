package com.ql.api_extension;

import com.ql.util.express.IExpressContext;

import java.util.HashMap;

/**
 * 8.1 与spring框架的无缝集成
 * 上下文参数 IExpressContext context 非常有用，它允许put任何变量，然后在脚本中识别出来。
 * <p>
 * 在实际中我们很希望能够无缝的集成到spring框架中，可以仿照下面的例子使用一个子类
 *
 * @auther Stiles-JKY
 * @date 2020/8/31-21:59
 */
public class ContextAPI {

    public static void main(String[] args) {

    }
}

class QLExpressContext extends HashMap<String,Object> implements IExpressContext<String,Object> {

}
