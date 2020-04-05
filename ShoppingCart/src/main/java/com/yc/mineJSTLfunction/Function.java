package com.yc.mineJSTLfunction;

import java.text.DecimalFormat;

public class Function {
    public static String double2TargetedPrecision(double a,int precision) {
        StringBuilder fString=new StringBuilder("0.");
        for(int i=0;i<precision;i++) {
            fString.append('0');
        }
        DecimalFormat f=new DecimalFormat(fString.toString());
        return f.format(a);
    }
}
