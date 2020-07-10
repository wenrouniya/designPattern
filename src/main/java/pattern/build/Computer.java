package pattern.build;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 要建造的实体类 电脑
 */
public class Computer {

    ArrayList<String> list=new ArrayList<String>();

    //添加电脑组建
    public void add(String str){
        list.add(str);
    }

    //展示电脑构成
    public void  showComputer(){
        for (String str:list){
            System.out.println(str);
        }
    }
}
