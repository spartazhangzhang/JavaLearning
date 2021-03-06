import arrs.Reverse;
import generics.*;
import inter.*;
import exception.*;
import reflect.Ref;
import reflect.Ref2;
import threads.*;
import enumerate.*;

public class Main {

    public static void thread(){
        DefaultMethodInter d = new DefaultMethodInter();
        d.print();
        TryCatch.print();
        // thread
        ThreadDemo.print();
        // create thead runnable interface
//        ThreadCreate.print();
        // create thread from extends Thread class
//        ThreadExtends.print();
        // sync
//        SyncedThread.main();
        // thread resume and supending
        // ResumeThread.main();
        Enumerator.print();
        // 反射
        Ref.print();
    }

    public static void gen(String[] args){
        GenericExample.print();
        MultpleGenerics.print();
        // 上限范型
        BoundedGeneric.print();
        // 通配符
        SameAvgGeneric.print();
        // 范型 统配 上界函数
        LimitGeneric.print();
        // 创建通用方法
        GenericMethod.main();
        // 创建通用构造函数
        GenericFunc.print();
    }

    public static void main(String[] args){
        Reverse.outPrint();
    }
}
