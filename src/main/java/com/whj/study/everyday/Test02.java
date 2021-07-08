package com.whj.study.everyday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @author: whj
 * @time: 2021/2/23 14:44
 */
public class Test02 {


    class Parent {

    }
    class Son extends Parent{

    }
    class GrandSon extends Son{

    }
    public void say(Son son) {
        System.out.println("hello son");
    }

    public void say(Parent parent) {
        System.out.println("hello parent");
    }

    public void say(Object parent) {
        System.out.println("hello object");
    }



//    public static void main(String[] args) {
//        Test02 test = new Test02();
//        GrandSon grandSon = test.new GrandSon();
//        test.say(grandSon);
//    }


    public void predict(String imagePath) {

        try {
//            String image_path = "F:\\train\\data_1\\1001.png"
            String[] args = {"python","D:/项目/山西大学/mobileNetTest/predict.py", imagePath };
            Process proc = Runtime.getRuntime().exec("cmd /c python " + "D:/项目/山西大学/mobileNetTest/predict.py " + imagePath);
//            Process proc = Runtime.getRuntime().exec(args);
            BufferedReader in = new BufferedReader(new InputStreamReader(proc.getInputStream()));
            String line = in.readLine();
//            System.out.println("结果：" + line);
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
            in.close();
            int i = proc.waitFor();
            System.out.println("运算结果：" + i);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//        String num="1001";
        new Test02().predict("D:\\img\\1.png");
//        new test().predict((args[0]));

    }
}
