package thread;

 abstract class T {}
interface A {}
 class E extends T implements A{}
 class F extends T {}
 class P extends E {}


class x {
     void C(){
         T[] t2=new T[3];
         T t3=new E();
         A nesneE=new E();
         A nesneP=new P();
         T t4=new P();
         P p4= (P) t4;
         T t5=new P();
         F f5=(F)t5;
     }
}