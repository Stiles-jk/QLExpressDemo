package com.ql.api_extension;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import com.ql.util.express.IExpressContext;
import com.ql.util.express.InstructionSet;

/**
 * 指令集缓存相关API
 * 因为QLExpress对文本到指令集做了一个本地HashMap缓存，
 * 通常情况下一个设计合理的应用脚本数量应该是有限的，
 * 缓存是安全稳定的，但是也提供了一些接口进行管理。
 *
 * @auther Stiles-JKY
 * @date 2020/8/31-21:52
 */
public class InstructionSetCacheAPI {

    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        String expressString = "for(i=0;i<10;i++){sum=i+1}return sum;";
        InstructionSet instructionSet = runner.getInstructionSetFromLocalCache(expressString);
        IExpressContext<String, Object> context = new DefaultContext<>();
        Object result = runner.execute(instructionSet, context, null, false, false, null);
        System.out.println(result);
    }

}
