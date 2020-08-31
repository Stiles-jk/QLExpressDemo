package com.ql.api_extension;

import com.ql.util.express.*;

/**
 * 预编译检查错误
 *
 * @auther Stiles-JKY
 * @date 2020/8/31-21:44
 */
public class GrammarAnalysisAPI {

    public static void main(String[] args) throws Exception {
        ExpressRunner expressRunner = new ExpressRunner();
        String expressString = "for(i=0;i<10;i++){sum=i+1}return sum;";
        InstructionSet instructionSet = expressRunner.parseInstructionSet(expressString);
        IExpressContext<String, Object> context = new DefaultContext<>();
        Object result = expressRunner.execute(instructionSet, context, null, false, false, null);
        System.out.println(result);
    }
}
