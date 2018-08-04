package cn.lusiliya;

import java.util.Scanner;

/**
 * Created by Lusiliya on 2018/8/4.
 */
public class TaxCal {
    public static void main(String[] args) {
        System.out.println("请输入工资：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("所需缴纳税费为：" + Tax(n));

    }

    private static int Tax(int n) {
        int s = n - 3500;
        int t = 0;
        if(s <= 1500){
            if(s > 0){
                t = (int)(s * 0.03);
            }
        }else if(s <= 4500){
            t = (int)(s * 0.1);
        }else if(s <= 9000){
            t = (int)(s * 0.2);
        }else if(s <= 35000){
            t = (int)(s * 0.25);
        }else if(s <= 55000){
            t = (int)(s * 0.3);
        }else if(s <= 80000){
            t = (int)(s * 0.35);
        }else{
            t = (int)(s * 0.45);
        }
        return  t;
    }
}
