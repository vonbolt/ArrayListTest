package ArrayListIterator;

import java.util.ArrayList;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class IteratorOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		log.debug("--------------------It runs!-----------------");
		//创建一个ArrayList对象  添加泛型会更省资源
        ArrayList<String> list = new ArrayList<String>();
        //对list集合添加5个值
        list.add("我是第一个对象");
        list.add("我是第二个对象");
        list.add("我是第三个对象");
        list.add("我是第四个对象");
        list.add("我是第五个对象");
       
        //返回一个有序的迭代器
        java.util.Iterator<String> iterators = list.iterator();
        //循环迭代器
        while (iterators.hasNext()) {        //如果有下一个值，进入循环
                String result = iterators.next();        //得到迭代器中下一个值 返回String类型
                System.out.println(result);        //输出结果
               
        }
	}

}
