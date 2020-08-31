package com.ql;

import com.ql.util.express.ExpressRunner;

/**
 * 编译当前ql表达式，并返回需要传入的值的列表
 *
 * @auther Stiles-JKY
 * @date 2020/8/31-20:25
 */
public class QLDemo04_Compile {

    public static void main(String[] args) throws Exception {
        String express = "int 平均值分=(math+chinese+english)/n;return 平均分";
        ExpressRunner runner = new ExpressRunner();
        String[] vars = runner.getOutVarNames(express);
        for (String var : vars) {
            System.out.println(var);
        }
    }
}
