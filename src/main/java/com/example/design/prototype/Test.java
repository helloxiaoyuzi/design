package com.example.design.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class Test {
    public static void main(String[] args) {

        //浅拷贝实现 Cloneable，重写clone方法，深拷贝是通过实现 Serializable 读取二进制流。
        Square square = new Square();
        square.setId("1");
        Type type = new Type();
        type.setType("长方形");
        square.setType(type);

//        try {
//            Square squareClone = (Square) square.clone();
//            System.out.println(square == squareClone);
//            System.out.println(square.type == squareClone.type);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }


        try {
            //序列化：把对象转换为字节序列的过程。
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(square);

            byte[] bs = bos.toByteArray();

            //反序列化：把字节序列恢复为对象的过程。
            ByteArrayInputStream bis = new ByteArrayInputStream(bs);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Square squareClone = (Square) ois.readObject();

            System.out.println(square == squareClone);
            System.out.println(square.type == squareClone.type);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
